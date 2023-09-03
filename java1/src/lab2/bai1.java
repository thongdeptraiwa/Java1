/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author macos
 */
public class bai1 {
    
    public static void ptb1(double a,double b){
        
        if(a == 0){
            if(b == 0)
                //thông báo vô số nghiệm
                System.out.println("Phuong trinh vo so nghiem");
            else
                //thông báo vô nghiệm
                System.out.println("Phuong trinh vo nghiem");          
        }
        else
            //tính và xuất nghiệm x = -b/a;
            System.out.printf("Phuong trinh co nghiem: x = "+(-b/a)+"\n");
    }
    public static void bai1(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap a: ");
        double a = sc.nextDouble();
        System.out.printf("Nhap b: ");
        double b = sc.nextDouble();
        ptb1(a,b);
    }
    
    public static void main(String[] args) {
        bai1();
    }
}
