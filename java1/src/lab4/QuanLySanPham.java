/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author macos
 */
public class QuanLySanPham {
    private static ArrayList<SanPham> list = new ArrayList<SanPham>();
    private static Scanner sc = new Scanner(System.in);
    public static void menu(){
        int chon;
        do{
            System.out.println("\t\t\t*MENU*");
            System.out.println("\t1. Nhap SP");
            System.out.println("\t2. Xuat SP");
            System.out.println("\t3. Sap xep theo ten SP");
            System.out.println("\t4. Sap xep theo gia SP");
            System.out.println("\t5. Thoat");
            System.out.print("\t\tVui long chon: ");
            chon = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch(chon){
                case 1:{
                    nhap();
                    break;
                }
                case 2:{
                    xuat();
                    break;
                }
                case 3:{
                    sapXepTheoTen();
                    System.out.println("Sap Xep SP theo ten");
                    xuat();
                    break;
                }
                case 4:{
                    sapXepTheoDiem();
                    System.out.println("Sap Xep SP tang dan theo don gia");
                    xuat();
                    break;
                }
                case 5:{
                    System.out.println("Bye Bye");
                    System.exit(0);
                }
                default :{
                    System.out.println("Ban da nhap sai!");
                    System.out.println("Vui long nhap lai");
                    continue;
                }
            }
        }while(true);
    }
    public static void nhap(){
        for(int i=0; ;i++){
            System.out.println("Nhap thong tin SP thu "+(i+1));
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            System.out.print("Ban co muon nhap them khong(Y/N)?");
            String them = sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No"))
                break;
        }
    }
    public static void xuat(){
        System.out.println("Danh Sach SP");
        for(int i=0;i<list.size();i++){
            System.out.println("Thong Tin SP thu "+(i+1));
            list.get(i).xuat();
            System.out.println("");
        }
    }
    public static void sapXepTheoTen(){
        Comparator<SanPham> comp = new Comparator<SanPham>(){
            @Override
            public int compare(SanPham sp1, SanPham sp2) {   
                return (sp1.getTen().compareTo(sp2.getTen()));
            }
        };
        Collections.sort(list, comp);
    }
    public static void sapXepTheoDiem(){
         Comparator<SanPham> comp = new Comparator<SanPham>(){
            @Override
            public int compare(SanPham sp1, SanPham sp2) {   
                return Double.compare(sp1.getDonGia(),sp2.getDonGia());
            }
        };
        Collections.sort(list, comp);
    }
    public static void main(String[] args) {
        menu();
    }
}
