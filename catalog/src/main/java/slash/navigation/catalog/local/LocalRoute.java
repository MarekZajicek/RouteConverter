/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/

package slash.navigation.catalog.local;

import slash.common.io.Files;
import slash.navigation.catalog.domain.Route;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static java.lang.String.format;

/**
 * Represents a route in the file system.
 *
 * @author Christian Pesch
 */
public class LocalRoute implements Route {
    private final LocalCatalog catalog;
    private File file;

    public LocalRoute(LocalCatalog catalog, File file) {
        this.catalog = catalog;
        this.file = file;
    }

    public String getUrl() {
        try {
            return getDataUrl().toString();
        } catch (IOException e) {
            throw new IllegalStateException(format("cannot create url for %s", file));
        }
    }

    public String getName() throws IOException {
        return file.getName();
    }

    public String getDescription() throws IOException {
        return null;
    }

    public String getCreator() throws IOException {
        // with Java 7 there is an API for the owner of a file
        // FileRef file = Paths.get("/path/to/file.ext");
        // UserPrincipal principal = Attributes.getOwner(file);
        // String username = principal.getName();
        return catalog.getUserName();
    }

    public URL getDataUrl() throws IOException {
        return file.toURI().toURL();
    }

    public void update(String categoryUrl, String description) throws IOException {
        File category = categoryUrl != null ? Files.toFile(new URL(categoryUrl)) : file.getParentFile();
        File newName = new File(category, description != null ? description : file.getName());
        if(!file.renameTo(newName))
            throw new IOException(format("cannot rename %s to %s", file, newName));
        file = newName;
    }

    public void delete() throws IOException {
        if (!file.delete())
            throw new IOException(format("cannot delete %s", file));
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalRoute that = (LocalRoute) o;

        return catalog.equals(that.catalog) && file.equals(that.file);
    }

    public int hashCode() {
        int result = catalog.hashCode();
        result = 31 * result + file.hashCode();
        return result;
    }

    public String toString() {
        return super.toString() + "[file=" + file + "]";
    }
}
