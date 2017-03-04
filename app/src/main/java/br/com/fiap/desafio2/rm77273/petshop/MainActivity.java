package br.com.fiap.desafio2.rm77273.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    RadioGroup radioGroup;
    CheckBox femea, adestrado, vacina;
    TextView calculcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





 	radioGroup = (RadioGroup)findViewById(R.id.rgGroup);
    	txtView = (TextView)findViewById(R.id.calcular);
    	femea = (CheckBox)findViewById(R.id.femea);
    	adestrado = (CheckBox)findViewById(R.id.adestrado);
    	vacina = (CheckBox)findViewById(R.id.vacina);


        Button btncalcular = (Button) findViewById(R.id.btncalcular);


    }




     public void calcular(View v){
        double valor = 0;
        double soma = 0;
        int idRadio = radioGroup.getCheckedRadioButtonId();
        if(idRadio == R.id.radio_cachorro1){
            valor = 800.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.cachorro2){
            valor = 750.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.cachorro3){
            valor = 700.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.cachorro4){
            valor = 800.00;
            txtView.setText("R$ " + valor);
        }else{
            valor = 00.00;
            txtView.setText("R$ " + valor);
        }




 if(femea.isChecked()){
            soma = 180.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if(adestrado.isChecked()){
            soma = 400.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if(vacina.isChecked()){
            soma = 200.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

        if(femea.isChecked() == false && adestrado.isChecked() == false && vacina.isChecked() == false){
            soma = 0;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

    }
}




