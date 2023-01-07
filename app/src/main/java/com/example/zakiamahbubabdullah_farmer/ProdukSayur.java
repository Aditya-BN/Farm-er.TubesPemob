package com.example.zakiamahbubabdullah_farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class ProdukSayur extends AppCompatActivity {
    TextView counterText, counterText2, counterText3, counterText4, counterText5, counterText6, counterText7, counterText8, counterText9;
    TextView jumlah;
    private int mcounter = 0, mcounter2 = 0, mcounter3 = 0, mcounter4 = 0, mcounter5 = 0, mcounter6 = 0, mcounter7 = 0, mcounter8 = 0, mcounter9 = 0;
    int totalBayarKentang, totalBayarCaberawit, totalBayarCabe, totalBayarTerong, totalBayarJagung, totalBayarTimun, totalBayarApel, totalBayarMangga, totalBayarPisang, totalBayar, total;
    Snackbar snackbar;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_sayur);
        final Button kentangAdd = findViewById(R.id.kentangAdd);
        Button rawitAdd = findViewById(R.id.rawitAdd);
        Button cabeAdd = findViewById(R.id.cabeAdd);
        Button terongAdd = findViewById(R.id.terongAdd);
        Button jagungAdd = findViewById(R.id.jagungAdd);
        Button timunAdd = findViewById(R.id.timunAdd);
        Button pisangAdd = findViewById(R.id.pisangAdd);
        Button manggaAdd = findViewById(R.id.manggaAdd);
        Button apelAdd = findViewById(R.id.apelAdd);
        Button kembali = findViewById(R.id.kembali);
        Button lanjutbelanja = findViewById(R.id.lanjutbelanja);
        Button pesansekarang = findViewById(R.id.pesansekarang);

        //down counter
        Button minKentang = findViewById(R.id.minusBtn);
        Button minCaberawit = findViewById(R.id.minusBtn2);
        Button minCabe = findViewById(R.id.minusBtn3);
        Button minTerong = findViewById(R.id.minusBtn4);
        Button minJagung = findViewById(R.id.minusBtn5);
        Button minTimun = findViewById(R.id.minusBtn6);
        Button minPisang = findViewById(R.id.minusBtn7);
        Button minMangga = findViewById(R.id.minusBtn8);
        Button minApel = findViewById(R.id.minusBtn9);

        //up counter
        Button plsKentang = findViewById(R.id.plusBtn);
        Button plsCaberawit = findViewById(R.id.plusBtn2);
        Button plsCabe = findViewById(R.id.plusBtn3);
        Button plsTerong = findViewById(R.id.plusBtn4);
        Button plsJagung = findViewById(R.id.plusBtn5);
        Button plsTimun = findViewById(R.id.plusBtn6);
        Button plsPisang = findViewById(R.id.plusBtn7);
        Button plsMangga = findViewById(R.id.plusBtn8);
        Button plsApel = findViewById(R.id.plusBtn9);

        //display counter
        counterText = (TextView) findViewById(R.id.counterText);
        counterText2 = (TextView) findViewById(R.id.counterText2);
        counterText3 = (TextView) findViewById(R.id.counterText3);
        counterText4 = (TextView) findViewById(R.id.counterText4);
        counterText5 = (TextView) findViewById(R.id.counterText5);
        counterText6 = (TextView) findViewById(R.id.counterText6);
        counterText7 = (TextView) findViewById(R.id.counterText7);
        counterText8 = (TextView) findViewById(R.id.counterText8);
        counterText9 = (TextView) findViewById(R.id.counterText9);

        linearLayout = findViewById(R.id.linearLayout);

        //KENTANG
        plsKentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter++;
                counterText.setText(Integer.toString(mcounter));
            }
        });
        minKentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter--;
                counterText.setText(Integer.toString(mcounter));

            }
        });
        kentangAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Kentang";
                int nCounter = Integer.parseInt(counterText.getText().toString());

                final int totKentang = nCounter * 10500;
                totalBayarKentang = +totKentang;

                 String strPaketKentang = "- Kentang" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarKentang;


                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukKentang(produk);
                globalClass.setBanyakKentang(nCounter);
                globalClass.setTotKentang(totalBayarKentang);
                globalClass.setPaketKentang(strPaketKentang);

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

                total = totalBayarKentang + kentang1 + cabe + cabe1 + rawit + rawit1 + terong + terong1 + jagung + jagung1 + timun + timun1 + apel
                        + apel1 + mangga + mangga1 + pisang + pisang1;
                globalClass.setTotalBayar(total);

                snackbar = Snackbar.make(v, "Total Produk: " + total, Snackbar.LENGTH_INDEFINITE).setAction("CHECKOUT", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //CABE RAWIT
        plsCaberawit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter2++;
                counterText2.setText(Integer.toString(mcounter2));
            }
        });
        minCaberawit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter2--;
                counterText2.setText(Integer.toString(mcounter2));
            }
        });
        rawitAdd.setOnClickListener(new View.OnClickListener() {
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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //CABE MERAH
        plsCabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter3++;
                counterText3.setText(Integer.toString(mcounter3));

            }
        });
        minCabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter3--;
                counterText3.setText(Integer.toString(mcounter3));
            }
        });
        cabeAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Cabai Merah";
                int nCounter = Integer.parseInt(counterText3.getText().toString());

                final int totCabe = nCounter * 5000;
                totalBayarCabe = +totCabe;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukCabe(produk);
                globalClass.setBanyakCabe(nCounter);
                globalClass.setTotCabe(totalBayarCabe);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //TERONG
        plsTerong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter4++;
                counterText4.setText(Integer.toString(mcounter4));
            }
        });
        minTerong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter4--;
                counterText4.setText(Integer.toString(mcounter4));
            }
        });
        terongAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Terong";
                int nCounter = Integer.parseInt(counterText4.getText().toString());

                final int totTerong = nCounter * 5000;
                totalBayarTerong = +totTerong;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukTerong(produk);
                globalClass.setBanyakTerong(nCounter);
                globalClass.setTotTerong(totalBayarTerong);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //JAGUNG
        plsJagung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter5++;
                counterText5.setText(Integer.toString(mcounter5));
            }
        });
        minJagung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter5--;
                counterText5.setText(Integer.toString(mcounter5));
            }
        });
        jagungAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Jagung";
                int nCounter = Integer.parseInt(counterText5.getText().toString());

                final int totJagung = nCounter * 4000;
                totalBayarJagung = +totJagung;

                String strPaketJagung = "- Jagung" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarJagung;



                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukJagung(produk);
                globalClass.setBanyakJagung(nCounter);
                globalClass.setTotJagung(totalBayarJagung);
                globalClass.setPaketJagung(strPaketJagung);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //TIMUN
        plsTimun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter6++;
                counterText6.setText(Integer.toString(mcounter6));
            }
        });
        minTimun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter6--;
                counterText6.setText(Integer.toString(mcounter6));
            }
        });
        timunAdd.setOnClickListener(new View.OnClickListener() {
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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //PISANG
        plsPisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter7++;
                counterText7.setText(Integer.toString(mcounter7));
            }
        });
        minPisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter7--;
                counterText7.setText(Integer.toString(mcounter7));
            }
        });
        pisangAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Pisang";
                int nCounter = Integer.parseInt(counterText7.getText().toString());

                final int totPisang = nCounter * 14500;
                totalBayarPisang = +totPisang;

                String strPaketPisang = "- Pisang" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarPisang;


                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukPisang(produk);
                globalClass.setBanyakPisang(nCounter);
                globalClass.setTotPisang(totalBayarPisang);
                globalClass.setPaketPisang(strPaketPisang);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //MANGGA
        plsMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter8++;
                counterText8.setText(Integer.toString(mcounter8));
            }
        });
        minMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter8--;
                counterText8.setText(Integer.toString(mcounter8));
            }
        });
        manggaAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Mangga";
                int nCounter = Integer.parseInt(counterText8.getText().toString());

                final int totMangga = nCounter * 20000;
                totalBayarMangga =+ totMangga;

                String strPaketMangga = "- Mangga" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarMangga;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukMangga(produk);
                globalClass.setBanyakMangga(nCounter);
                globalClass.setTotMangga(totalBayarMangga);
                globalClass.setPaketMangga(strPaketMangga);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        //APEL
        plsApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter9++;
                counterText9.setText(Integer.toString(mcounter9));
            }
        });
        minApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter9--;
                counterText9.setText(Integer.toString(mcounter9));
            }
        });
        apelAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String produk = "Apel";
                int nCounter = Integer.parseInt(counterText9.getText().toString());

                final int totApel = nCounter * 25000;
                totalBayarApel = +totApel;

                String strPaketApel = "- Apel" + "\t" + nCounter + "kg" + "\t" + "Rp." + totalBayarApel;

                GlobalClass globalClass = (GlobalClass) getApplicationContext();
                globalClass.setProdukApel(produk);
                globalClass.setBanyakApel(nCounter);
                globalClass.setTotApel(totalBayarApel);
                globalClass.setPaketApel(strPaketApel);

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
                        Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                        startActivity(intent);
                    }
                });
                snackbar.show();
            }
        });

        pesansekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, DataDiri.class);
                startActivity(intent);
            }
        });

        lanjutbelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, HalamanUtama.class);
                startActivity(intent);

            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, HalamanUtama.class);
                startActivity(intent);
            }
        });


        FrameLayout frameKentang = findViewById(R.id.frame_kentang);
        FrameLayout frameCabe = findViewById(R.id.frame_cabe);
        FrameLayout frameCaberawit = findViewById(R.id.frame_caberawit);
        FrameLayout frameTerong = findViewById(R.id.frame_terong);
        FrameLayout frameJagung = findViewById(R.id.frame_jagung);
        FrameLayout frameTimun = findViewById(R.id.frame_timun);
        FrameLayout framePisang = findViewById(R.id.frame_pisang);
        FrameLayout frameMangga = findViewById(R.id.frame_mangga);
        FrameLayout frameApel = findViewById(R.id.frame_apel);

        frameKentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Kentang.class);
                startActivity(intent);
            }
        });
        frameCaberawit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, CabeRawit.class);
                startActivity(intent);
            }
        });
        frameCabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Cabe.class);
                startActivity(intent);
            }
        });
        frameTerong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Terong.class);
                startActivity(intent);
            }
        });
        frameJagung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Jagung.class);
                startActivity(intent);
            }
        });
        frameTimun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Timun.class);
                startActivity(intent);
            }
        });
        framePisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Pisang.class);
                startActivity(intent);
            }
        });
        frameMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Mangga.class);
                startActivity(intent);
            }
        });
        frameApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProdukSayur.this, Apel.class);
                startActivity(intent);
            }
        });

    }
}