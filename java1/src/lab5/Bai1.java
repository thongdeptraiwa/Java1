/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        while(true){
            System.out.print("Nhap so: ");
            Double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.print("Nhập thêm (Y/N)?" );  
            String them = sc.nextLine();
            if(them.equals("N")||them.equals("n")||them.equals("No")||them.equals("NO")||them.equals("no")||them.equals("nO")){
                break;
            }
        }
        for(Double i: list){
            System.out.println(i);
        }
    }
}
