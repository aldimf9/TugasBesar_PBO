/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.Date;

/**
 *
 * @author naufa
 */
public abstract class Asesmen {
    private String jenisAsesmen,hasilDiagnosis, tanggal;
    private User pengguna;
    private int usia,tekananDarahSis,tekananDarahDia;
    private float tinggiBadan,beratBadan;

    public Asesmen(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan) {
        this.jenisAsesmen = jenisAsesmen;
        this.tanggal = tanggal;
        this.usia = usia;
        this.tekananDarahSis = tekananDarahSis;
        this.tekananDarahDia = tekananDarahDia;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        
        this.hasilDiagnosis = this.prediksi();
    }
    
    public Asesmen(String jenisAsesmen, String tanggal, User pengguna, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan) {
        this.jenisAsesmen = jenisAsesmen;
        this.tanggal = tanggal;
        this.pengguna = pengguna;
        this.usia = usia;
        this.tekananDarahSis = tekananDarahSis;
        this.tekananDarahDia = tekananDarahDia;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
        
        this.hasilDiagnosis = this.prediksi();
    }
    

    
    public void tampilkanHasil(){
        System.out.println("Hasil diagnosis anda adalah: "+ this.hasilDiagnosis);
    }
    
    public abstract String prediksi();

    public String getJenisAsesmen() {
        return jenisAsesmen;
    }

    public void setJenisAsesmen(String jenisAsesmen) {
        this.jenisAsesmen = jenisAsesmen;
    }

    public String getHasilDiagnosis() {
        return hasilDiagnosis;
    }

    public void setHasilDiagnosis(String hasilDiagnosis) {
        this.hasilDiagnosis = hasilDiagnosis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public User getPengguna() {
        return pengguna;
    }

    public void setPengguna(User pengguna) {
        this.pengguna = pengguna;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getTekananDarahSis() {
        return tekananDarahSis;
    }

    public void setTekananDarahSis(int tekananDarahSis) {
        this.tekananDarahSis = tekananDarahSis;
    }

    public int getTekananDarahDia() {
        return tekananDarahDia;
    }

    public void setTekananDarahDia(int tekananDarahDia) {
        this.tekananDarahDia = tekananDarahDia;
    }

    public float getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(float tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public float getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(float beratBadan) {
        this.beratBadan = beratBadan;
    }
    
    
}
