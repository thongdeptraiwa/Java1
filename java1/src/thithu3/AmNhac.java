/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu3;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class AmNhac {
    private String maAlbum;
    private String tenAlbum;
    private double gia;
     
    private Scanner sc = new Scanner(System.in);
    
    public AmNhac() {
    }

    public AmNhac(String maAlbum, String tenAlbum, double gia) {
        this.maAlbum = maAlbum;
        this.tenAlbum = tenAlbum;
        this.gia = gia;
    }
    

    public String getMaAlbum() {
        return maAlbum;
    }

    public void setMaAlbum(String maAlbum) {
        this.maAlbum = maAlbum;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhap(){
        System.out.print("Nhap ma: ");
        setMaAlbum(sc.nextLine());
        System.out.print("Nhap ten: ");
        setTenAlbum(sc.nextLine());
        System.out.print("Nhap gia: ");
        setGia(Double.parseDouble(sc.nextLine()));
    }
    public void xuat(){
        System.out.printf("%-5s\t|\t%-30s\t|\t%.0f\n",getMaAlbum(),getTenAlbum(),getGia());
    }
    
    public static void main(String[] args) {
        AmNhac an1 = new AmNhac();
        AmNhac an2 = new AmNhac();
        System.out.println("Nhap Album thu nhat");
        an1.nhap();
        System.out.println("Nhap Album thu hai");
        an2.nhap();
        System.out.printf("%-5s\t|\t%-30s\t|\t%s\n","Ma","Ten","Gia");
        an1.xuat();
        an2.xuat();
    }
}
