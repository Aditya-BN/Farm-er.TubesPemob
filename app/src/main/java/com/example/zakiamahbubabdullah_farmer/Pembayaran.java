package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Pembayaran extends AppCompatActivity {
String strPembayaran, strPemilikrek, strNorek, strBank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        final RadioGroup metode = findViewById(R.id.metode);
        final RadioButton bni = findViewById(R.id.bni);
        final RadioButton bri = findViewById(R.id.bri);
        final EditText pemilikrekening = findViewById(R.id.pemilikrekening);
        final EditText norek = findViewById(R.id.norekening);
        final EditText bank = findViewById(R.id.namabank);
        Button bayar = findViewById(R.id.bayar);
        Button kembali = findViewById(R.id.kembali);

        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pembayaran.this,RekapData.class);
                startActivity(intent);

                strPembayaran="";
                if (metode.getCheckedRadioButtonId()==bni.getId()) strPembayaran += "BNI Transfer \t 01234567890";
                if (metode.getCheckedRadioButtonId()==bri.getId()) strPembayaran += "BRI Transfer \t 01234567890";

                strPemilikrek = pemilikrekening.getText().toString();
                strNorek = norek.getText().toString();
                strBank = bank.getText().toString();

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setGCPilihBank(strPembayaran);
                globalClass.setGCNamaPemilik(strPemilikrek);
                globalClass.setGCNoRek(strNorek);
                globalClass.setGCNamaBank(strBank);

            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pembayaran.this,DataDiri.class);
                startActivity(intent);
            }
        });
    }
}