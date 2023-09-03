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
public class Bai2 {
    
    public static void main(String[] args) {
        
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        Scanner sc= new Scanner(System.in);
        //nhap
        for(int i=0;;i++){
            System.out.println("Nhap thong tin SP thu "+(i+1));   
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
            System.out.print("Ban co muon nhap them SP khong (Y/N)?");
            String them=sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No"))
                break;
        }
        //xuat
        System.out.println("Danh sach SP");
        System.out.printf("%-20s|\t%10s\t|\t%s\n","Ten","Don Gia","Hang");
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i).getHang().equalsIgnoreCase("Nokia")){
                list.get(i).xuat();
            }
        }
        
    }
    
    
    
}
