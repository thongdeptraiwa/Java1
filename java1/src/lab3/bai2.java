/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import constanst.UtilsConstanst;

/**
 *
 * @author macos
 */
public class bai2 {

    public static void cuuChuong(Integer n) {
        System.out.println("\t Bang cuu chuong " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        int n;
        do {
            System.out.printf("Nhap cuu chuong(1-9)(0 thoat): ");
            n = UtilsConstanst.nhap.nextInt();
            if (n == 0) {
                break;
            }
            cuuChuong(n);
        } while (n != 0);

    }
}
