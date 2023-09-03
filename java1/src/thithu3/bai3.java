/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class bai3 {
    private static ArrayList<AmNhac> list = new  ArrayList<AmNhac>();
    private static Scanner sc = new Scanner(System.in);
    public static void nhap(){
        String them;
        for (int i = 1;; i++) {
            System.out.println("Nhap Album thu " + i);
            AmNhac an = new AmNhac();
            an.nhap();
            list.add(an);

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
    public static void xuat() {
        System.out.printf("%-3s\t|\t%-5s\t|\t%-30s\t|\t%s\n","STT","Ma","Ten","Gia");
        for (int i=0;i<list.size();i++) {
            System.out.printf("%3d\t|\t",(i+1));
            list.get(i).xuat();
        }
    }
    
    public static void sapXepMa() {
        Comparator<AmNhac> comp = new Comparator<AmNhac>() {
            @Override
            public int compare(AmNhac o1, AmNhac o2) {
                return (o1.getMaAlbum().compareTo(o2.getMaAlbum()));
            }
        };
        Collections.sort(list, comp);
    }
    public static void sapXepTen() {
        Comparator<AmNhac> comp = new Comparator<AmNhac>() {
            @Override
            public int compare(AmNhac o1, AmNhac o2) {
                return (o1.getTenAlbum().compareTo(o2.getTenAlbum()));
            }
        };
        Collections.sort(list, comp);
    }
    public static void top2() {
        
         Comparator<AmNhac> comp = new Comparator<AmNhac>() {
            @Override
            public int compare(AmNhac o1, AmNhac o2) {
                return Double.compare(o2.getGia(), o1.getGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Sap Xep NV Tang Dan Theo Thu Nhap");
        
        //xuat
        System.out.println("Top 2 gia cao nhat");
        System.out.printf("%-3s\t|\t%-5s\t|\t%-30s\t|\t%s\n","STT","Ma","Ten","Gia");
        for (int i=0;i<2;i++) {
            System.out.printf("%3d\t|\t",(i+1));
            list.get(i).xuat();
        }
    }
    public static void main(String[] args) {
        String chon;
        do{
             System.out.println("\n\tMenu");
               System.out.println("a/ nhap va xuat");
               System.out.println("b/ Sap xep tang dan theo ma");
               System.out.println("c/ Sap xep tang dan theo ten");
               System.out.println("d/ Xuat 2 gia cao nhat");
               System.out.println("e/ Thoat");
               System.out.print("Vui long chon: ");
               chon = sc.nextLine();
               switch(chon){
                   case "a":{
                       nhap();
                       xuat();
                       break;
                   }
                   case "b":{
                       sapXepMa();
                       xuat();
                       break;
                   }
                   case "c":{
                       sapXepTen();
                       xuat();
                       break;
                   }
                   case "d":{
                       top2();
                       break;
                   }
                   case "e":{
                       System.out.println("Bye Bye");
                       System.exit(0);  
                   }
                   default:{
                       System.out.println("Ban da chon sai!");
                       continue;
                   }
                }
        }while(true);
    }
}
