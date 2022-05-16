package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class UniversidadAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidad);
        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText salario = (EditText) findViewById(R.id.salario);
        RadioButton est1 = (RadioButton)  findViewById(R.id.radioButtones1);
        RadioButton est2 = (RadioButton)  findViewById(R.id.radioButtones2);
        RadioButton est3 = (RadioButton)  findViewById(R.id.radioButtones3);
        RadioButton sal1 = (RadioButton)  findViewById(R.id.radioButtonsal1);
        RadioButton sal2 = (RadioButton)  findViewById(R.id.radioButtonsal2);
        RadioButton sal3 = (RadioButton)  findViewById(R.id.radioButtonsal3);
        RadioButton sal4 = (RadioButton)  findViewById(R.id.radioButtonsal4);
        TextView ben = (TextView) findViewById(R.id.numben);
        TextView des = (TextView) findViewById(R.id.numdes);
        Button boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double finalsalario = Double.parseDouble(salario.getText().toString());
                double temporal = 0.00;
                if (est1.isChecked()){
                    temporal = finalsalario * 0.149;
                    ben.setText(String.valueOf(temporal));
                }
                else if (est2.isChecked()){
                    temporal = finalsalario * 0.142;
                    ben.setText(String.valueOf(temporal));
                }else{
                    temporal = finalsalario * 0.127;
                    ben.setText(String.valueOf(temporal));
                }
                if (sal1.isChecked()){
                    temporal = finalsalario * 0.034;
                    des.setText(String.valueOf(temporal));
                }
                else if (sal2.isChecked()){
                    temporal = finalsalario * 0.013;
                    des.setText(String.valueOf(temporal));
                }
                else if (sal3.isChecked()){
                    temporal = finalsalario * 0.016;
                    des.setText(String.valueOf(temporal));
                }else{
                    temporal = finalsalario * 0.012;
                    des.setText(String.valueOf(temporal));
                }
                nombre.getText().clear();
                salario.getText().clear();
            }
        });
    }
}