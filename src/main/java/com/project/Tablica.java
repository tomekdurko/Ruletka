package com.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Tablica {
    private Vector<Zeton> wektor;
    private File resourcesDirectory = new File("src/main/resources");


    public Tablica()
    {
        wektor = new Vector<>();
    }
    public void dodajZeton(int x, int y)
    {
        wektor.add(new Zeton(x,y));
    }

    public void dodajZetonyZPliku(String nazwaPliku) throws FileNotFoundException {
        Scanner odczyt = new Scanner(new File(resourcesDirectory.getAbsolutePath()+"/"+nazwaPliku));
        int x,y;
        while (odczyt.hasNextInt())
        {
            x = odczyt.nextInt();
            y = odczyt.nextInt();
            wektor.add(new Zeton(x,y));
        }
    }

    public int wygranaDlaTablicy(int wylosowanaLiczba)
    {
        int suma=0;
        for(int i=0;i<wektor.size();i++)
        {
            suma+=wektor.elementAt(i).wygrana(wylosowanaLiczba);
        }
        return suma;
    }

}
