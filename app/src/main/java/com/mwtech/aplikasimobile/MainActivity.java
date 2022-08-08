package com.mwtech.aplikasimobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText etInputNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getSupportActionBar().setTitle("Input Nama");

        hasil = findViewById(R.id.hasil);
        etInputNama = findViewById(R.id.etNama);
    }

    public void TampilNama(View view){

        hasil.setText("Nama Anda: " + etInputNama.getText());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu1){
            startActivity(new Intent(MainActivity.this, KalkulatorSederhanaActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}