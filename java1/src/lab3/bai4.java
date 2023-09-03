/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;
import constanst.UtilsConstanst;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macos
 */
public class bai4 {
    
    public static void nhap(int n, String hoten[], double diem[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf("\nNhap ho ten sv thu %d: ", i + 1);
            hoten[i] = UtilsConstanst.nhap.nextLine();
            System.out.printf("Nhap diem sv thu %d: ", i + 1);
            diem[i] = Double.parseDouble(UtilsConstanst.nhap.nextLine());
            
        }
        
    }
    
    public static void xuat(int n, String hoten[], double diem[], ArrayList<String> hocLuc) {
        
        for (int i = 0; i < n; i++) {
            System.out.println("sv thu " + (i + 1));
            System.out.println("ho ten: " + hoten[i]);
            System.out.println("diem: " + diem[i]);
            System.out.println("hoc luc: " + hocLuc.get(i) + "\n");
        }
        
    }
    
    public static void xethocluc(int n, double diem[], ArrayList<String> hocLuc) {
        
        for (int i = 0; i < n; i++) {
            if (diem[i] >= 9) {
                hocLuc.add("Xuat sac");
            } else {
                if (diem[i] >= 7.5) {
                    hocLuc.add("Gioi");
                } else {
                    if (diem[i] >= 6.5) {
                        hocLuc.add("Kha");
                    } else {
                        if (diem[i] >= 5) {
                            hocLuc.add("Trung Binh");
                        } else {
                            hocLuc.add("Yeu");
                        }
                    }
                }
            }
        }
    }
    
    public static void tangdan(int n, double diem[], String hoten[], ArrayList<String> hocLuc) {
        double tempdiem;
        String temphoten;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    tempdiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempdiem;
                    
                    temphoten = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = temphoten;
                    
                    Collections.swap(hocLuc, i, j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.printf("Nhap n phan tu: ");
        int n = Integer.parseInt(UtilsConstanst.nhap.nextLine());
        String hoten[] = new String[n];
        double diem[] = new double[n];
        ArrayList<String> hocLuc = new ArrayList<String>();
        //String hocluc[] = new String[n];
        nhap(n, hoten, diem);
        xethocluc(n, diem, hocLuc);
        xuat(n, hoten, diem, hocLuc);
        System.out.println("*Sap xep tang dan theo diem");
        tangdan(n, diem, hoten, hocLuc);
        xuat(n, hoten, diem, hocLuc);
        
    }
}
