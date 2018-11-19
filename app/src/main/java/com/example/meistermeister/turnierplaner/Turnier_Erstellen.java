package com.example.meistermeister.turnierplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Turnier_Erstellen extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button;
    public static int gruppen;
    public static int mannschaften;
    public static int minutenprospiel;
    public static String turniername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnier__erstellen);

        Spinner spinner= findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.gruppen, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        button= (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmannschaften();
            }
        });
    }

    public void openmannschaften() {
        EditText edText2= (EditText) findViewById(R.id.editText2);
        EditText edText3=  findViewById(R.id.editText9);
        EditText edText4 = findViewById(R.id.editText);
        mannschaften= Integer.parseInt(edText2.getText().toString());
        minutenprospiel= Integer.parseInt(edText3.getText().toString());
        turniername= edText4.getText().toString();
        Intent intent = new Intent(this,Mannschaftseingabe.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text= adapterView.getItemAtPosition(i).toString();
        gruppen = Integer.parseInt(text);
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public static int getgruppen(){
        return gruppen;
    }

    public static int getMannschaften(){
        return mannschaften;
    }
}
