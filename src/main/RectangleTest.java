package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea1() {
        Rectangle rex = new Rectangle(4, 6);
        assertEquals(24, rex.computeArea());
    }
}