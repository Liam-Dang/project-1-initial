// Write PointTest for Point.java class including common egde cases

package com.csc205.project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void setPoint() {
        Point point = new Point(0, 0);
        point.setPoint(5, 5);
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());
    }

    @Test
    void shiftX() {
        Point point = new Point(5, 5);
        point.shiftX(1);
        assertEquals(6, point.getX());
    }

    @Test
    void shiftY() {
        Point point = new Point(5, 5);
        point.shiftY(1);
        assertEquals(6, point.getY());
    }

    @Test
    void distance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(5, point1.distance(point2));
    }

    @Test
    void rotate() {
        Point point = new Point(5, 5);
        point.rotate(Math.PI / 2.0);
        assertEquals(-5, point.getX(), 1e-9);
        assertEquals(5, point.getY(), 1e-9);
    }

    @Test
    void testNegativeCoordinates() {
        Point point = new Point(-5, -5);
        assertEquals(-5, point.getX());
        assertEquals(-5, point.getY());
    }

    @Test
    void testZeroCoordinates() {
        Point point = new Point(0, 0);
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testLargeCoordinates() {
        Point point = new Point(1e9, 1e9);
        assertEquals(1e9, point.getX());
        assertEquals(1e9, point.getY());
    }

    @Test
    void testRotateEdgeCase() {
        Point point = new Point(1, 0);
        point.rotate(Math.PI);
        assertEquals(-1, point.getX(), 1e-9);
        assertEquals(0, point.getY(), 1e-9);
    }

    @Test
    void testDistanceToSelf() {
        Point point = new Point(3, 4);
        assertEquals(0, point.distance(point));
    }
}