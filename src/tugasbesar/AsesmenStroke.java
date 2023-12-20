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
public class AsesmenStroke extends Asesmen {

    private boolean matiRasa;
    
    public AsesmenStroke(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);
    }
    
    public AsesmenStroke(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan, boolean matiRasa) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);
        this.matiRasa = matiRasa;
    }
    
    @Override
    public String prediksi() {

        if (matiRasa){
            return "positif";
        }
        
        if (this.getUsia() <= 48) {
            return "negatif";
        } else {
            return "positif";
        }
    }
}
