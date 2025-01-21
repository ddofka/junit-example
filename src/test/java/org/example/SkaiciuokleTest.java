package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {

    Skaiciuokle testSkaiciuokle;

    @BeforeEach
    void setUp() {
        testSkaiciuokle = new Skaiciuokle(33,7);
    }

    @Test
    void sudetis() {
        assertEquals(40,testSkaiciuokle.sudetis());
    }

    @Test
    void atimtis() {
        assertEquals(26,testSkaiciuokle.atimtis());
    }

    @Test
    void daugyba() {
        assertEquals(231,testSkaiciuokle.daugyba());
    }

    @Test
    void dalyba() {
        //then
        assertEquals(4.0,testSkaiciuokle.dalyba());
    }

    @Test
    void dalybaThrowsException() {
        //given
        Skaiciuokle test_Skaiciuokle_Zero = new Skaiciuokle(33,0);
        //then
        assertThrows(ArithmeticException.class, test_Skaiciuokle_Zero::dalyba);
    }
}