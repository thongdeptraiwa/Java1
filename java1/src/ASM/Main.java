/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macos
 */
public class Main {
    public static ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    public static Scanner sc = new Scanner(System.in);
    public static int menu() {
        System.out.println("                            *Menu*            ");
        System.out.println("+----------------------------------------------------------+");
        System.out.println("| 1. Nhap danh sach nhan vien tu ban phim                  |");
        System.out.println("| 2. Xuat danh sach nhan vien ra man hinh                  |");
        System.out.println("| 3. Tim va hien thi nhan vien theo ma nhap tu ban phim    |");
        System.out.println("| 4. Xoa nhan vien theo ma nhap tu ban phim                |");
        System.out.println("| 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim |");
        System.out.println("| 6. Tim cac nhan vien theo khoang luong nhap tu ban phim  |");
        System.out.println("| 7. Sap xep nhan vien theo ho va tien                     |");
        System.out.println("| 8. sap xep nhan vien theo thu nhap                       |");
        System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat                 |");
        System.out.println("| 10. Thoat chuong trinh                                   |");
        System.out.println("+----------------------------------------------------------+");
        System.out.printf("\t\t\tVui long chon: ");
        int chon = Integer.parseInt(sc.nextLine());
        return chon;
    }

    public static void main(String[] args) {  
        int chon;
        do {
            chon = menu();
            switch (chon) {
                case 1: {
                    CacChucNang.nhap();
                    break;
                }
                case 2: {                   
                     CacChucNang.xuat();
                    break;
                }
                case 3: {
                     CacChucNang.tim();
                    break;
                }
                case 4: {   
                     CacChucNang.xoa();
                    break;
                }
                case 5: {
                     CacChucNang.capNhap();
                    break;
                }
                case 6: {
                     CacChucNang.timKhoang();
                    break;
                }
                case 7: {
                     CacChucNang.sapXepHoTen();
                     CacChucNang.xuat();
                    break;
                }
                case 8: {
                    CacChucNang.sapXepThuNhap();
                    CacChucNang.xuat();
                    break;
                }
                case 9: {
                    CacChucNang.top5();
                    break;
                }
                case 10: {
                    System.out.println("Bye Bye");
                    System.exit(0);
                }
                default :{
                    System.out.println("Ban da nhap sai so chung nang!");
                    System.out.println("Vui long nhap lai!");
                    continue;
                }
            }
        } while (true);

    }

    private static Object CacChucNang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
