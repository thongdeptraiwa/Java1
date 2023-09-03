/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Main {
    private static ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    private static Scanner sc = new Scanner(System.in);
    public static void nhap(){
        String them;
        for(int i=0;;i++){
            System.out.println("Nhap thong tin sv thu "+(i+1));
            SinhVien sv= new SinhVien();
            sv.nhap();
            list.add(sv);
            
           do{
               System.out.print("Ban muon nhap nua ko(Y/N)? ");
               them = sc.nextLine();
               if(them.equalsIgnoreCase("N") || them.equalsIgnoreCase("N0") || them.equalsIgnoreCase("y")||them.equalsIgnoreCase("yes")){
                   break;
               }
               else{
                   continue;
               }
           }while(true);
           if(them.equalsIgnoreCase("N") || them.equalsIgnoreCase("N0")){
               break;
           }
        }
    }
    public static void xuat(){
        System.out.printf("%-30s\t|\t%10S\t|\t%s\t|\t%10s\n","Ten","Ma","diem","Xep loai");
        for(SinhVien i: list){
            i.xuat();
        }
    }
    public static void main(String[] args) {
        nhap();
        xuat();
        
    }
}
