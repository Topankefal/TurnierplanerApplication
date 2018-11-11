package com.example.meistermeister.turnierplaner;

public class Mannschaftsobjekt {
    public String gruppenbuchstabe;
    public String mannschaftsname;
    public int tore,gegentore,punkte;

    public Mannschaftsobjekt(){
        gruppenbuchstabe= "default";
        mannschaftsname="default";
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

    public void setmannschaftsname(String s) {
        mannschaftsname=s;
    }

    public void setPunkte(int p){
        punkte+=p;
    }

    public int getPunkte(){
        return punkte;
    }
}
