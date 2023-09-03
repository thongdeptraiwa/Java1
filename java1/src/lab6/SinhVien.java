/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }
    
    
    
    
    public void nhapTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
    }
    public void nhapEmail(){
    
        //email
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            String reEmail = "\\w+@fpt.edu.vn";
            if(email.matches(reEmail)){
                break;
            }else{
                System.out.println("Ban da nhap sai");
                System.out.println("Vui long nhap lai");
                continue;
            }
        }while(true);
    }
    public void nhapSDT(){
        //sdt
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so dien thoai: ");
            sdt = sc.nextLine();
            String reSdt = "0\\d{9}";
            if(sdt.matches(reSdt)){
                break;
            }else{
                System.out.println("Ban da nhap sai");
                System.out.println("Vui long nhap lai");
                continue;
            }
        }while(true);
    }
    public void nhapCMND(){
        
        //cmnd
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap CMND: ");
            cmnd = sc.nextLine();
            String reCmnd = "\\d{12}";
            if(cmnd.matches(reCmnd)){
                break;
            }else{
                System.out.println("Ban da nhap sai");
                System.out.println("Vui long nhap lai");
                continue;
            }
        }while(true);
       
    }

    public void xuat(){
        System.out.printf("%-30s|\t%-30s\t|\t%-12s\t|\t%s\n",hoTen,email,sdt,cmnd);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    

    
    
}
