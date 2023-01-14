package com.example.zakiamahbubabdullah_farmer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public class RekapData extends AppCompatActivity {
    String data;
    TextView rekapNama, rekapAlamat, rekapTelpon, rekapEmail, rekapPengiriman, rekapPembayaran, rekapPemilikrek, rekapNorek, rekapBank, rekapProduk, rekapTotal,rekapBiayaAfterOngkir;
    String kentang, cabe, rawit, terong, jagung, timun, pisang, mangga, apel;
    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
//    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
//    DatabaseReference reff;
//    GlobalClass GlobalClass;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekap_data);

        progressDialog = new ProgressDialog(RekapData.this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Menyimpan....");

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
        int banyakKentang = globalClass.getBanyakkentang1();
        int banyakCabe = globalClass.getBanyakcabe1();
        int banyakRawit = globalClass.getBanyakrawit1();
        int banyakTerong = globalClass.getBanyakterong1();
        int banyakJagung = globalClass.getBanyakjagung1();
        int banyakTimun = globalClass.getBanyaktimun1();
        int banyakPisang = globalClass.getBanyakpisang1();
        int banyakApel = globalClass.getBanyakapel1();
        int banyakMangga = globalClass.getBanyakmangga1();

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

        final String nama = ""+ getnama;
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


//        GlobalClass = new GlobalClass();
//        reff = FirebaseDatabase.getInstance().getReference().child("GlobalClass");


        final String finalNproduk = nproduk;
        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //coba firebase
                String fr_nama = rekapNama.getText().toString().trim();
                String fr_alamat = rekapAlamat.getText().toString().trim();
                String fr_telpon = rekapTelpon.getText().toString().trim();
                String fr_email = rekapEmail.getText().toString().trim();
                String fr_pengiriman = rekapPengiriman.getText().toString().trim();
                String fr_pembayaran = rekapPembayaran.getText().toString().trim();
                String fr_pemilikrek = rekapPemilikrek.getText().toString().trim();
                String fr_norek = rekapNorek.getText().toString().trim();
                String fr_bank = rekapBank.getText().toString().trim();
                String fr_produk = rekapProduk.getText().toString().trim();
                Integer fr_total = Integer.parseInt(rekapTotal.getText().toString().trim());
                Integer fr_biayaafterongkir = Integer.parseInt(rekapBiayaAfterOngkir.getText().toString().trim());

                //firestore
                savedata(fr_nama,fr_alamat,fr_telpon,fr_email,fr_pengiriman,fr_pembayaran,fr_pemilikrek,fr_norek,fr_bank,fr_produk,fr_total,fr_biayaafterongkir);
//
//                GlobalClass.setGCNama(fr_nama);
//                GlobalClass.setGCAlamat(fr_alamat);
//                GlobalClass.setGCNoHp(fr_telpon);
//                GlobalClass.setGCEmail(fr_email);
//                GlobalClass.setGCPengiriman(fr_pengiriman);
//                GlobalClass.setGCPilihBank(fr_pembayaran);
//                GlobalClass.setGCNamaPemilik(fr_pemilikrek);
//                GlobalClass.setGCNoRek(fr_norek);
//                GlobalClass.setGCNamaBank(fr_bank);
//                GlobalClass.setGCProduk(fr_produk);
//                GlobalClass.setTotalBayar(fr_total);
//                GlobalClass.setTotalBayarProduk(fr_biayaafterongkir);
//
//                reff.push().setValue(GlobalClass);
//                Toast.makeText(RekapData.this, "data inserted successfully", Toast.LENGTH_LONG).show();
//


                //firebase
//                database.child("GlobalClass").push().setValue(new GlobalClass(nama, alamat,telpon,email,pengiriman,pembayaran,pemilikrek,norek,namabank,finalNproduk,totalBayar,biayaAfterOngkir)).addOnSuccessListener(aVoid -> {
//                    Toast.makeText(RekapData.this, "Data berhasil disimpan!", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(RekapData.this, Firebase.class));
//                    finish();
//
//                }) .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Toast.makeText(RekapData.this, "Gagal menyimpan data!", Toast.LENGTH_SHORT).show();
//
//                    }
//                });

                if (telpon == null || telpon.length() == 0 || nama == null || nama.length()==0 || alamat == null || alamat.length()==0 || pengiriman == null || pengiriman.length()==0 || pembayaran == null || pembayaran.length()==0 || pemilikrek == null || pemilikrek.length()==0 || norek == null || norek.length()==0 || produk == null || produk.length()==0 || total == null || total.length()==0) {
                    return;
                }

                String semuapesanan = "Pesanan Anda :"+"\n"
                        +"Nama: " +nama+ "\n"
                        +"Alamat: "+alamat+"\n"
                        +"No. Hp: " +telpon+"\n"
                        +"Email: "+email+"\n"
                        +"Pengiriman: "+pengiriman+"\n"
                        +"Pembayaran: "+pembayaran+"\n"
                        +"Pemilik Rekening: "+pemilikrek+"\n"
                        +"No. Rekening: "+norek+"\n"
                        +"Bank: "+namabank+"\n"
                        +"Produk: "+finalNproduk+"\n"
                        +"Total Bayar: "+totalBayar+"\n"
                        +"Total Bayar dengan Ongkir: "+ biayaAfterOngkir;

                Intent kirimWA= new Intent(Intent.ACTION_SEND);
                kirimWA.setType("text/plain");
                kirimWA.putExtra(Intent.EXTRA_TEXT,semuapesanan);
                kirimWA.putExtra("jid",telpon +"@s.whatsapp.net");
                kirimWA.setPackage("com.whatsapp");
                startActivity(kirimWA);

                startActivity(new Intent(RekapData.this, HalamanAkhir.class));

//                boolean installed = appInstalledOrNot("com.whatsapp");
//                if(installed){
//                    Intent intent = new Intent(Intent.ACTION_SEND, Uri.parse("https://api.whatsapp.com/send?phone=" +fr_telpon
//                                                                            +"&text=" + semuapesanan));
//                    startActivity(intent);
//
//                } else {
//                    Toast.makeText(RekapData.this, "Whatsapp not installed on your device",Toast.LENGTH_SHORT).show();
//                }
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

    private void savedata(String nama, String alamat, String telpon, String email, String pengiriman,
                          String pembayaran, String pemilikrek, String norek, String namabank,
                          String finalNproduk, Integer totalBayar, Integer biayaAfterOngkir){
        Map<String, Object> user = new HashMap<>();
        user.put("nama : ",nama);
        user.put("alamat : ", alamat);
        user.put("No Hp : ", telpon);
        user.put("Email", email);
        user.put("pengiriman : ", pengiriman);
        user.put("pembayaran : ", pembayaran);
        user.put("nama pemilik rekening : ", pemilikrek);
        user.put("nomor rekening : ", norek);
        user.put("nama bank : ", namabank);
        user.put("produk : ", finalNproduk);
        user.put("total bayar : ", totalBayar);
        user.put("total bayar + ongkir : ", biayaAfterOngkir);

        progressDialog.show();
        db.collection("users")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(getApplicationContext(), "Berhasil!", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                });
    }

    private boolean appInstalledOrNot(String uri){
        PackageManager packageManager = getPackageManager();
        boolean appInstalled;

        try {
            packageManager.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            appInstalled = true;
        } catch (PackageManager.NameNotFoundException e){
            appInstalled = false;
        }
        return appInstalled;
    }
}