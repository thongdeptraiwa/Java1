/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class QLSV {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    String them;

    public void nhap() {
        for (int i = 1;; i++) {
            System.out.println("Nhap SV thu " + i);
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);

            do {
                System.out.print("Ban muon nhap tiep khong(Y/N)? ");
                them = sc.nextLine();
                if (them.equalsIgnoreCase("n") || them.equalsIgnoreCase("no") || them.equalsIgnoreCase("y") || them.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    continue;
                }
            } while (true);
            if (them.equalsIgnoreCase("n") || them.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public void xuat() {
        System.out.printf("%10s\t|\t%-30s\t|\t%5s\t|\t%2s\n", "MSSV", "TenSSV", "NamSinh", "Diem");
        for (SinhVien i : list) {
            i.xuat();
        }
    }

    public void quamon() {
        System.out.println("Danh sach cac SV qua mon");
        System.out.printf("%10s\t|\t%-30s\t|\t%5s\t|\t%2s\n", "MSSV", "TenSSV", "NamSinh", "Diem");
        for (SinhVien i : list) {
            if (i.getDiem() >= 5) {
                i.xuat();
            }
        }
    }

    public void tim() {

        boolean check = false;
        System.out.print("Nhap ma SV ban muon tim: ");
        int tim = sc.nextInt();
        
        for (SinhVien i : list) {
            if (tim == i.getMSSV()) {
                System.out.printf("%10s\t|\t%-30s\t|\t%5s\t|\t%2s\n", "MSSV", "TenSSV", "NamSinh", "Diem");
                i.xuat();
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay ma nv " + tim);
        }
    }

}
