/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class bai3 {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        Scanner sc = new Scanner(System.in);
        String them;
        for(int i=1 ; ; i++){          
            System.out.printf("Nhap SV thu %d\n",i);   
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
            
            do{
                System.out.print("Ban muon nhap tiep khong(Y/N)? ");
                them = sc.nextLine();
                if(them.equalsIgnoreCase("n") || them.equalsIgnoreCase("no"))
                    break;
                else if(them.equalsIgnoreCase("y") || them.equalsIgnoreCase("yes"))
                    break;
                else
                    continue;
            }while(true);
            if(them.equalsIgnoreCase("n") || them.equalsIgnoreCase("no"))
                    break;
        }
        
        
        System.out.println("danh sach SV");
        System.out.printf("%-30s|\t%10s\t|\t%4s\t|\t%s\n","Ho Ten","Ma SV","Diem","Xep Loai");
        for(SinhVien i:list){
           i.xuat();
        }
        
    }
    
}
