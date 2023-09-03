/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu1;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SinhVien {
    public  String hoTen;
    public String ma;
    public double diem;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String ma, double diem) {
        this.hoTen = hoTen;
        this.ma = ma;
        this.diem = diem;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap ma Sv: ");
        setMa(sc.nextLine());
        System.out.print("Nhap diem: ");
        setDiem(sc.nextDouble());
    }
    
    
    
    public String xepLoai(){
        if(diem>=9)
            return "Gioi";
        else if(diem>=7)
            return "Kha";
        else if(diem>=5)
            return "Trung Binh";
        else
            return "Yeu";
    }
    
    public void xuat(){
        System.out.printf("%-30s|\t%10s\t|\t%2.2f\t|\t%s\n",hoTen,ma,diem,xepLoai());
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    
    
    
    
}
