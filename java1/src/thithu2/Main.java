/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu2;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Main {
    public static QLSV qlsv = new QLSV();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int chon;
        do{
            System.out.println("\tMENU");
            System.out.println("1.Nhap");
            System.out.println("2.Xuat");
            System.out.println("3.Danh sach SV qua mon(diem>=5)");
            System.out.println("4.Tim SV theo ma");
            System.out.println("5.ke thua");
            System.out.println("0.Thoat");
            System.out.printf("Vui long chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    qlsv.nhap();                   
                    break;
                }
                case 2:{
                    qlsv.xuat();
                    break;
                }
                case 3:{
                    qlsv.quamon();
                    break;
                }
                case 4:{
                    qlsv.tim();
                    break;
                }
                case 5:{
                    SinhVien sv = new SinhVienUDPM();
                    sv.nhap();
                    sv.xuat();
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default:{
                    continue;
                    
                }
            }
        }while(true);
    }
}
