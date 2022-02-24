package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class App2Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2_tela2);

        TextView out = findViewById(R.id.textView4);
        Intent it = getIntent();
        if(it != null)
        {
            Bundle params = it.getExtras();
            if(params != null)
            {
                String msg = params.getString("msg");
                Log.i("minhaApp","Mensagem: " + msg);
                out.setText(msg);
            }
        }
    }

}