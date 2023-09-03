/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        
        String ho=hoTen.substring(0,hoTen.indexOf(" "));
        System.out.println(ho.toUpperCase());
        
        String tenDem=hoTen.substring(hoTen.indexOf(" ")+1,hoTen.lastIndexOf(" "));
        System.out.println(tenDem.toUpperCase());
        
        String ten=hoTen.substring(hoTen.lastIndexOf(" ")+1,hoTen.length());
        System.out.println(ten.toUpperCase());
        
        
    }
}
