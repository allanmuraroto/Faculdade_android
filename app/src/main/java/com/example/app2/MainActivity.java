package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view)
    {
        TextView entrada = findViewById(R.id.TextViewName);
        EditText nota1 = findViewById(R.id.editTextNumber1);
        EditText nota2 = findViewById(R.id.editTextNumber2);
        EditText freq = findViewById(R.id.editTextNumber3);

        double n1 = Double.parseDouble(nota1.getText().toString());
        double n2 = Double.parseDouble(nota2.getText().toString());
        int presenca = Integer.parseInt(freq.getText().toString());

        double media = (n1+n2)/2;

        if(media >= 70 && presenca >= 75)
        {
            Intent it = new Intent(this, App2Tela2.class);
            Bundle params = new Bundle();
            String dados = entrada.getText().toString();
            params.putString("msg", dados + " você está aprovado" );
            it.putExtras(params);
            startActivity(it);
        }
        else if (media < 70 && media > 39 && presenca >= 75)
        {
            Intent it = new Intent(this, App2Tela2.class);
            Bundle params = new Bundle();
            String dados = entrada.getText().toString();
            params.putString("msg", dados + " você está de final" );
            it.putExtras(params);
            startActivity(it);
        }
        else if (presenca < 75)
        {
            Intent it = new Intent(this, App2Tela2.class);
            Bundle params = new Bundle();
            String dados = entrada.getText().toString();
            params.putString("msg", dados + " você está reprovado por falta" );
            it.putExtras(params);
            startActivity(it);
        }
        else
        {
            Intent it = new Intent(this, App2Tela2.class);
            Bundle params = new Bundle();
            String dados = entrada.getText().toString();
            params.putString("msg", dados + " você está reprovado por nota" );
            it.putExtras(params);
            startActivity(it);
        }
    }
}