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
public class TiepThi extends NhanVien{
    protected double doanhSo;
    protected double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong+(doanhSo*hueHong);
    }
 
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    
}
