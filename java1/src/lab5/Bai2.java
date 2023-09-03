/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Bai2 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> list = new ArrayList<String>();
     public static int menu() {
        System.out.println("                 *Menu*            ");
        System.out.println("+---------------------------------------+");
        System.out.println("| 1. Nhap danh sach ho va ten           |");
        System.out.println("| 2. Xuat danh sach vua nhap            |");
        System.out.println("| 3. Xuat danh sach ngau nhien          |");
        System.out.println("| 4. Sap xep giam dan va Xuat danh sach |");
        System.out.println("| 5. Tim va xoa ten nhap tu ban phim    |");
        System.out.println("| 6. thoat                              |");
        System.out.println("+---------------------------------------+");
        Scanner sc = new Scanner(System.in);
        System.out.printf("\t\tVui long chon: ");
        int chon = sc.nextInt();
        return chon;
    }
    public static void nhap(){
        while(true){
            System.out.print("Nhap ho va ten: ");
            String hoTen = sc.nextLine();
            list.add(hoTen);
            System.out.print("Nhập thêm (Y/N)?" );  
            String them = sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No")){
                break;
            }
        }
    }
    public static void xuat(){
        for(String i: list){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int chon;     
        do{
            chon = menu();
            switch (chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    Collections.shuffle(list);
                    xuat();
                    break;
                }
                case 4: {
                    Collections.sort(list);
                    Collections.reverse(list);
                    xuat();
                    break;
                }
                case 5: {
                    System.out.print("Nhap ho va ten ban muon xoa:");
                    String xoa = sc.nextLine();
                    
                    if(list.contains(xoa)){
                        System.out.print("Ban co chac la muon xoa khong (Y/N)?");
                        String them = sc.nextLine();
                        if(them.equalsIgnoreCase("Y")||them.equalsIgnoreCase("Yes")){
                            list.remove(xoa);
                            System.out.println("Xoa thanh cong");
                        }else
                            System.out.println("Huy xoa thanh cong");                                     
                    }                        
                    else
                        System.out.println("khong tim thay ten "+xoa);
                    
                    break;
                }
                case 6: {
                    System.exit(0);
                }     
                default:{
                    continue;
                }
            }
        }while(chon!=6);
        
    }
}
