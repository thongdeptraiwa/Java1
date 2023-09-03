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
public class bai1_2 {
    
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    
    public static void nhap(){
        System.out.print("Nhap n phan tu: ");
        n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            System.out.printf("Nhap A[%d]: ",i);
            list.add(sc.nextInt());
        }
    }
//    public static void xuat(){
//        System.out.println("Danh sach mang");
//        for(int i=0 ; i<n ; i++){
//            System.out.printf("A[%d] = %.2f\n",i+1,list[i]);
//            
//        }
//    }
    public static void tong(){
        int tongchan=0;
        int tongle=0;
        for(int i=0 ; i<n ; i++){
            if(list.get(i)%2==0)
                tongchan+=list.get(i);
            else
                tongle+=list.get(i);            
        }
        System.out.printf("Tong so chan trong mang la %d\n",tongchan);
        System.out.printf("Tong so le trong mang la %d\n",tongle);
    }
    public static void songuyento(){
        boolean check=true;
        System.out.print("Cac so nguyen to trong mang: ");
        for(int i=0 ; i<n ;i++){
            for(int j=2 ; j<n ; j++){
                if(list.get(i)%j==0){
                    check=false;
                    break;
                }
            }
            if(check == true){
                System.out.printf("\t%d",list.get(i));
            }
            check = true;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        nhap();
        do{                       
            System.out.println("\tMenu");
            System.out.println("1.1 tong chan va tong le");
            System.out.println("1.2 cac so nguyen to");
            System.out.println("1.3 thoat");
            System.out.print("Vui long chon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch(chon){
                case 1:{
                    tong();
                    break;
                }
                case 2:{
                    songuyento();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
                default:{
                    continue;
                }
            }
            
            do{
                System.out.print("\nBan muon nhap lai mang khong (Y/N)? ");
                String them = sc.nextLine();
                if(them.equalsIgnoreCase("Y") || them.equalsIgnoreCase("Yes")){
                    nhap();
                    break;
                }else if(them.equalsIgnoreCase("n") || them.equalsIgnoreCase("no")){
                    break;
                }else{
                    continue;
                }
            }while(true);
            
        }while(true);
        
    }
}
