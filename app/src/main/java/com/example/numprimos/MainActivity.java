package com.example.numprimos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Objetos
    private EditText editNum;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum = findViewById(R.id.edit_text_num);
        textResultado = findViewById(R.id.text_view_resultado);
    }

    public void CalcP(View v){
        String msgOk = " é um número primo.";
        String msgFail = " não é um número primo.";

        Integer num;

        num = Integer.parseInt(editNum.getText().toString());

        Primos primos = new Primos();
        Boolean resultado = primos.calculaPrimos(num);

        if (resultado == true){
            textResultado.setText(num + msgOk);
        }else{
            textResultado.setText(num + msgFail);
        }
    }
}
