package br.com.fiap.desafio2.rm77273.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



     CheckBox femea, adestrado, vacina;
    RadioButton cachorro1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                        femea = (CheckBox) findViewById(R.id.femea);
        adestrado = (CheckBox) findViewById(R.id.adestrado);
        vacina = (CheckBox) findViewById(R.id.vacina);
        resultado =(TextView) findViewById(R.id.calculcar) ;


        Button btncalcular = (Button) findViewById(R.id.btncalcular);


    }




    public void botao  (View v){


        int resultado;
        int valorfemea = 180;
        int valor1 = 800;

        if(cachorro1.isChecked() && femea.isChecked())
            resultado = (valor1 + valorfemea);



    }
}
