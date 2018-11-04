package com.example.meistermeister.turnierplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mannschaftseingabe extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mannschaftseingabe);
        button= (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmenu();
            }
        });
    }
    public void openmenu() {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
