package com.example.meistermeister.turnierplaner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Tabelle extends AppCompatActivity {
    ArrayList<Mannschaftsobjekt> tabelle = new ArrayList<>();
    Mannschaftseingabe teilnehmer;
    Mannschaftsobjekt holder;
    ArrayList<Mannschaftsobjekt> mannschaften= new ArrayList<>();
    Mannschaftsobjekt[][] gruppen = new Mannschaftsobjekt[teilnehmer.gruppen][teilnehmer.mpg];
    int countervariable=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabelle);
        tabelle =teilnehmer.teilnehmer;
        erstelleGruppen();
    }
    public void sortiereTabelle() {
        for (int x = 0; x < teilnehmer.gruppen; x++) {
            for (int i = gruppen[x].length; i > 1; i--) {
                for (int n = 0; n < i - 1; i++) {
                    if (gruppen[x][n].punkte < gruppen[x][n+1].punkte) {
                        holder = gruppen[x][n];
                        gruppen[x][n]= gruppen[x][n+1]; //tabelle.set(n, tabelle.get(n + 1));
                        gruppen[x][n+1]= holder; //tabelle.set(n + 1, holder);
                    } else if (gruppen[x][n].punkte > gruppen[x][n+1].punkte){} else if (gruppen[x][n].tordifferenz < gruppen[x][n+1].tordifferenz) {
                        holder = gruppen[x][n];
                        gruppen[x][n]= gruppen[x][n+1]; //tabelle.set(n, tabelle.get(n + 1));
                        gruppen[x][n+1]= holder;
                    }
                }
            }
        }
    }

    public void erstelleGruppen () {
        mannschaften = teilnehmer.teilnehmer;
        for (int i=0;i<teilnehmer.gruppen;i++){
            for (int j=0;j<teilnehmer.mpg;j++){
                gruppen[i][j]=mannschaften.get(countervariable);
                countervariable++;
            }

        }
    }
}
