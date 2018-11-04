package com.example.meistermeister.turnierplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonhurenoshgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTurnier_erstellen();
            }
        });
        }
    public void openTurnier_erstellen(){
        Intent intent = new Intent(this,Turnier_Erstellen.class);
        startActivity(intent);
    }
}
