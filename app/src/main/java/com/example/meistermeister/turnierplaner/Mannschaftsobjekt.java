package com.example.meistermeister.turnierplaner;

public class Mannschaftsobjekt {
    public String gruppenbuchstabe;
    public String mannschaftsname;
    public int tore,gegentore,punkte,tordifferenz=tore-gegentore;

    public Mannschaftsobjekt(){
        gruppenbuchstabe= "default";
        mannschaftsname="default";
        punkte=0;
    }

    public String getgruppenbuchstabe() {
        return gruppenbuchstabe;
    }

    public String getmannschaftsname() {
        return mannschaftsname;
    }

    public void setgruppenbuchstabe(String s) {
        gruppenbuchstabe=s;
    }

    public void setMannschaftsname(String s) {
        mannschaftsname=s;
    }

    public void setPunkte(int p){
        punkte+=p;
    }

    public int getPunkte(){
        return punkte;
    }
}
