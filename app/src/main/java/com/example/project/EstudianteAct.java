package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class EstudianteAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);
        RadioButton php = (RadioButton) findViewById(R.id.phprb);
        RadioButton php1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton php2 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton php3 = (RadioButton) findViewById(R.id.radioButton2);
        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (php.isChecked()){
                php1.setEnabled(true);
                php2.setEnabled(true);
                php3.setEnabled(true);
                }
                else{
                    php1.setEnabled(false);
                    php2.setEnabled(false);
                    php3.setEnabled(false);
                }
            }
        });
        RadioButton java = (RadioButton) findViewById(R.id.javarb);
        RadioButton java1 = (RadioButton) findViewById(R.id.radioButtonjava);
        RadioButton java2 = (RadioButton) findViewById(R.id.radioButton3java);
        RadioButton java3 = (RadioButton) findViewById(R.id.radioButton2java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (java.isChecked()){
                java1.setEnabled(true);
                java2.setEnabled(true);
                java3.setEnabled(true);
                }
                else{
                    java1.setEnabled(false);
                    java2.setEnabled(false);
                    java3.setEnabled(false);
                }
            }
        });
        RadioButton android = (RadioButton) findViewById(R.id.androidrb);
        RadioButton android1 = (RadioButton) findViewById(R.id.radioButtonandroid);
        RadioButton android2 = (RadioButton) findViewById(R.id.radioButton3android);
        RadioButton android3 = (RadioButton) findViewById(R.id.radioButton2android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.isChecked()){
                    android1.setEnabled(true);
                    android2.setEnabled(true);
                    android3.setEnabled(true);
                }
                else{
                    android1.setEnabled(false);
                    android2.setEnabled(false);
                    android3.setEnabled(false);
                }
            }
        });

        Button clickbutton = (Button) findViewById(R.id.buttoncalcular);
        TextView texto = (TextView) findViewById(R.id.texto);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double suma = 0.0;
                if (php.isChecked()){
                    if(php1.isChecked()){
                        suma = suma + 225;
                    }else if(php2.isChecked()){
                        suma = suma + 260;
                    }
                    else{
                        suma = suma + 275;
                    }
                }
                if(java.isChecked()){
                    if(java1.isChecked()){
                        suma = suma + 330;
                    }else if(java2.isChecked()){
                        suma = suma + 340;
                    }
                    else{
                        suma = suma + 365;
                    }
                }
                if(android.isChecked()){
                    if(android1.isChecked()){
                        suma = suma + 545;
                    }else if(android2.isChecked()){
                        suma = suma + 575;
                    }
                    else{
                        suma = suma + 620;
                    }
                }
                texto.setText(String.valueOf(suma));

            }
        });
    }
}