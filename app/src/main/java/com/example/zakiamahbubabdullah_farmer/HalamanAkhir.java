package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HalamanAkhir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_akhir);

        TextView konfirmasiakhir = findViewById(R.id.konfirmasiakhir);
        Button selesai = findViewById(R.id.selesai);

        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAkhir.this, HalamanUtama.class);
                startActivity(intent);
            }
        });

        GlobalClass globalclass = (GlobalClass) getApplicationContext();
        String nomortlp = globalclass.getGCNoHp();
        String pengiriman = globalclass.getGCPengiriman();

        String konfirmasi = "Data pemesanan telah dikirimkan melalui sms ke nomor " + nomortlp + "." + " Pengiriman akan dilakukan pada " + pengiriman
                +"." +"\n"+"Terimakasih";
        konfirmasiakhir.setText(konfirmasi);
    }
}