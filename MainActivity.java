package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button;
    EditText editText1,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.angka_pertama);
        editText2 = findViewById(R.id.angka_kedua);
        editText3 = findViewById(R.id.operasi_hit);
        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView2);
    }
    public void ngitung (View view){
        double angka_pertama = Double.parseDouble(editText1.getText().toString());
        double angka_kedua = Double.parseDouble(editText2.getText().toString());
        String operasi_hit = editText3.getText().toString();
        double textView2;

        if (operasi_hit.equals("+")){
            textView2 = angka_pertama+angka_kedua;
            textView1.setText("Hasil Penjumlahan adalah "+textView2);
        }
        else if (operasi_hit.equals("-")){
            textView2 = angka_pertama-angka_kedua;
            textView1.setText("Hasil Penjumlahan adalah "+textView2);
        }
        else if (operasi_hit.equals("*")){
            textView2 = angka_pertama*angka_kedua;
            textView1.setText("Hasil Penjumlahan adalah "+textView2);
        }
        else if (operasi_hit.equals("/")){
            textView2 = angka_pertama/angka_kedua;
            textView1.setText("Hasil Penjumlahan adalah "+textView2);
        }
        else {
            textView1.setText("Operasi aritmatika salah");
        }

    }
}