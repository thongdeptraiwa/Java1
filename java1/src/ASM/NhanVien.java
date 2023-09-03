/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;


/**
 *
 * @author macos
 */
public class NhanVien {
    protected  String maNV;
    protected  String hoTen;
    protected  double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
   
    public double getThueTN(){
        if(getThuNhap()<9)
            return 0;
        else if(getThuNhap()<15)
            return luong * 0.1;
        else    
            return luong * 0.12;
    }
    
    public double getThuNhap(){
        return luong;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}               
