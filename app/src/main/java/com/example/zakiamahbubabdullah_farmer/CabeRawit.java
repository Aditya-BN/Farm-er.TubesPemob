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

public class CabeRawit extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;
    Button pls, min, beli, pesan, lanjut;
    TextView counterText2;
    int mcounter2 = 0;
    int totalBayarCaberawit, total;

    Snackbar snackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabe_rawit);
        pls = (Button) findViewById(R.id.plus);
        min = (Button) findViewById(R.id.minus);
        beli = (Button) findViewById(R.id.beli);
        pesan = (Button) findViewById(R.id.pesan);
        lanjut = (Button) findViewById(R.id.lanjut);
        counterText2 = (TextView) findViewById(R.id.counter);

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
                mcounter2++;
                counterText2.setText(Integer.toString(mcounter2));
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter2--;
                counterText2.setText(Integer.toString(mcounter2));
            }
        });
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Cabai Rawit";
                int nCounter = Integer.parseInt(counterText2.getText().toString());

                final int totRawit = nCounter * 7000;
                totalBayarCaberawit = +totRawit;

                String strPaketRawit = "- Cabe Rawit" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarCaberawit;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukCaberawit(produk);
                globalClass.setBanyakCaberawit(nCounter);
                globalClass.setTotCaberawit(totalBayarCaberawit);
                globalClass.setPaketRawit(strPaketRawit);

                int kentangHarga = globalClass.getTotKentang();
                int hargakentang = globalClass.getTotalKentang(); //harga kentang di halaman produk masing2
                int cabeHarga = globalClass.getTotCabe(); //harga cabe di halaman produk sayur
                int hargacabe = globalClass.getTotalCabe(); //harga cabe di halaman produk masing2
                int caberawitHarga = globalClass.getTotCaberawit(); //harga cabe rawit di halaman produk sayur
                int hargacaberawit = globalClass.getTotalCaberawit();
                int terongHarga = globalClass.getTotTerong();
                int hargaterong = globalClass.getTotalTerong();
                int jagungHarga = globalClass.getTotJagung();
                int hargajagung = globalClass.getTotalJagung();
                int timunHarga = globalClass.getTotTimun();
                int hargatimun = globalClass.getTotalTimun();
                int apelHarga = globalClass.getTotApel();
                int hargaapel = globalClass.getTotalApel();
                int manggaHarga = globalClass.getTotMangga();
                int hargamangga = globalClass.getTotalMangga();
                int pisangHarga = globalClass.getTotPisang();
                int hargapisang = globalClass.getTotalPisang();

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
                        Intent intent = new Intent(CabeRawit.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CabeRawit.this,DataDiri.class);
                startActivity(intent);
            }
        });
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CabeRawit.this,ProdukSayur.class);
                startActivity(intent);
            }
        });
    }
}