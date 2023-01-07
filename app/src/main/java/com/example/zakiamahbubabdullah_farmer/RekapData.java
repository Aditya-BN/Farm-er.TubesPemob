package com.example.zakiamahbubabdullah_farmer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class RekapData extends AppCompatActivity {
    String data;
    TextView rekapNama, rekapAlamat, rekapTelpon, rekapEmail, rekapPengiriman, rekapPembayaran, rekapPemilikrek, rekapNorek, rekapBank, rekapProduk, rekapTotal,rekapBiayaAfterOngkir;
    String kentang, cabe, rawit, terong, jagung, timun, pisang, mangga, apel;
    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekap_data);

        rekapNama = findViewById(R.id.rekapNama);
        rekapAlamat = findViewById(R.id.rekapAlamat);
        rekapTelpon = findViewById(R.id.rekapTelepon);
        rekapEmail = findViewById(R.id.rekapEmail);
        rekapPengiriman = findViewById(R.id.rekapPengiriman);
        rekapPembayaran = findViewById(R.id.rekapBankbayar);
        rekapPemilikrek = findViewById(R.id.rekapNamapemilik);
        rekapNorek = findViewById(R.id.rekapNorek);
        rekapBank = findViewById(R.id.rekapNamabank);
        rekapProduk = findViewById(R.id.rekapJumlahProduk);
        rekapTotal = findViewById(R.id.rekapTotal);
        rekapBiayaAfterOngkir = findViewById(R.id.rekapBiayaAfterOngkir);

        GlobalClass globalClass = (GlobalClass) getApplicationContext();
        //DATA PEMBELI
        String getnama = globalClass.getGCNama();
        String getalamat = globalClass.getGCAlamat();
        String gettelpon = globalClass.getGCNoHp();
        String getemail = globalClass.getGCEmail();
        String getpengiriman = globalClass.getGCPengiriman();
        String getpembayaran = globalClass.getGCPilihBank();
        String getpemilikrek = globalClass.getGCNamaPemilik();
        String getnorek = globalClass.getGCNoRek();
        String getnamabank = globalClass.getGCNamaBank();

        //get nama produk yang dibeli
        String getkentang = globalClass.getProdukKentang();
        String getcabe = globalClass.getProdukCabe();
        String getrawit = globalClass.getProdukCaberawit();
        String getterong = globalClass.getProdukTerong();
        String getjagung = globalClass.getProdukJagung();
        String gettimun = globalClass.getProdukTimun();
        String getapel = globalClass.getProdukApel();
        String getmangga = globalClass.getProdukMangga();
        String getpisang = globalClass.getProdukPisang();

        kentang = getkentang;

        //get banyaknya produk yang dibeli di halaman produk sayur
        int banyakkentang = globalClass.getBanyakKentang();
        int banyakcabe = globalClass.getBanyakCabe();
        int banyakrawit = globalClass.getBanyakCaberawit();
        int banyakterong = globalClass.getBanyakTerong();
        int banyakjagung = globalClass.getBanyakJagung();
        int banyaktimun = globalClass.getBanyakTimun();
        int banyakpisang = globalClass.getBanyakPisang();
        int banyakmangga = globalClass.getBanyakMangga();
        int banyakapel = globalClass.getBanyakApel();

        //get banyaknya produk yang dibeli di halaman produk masing2
        int banyakKentang = globalClass.getBanyakkentang();
        int banyakCabe = globalClass.getBanyakcabe();
        int banyakRawit = globalClass.getBanyakrawit();
        int banyakTerong = globalClass.getBanyakterong();
        int banyakJagung = globalClass.getBanyakjagung();
        int banyakTimun = globalClass.getBanyaktimun();
        int banyakPisang = globalClass.getBanyakpisang();
        int banyakApel = globalClass.getBanyakapel();
        int banyakMangga = globalClass.getBanyakmangga();

        //total banyaknya produk yang dibeli
        int banyakprodukkentang = banyakKentang + banyakkentang;
        int banyakprodukcabe = banyakCabe + banyakcabe;
        int banyakprodukrawit = banyakRawit + banyakrawit;
        int banyakprodukterong = banyakTerong + banyakterong;
        int banyakprodukjagung = banyakJagung + banyakJagung;
        int banyakproduktimun = banyakTimun + banyaktimun;
        int banyakprodukpisang = banyakPisang + banyakpisang;
        int banyakprodukmangga = banyakMangga + banyakmangga;
        int banyakprodukapel = banyakApel + banyakapel;



        //ngubah integer ke banyak produk ke string
        String nKentang = Integer.toString(banyakprodukkentang);
        String nCabe = Integer.toString(banyakprodukcabe);
        String nRawit = Integer.toString(banyakprodukrawit);
        String nTerong = Integer.toString(banyakprodukterong);
        String nJagung = Integer.toString(banyakprodukjagung);
        String nTimun = Integer.toString(banyakproduktimun);
        String nPisang = Integer.toString(banyakprodukpisang);
        String nMangga = Integer.toString(banyakprodukmangga);
        String nApel = Integer.toString(banyakprodukapel);

        //get total produk di halaman produk sayur
        int totalKentang = globalClass.getTotKentang();
        int totalCabe = globalClass.getTotCabe();
        int totalCaberawit = globalClass.getTotCaberawit();
        int totalTerong = globalClass.getTotTerong();
        int totalJagung = globalClass.getTotJagung();
        int totalTimun = globalClass.getTotTimun();
        int totalPisang = globalClass.getTotPisang();
        int totalMangga = globalClass.getTotMangga();
        int totalApel = globalClass.getTotApel();

        //get total produk di halaman produk masing2
        int totKentang = globalClass.getTotalKentang();
        int totCabe = globalClass.getTotalCabe();
        int totCaberawit = globalClass.getTotalCaberawit();
        int totTerong = globalClass.getTotalTerong();
        int totJagung = globalClass.getTotalJagung();
        int totTimun = globalClass.getTotalTimun();
        int totPisang = globalClass.getTotalPisang();
        int totMangga = globalClass.getTotalMangga();
        int totApel = globalClass.getTotalApel();

        //get total semua produk
        final int totalBayar = globalClass.getTotalBayar();
        int totalBayarPS = globalClass.getTotalBayarProduk();
        final String total = Integer.toString(totalBayar);

        //get paket kentang
        String PaketKentang = globalClass.getPaketKentang();
        String PaketRawit = globalClass.getPaketRawit();
        String PaketJagung = globalClass.getPaketJagung();
        String PaketCabeMerah = globalClass.getPaketCabeMerah();
        String PaketTimun = globalClass.getPaketTimun();
        String PaketTerong = globalClass.getPaketTerong();
        String PaketPisang = globalClass.getPaketPisang();
        String PaketMangga = globalClass.getPaketMangga();
        String PaketApel = globalClass.getPaketApel();

        int hargakentang =+ totalKentang + totKentang;
        int hargacabe =+ totalCabe + totCabe;
        int hargarawit =+ totalCaberawit + totCaberawit;
        int hargaterong =+ totalTerong + totTerong;
        int hargajagung =+ totalJagung + totJagung;
        int hargatimun =+ totalTimun + totTimun;
        int hargapisang =+ totalPisang + totPisang;
        int hargamangga =+ totalMangga + totMangga;
        int hargaapel =+ totalApel + totApel;

        final String nama = ""+getnama;
        final String alamat = ""+getalamat;
        final String telpon = ""+gettelpon;
        final String email = ""+getemail;
        final String pengiriman = ""+getpengiriman;
        final String pembayaran = ""+getpembayaran;
        final String pemilikrek = ""+getpemilikrek;
        final String norek = ""+getnorek;
        final String namabank = ""+getnamabank;

        final String produk = "Produk: "+
                "\n" +  PaketKentang +
                "\n" + PaketRawit+
                "\n" + PaketJagung+
                "\n" + PaketTimun+
                "\n" + PaketCabeMerah+
                "\n" + PaketTerong+
                "\n" + PaketPisang+
                "\n" + PaketMangga+
                "\n" + PaketApel;

        String produkKentang = getkentang + " " + nKentang + " kilo" + " Rp. " + hargakentang;
        String produkCabe = getcabe + " " + nCabe + " ons" + " Rp. " + hargacabe ;
        String produkRawit = getrawit + " " + nRawit + " ons" + " Rp. " + hargarawit;
        String produkTerong = getterong + " " + nTerong + " kilo" + " Rp. " + hargaterong;
        String produkJagung = getjagung + " " + nJagung + " kilo" + " Rp. " + hargajagung;
        String produkTimun = gettimun + " " + nTimun + " kilo" + " Rp. " + hargatimun;
        String produkPisang = getpisang + " " + nPisang + " kilo" + " Rp. " + hargapisang;
        String produkMangga = getmangga + " " + nMangga + " kilo" + " Rp. " + hargamangga;
        String produkApel = getapel + " " + nApel + " kilo" + " Rp. " + hargaapel;

        String namaproduk = produkKentang +"\n" + produkCabe + "\n" + produkRawit + "\n" + produkTerong
                + "\n" + produkJagung + "\n" + produkTimun + "\n" + produkPisang + "\n" + produkMangga + "\n" + produkApel;

        String nproduk = "Produk: ";
        if (getkentang != null){
            nproduk = produkKentang;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getcabe != null){
            nproduk = produkCabe;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getrawit != null){
            nproduk = produkRawit;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getterong != null){
            nproduk = produkTerong;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getjagung!=null){
            nproduk = produkJagung;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (gettimun != null){
            nproduk = gettimun;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }

        //kentang dan yang lain variasi 2 produk
        if (getkentang != null && getcabe != null){
            nproduk = produkKentang  + "\n"+ produkCabe;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getkentang != null && getrawit != null){
            nproduk = produkKentang  + "\n" + produkRawit;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }
        if (getkentang != null && getterong != null){
            nproduk = produkKentang  + "\n" + produkTerong;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && gettimun != null){
            nproduk = produkKentang  + "\n" + produkTimun;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getapel != null){
            nproduk = produkKentang  + "\n" + produkApel;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getmangga != null){
            nproduk = produkKentang + "\n" + produkMangga;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getpisang != null){
            nproduk = produkKentang  + "\n" + produkPisang;
            rekapProduk.setText(nproduk);
        }else if (getapel != null && getpisang != null){
            nproduk = produkApel  + "\n" + produkPisang;
            rekapProduk.setText(nproduk);
        }else if (getapel != null && getmangga != null){
            nproduk = produkApel  + "\n" + produkMangga;
            rekapProduk.setText(nproduk);
        }else if (getmangga != null && getpisang != null){
            nproduk = produkMangga  + "\n" + produkPisang;
            rekapProduk.setText(nproduk);
        }else if (getrawit != null && getcabe != null){
            nproduk = produkRawit  + "\n" + produkCabe;
            rekapProduk.setText(nproduk);
        }else if (gettimun != null && getjagung != null){
            nproduk = produkTimun  + "\n" + produkJagung;
            rekapProduk.setText(nproduk);
        }else if (gettimun != null && getterong != null){
            nproduk = produkTimun  + "\n" + produkTerong;
            rekapProduk.setText(nproduk);
        }else if (getterong != null && getjagung != null){
            nproduk = produkTerong  + "\n" + produkJagung;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }

        //variasi 3 produk kentang
        if (getkentang != null && getcabe != null && getrawit != null){
            nproduk = produkKentang + "\n" + produkCabe + "\n" + produkRawit;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getcabe != null && getterong != null){
            nproduk = produkKentang + "\n" + produkCabe + "\n" + produkTerong;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getpisang != null && getrawit != null){
            nproduk = produkKentang + "\n" + produkPisang + "\n" + produkRawit;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getcabe != null && getjagung !=null){
            nproduk = produkKentang + "\n" + produkCabe + "\n" + produkJagung;
            rekapProduk.setText(nproduk);
        }else if (getkentang != null && getapel != null && getpisang != null){
            nproduk = produkKentang + "\n" + produkPisang + "\n" + produkApel;
            rekapProduk.setText(nproduk);
        }else if (getcabe != null && getpisang != null && getterong != null){
            nproduk = produkPisang + "\n" + produkCabe + "\n" + produkTerong;
            rekapProduk.setText(nproduk);
        }else if (gettimun != null && getjagung != null && getrawit != null){
            nproduk = produkTimun + "\n" + produkJagung + "\n" + produkRawit;
            rekapProduk.setText(nproduk);
        }else {
            rekapProduk.setText(nproduk);
        }

        if (getkentang != null && getcabe != null && getrawit != null && getterong != null && getjagung != null && gettimun!= null && getapel != null && getpisang != null && getmangga != null) {
            nproduk = produkKentang + "\n" + produkCabe + "\n" + produkRawit + "\n" + produkTerong + "\n" + produkJagung + "\n" + produkTimun + "\n" + produkApel + "\n" + produkPisang +"\n" + produkMangga;
            rekapProduk.setText(nproduk);
        }

        rekapNama.setText(nama);
        rekapAlamat.setText(alamat);
        rekapTelpon.setText(telpon);
        rekapEmail.setText(email);
        rekapPengiriman.setText(pengiriman);
        rekapPembayaran.setText(pembayaran);
        rekapPemilikrek.setText(pemilikrek);
        rekapNorek.setText(norek);
        rekapBank.setText(namabank);
        //rekapProduk.setText(produk);
        rekapTotal.setText(String.valueOf(totalBayar));

        int hOngkir = 15000;
        final String ongkir = "Ongkir: Rp. 15.000";
        final int biayaAfterOngkir = totalBayar+hOngkir;
        String Ongkir = Integer.toString(biayaAfterOngkir);
        rekapBiayaAfterOngkir.setText(String.valueOf(biayaAfterOngkir));

        Button bayar = findViewById(R.id.bayar);
        Button lanjutbelanja = findViewById(R.id.lanjutbelanja);

        //SMS
//        bayar.setEnabled(false);
//        if (checkPermission(Manifest.permission.SEND_SMS)){
//            bayar.setEnabled(true);
//        }else {
//            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS}, SEND_SMS_PERMISSION_REQUEST_CODE);
//        }
//
//        String adminTelp = "082310205957";
//
//        if (telpon == null || telpon.length() == 0 || nama == null || nama.length()==0 || alamat == null || alamat.length()==0 || pengiriman == null || pengiriman.length()==0 || pembayaran == null || pembayaran.length()==0 || pemilikrek == null || pemilikrek.length()==0 || norek == null || norek.length()==0 || produk == null || produk.length()==0 || total == null || total.length()==0){
//            return;
//        }
//        if (checkPermission(Manifest.permission.SEND_SMS)){
//            SmsManager smsManager = SmsManager.getDefault();
//            smsManager.sendTextMessage(adminTelp, null, nama  + "\n" + alamat + "\n" + telpon + "\n" + pengiriman  + "\n" + nproduk +"\n" +ongkir + "\n" + "Total: " + Ongkir , null,null);
//            Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
//        }
        //////


        final String finalNproduk = nproduk;
        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RekapData.this, HalamanAkhir.class);
                startActivity(intent1);

                if (telpon == null || telpon.length() == 0 || nama == null || nama.length()==0 || alamat == null || alamat.length()==0 || pengiriman == null || pengiriman.length()==0 || pembayaran == null || pembayaran.length()==0 || pemilikrek == null || pemilikrek.length()==0 || norek == null || norek.length()==0 || produk == null || produk.length()==0 || total == null || total.length()==0){
                    return;
                }

                String semuapesanan = "Pesanan Anda :"+"\n"+
                                        "Nama: " +nama+ "\n"+
                                        "Alamat: "+alamat+"\n"+
                                        "No. Hp: " +telpon+"\n"+
                                        "Email: "+email+"\n"+
                                        "Pengiriman: "+pengiriman+"\n"+
                                        "Pembayaran: "+pembayaran+"\n"+
                                        "Pemilik Rekening: "+pemilikrek+"\n"+
                                        "No. Rekening: "+norek+"\n"+"Bank: "+namabank+"\n"+
                                        "Produk: "+ finalNproduk +"\n"+
                                        "Total Bayar: "+totalBayar+"\n"+
                                        "Total Bayar dengan Ongkir: "+ biayaAfterOngkir;

                Intent kirimWA= new Intent(Intent.ACTION_SEND);
                kirimWA.setType("text/plain");
                kirimWA.putExtra(Intent.EXTRA_TEXT,semuapesanan);
                kirimWA.putExtra("jid",telpon +"@s.whatsapp.net");
                kirimWA.setPackage("com.whatsapp");
                startActivity(kirimWA);
            }
        });

        lanjutbelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RekapData.this,ProdukSayur.class);
                startActivity(intent);
            }
        });
    }

    public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this,permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}