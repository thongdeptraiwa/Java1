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
public class bai2 {

    public static void ptb2(double a, double b, double c) {

        if (a == 0) {
            bai1.ptb1(b, c);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                if (delta == 0) {
                    System.out.printf("Phuong trinh co nghiem kep: x = " + (-b / (2 * a)));
                } else {
                    System.out.printf("Phuong trinh 2 nghiem phan biet: x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) + "\tx2 = " + ((-b - Math.sqrt(delta)) / (2 * a)) + "\n");
                }
            }
        }
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap a: ");
        double a = sc.nextDouble();
        System.out.printf("Nhap b: ");
        double b = sc.nextDouble();
        System.out.printf("Nhap c: ");
        double c = sc.nextDouble();
        ptb2(a, b, c);

    }

    public static void main(String[] args) {
        bai2();
    }
}
