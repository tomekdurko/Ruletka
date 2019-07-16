package com.project;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class TablicaTest {
    private Tablica testTablica;
    private Tablica pustaTablica= new Tablica();
    @BeforeEach
    public void setUp()
    {
        testTablica = new Tablica();
        testTablica.dodajZeton(15,1);
        testTablica.dodajZeton(12,3);
        testTablica.dodajZeton(10,2);
        testTablica.dodajZeton(8,5);
        testTablica.dodajZeton(11,5);

    }

    @Test
    void wygranaDlaTablicy() {
        assertEquals(22 , testTablica.wygranaDlaTablicy(15));
    }

    @Test
    void dodajZetonyZPliku() {
        try {
            pustaTablica.dodajZetonyZPliku("plansza.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(22, pustaTablica.wygranaDlaTablicy(15) );
    }
}