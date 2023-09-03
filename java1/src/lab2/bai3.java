/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class bai3 {

    public static void tinhtiendien() {
        Scanner sc = new Scanner(System.in);
        int tien = 0;
        try {
            System.out.printf("Nhap so dien su dung: ");
            int dien = sc.nextInt();
            if (dien >= 0) {
                if (dien <= 50) {
                    tien = dien * 1000;
                } else {
                    tien = 50 * 1000 + (dien - 50) * 1200;
                }
                System.out.printf("Tien dien: " + tien + "k\n");
            }else{
                System.out.println("Ban da nhap so am");
            }
        } catch (Exception ex) {
            System.out.println("Ban da nhap chu");
        }

    }

    public static void main(String[] args) {
        tinhtiendien();
    }
}
