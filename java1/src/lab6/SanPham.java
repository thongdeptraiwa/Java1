/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;
    
    public void nhap(){   
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap hang: ");
        hang = sc.nextLine();
    }
    public void xuat(){    
            System.out.printf("%-20s|\t%10f\t|\t%s\n",tenSP,donGia,hang);
    }
    

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
}
