package com.project;

public class Zeton {
    private int wspX;
    private int wspY;
    public Zeton(int X, int Y)
    {
        wspX=X;
        wspY=Y;
    }

    public int getWspX() {
        return wspX;
    }

    public int getWspY() {
        return wspY;
    }

    public static int znajdzX(int wylosowanaLiczba)
    {
        int x;
        if(wylosowanaLiczba%3==0)
            x=wylosowanaLiczba*2/3;
        else
        x=(((3-wylosowanaLiczba%3)+wylosowanaLiczba)/3)*2;
        return x;
    }
    public static int znajdzY(int wylosowanaLiczba)
    {
        int y;
        y=wylosowanaLiczba%3;
        if(y==1)
            y=4;
        return y;
    }
    public int wygrana(int wylosowanaLiczba)
    {
        int xLiczby=znajdzX(wylosowanaLiczba);
        int yLiczby=znajdzY(wylosowanaLiczba);
        if(xLiczby==wspX&&yLiczby==wspY) // liczba
            return 35;
        if(wspY==5)
        {
            if(wspX==xLiczby)
                return 11;
            else if(wspX==xLiczby-1|| wspX==xLiczby+1)
                return 5;
        }
        for(int i=xLiczby-1;i<(xLiczby+1);i++)
        {
            for(int j=yLiczby-1;j<(yLiczby+1);j++)
            {
                if (i==wspX||j==wspY)
                {
                    if(i%2==0||j%2==0)
                    {
                        return 17; // podwójna
                    }
                    else return 8; // corner
                }
            }
        }

        return 0;

    }

}
