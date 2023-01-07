package com.example.zakiamahbubabdullah_farmer;

import android.app.Application;

public class GlobalClass extends Application {
    //buat data pembayaran
    private String GCNama;
    private String GCAlamat;
    private String GCNoHp;
    private String GCEmail;
    private String GCPengiriman;
    private String GCPilihBank;
    private String GCNamaPemilik;
    private String GCNoRek;
    private String GCNamaBank;
    private String GCNamaBankLain;
    private String GCProduk;
    private String GCPaket;
    private String GCJumlah;
    private String GCTotal;
    private String GCProdukBuah;
    private String GCProdukSayur;

    //buat nama produk yang dibeli
    private String produkKentang;
    private String produkCabe;
    private String produkCaberawit;
    private String produkTerong;
    private String produkJagung;
    private String produkTimun;
    private String produkApel;
    private String produkMangga;
    private String produkPisang;

    //buat banyaknya produk yang dibeli di halaman produk sayur
    private int banyakKentang;
    private int banyakTimun;
    private int banyakCabe;
    private int banyakCaberawit;
    private int banyakTerong;
    private int banyakJagung;
    private int banyakApel;
    private int banyakPisang;
    private int banyakMangga;

    //buat masukin produk yang dibeli
    private String paketKentang;
    private String paketRawit;
    private String paketJagung;
    private String paketCabeMerah;
    private String paketPisang;
    private String paketApel;
    private String paketMangga;
    private String paketTimun;
    private String paketTerong;

    //buat banyaknya produk yang dibeli di halaman masing2 produk
    private int banyakkentang;
    private int banyakcabe;
    private int banyakrawit;
    private int banyakterong;
    private int banyakjagung;
    private int banyaktimun;
    private int banyakpisang;
    private int banyakmangga;
    private int banyakapel;

    //buat total produk yang dibeli di halaman produk masing2
    private int totalKentang;
    private int totalCabe;
    private int totalCaberawit;
    private int totalTerong;
    private int totalJagung;
    private int totalTimun;
    private int totalMangga;
    private int totalApel;
    private int totalCarica;
    private int totalPisang;

    //buat total produk yang dibeli di halaman sayur
    private int totKentang;
    private int totCabe;
    private int totCaberawit;
    private int totTerong;
    private int totJagung;
    private int totTimun;
    private int totCarica;
    private int totMangga;
    private int totApel;
    private int totPisang;

    //buat total jumlah harga produk semuanya
    private int totalBayar;
    private int totalBayarProduk;



    public String getGCNama() {
        return GCNama;
    }

    public void setGCNama(String GCNama) {
        this.GCNama = GCNama;
    }

    public String getGCAlamat() {
        return GCAlamat;
    }

    public void setGCAlamat(String GCAlamat) {
        this.GCAlamat = GCAlamat;
    }

    public String getGCNoHp() {
        return GCNoHp;
    }

    public void setGCNoHp(String GCNoHp) {
        this.GCNoHp = GCNoHp;
    }

    public String getGCEmail() {
        return GCEmail;
    }

    public void setGCEmail(String GCEmail) {
        this.GCEmail = GCEmail;
    }

    public String getGCPengiriman() {
        return GCPengiriman;
    }

    public void setGCPengiriman(String GCPengiriman) {
        this.GCPengiriman = GCPengiriman;
    }

    public String getGCPilihBank() {
        return GCPilihBank;
    }

    public void setGCPilihBank(String GCPilihBank) {
        this.GCPilihBank = GCPilihBank;
    }

    public String getGCNamaPemilik() {
        return GCNamaPemilik;
    }

    public void setGCNamaPemilik(String GCNamaPemilik) {
        this.GCNamaPemilik = GCNamaPemilik;
    }

    public String getGCNoRek() {
        return GCNoRek;
    }

    public void setGCNoRek(String GCNoRek) {
        this.GCNoRek = GCNoRek;
    }

    public String getGCNamaBank() {
        return GCNamaBank;
    }

    public void setGCNamaBank(String GCNamaBank) {
        this.GCNamaBank = GCNamaBank;
    }

    public String getGCNamaBankLain() {
        return GCNamaBankLain;
    }

    public void setGCNamaBankLain(String GCNamaBankLain) {
        this.GCNamaBankLain = GCNamaBankLain;
    }

    public String getGCProduk() {
        return GCProduk;
    }

    public void setGCProduk(String GCProduk) {
        this.GCProduk = GCProduk;
    }

    public String getGCPaket() {
        return GCPaket;
    }

    public void setGCPaket(String GCPaket) {
        this.GCPaket = GCPaket;
    }

    public String getGCJumlah() {
        return GCJumlah;
    }

    public void setGCJumlah(String GCJumlah) {
        this.GCJumlah = GCJumlah;
    }

    public String getGCTotal() {
        return GCTotal;
    }

    public void setGCTotal(String GCTotal) {
        this.GCTotal = GCTotal;
    }

    public int getTotalKentang() {
        return totalKentang;
    }

    public void setTotalKentang(int totalKentang) {
        this.totalKentang = totalKentang;
    }

    public int getTotalCabe() {
        return totalCabe;
    }

    public void setTotalCabe(int totalCabe) {
        this.totalCabe = totalCabe;
    }

    public int getTotalCaberawit() {
        return totalCaberawit;
    }

    public void setTotalCaberawit(int totalCaberawit) {
        this.totalCaberawit = totalCaberawit;
    }

    public int getTotalTerong() {
        return totalTerong;
    }

    public void setTotalTerong(int totalTerong) {
        this.totalTerong = totalTerong;
    }

    public int getTotalJagung() {
        return totalJagung;
    }

    public void setTotalJagung(int totalJagung) {
        this.totalJagung = totalJagung;
    }

    public int getTotalTimun() {
        return totalTimun;
    }

    public void setTotalTimun(int totalTimun) {
        this.totalTimun = totalTimun;
    }

    public int getTotalMangga() {
        return totalMangga;
    }

    public void setTotalMangga(int totalMangga) {
        this.totalMangga = totalMangga;
    }

    public int getTotalApel() {
        return totalApel;
    }

    public void setTotalApel(int totalApel) {
        this.totalApel = totalApel;
    }

    public int getTotalCarica() {
        return totalCarica;
    }

    public void setTotalCarica(int totalCarica) {
        this.totalCarica = totalCarica;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public int getTotKentang() {
        return totKentang;
    }

    public void setTotKentang(int totKentang) {
        this.totKentang = totKentang;
    }

    public int getTotCabe() {
        return totCabe;
    }

    public void setTotCabe(int totCabe) {
        this.totCabe = totCabe;
    }

    public int getTotCaberawit() {
        return totCaberawit;
    }

    public void setTotCaberawit(int totCaberawit) {
        this.totCaberawit = totCaberawit;
    }

    public int getTotTerong() {
        return totTerong;
    }

    public void setTotTerong(int totTerong) {
        this.totTerong = totTerong;
    }

    public int getTotJagung() {
        return totJagung;
    }

    public void setTotJagung(int totJagung) {
        this.totJagung = totJagung;
    }

    public int getTotTimun() {
        return totTimun;
    }

    public void setTotTimun(int totTimun) {
        this.totTimun = totTimun;
    }

    public int getTotCarica() {
        return totCarica;
    }

    public void setTotCarica(int totCarica) {
        this.totCarica = totCarica;
    }

    public int getTotMangga() {
        return totMangga;
    }

    public void setTotMangga(int totMangga) {
        this.totMangga = totMangga;
    }

    public int getTotApel() {
        return totApel;
    }

    public void setTotApel(int totApel) {
        this.totApel = totApel;
    }

    public String getGCProdukSayur() {
        return GCProdukSayur;
    }

    public void setGCProdukSayur(String GCProdukSayur) {
        this.GCProdukSayur = GCProdukSayur;
    }

    public String getGCProdukBuah() {
        return GCProdukBuah;
    }

    public void setGCProdukBuah(String GCProdukBuah) {
        this.GCProdukBuah = GCProdukBuah;
    }

    public int getTotalBayarProduk() {
        return totalBayarProduk;
    }

    public void setTotalBayarProduk(int totalBayarProduk) {
        this.totalBayarProduk = totalBayarProduk;
    }

    public int getBanyakKentang() {
        return banyakKentang;
    }

    public void setBanyakKentang(int banyakKentang) {
        this.banyakKentang = banyakKentang;
    }

    public int getBanyakTimun() {
        return banyakTimun;
    }

    public void setBanyakTimun(int banyakTimun) {
        this.banyakTimun = banyakTimun;
    }

    public int getBanyakCabe() {
        return banyakCabe;
    }

    public void setBanyakCabe(int banyakCabe) {
        this.banyakCabe = banyakCabe;
    }

    public int getBanyakCaberawit() {
        return banyakCaberawit;
    }

    public void setBanyakCaberawit(int banyakCaberawit) {
        this.banyakCaberawit = banyakCaberawit;
    }

    public int getBanyakTerong() {
        return banyakTerong;
    }

    public void setBanyakTerong(int banyakTerong) {
        this.banyakTerong = banyakTerong;
    }

    public int getBanyakJagung() {
        return banyakJagung;
    }

    public void setBanyakJagung(int banyakJagung) {
        this.banyakJagung = banyakJagung;
    }

    public String getProdukKentang() {
        return produkKentang;
    }

    public void setProdukKentang(String produkKentang) {
        this.produkKentang = produkKentang;
    }

    public String getProdukCabe() {
        return produkCabe;
    }

    public void setProdukCabe(String produkCabe) {
        this.produkCabe = produkCabe;
    }

    public String getProdukCaberawit() {
        return produkCaberawit;
    }

    public void setProdukCaberawit(String produkCaberawit) {
        this.produkCaberawit = produkCaberawit;
    }

    public String getProdukTerong() {
        return produkTerong;
    }

    public void setProdukTerong(String produkTerong) {
        this.produkTerong = produkTerong;
    }

    public String getProdukJagung() {
        return produkJagung;
    }

    public void setProdukJagung(String produkJagung) {
        this.produkJagung = produkJagung;
    }

    public String getProdukTimun() {
        return produkTimun;
    }

    public void setProdukTimun(String produkTimun) {
        this.produkTimun = produkTimun;
    }

    public String getProdukApel() {
        return produkApel;
    }

    public void setProdukApel(String produkApel) {
        this.produkApel = produkApel;
    }

    public String getProdukMangga() {
        return produkMangga;
    }

    public void setProdukMangga(String produkMangga) {
        this.produkMangga = produkMangga;
    }

    public String getProdukPisang() {
        return produkPisang;
    }

    public void setProdukPisang(String produkPisang) {
        this.produkPisang = produkPisang;
    }

    public int getTotPisang() {
        return totPisang;
    }

    public void setTotPisang(int totPisang) {
        this.totPisang = totPisang;
    }

    public int getTotalPisang() {
        return totalPisang;
    }

    public void setTotalPisang(int totalPisang) {
        this.totalPisang = totalPisang;
    }

    public int getBanyakApel() {
        return banyakApel;
    }

    public void setBanyakApel(int banyakApel) {
        this.banyakApel = banyakApel;
    }

    public int getBanyakPisang() {
        return banyakPisang;
    }

    public void setBanyakPisang(int banyakPisang) {
        this.banyakPisang = banyakPisang;
    }

    public int getBanyakMangga() {
        return banyakMangga;
    }

    public void setBanyakMangga(int banyakMangga) {
        this.banyakMangga = banyakMangga;
    }

    public int getBanyakapel() {
        return banyakapel;
    }

    public void setBanyakapel(int banyakapel) {
        this.banyakapel = banyakapel;
    }

    public int getBanyakmangga() {
        return banyakmangga;
    }

    public void setBanyakmangga(int banyakmangga) {
        this.banyakmangga = banyakmangga;
    }

    public int getBanyakpisang() {
        return banyakpisang;
    }

    public void setBanyakpisang(int banyakpisang) {
        this.banyakpisang = banyakpisang;
    }

    public int getBanyaktimun() {
        return banyaktimun;
    }

    public void setBanyaktimun(int banyaktimun) {
        this.banyaktimun = banyaktimun;
    }

    public int getBanyakjagung() {
        return banyakjagung;
    }

    public void setBanyakjagung(int banyakjagung) {
        this.banyakjagung = banyakjagung;
    }

    public int getBanyakterong() {
        return banyakterong;
    }

    public void setBanyakterong(int banyakterong) {
        this.banyakterong = banyakterong;
    }

    public int getBanyakrawit() {
        return banyakrawit;
    }

    public void setBanyakrawit(int banyakrawit) {
        this.banyakrawit = banyakrawit;
    }

    public int getBanyakcabe() {
        return banyakcabe;
    }

    public void setBanyakcabe(int banyakcabe) {
        this.banyakcabe = banyakcabe;
    }

    public int getBanyakkentang() {
        return banyakkentang;
    }

    public void setBanyakkentang(int banyakkentang) {
        this.banyakkentang = banyakkentang;
    }

    public String getPaketKentang() {
        return paketKentang;
    }

    public void setPaketKentang(String paketKentang) {
        this.paketKentang = paketKentang;
    }

    public String getPaketRawit() {return paketRawit;}

    public void setPaketRawit(String paketRawit) {
        this.paketRawit = paketRawit;
    }

    public String getPaketJagung() {
        return paketJagung;
    }

    public void setPaketJagung(String paketJagung) {
        this.paketJagung = paketJagung;
    }

    public String getPaketApel() {
        return paketApel;
    }

    public void setPaketApel(String paketApel) {
        this.paketApel = paketApel;
    }

    public String getPaketCabeMerah() {
        return paketCabeMerah;
    }

    public void setPaketCabeMerah(String paketCabeMerah) {
        this.paketCabeMerah = paketCabeMerah;
    }

    public String getPaketPisang() {
        return paketPisang;
    }

    public void setPaketPisang(String paketPisang) {
        this.paketPisang = paketPisang;
    }
    public String getPaketMangga() {
        return paketMangga;
    }

    public void setPaketMangga(String paketMangga) {
        this.paketMangga = paketMangga;
    }
    public String getPaketTerong() {
        return paketTerong;
    }

    public void setPaketTerong(String paketTerong) {
        this.paketTerong = paketTerong;
    }


    public void setPaketTimun(String paketTimun) {
        this.paketTimun = paketTimun;
    }
    public String getPaketTimun() {
        return paketTimun;
    }
}

