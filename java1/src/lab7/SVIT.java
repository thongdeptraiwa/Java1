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
public class SVIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SVIT() {
    }

    public SVIT(String ten, String nganh,double diemJava, double diemCss, double diemHtml) {
        super(ten, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem java: ");
        setDiemJava(sc.nextDouble());
        System.out.print("Nhap diem css: ");
        setDiemCss(sc.nextDouble());
        System.out.print("Nhap diem html: ");
        setDiemHtml(sc.nextDouble());
    }
    
    
    @Override
    public double getDiem() {
        return (2*getDiemJava()+getDiemCss()+getDiemHtml())/4;
    }
    
}
