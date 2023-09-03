/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Arrays;
import constanst.UtilsConstanst;

/**
 *
 * @author macos
 */
public class bai3 {

    

    public static void nhapMang(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = UtilsConstanst.nhap.nextInt();
        }
    }

    public static void xuatMang(int n, int a[]) {
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]: %d\n", i, a[i]);
        }
    }
    
    public static int minMang(int n,int a[]){
        int min = a[0];
        for(int i=0;i<n;i++){
            min = Math.min(min, a[i]);
        }
        return min;
    }
    
    public static double tbc3(int n, int a[]){
        int count=0,tong=0;
        
        for(int i=0;i<n;i++){
            if(a[i]%3==0){
                count++;
                tong+=a[i];
            }
        }
        //retrun cung phai ep kieu
        return (double)tong/count;
    }
     
    public static void main(String[] args) {        
        System.out.printf("Nhap n phan tu: ");
        int n = UtilsConstanst.nhap.nextInt();
        int a[] = new int[n];
        nhapMang(n, a);
        xuatMang(n, a);
        
        //min
        /*int i = Arrays.binarySearch(a, minMang(n,a));
        System.out.printf("Min(a[%d]): %d\n",i,minMang(n,a));*/
        
        //sap xep
        Arrays.sort(a);               
        System.out.println("Sap Xep mang tang dan");
        xuatMang(n, a);
        System.out.println("Min: "+a[0]);
        
        //tbc3
        System.out.println("Trung Binh Cong cac phan tu chia het cho 3 la "+tbc3(n,a));
    }
}
