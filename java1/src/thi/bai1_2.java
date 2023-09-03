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
public class bai1_2 {
    private static ArrayList<String> list = new ArrayList<String>();
    private static Scanner sc = new Scanner(System.in);
    public static void nhap(){
        for(int i=0;i<3;i++){
            System.out.printf("Nhap A[%d]: ",i);
            list.add(sc.nextLine());
        }
    }
    public static void so(){
        for(int i=0;i<3;i++){
            try {  
                System.out.println(Double.parseDouble(list.get(i))); 
            
          } catch(NumberFormatException e){  
                
        }
        }
    }  
    public static void koso(){
        for(int i=0;i<3;i++){
            try {  
                Double.parseDouble(list.get(i)); 
            
          } catch(NumberFormatException e){  
                System.out.println(list.get(i));
        }
        }
    }   

    public static void main(String[] args) {
        int chon;
        nhap();
        do{
            
            System.out.println("\n\tMenu");
            System.out.println("1/So nguyen va so thuc");
            System.out.println("2/Khong phai la so");
            System.out.println("3/thoat");
            System.out.print("Vui long chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:{
                    so();
                    break;
                }
                case 2:{
                    koso();
                    break;
                }
                case 3:{
                    System.out.println("Bye bye");
                    System.exit(0);
                }
                default:{
                    System.out.println("Ban da nhap sai!");
                    continue;
                }
            }
        }while(true);
    }
}
