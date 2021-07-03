/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

/**
 *
 * @author hoang
 */
public class DiemSinhvien {
    private String masv,hoten;
    private float TA,TH,GDTC;

    public DiemSinhvien(String masv, String hoten, float TA, float TH, float GDTC) {
        this.masv = masv;
        this.hoten = hoten;
        this.TA = TA;
        this.TH = TH;
        this.GDTC = GDTC;
    }

    public DiemSinhvien() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getTA() {
        return TA;
    }

    public void setTA(float TA) {
        this.TA = TA;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
            float diemTB(){
                float tb=(getTA()+getTH()+getGDTC())/3;
  return Math.round(tb*10f)/10f;
} 
}
