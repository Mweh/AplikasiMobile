package com.mwtech.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorSederhanaActivity extends AppCompatActivity {

    Button kali, bagi, tambah, kurang, bersihkan;
    EditText angka_pertama, angka_kedua;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_sederhana);

        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        bersihkan = findViewById(R.id.bersihkan);
        angka_pertama = findViewById(R.id.etAngkaPertama);
        angka_kedua = findViewById(R.id.etAngkaKedua);
        hasil = findViewById(R.id.txtHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));

                } else {
                    Toast.makeText(KalkulatorSederhanaActivity.this, "Mohon Masukkan Angka Pertama & Angka Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });


        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));

                } else {
                    Toast.makeText(KalkulatorSederhanaActivity.this, "Mohon Masukkan Angka Pertama & Angka Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));

                } else {
                    Toast.makeText(KalkulatorSederhanaActivity.this, "Mohon Masukkan Angka Pertama & Angka Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && angka_kedua.getText().length()>0){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));

                } else {
                    Toast.makeText(KalkulatorSederhanaActivity.this, "Mohon Masukkan Angka Pertama & Angka Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("0");
                angka_pertama.requestFocus();
            }
        });
    }
}