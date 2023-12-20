/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author naufa
 */
public class User {
    
    private String email;
    private String password;
    private String username;
    private ArrayList<Asesmen> riwayatAsesmen = new ArrayList<>();
    private ArrayList<Konsultasi> riwayatKonsultasi = new ArrayList<>();

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    } 
    
    public User(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
    
    public Asesmen asesmen(String jenisAsesmen, User user, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan,
                boolean seringNyeriDada, boolean jantungSeringBerdebar, boolean keturunanDiabetes, boolean matiRasa){
        
        

        Date d = new Date();
        String tanggal = d.getDate() + "-" + d.getMonth() + "-" + (d.getYear() % 100);
        
        if (jenisAsesmen.equals("jantung")) {
            AsesmenJantung a = new AsesmenJantung(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan, seringNyeriDada, jantungSeringBerdebar);
            this.riwayatAsesmen.add(a);
            
            return a;
        } else if (jenisAsesmen.equals("stroke")) {
            AsesmenStroke a = new AsesmenStroke(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan, matiRasa);
            this.riwayatAsesmen.add(a);
            
            return a;
        } else {
            AsesmenDiabetes a = new AsesmenDiabetes(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan, keturunanDiabetes);
            this.riwayatAsesmen.add(a);
            
            return a;
        }
               
        
    }
    
    public Konsultasi konsultasi(String jenisPesan){
        
        

        
        
        String balasan, pesan;
        if (jenisPesan.equals("jantung")) {
            pesan = "Saya positif jantung";
            balasan = "Anda perlu menjaga pola makan dan berhenti merokok";
            
        } else if (jenisPesan.equals("stroke")) {
            pesan = "Saya positif stroke";
            balasan = "Anda perlu rajin berolahraga";
        } else {
            pesan = "Saya positif diabetes";
            balasan = "Anda tidak boleh makan dan minum yang manis-manis";
        }
       
        
        Date d = new Date();
        String tanggal = d.getDate() + "-" + d.getMonth() + "-" + (d.getYear() % 100);
        
        Konsultasi k = new Konsultasi(this, pesan, balasan, tanggal);
        riwayatKonsultasi.add(k);
        
        return k;
               
    }
    
    public String[] getKonsultasiHighlight() {
        String[] highlight = new String[this.riwayatKonsultasi.size()];
        
        int cnt = 0;
        for (Konsultasi k: riwayatKonsultasi){
            highlight[cnt] = k.getTanggal() + " pesan: " + k.getPesan() + " , balasan: " + k.getBalasan();
            cnt++;
        }
        
        return highlight;
    }
    
    public String[] getAsesmenHighlight() {
        String[] highlight = new String[this.riwayatAsesmen.size()];
        
        int cnt = 0;
        for (Asesmen a: riwayatAsesmen){
            highlight[cnt] = a.getTanggal() + " jenis: " + a.getJenisAsesmen() + " , hasil: " + a.getHasilDiagnosis();
            cnt++;
        }
        
        return highlight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Asesmen> getRiwayatAsesmen() {
        return riwayatAsesmen;
    }

    public void setRiwayatAsesmen(ArrayList<Asesmen> riwayatAsesmen) {
        this.riwayatAsesmen = riwayatAsesmen;
    }

    public ArrayList<Konsultasi> getRiwayatKonsultasi() {
        return riwayatKonsultasi;
    }

    public void setRiwayatKonsultasi(ArrayList<Konsultasi> riwayatKonsultasi) {
        this.riwayatKonsultasi = riwayatKonsultasi;
    }
    
    
}
