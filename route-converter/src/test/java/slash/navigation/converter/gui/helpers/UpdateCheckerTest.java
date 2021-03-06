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

package slash.navigation.converter.gui.helpers;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateCheckerTest {
    @Test
    public void testSetParameters() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult("2.2", "1.5");
        result.setParameters("b=c,routeconverter.version=1.3,a=b");
        assertEquals("c", result.getValue("b"));
        assertEquals("1.3", result.getValue("routeconverter.version"));
        assertEquals("b", result.getValue("a"));
        assertNull( result.getValue("c"));
    }

    @Test
    public void testParseVersion() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult("2.2", "1.6.0_03");
        result.setParameters("b=c,routeconverter.version=1.3,java6.version=1.6.0_04,java7.version=1.7.0_05," +
                "java8.version=1.8.0_05,java9.version=9.0.1,java10.version=10,a=b");
        assertEquals("2.2", result.getMyRouteConverterVersion());
        assertEquals("1.3", result.getLatestRouteConverterVersion());
        assertFalse(result.existsLaterRouteConverterVersion());
        assertEquals("1.6.0_03", result.getMyJavaVersion());
        assertTrue(result.existsLaterJavaVersion());
    }

    @Test
    public void noJava5Supported() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "1.5.0_21");
        result.setParameters("java6.version=1.5.0_19");
        assertFalse(result.existsLaterJavaVersion());
        assertNull(result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion8() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "1.8.0_01");
        result.setParameters("java8.version=1.8.0_02");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("1.8.0_02", result.getLatestJavaVersion());
    }

    @Test
    public void noLaterJava8Version1() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "1.8.0_02");
        result.setParameters("java8.version=1.8.0_02");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("1.8.0_02", result.getLatestJavaVersion());
    }

    @Test
    public void noLaterJava8Version2() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "1.8.0_02");
        result.setParameters("java8.version=1.8.0_01");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("1.8.0_01", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion9() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "9.0");
        result.setParameters("java9.version=9.0.1");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("9.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void noLaterJava9Version1() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "9.0.1");
        result.setParameters("java9.version=9.0.1");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("9.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void noLaterJava9Version2() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "9.0.2");
        result.setParameters("java9.version=9.0.1");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("9.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion10() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "10");
        result.setParameters("java10.version=10");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("10", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion11() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "11");
        result.setParameters("java11.version=11");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("11", result.getLatestJavaVersion());

        result.setParameters("java11.version=11.0.1");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("11.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion12() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "12");
        result.setParameters("java12.version=12");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("12", result.getLatestJavaVersion());

        result.setParameters("java12.version=12.0.1");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("12.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion13() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "13");
        result.setParameters("java13.version=13");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("13", result.getLatestJavaVersion());

        result.setParameters("java13.version=13.0.1");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("13.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void existsLaterJavaVersion14() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "14");
        result.setParameters("java14.version=14");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("14", result.getLatestJavaVersion());

        result.setParameters("java14.version=14.0.1");
        assertTrue(result.existsLaterJavaVersion());
        assertEquals("14.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void ignoreJava14jackage() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "14-jpackage");
        result.setParameters("java14.version=14.0.1");
        assertFalse(result.existsLaterJavaVersion());
        assertEquals("14.0.1", result.getLatestJavaVersion());
    }

    @Test
    public void noJava15Supported() {
        UpdateChecker.UpdateResult result = new UpdateChecker.UpdateResult(null, "14");
        result.setParameters("java15.version=15.0.1");
        assertFalse(result.existsLaterJavaVersion());
        assertNull(result.getLatestJavaVersion());
    }
}
