/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author macos
 */
public class ChuNhat {
    public double rong;
    public double dai;

    public ChuNhat() {
    }
    
    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
       
    public double getChuVi(){
        return (rong+dai)*2;
    }
    
    public double getDienTich(){
        return rong*dai;
    }
    
    public void xuat(){
        System.out.println("Chieu rong: "+rong);
        System.out.println("Chieu dai: "+dai);
        System.out.println("Chu vi HCM: "+getChuVi());
        System.out.println("Dien Tich Hcm: "+getDienTich());
    }
    
    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    
}
