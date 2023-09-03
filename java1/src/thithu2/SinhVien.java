/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu2;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SinhVien {

    private int MSSV;
    private String TenSSV;
    private int NamSinh;
    private double Diem;

    public SinhVien() {
    }

    public SinhVien(int MSSV, String TenSSV, int NamSinh, double Diem) {
        this.MSSV = MSSV;
        this.TenSSV = TenSSV;
        this.NamSinh = NamSinh;
        this.Diem = Diem;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getTenSSV() {
        return TenSSV;
    }

    public void setTenSSV(String TenSSV) {
        this.TenSSV = TenSSV;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap MSSV: ");
        setMSSV(sc.nextInt());
        sc.nextLine();
        System.out.printf("Nhap ten: ");
        setTenSSV(sc.nextLine());

        System.out.printf("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());

        System.out.printf("Nhap diem: ");
        setDiem(sc.nextDouble());
    }

    public void xuat() {
        System.out.printf("%10d\t|\t%-30s\t|\t%5d\t|\t%2.2f\n", MSSV, TenSSV, NamSinh, Diem);
    }

}
