package com.madskchristensen.testjenkinsec2.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    @Test
    void add() {
        double x = 10;
        double y = 5.5;
        double expected = 15.5;

        assertEquals(expected, x + y);
    }
}