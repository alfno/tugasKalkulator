package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class kalkulator extends AppCompatActivity {


    EditText  txtnomer;
    EditText  txtnomer2;

    Spinner spinnerAritmatika;
    TextView txthasil;

    Button hitung;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        txtnomer = findViewById(R.id.txtnomer);
        txtnomer2 = findViewById(R.id.txtnomer2);
        txthasil = findViewById(R.id.txthasil);
        spinnerAritmatika = findViewById(R.id.spinnerAritmatika);
        hitung = findViewById(R.id.btnitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String text = spinnerAritmatika.getSelectedItem().toString();
                    int angka1 = Integer.parseInt(txtnomer.getText().toString());
                    int angka2 = Integer.parseInt(txtnomer2.getText().toString());
                    int hasil = 0;

                    switch (text) {
                        case "Tambah":
                            hasil = angka1 + angka2;
                            txthasil.setText(hasil + "");
                            break;
                        case  "Kurang":
                            hasil = angka1 - angka2;
                            txthasil.setText(hasil + "");
                            break;
                    }

            }
        });
    }
}