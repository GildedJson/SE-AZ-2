package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rex = new Rectangle(4, 6);
        assertEquals(24, rex.computeArea());
    }

    @Test
    void changeWidth() {
        Rectangle rex = new Rectangle(4, 6);
        rex.setWidth(3);
        assertEquals(3, rex.getWidth());
    }

    @Test
    void changeHeight() {
        Rectangle rex = new Rectangle(4, 6);
        rex.setHeight(7);
        assertEquals(7, rex.getHeight());
    }
}