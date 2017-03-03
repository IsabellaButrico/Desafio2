package br.com.fiap.desafio2.rm77273.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {



     CheckBox femea, adestrado, vacina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                        femea = (CheckBox) findViewById(R.id.femea);
        adestrado = (CheckBox) findViewById(R.id.adestrado);
        vacina = (CheckBox) findViewById(R.id.vacina);
        Button btncalcular = (Button) findViewById(R.id.btncalcular);


    }




    public void botao  (View v){


                    double resultado = 0;

        if()

    }
}
