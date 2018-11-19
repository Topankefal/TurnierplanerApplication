package com.example.meistermeister.turnierplaner;

import java.util.ArrayList;

public class Gruppe {
    Mannschaftseingabe teilnehmer;
    ArrayList<Mannschaftsobjekt> mannschaften= new ArrayList<>();
    Mannschaftsobjekt[][] gruppen = new Mannschaftsobjekt[teilnehmer.gruppen][teilnehmer.mpg];
    int countervariable=0;

    public void erstelleGruppen () {
        mannschaften = teilnehmer.teilnehmer;
        for (int i=0;i<teilnehmer.gruppen;i++){
            for (int j=0;j<teilnehmer.mpg;j++){
                gruppen[i][j]=mannschaften.get(countervariable);
                countervariable++;
            }

        }
    }
    public Mannschaftsobjekt[][] getGruppen(){
        return gruppen;
    }
}
