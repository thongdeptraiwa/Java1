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
public class bai1 {

    public static int soNguyen(Integer n) {
        int check = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = 0;
                break;
            }
        }
        return check;
    }

    public static void bai1() {

        System.out.printf("Nhap n: ");
        int n = UtilsConstanst.nhap.nextInt();
        if (soNguyen(n) > 0) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

    }

    public static void main(String[] args) {
        bai1();
    }
}
