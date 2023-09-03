/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SinhVien {
    private String ten;
    private String ma;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String ma, double diem) {
        this.ten = ten;
        this.ma = ma;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        setTen(sc.nextLine());
        System.out.print("Nhap ma: ");
        setMa(sc.nextLine());
        System.out.print("Nhap diem: ");
        setDiem(Integer.parseInt(sc.nextLine()));
        
    }
    public String xeploai(){
        if(diem>=9)
            return "Gioi";
        else if(diem>=7)
            return "Kha";
        else if(diem>=5)
            return "Trung binh";
        else
            return "Yeu";
    }
    public void xuat(){
        System.out.printf("%-30s\t|\t%10S\t|\t%.2f\t|\t%10s\n",getTen(),getMa(),getDiem(),xeploai());
    }
}
