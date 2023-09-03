/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SVBiz extends SinhVienPoly{
    private double diemMkt;
    private double diemSales;

    public SVBiz() {
    }

    public SVBiz(String ten, String nganh,double diemMkt, double diemSales) {
        super(ten, nganh);
        this.diemMkt = diemMkt;
        this.diemSales = diemSales;
    }

    public double getDiemMkt() {
        return diemMkt;
    }

    public void setDiemMkt(double diemMkt) {
        this.diemMkt = diemMkt;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem Maketing: ");
        setDiemMkt(sc.nextDouble());
        System.out.print("Nhap diem Sales: ");
        setDiemSales(sc.nextDouble());
    }
    
    @Override
    public double getDiem() {
        return (2*getDiemMkt()+getDiemSales())/3;
    }
    
}
