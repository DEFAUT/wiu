package com.example.luiz.luluensina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // metodo que eh chamado quando clicamos no botão
    public void cliqueAqui(View v){
        //cria uma referencia no codigo para a textview que queremos editar
        TextView hello;
        //instancia ela falando qual o id que ela possui no xml
        hello = (TextView) findViewById(R.id.helloluiz);
        //mudo os parametros dela que eu desejo
        hello.setText("Hello de C eh Rola!");
    }
}
