/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author macos
 */
public class Bai4 {
    public static ArrayList<SinhVienPoly> list = new ArrayList<SinhVienPoly>();
    public static Scanner sc = new Scanner(System.in);
    public static void menu(){
        int chon;
        do{
            System.out.println("\t\t\t*MENU*");
            System.out.println("\t1. Nhap danh sach sv");
            System.out.println("\t2. Xuat thong tin danh sach sv");
            System.out.println("\t3. xuat danh sach sv co hoc luc gioi");
            System.out.println("\t4. Sap xep danh sach sv theo diem");
            System.out.println("\t5. Thoat");
            System.out.print("\t\tVui long chon: ");
            chon = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch(chon){
                case 1:{
                    b1();
                    break;
                }
                case 2:{
                    b2();
                    break;
                }
                case 3:{
                    b3();
                    break;
                }
                case 4:{
                    b4();
                    break;
                }
                case 5:{
                    System.out.println("Bye Bye");
                    System.exit(0);
                }
                default :{
                    continue;
                }
            }
        }while(true);
    }
    public static void b1(){
        for(int i=0; ;i++){
            System.out.println("Nhap sv thu "+(i+1));
            do{
                System.out.print("Nganh nganh(IT/Biz): ");
                String nganh = sc.nextLine();
                if(nganh.equalsIgnoreCase("IT")){
                    SinhVienPoly svit = new SVIT();
                    svit.nhap();
                    list.add(svit);
                    break;
                }else if(nganh.equalsIgnoreCase("Biz")){
                    SinhVienPoly svbiz = new SVBiz();
                    svbiz.nhap();
                    list.add(svbiz);
                    break;
                }else
                    continue;
            }while(true);
            System.out.print("Ban co muon nhap them khong(Y/N)?");
            String them = sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No"))
                break;
        }
    }
    public static void b2(){
        System.out.println("\tDanh Sach SV");
        for(int i=0;i<list.size();i++){
            System.out.println("*Thong Tin SV thu "+(i+1));
            list.get(i).xuat();
            System.out.println("");
        }
    }
    public static void b3(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).hocLuc().equalsIgnoreCase("Gioi"))
                list.get(i).xuat();
        }
    }
    public static void b4(){
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>(){
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {   
                return Double.compare(o1.getDiem(),o2.getDiem());
            }
        };
        Collections.sort(list, comp); 
        System.out.println("Sap Xep SV Tang Dan Theo Diem");
        b2();
    }
    public static void main(String[] args) {
        menu();
    }
}
