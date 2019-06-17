package com.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZetonTest {
    private Zeton zetonCorner;
    private Zeton zetonDwojka;
    private Zeton zetonLiczba;
    private Zeton zetonStrit;
    private Zeton zetonSzostka;
    @BeforeEach
    void setUp() {
        zetonCorner = new Zeton(15,1);
        zetonDwojka = new Zeton(12,3);
        zetonLiczba = new Zeton(10,2);
        zetonStrit = new Zeton(8,5);
        zetonSzostka = new Zeton(11,5);
    }

    @Test
    void znajdzX() {
        assertEquals(16,Zeton.znajdzX(22));
    }

    @Test
    void znajdzY() {
        assertEquals(4,Zeton.znajdzY(22));
    }

    @Test
    void wygranaCorner() {
        assertEquals(8,zetonCorner.wygrana(20));
    }
    @Test
    void wygranaDwojka(){
        assertEquals(17,zetonDwojka.wygrana(17));
    }
    @Test
    void wygranaLiczba() {
        assertEquals(35,zetonLiczba.wygrana(14));
    }
    @Test
    void wygranaStrit() {
        assertEquals(11,zetonStrit.wygrana(12));
    }
    @Test
    void wygranaSzostka() {
        assertEquals(5,zetonSzostka.wygrana(15));
    }
}
