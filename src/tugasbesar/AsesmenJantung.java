/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author naufa
 */
public class AsesmenJantung extends Asesmen {
    
    private boolean seringNyeriDada, jantungSeringBerdebar;
    
    public AsesmenJantung(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);

    }

    public AsesmenJantung(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan, boolean seringNyeriDada, boolean jantungSeringBerdebar) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);
        this.seringNyeriDada = seringNyeriDada;
        this.jantungSeringBerdebar = jantungSeringBerdebar;
    }
    
    @Override
    public String prediksi() {
        
        if (seringNyeriDada && jantungSeringBerdebar){
            return "positif";
        }

        if (this.getTekananDarahSis() <= 128) {

            if(this.getTekananDarahDia() <= 5) {
                return "negatif";
            } else {
                return "positif";
            }

        } else if (this.getUsia() <= 58) {
            return "negatif";
        } else {
            return "positif";
        }

    }
}
