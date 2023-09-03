/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class DSSP {
    private static ArrayList<SanPham> list = new ArrayList<SanPham>();
    private static Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap danh sach san pham");
        for(int i=1;;i++){
            System.out.printf("Nhap SP thu %d: \n",i);
            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap gia: ");
            double gia = Double.parseDouble(sc.nextLine());
            list.add(new SanPham(ten,gia));
            System.out.print("Ban co muon nhap them SP khong (Y/N)?" );  
            String them = sc.nextLine();
            if(them.equalsIgnoreCase("N")||them.equalsIgnoreCase("No")){
                break;
            }
        }
    }
    public void xuat(){
        System.out.println("Danh Sach San Pham");
        System.out.println("Ten\t\t|\tGia");
        for(SanPham i: list){
            System.out.printf("%-16s|\t%f\n",i.getTen(),i.getGia());
        }
    }
    public void timVaXoa(){
        System.out.print("Nhap ten SP ban muon tim:");
        String xoa = sc.nextLine();
        int count=1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTen().contains(xoa)) {
                count++;
                System.out.print("Ban co chac la muon xoa khong (Y/N)?");
                String them = sc.nextLine();
                if(them.equalsIgnoreCase("Y")||them.equalsIgnoreCase("Yes")){
                    list.remove(i);
                    System.out.println("Xoa thanh cong");
                }else
                    System.out.println("Huy xoa thanh cong");
                break;   
            }
            continue;
        }
        
        if(count==list.size() ){
            System.out.println("Khong tim thay ten SP "+xoa);
        }
    }
    public double giaTB(){
        double tong=0;
        for(int i=0; i<list.size();i++){
            tong+=list.get(i).getGia();
        }
        return tong/list.size();
    }
    public void sapXep(){
        Comparator<SanPham> comp = new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {   
                return Double.compare(o2.getGia(),o1.getGia());
            }
        };
        Collections.sort(list, comp);   
    }
    public void menu() {
        int chon;
        do{
            System.out.println("                         *Menu*            ");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| 1. Nhap danh sach san pham tu ban phim           |");
            System.out.println("| 2. Sap xep giam dan theo gia va xuat ra man hinh |");
            System.out.println("| 3. Tim va xoa san pham theo ten nhap tu ban phim |");
            System.out.println("| 4. Xuat gia trung binh cau cac san pham          |");
            System.out.println("| 5. thoat                                         |");
            System.out.println("+--------------------------------------------------+");
            System.out.printf("\t\tVui long chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    sapXep();  
                    xuat();
                    break;
                }
                case 3: {
                    timVaXoa();               
                    break;
                }
                case 4: {
                    System.out.println("Gia TB cua tat ca SP: "+giaTB());
                    break;
                }
                case 5: {
                    System.exit(0);
                }     
                default:{
                    System.out.println("Ban nhap sai menu");
                    continue;
                }
            }
        }while(chon!=5);
    }
}
