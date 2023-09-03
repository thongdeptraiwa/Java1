/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Bai3 {
    public static void main(String[] args) {
        
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        for(int i=0;i<5;i++){
            SinhVien sv = new SinhVien();
            list.add(sv);
        }
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("\t\t\t*MENU*");
            System.out.println("\t1. Nhap ten");
            System.out.println("\t2. Nhap email");
            System.out.println("\t3. Nhap SDT");
            System.out.println("\t4. Nhap CMND");
            System.out.println("\t5. Xuat");
            System.out.println("\t6. Thoat");
            System.out.print("\t\tVui long chon: ");
            chon = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch(chon){
                case 1:{
                    for(SinhVien i: list){
                        i.nhapTen();
                    }
                    break;
                }
                case 2:{
                    for(SinhVien i: list){
                        i.nhapEmail();
                    }
                    break;
                }
                case 3:{
                    for(SinhVien i: list){
                        i.nhapSDT();
                    }
                    break;
                }
                case 4:{
                    for(SinhVien i: list){
                        i.nhapCMND();
                    }
                    break;
                }
                case 5:{
                    System.out.printf("%-30s|\t%-30s\t|\t%-12s\t|\t%s\n","hoTen","email","sdt","cmnd");
                    for(SinhVien i:list){
                        i.xuat();
                    }
                    break;
                }
                case 6:{
                    System.out.println("Bye Bye");
                    System.exit(0);
                }
                default :{
                    continue;
                }
            }
        }while(true);
        
//         for (int i=0 ; ;i++) {
//            System.out.println("Nhap thong tin SV thu "+(i+1));
//            SinhVien sv = new SinhVien();
//            sv.nhap();
//            list.add(sv);
//            System.out.print("Ban co muon nhap them SV khong(Y/N)?");
//            String them = sc.next();
//            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No"))
//                break;
//        }
//        System.out.println("Danh sach SV ");
//        System.out.printf("%-20s|\t%-15s\t|\t%-10s\t|\t%s\n","hoTen","email","sdt","cmnd");
//        for(int i=0;i<list.size();i++){          
//            list.get(i).xuat();
//        }
    }
}
