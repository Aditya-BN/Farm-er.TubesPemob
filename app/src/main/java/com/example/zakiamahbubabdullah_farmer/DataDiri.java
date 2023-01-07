package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class DataDiri extends AppCompatActivity {
String strNama, strAlamat, strTelpon, strEmail, strPengiriman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri);

        final EditText nama = findViewById(R.id.nama);
        final EditText alamat = findViewById(R.id.alamat);
        final EditText telepon = findViewById(R.id.telpon);
        final EditText email = findViewById(R.id.email);
        Button belanja = findViewById(R.id.lanjutbelanja);
        Button pembayaran = findViewById(R.id.lanjutbayar);
        final RadioGroup pengiriman = findViewById(R.id.pengiriman);
        final RadioButton senin = findViewById(R.id.senin);
        final RadioButton rabu = findViewById(R.id.rabu);
        final RadioButton sabtu = findViewById(R.id.sabtu);

        pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strNama = nama.getText().toString();
                strAlamat = alamat.getText().toString();
                strTelpon = telepon.getText().toString();
                strEmail = email.getText().toString();

                strPengiriman = "";
                if (pengiriman.getCheckedRadioButtonId()==senin.getId()) strPengiriman += "Hari Senin";
                if (pengiriman.getCheckedRadioButtonId()==rabu.getId()) strPengiriman += "Hari Rabu";
                if (pengiriman.getCheckedRadioButtonId()==sabtu.getId()) strPengiriman += "Hari Sabtu";

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setGCNama(strNama);
                globalClass.setGCAlamat(strAlamat);
                globalClass.setGCNoHp(strTelpon);
                globalClass.setGCEmail(strEmail);
                globalClass.setGCPengiriman(strPengiriman);

                Intent intent = new Intent(DataDiri.this,Pembayaran.class);
                startActivity(intent);
            }
        });

        belanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataDiri.this,HalamanUtama.class);
                startActivity(intent);
            }
        });
    }
}