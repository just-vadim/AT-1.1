package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn500() {
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0If1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000If0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}