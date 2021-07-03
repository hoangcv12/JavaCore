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
public class Sinhvien {
    String masv,hoten,email,sodt;
    boolean gioitinh;
    String diachi,anh;

    public Sinhvien(String masv, String hoten, String email, String sodt, boolean gioitinh, String diachi, String anh) {
        this.masv = masv;
        this.hoten = hoten;
        this.email = email;
        this.sodt = sodt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.anh = anh;
    }

    public Sinhvien() {
    }
    
    
}
