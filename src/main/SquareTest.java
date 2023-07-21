package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateArea() {
        Square ski = new Square(5);
        assertEquals(25, ski.computeArea());
    }

    @Test
    void changeLength() {
        Square ski = new Square(5);
        ski.setLength(3);
        assertEquals(3, ski.getLength());
    }
}