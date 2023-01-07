package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Timun extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;
    Button pls, min, beli, pesan, lanjut;
    TextView counterText6;
    int mcounter6 = 0;
    int totalBayarTimun, total;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timun);

        pls = (Button) findViewById(R.id.plus);
        min = (Button) findViewById(R.id.minus);
        beli = (Button) findViewById(R.id.beli);
        pesan = (Button) findViewById(R.id.pesan);
        lanjut = (Button) findViewById(R.id.lanjut);
        counterText6 = (TextView) findViewById(R.id.counter);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.flipper);
        fadein = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();

        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter6++;
                counterText6.setText(Integer.toString(mcounter6));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter6--;
                counterText6.setText(Integer.toString(mcounter6));
            }
        });
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Timun";
                int nCounter = Integer.parseInt(counterText6.getText().toString());

                final int totTimun = nCounter * 5000;
                totalBayarTimun = +totTimun;

                String strPaketTimun = "- Timun" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarTimun;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukTimun(produk);
                globalClass.setBanyakTimun(nCounter);
                globalClass.setTotTimun(totalBayarTimun);
                globalClass.setPaketTimun(strPaketTimun);

                int kentangHarga = globalClass.getTotKentang();
                int hargakentang = globalClass.getTotalKentang();       //harga kentang di halaman produk masing2
                int cabeHarga = globalClass.getTotCabe();               //harga cabe di halaman produk sayur
                int hargacabe = globalClass.getTotalCabe();             //harga cabe di halaman produk masing2
                int caberawitHarga = globalClass.getTotCaberawit();     //harga cabe rawit di halaman produk sayur
                int hargacaberawit = globalClass.getTotalCaberawit();   //harga cabe rawit di halaman produk masing2
                int terongHarga = globalClass.getTotTerong();           //harga terong di halaman produk sayur
                int hargaterong = globalClass.getTotalTerong();         //harga terong di halaman produk masing2
                int jagungHarga = globalClass.getTotJagung();           //harga jagung di halaman produk sayur
                int hargajagung = globalClass.getTotalJagung();         //harga jagung di halaman produk masing2
                int timunHarga = globalClass.getTotTimun();             //harga timun di halaman produk sayur
                int hargatimun = globalClass.getTotalTimun();           //harga timun di halaman produk masing2
                int apelHarga = globalClass.getTotApel();               //harga apel di halaman produk sayur
                int hargaapel = globalClass.getTotalApel();             //harga apel di halaman produk masing2
                int manggaHarga = globalClass.getTotMangga();           //harga mangga di halaman produk sayur
                int hargamangga = globalClass.getTotalMangga();         //harga mangga di halaman produk masing2
                int pisangHarga = globalClass.getTotPisang();           //harga pisang di halaman produk sayur
                int hargapisang = globalClass.getTotalPisang();         //harga pisang di halaman produk masing2

                int kentang = +kentangHarga;
                int kentang1 = +hargakentang;
                int cabe = +cabeHarga;
                int cabe1 = +hargacabe;
                int rawit = +caberawitHarga;
                int rawit1 = +hargacaberawit;
                int terong = +terongHarga;
                int terong1 = +hargaterong;
                int jagung = +jagungHarga;
                int jagung1 = +hargajagung;
                int timun = +timunHarga;
                int timun1 = +hargatimun;
                int apel = +apelHarga;
                int apel1 = +hargaapel;
                int mangga = +manggaHarga;
                int mangga1 = +hargamangga;
                int pisang = +pisangHarga;
                int pisang1 = +hargapisang;

                total = kentang + kentang1 + cabe + cabe1 + rawit + rawit1 + terong + terong1 + jagung + jagung1 + timun + timun1 + apel
                        + apel1 + mangga + mangga1 + pisang + pisang1;
                globalClass.setTotalBayar(total);

                snackbar = Snackbar.make(v, "Total Produk: " + total, Snackbar.LENGTH_INDEFINITE).setAction("CHECKOUT", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Timun.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timun.this,DataDiri.class);
                startActivity(intent);
            }
        });
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Timun.this,ProdukSayur.class);
                startActivity(intent);
            }
        });
    }
}