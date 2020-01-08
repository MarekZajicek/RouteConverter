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
package slash.navigation.photon;

import org.junit.Test;
import slash.navigation.common.NavigationPosition;
import slash.navigation.common.SimpleNavigationPosition;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PhotonServiceIT {
    private PhotonService service = new PhotonService();

    @Test
    public void getPositionsFor() throws IOException {
        List<SimpleNavigationPosition> expected = asList(
                new SimpleNavigationPosition(10.1994416, 50.0002652, null, "B\u00fchlstra\u00dfe, 97506 Grafenrheinfeld, Bavaria, Germany (highway)"),
                new SimpleNavigationPosition(10.2001313, 50.0016142, null, "B\u00fchlstra\u00dfe, 97506 Grafenrheinfeld, Bavaria, Germany (highway)"),
                new SimpleNavigationPosition(10.1999752, 49.9999416, null, "B\u00fchlstra\u00dfe, 97506 Grafenrheinfeld, Bavaria, Germany (highway)"),
                new SimpleNavigationPosition(10.200785058788268, 50.0012567, null, "Pfarrheim, 97506 Grafenrheinfeld, Bavaria, Germany (building)"),
                new SimpleNavigationPosition(10.2004901, 50.0014652, null, "Kindertagesst\u00e4tte St. Joseph, 97506 Grafenrheinfeld, Bavaria, Germany (amenity)")
        );
        List<NavigationPosition> actual = service.getPositionsFor("B\u00fchlstra\u00dfe, 97506 Grafenrheinfeld, Germany");
        assertEquals(expected, actual);
    }

    @Test
    public void getAddressFor() throws IOException {
        String address1 = service.getAddressFor(new SimpleNavigationPosition(9.0, 47.3));
        assertTrue(address1.contains("Sankt Gallen") && address1.contains("Switzerland"));
        String address2 = service.getAddressFor(new SimpleNavigationPosition(10.2, 50.001));
        assertTrue(address2.contains("Grafenrheinfeld") && address2.contains("Bavaria") && address2.contains("Germany"));
        String address3 = service.getAddressFor(new SimpleNavigationPosition(11.06561, 47.42428));
        assertTrue(address3.contains("Garmisch-Partenkirchen") && address3.contains("Bavaria") && address3.contains("Germany"));
        assertEquals("Atlas Buoy 0.00E 0.00N", service.getAddressFor(new SimpleNavigationPosition(0.0, 0.0)));
        assertEquals("North Pole", service.getAddressFor(new SimpleNavigationPosition(0.0, 90.0)));
        String pole1 = service.getAddressFor(new SimpleNavigationPosition(0.0, -90.0));
        assertTrue(pole1.contains("Pole") || pole1.contains("Skiway"));
        assertNull(service.getAddressFor(new SimpleNavigationPosition(-90.0, 0.0)));
        String pole2 = service.getAddressFor(new SimpleNavigationPosition(-90.0, -90.0));
        assertTrue(pole2.contains("Pole") || pole2.contains("Skiway"));
        assertEquals("North Pole", service.getAddressFor(new SimpleNavigationPosition(90.0, 90.0)));
    }
}
