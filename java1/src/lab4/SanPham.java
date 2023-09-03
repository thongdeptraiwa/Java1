/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SanPham {
    public String ten;
    public double donGia;
    public double giamGia;

    public SanPham() {

    }
   
    public SanPham(String ten, double donGia, double giamGia) {
        this.ten = ten;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
     public SanPham(String ten, double donGia) {
        this(ten,donGia,0);
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    
      
    private double getThueNhapKhau(){
        return donGia * 0.1;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap ten: ");ten = sc.nextLine();
        System.out.printf("Nhap don gia: ");donGia = Double.parseDouble(sc.nextLine());
        System.out.printf("Nhap giam gia: ");
        giamGia = Double.parseDouble(sc.nextLine());       
    }
    
    public void xuat(){
        System.out.println("Ten san pham: "+ten);
        System.out.println("Don Gia: "+donGia);
        System.out.println("Giam gia: "+giamGia);
        System.out.println("Thue nhap khau: "+getThueNhapKhau());
    }

    
    
}
