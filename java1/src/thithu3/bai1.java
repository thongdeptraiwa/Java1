/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class bai1 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Double> list = new ArrayList<Double>();
    private static int n;
    
    public static void nhap(){
        System.out.print("Nhap n phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.printf("Nhap A[%d]: ",i);
            list.add(Double.parseDouble(sc.nextLine()));
        }
    }
    
    public static void xuat(){
        if(list.isEmpty()==false){
            System.out.println("Danh sach mang so thuc");
            for(int i=0;i<n;i++){
                System.out.printf("A[%d] = %.2f\n",i,list.get(i));
            }
        }else
           System.out.println("Mang rong");
            
        
    }
    
    //tang dan
    public static void tang(){
            Collections.sort(list);      
    }
    
    public static void tim(){
        if(list.isEmpty()==false){
            System.out.print("Nhap phan tu ban muon tim: ");
            double tim = Double.parseDouble(sc.nextLine());
            if(list.contains(tim)==true)
                System.out.printf("A[%d] = %.2f\n",list.indexOf(tim),tim);
            else
                System.out.printf("khong tim thay phan tu %.2f\n",tim);
        }else
           System.out.println("Mang rong");
    } 
        
    
    public static void ktRong(){
        boolean rong = list.isEmpty();
        if(rong==true)
            System.out.println("Mang rong");
        else
            System.out.println("Mang khong rong");
    }
    
    public static void daoNguoc(){  
        Collections.reverse(list);            
    }
    public static void themXoaSua(){
        if(list.isEmpty()==false){
           String chon;
           do{
               System.out.println("\n\tThem Xoa Sua vao dau mang");
               System.out.println("1/ them");
               System.out.println("2/ xoa");
               System.out.println("3/ sua");
               System.out.println("4/ Quay ve menu");
               System.out.print("Vui long chon: ");
               chon = sc.nextLine();
               switch(chon){
                   case "1":{
                       System.out.print("Nhap so thuc ban muon them vao dau mang: ");
                       list.add(0,Double.parseDouble(sc.nextLine()));
                       n++;
                       xuat();
                       break;
                   }
                   case "2":{
                       list.remove(0);
                       n--;
                       xuat();
                       break;
                   }
                   case "3":{
                       System.out.print("Nhap so thuc ban muon sua vao dau mang: ");
                       list.set(0,Double.parseDouble(sc.nextLine()));
                       xuat();
                       break;
                   }
                   case "4":{
                       break;
                   }
                   default:{
                       System.out.println("Ban da chon sai!");
                       continue;
                   }
               }
           }while(chon!="4");
           
        }else
           System.out.println("Mang rong");
    }
    public static void main(String[] args) {
        
        String chon;
        do{
            System.out.println("\n\tMENU");
            System.out.println("a) Nhap danh sach so thuc tuy y tu ban phim");
            System.out.println("b) Xuat mang so thuc ra man hinh");
            System.out.println("c) Xuat ra man hinh theo thu tu tang dan");
            System.out.println("d) Tim kiem phan tu trong mang");
            System.out.println("e) Kiem tra rong");
            System.out.println("f) Dao nguoc");
            System.out.println("g) Them Xoa sua vao dau mang");
            System.out.println("x) Thoat");
            System.out.print("Vui long chon chuc nang: ");
            chon = sc.nextLine();
            switch(chon){
                case "a":{
                    nhap();
                    break;
                }
                case "b":{
                    xuat();
                    break;
                }
                case "c":{
                    tang();
                    xuat();
                    break;
                }
                case "d":{
                    tim();
                    break;
                }
                case "e":{
                    ktRong();
                    break;
                }
                case "f":{
                    daoNguoc();
                    xuat();
                    break;
                }
                case "g":{
                    themXoaSua();
                    break;
                }
                case "x":{
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
