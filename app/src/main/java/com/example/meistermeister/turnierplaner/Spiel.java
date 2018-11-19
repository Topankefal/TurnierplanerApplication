package com.example.meistermeister.turnierplaner;

public class Spiel {
    Mannschaftsobjekt team1,team2;
    int t1tore,t2tore;

    public Spiel(Mannschaftsobjekt t1,Mannschaftsobjekt t2){
        team1=t1;
        team2=t2;
    }

    public void setSpielstand(int tore1,int tore2){
        t1tore=tore1;
        t2tore=tore2;
    }

    public String gewinnerSpiel(){
        if (t1tore>t2tore)
            return team1.mannschaftsname;
        else if (t1tore<t2tore)
            return team2.mannschaftsname;
        else return "unentschieden";
    }
}
