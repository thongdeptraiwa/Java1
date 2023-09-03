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
public abstract class SinhVienPoly {
    private String ten;
    private String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String ten, String nganh) {
        this.ten = ten;
        this.nganh = nganh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        setTen(sc.nextLine());
        System.out.print("Nhap nganh: ");
        setNganh(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Ten : "+getTen());
        System.out.println("Nganh : "+getNganh());
        System.out.println("Diem : "+getDiem());
        System.out.println("Hoc luc : "+hocLuc());
    }
    public abstract double getDiem();
    
    public String hocLuc(){
        //double diem = getDiem();
        String hocLuc;
        if(getDiem()>=9)
            hocLuc="Xuat sac";
        else if(getDiem()>=7.5)
            hocLuc ="Gioi";
        else if(getDiem()>=6.5)
            hocLuc ="Kha";
        else if(getDiem()>=5)
            hocLuc ="TB";
        else
            hocLuc="Yeu";
        return hocLuc;
    }
}
