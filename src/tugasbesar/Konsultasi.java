/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author naufa
 */
public class Konsultasi {
    private User pengirim;
    private String pesan;
    private String balasan;
    private String tanggal;

    public Konsultasi(String pesan, String balasan, String tanggal) {
        this.pesan = pesan;
        this.balasan = balasan;
        this.tanggal = tanggal;
    }

    public Konsultasi(User pengirim, String pesan, String balasan, String tanggal) {
        this.pengirim = pengirim;
        this.pesan = pesan;
        this.balasan = balasan;
        this.tanggal = tanggal;
    }

    public User getPengirim() {
        return pengirim;
    }

    public void setPengirim(User pengirim) {
        this.pengirim = pengirim;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getBalasan() {
        return balasan;
    }

    public void setBalasan(String balasan) {
        this.balasan = balasan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
        
        
}
