package br.com.fiap.desafio2.rm77273.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    RadioGroup grupo;
    CheckBox femea, adestrado, vacina;
    TextView calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        grupo= (RadioGroup)findViewById(R.id.rgGroup);
    	calculo = (TextView)findViewById(R.id.calcular);
    	femea = (CheckBox)findViewById(R.id.femea);
    	adestrado = (CheckBox)findViewById(R.id.adestrado);
    	vacina = (CheckBox)findViewById(R.id.vacina);

    }




     public void Calcular(View v){
        double v = 0;
        double soma = 0;
        int idRadio = grupo.getCheckedRadioButtonId();
        if(idRadio == R.id.radio_cachorro1){
            v = 800.00;
            calculo.setText("R$ " + v);
        }else if(idRadio == R.id.cachorro2){
            v = 750.00;
            calculo.setText("R$ " + v);
        }else if(idRadio == R.id.cachorro3){
            v = 700.00;
            calculo.setText("R$ " + v);
        }else if(idRadio == R.id.cachorro4){
            v = 800.00;
            calculo.setText("R$ " + v);
        }else{
            v = 00.00;
            calculo.setText("R$ " + v);
        }




 if(femea.isChecked()){
            soma = 180.00;
            v = (v + soma);
     calculo.setText("R$ " + v);
        }
        if(adestrado.isChecked()){
            soma = 400.00;
            v = (v + soma);
            calculo.setText("R$ " + v);
        }
        if(vacina.isChecked()){
            soma = 200.00;
            v = (v + soma);
            calculo.setText("R$ " + v);
        }

        if(femea.isChecked() == false && adestrado.isChecked() == false && vacina.isChecked() == false){
            soma = 0;
            v = (v + soma);
            calculo.setText("R$ " + v);
        }

    }
}




