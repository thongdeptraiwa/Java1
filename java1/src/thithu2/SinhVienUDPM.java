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
public class SinhVienUDPM extends SinhVien {

    private double DiemJava;
    private double DiemWeb;

    public SinhVienUDPM() {
    }

    public SinhVienUDPM(double DiemJava, double DiemWeb, int MSSV, String TenSSV, int NamSinh, double Diem) {
        super(MSSV, TenSSV, NamSinh, Diem);
        this.DiemJava = DiemJava;
        this.DiemWeb = DiemWeb;
    }

    @Override
    public double getDiem() {
        //return super.getDiem(); //To change body of generated methods, choose Tools | Templates.
        return (DiemJava + DiemWeb) / 2;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
         System.out.printf("Nhap MSSV: ");
        setMSSV(sc.nextInt());
        sc.nextLine();
        System.out.printf("Nhap ten: ");
        setTenSSV(sc.nextLine());

        System.out.printf("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());
        
        System.out.print("Nhap diem Java: ");
        setDiemJava(sc.nextDouble());sc.nextLine();
        
        System.out.print("Nhap diem Web: ");
        setDiemWeb(sc.nextDouble());sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("%10s\t|\t%-30s\t|\t%5s\t|\t%2s\n", "MSSV", "TenSSV", "NamSinh", "Diem");
        System.out.printf("%10d\t|\t%-30s\t|\t%5d\t|\t%2.2f\n", getMSSV(), getTenSSV(), getNamSinh(), getDiem());

    }

    public double getDiemJava() {
        return DiemJava;
    }

    public void setDiemJava(double DiemJava) {
        this.DiemJava = DiemJava;
    }

    public double getDiemWeb() {
        return DiemWeb;
    }

    public void setDiemWeb(double DiemWeb) {
        this.DiemWeb = DiemWeb;
    }

}
