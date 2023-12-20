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
public class AsesmenDiabetes extends Asesmen {
    
    private boolean turunanDiabetes;

    public AsesmenDiabetes(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);
    }
    
    public AsesmenDiabetes(String jenisAsesmen, String tanggal, int usia, int tekananDarahSis, int tekananDarahDia, float tinggiBadan, float beratBadan, boolean turunanDiabetes) {
        super(jenisAsesmen, tanggal, usia, tekananDarahSis, tekananDarahDia, tinggiBadan, beratBadan);
        this.turunanDiabetes = turunanDiabetes;
    }
    
    @Override
    public String prediksi() {
        
        if (turunanDiabetes) {
            return "positif";
        }

        float bmi = (float) this.getBeratBadan() * 10000.0f / (float) this.getTinggiBadan() / (float) this.getTinggiBadan();

        if (this.getUsia() <= 28) {
            if (bmi <= 26.7) {
                return "negatif";
            } else {
                return "positif";
            }
        } else {
            if (bmi <= 41.75) {
                if (this.getTekananDarahDia() <= 63) {
                    return "negatif";
                } else {
                    return "positif";
                }
            } else if (this.getTekananDarahDia() <= 12) {
                return "positif";
            } else {
                return "negatif";
            }
        }
    }
}
