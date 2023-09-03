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
public class bai4 {

    public static int menu() {
        System.out.println("            *Menu*            ");
        System.out.println("+----------------------------+");
        System.out.println("| 1. Giai phuong trinh bac 1 |");
        System.out.println("| 2. Giai phuong trinh bac 2 |");
        System.out.println("| 3. Tinh tien dien          |");
        System.out.println("| 4. thoat                   |");
        System.out.println("+----------------------------+");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\tVui long chon: ");
        int chon = sc.nextInt();
        return chon;
    }

    public static void bai4() {
        int chon;
        chon = menu();
        switch (chon) {
            case 1: {
                bai1.bai1();
                break;
            }
            case 2: {
                bai2.bai2();
                break;
            }
            case 3: {
                bai3.tinhtiendien();
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        bai4();
    }
}
