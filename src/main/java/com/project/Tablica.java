package com.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Tablica {
    private Vector<Zeton> wektor;
    private int wylosowanaLiczba;
    private File resourcesDirectory = new File("src/main/resources");


    public Tablica()
    {
        wektor = new Vector<>();
        wylosowanaLiczba = 0;
    }
    public Tablica(String nazwaPliku) throws FileNotFoundException {
        dodajZetonyZPliku(nazwaPliku);
    }
    public void dodajZeton(int x, int y)
    {
        wektor.add(new Zeton(x,y));
    }
    public void setWylosowanaLiczba(int wylosowanaLiczba)
    {
        this.wylosowanaLiczba = wylosowanaLiczba;
    }
    public Vector<Zeton> getWektor() {
        return wektor;
    }
    public void dodajZetonyZPliku(String nazwaPliku) throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File(resourcesDirectory.getAbsolutePath()+"/"+nazwaPliku));
        int x,y;
        this.wylosowanaLiczba = odczyt.nextInt();
        while (odczyt.hasNextInt())
        {
            x = odczyt.nextInt();
            y = odczyt.nextInt();
            wektor.add(new Zeton(x,y));
        }
    }

    public int wygranaDlaTablicy()
    {
        int suma=0;
        for(int i=0;i<wektor.size();i++)
        {
            suma+=wektor.elementAt(i).wygrana(wylosowanaLiczba);
        }
        return suma;
    }

}
