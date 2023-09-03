/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import static ASM.Main.list;
import static ASM.Main.sc;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author macos
 */
public class CacChucNang {

    public static void nhap() {
        for (int i = 0;; i++) {
            System.out.println("Nhap NV thu " + (i + 1));
            System.out.print("Nhap ma NV: ");
            String maNV = sc.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());
            do {
                System.out.print("Nhap ban(Tiep Thi/Truong phong/Hanh chinh): ");
                String ban = sc.nextLine();
                if (ban.equalsIgnoreCase("tiep thi")) {
                    System.out.print("Nhap doanh so: ");
                    double doanhSo = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap hue hong: ");
                    double hueHong = Double.parseDouble(sc.nextLine());
                    NhanVien nvtt = new TiepThi(doanhSo, hueHong, maNV, hoTen, luong);
                    list.add(nvtt);
                    break;
                } else if (ban.equalsIgnoreCase("truong phong")) {
                    System.out.print("Nhap trach nhiem: ");
                    double trachNhiem = Double.parseDouble(sc.nextLine());
                    NhanVien nvtp = new TruongPhong(trachNhiem, maNV, hoTen, luong);
                    list.add(nvtp);
                    break;
                } else if (ban.equalsIgnoreCase("hanh chinh")) {
                    NhanVien nvhc = new NhanVien(maNV, hoTen, luong);
                    list.add(nvhc);
                    break;
                } else {
                    continue;
                }
            } while (true);
            System.out.print("Ban co muon nhap them khong(Y/N)?");
            String them = sc.nextLine();
            if (them.equalsIgnoreCase("N") || them.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    public static void xuat() {
        System.out.println("\t\t*Danh Sach Nhan Vien*");
        System.out.printf("%-10s|\t%-32s|\t%s\n", "Ma", "Ho va Ten", "Luong");
        for (NhanVien nv : list) {
            System.out.printf("%-10s|\t%-32s|\t%f\n", nv.getMaNV(), nv.getHoTen(), (nv.getThuNhap() - nv.getThueTN()));
        }
    }

    public static void tim() {
        boolean check = false;
        System.out.print("Nhap ma NV ban muon tim: ");
        String tim = sc.nextLine();
        for (NhanVien nv : list) {
            if (tim.equalsIgnoreCase(nv.getMaNV())) {
                System.out.printf("%-10s|\t%-32s|\t%f\n", nv.getMaNV(), nv.getHoTen(), nv.getThuNhap());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay ma NV " + tim);
        }
    }

    public static void xoa() {
        System.out.print("Nhap ma NV ban muon xoa:");
        String xoa = sc.nextLine();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count++;
            if (list.get(i).getMaNV().contains(xoa)) {
                System.out.print("Ban co chac la muon xoa khong (Y/N)?");
                String them = sc.nextLine();
                if (them.equalsIgnoreCase("Y") || them.equalsIgnoreCase("Yes")) {
                    list.remove(i);
                    System.out.println("Xoa thanh cong!");
                } else {
                    System.out.println("Huy xoa thanh cong!");
                }
                count = 0;
                break;
            }
        }

        if (count == list.size()) {
            System.out.println("Khong tim thay ma NV " + xoa);
        }
    }

    public static void capNhap() {
        System.out.print("Nhap ma NV ban muon cap nhap:");
        String cn = sc.nextLine();
        NhanVien found = null;
        int index = 0;
        for (NhanVien nv : list) {
            if (cn.equalsIgnoreCase(nv.getMaNV())) {
                System.out.printf("%-10s|\t%-32s|\t%f\n", nv.getMaNV(), nv.getHoTen(), nv.getThuNhap());
                found = nv;
                index = list.indexOf(nv);
                break;//khong co truong hop trung id
            }
        }
        if (found != null) {
            System.out.print("Nhap ma NV: ");
            String maNV = sc.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap luong: ");
            double luong = Double.parseDouble(sc.nextLine());
            do {
                System.out.print("Nhap ban(Tiep Thi/Truong phong/Hanh chinh): ");
                String ban = sc.nextLine();
                if (ban.equalsIgnoreCase("tiep thi")) {
                    System.out.print("Nhap doanh so: ");
                    double doanhSo = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhap hue hong: ");
                    double hueHong = Double.parseDouble(sc.nextLine());
                    NhanVien nvtt = new TiepThi(doanhSo, hueHong, maNV, hoTen, luong);
                    list.set(index, nvtt);
                    break;
                } else if (ban.equalsIgnoreCase("truong phong")) {
                    System.out.print("Nhap trach nhiem: ");
                    double trachNhiem = Double.parseDouble(sc.nextLine());
                    NhanVien nvtp = new TruongPhong(trachNhiem, maNV, hoTen, luong);
                    list.set(index, nvtp);
                    break;
                } else if (ban.equalsIgnoreCase("hanh chinh")) {
                    NhanVien nvhc = new NhanVien(maNV, hoTen, luong);
                    list.set(index, nvhc);
                    break;
                } else {
                    continue;
                }
            } while (true);
        } else {
            System.out.println("Khong tim thay ma NV " + cn);
        }
    }

    public static void timKhoang() {
        System.out.println("Nhap khoang luong (tu...den...) ");
        System.out.print("Tu: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Den: ");
        double b = Double.parseDouble(sc.nextLine());
        boolean check = false;
        for (NhanVien nv : list) {
            if (nv.getLuong() >= a && nv.getLuong() <= b) {
                System.out.printf("%-10s|\t%-32s|\t%f\n", nv.getMaNV(), nv.getHoTen(), nv.getThuNhap());
                check = true;
                break;
            }
        }
        if (check = true) {
            System.out.println("Khong tim thay NV nao tu " + a + " den " + b);
        }
    }

    //Sap xep theo abc
    public static void sapXepHoTen() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return (o1.getHoTen().compareTo(o2.getHoTen()));
            }
        };
        Collections.sort(list, comp);
    }

    //Sap xep theo so tang dan
    public static void sapXepThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o1.getThuNhap(), o2.getThuNhap());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Sap Xep NV Tang Dan Theo Thu Nhap");
    }

    public static void top5() {
        //sap xep theo so giam dan
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return Double.compare(o2.getThuNhap(), o1.getThuNhap());
            }
        };
        Collections.sort(list, comp);
        if (list.size() < 5) {
            System.out.printf("\t*Top %d Nhan Vien co thu nhap cao nhat*\n", list.size());
            for (int i = 0; i < list.size(); i++) {
                System.out.println("*Top " + (i + 1));
                System.out.printf("%-10s|\t%-32s|\t%f\n", list.get(i).getMaNV(), list.get(i).getHoTen(), list.get(i).getThuNhap());
            }
        } else {
            System.out.println("\t*Top 5 Nhan Vien co thu nhap cao nhat*");
            for (int i = 0; i < 5; i++) {
                System.out.println("*Top " + (i + 1));
                System.out.printf("%-10s|\t%-32s|\t%f\n", list.get(i).getMaNV(), list.get(i).getHoTen(), list.get(i).getThuNhap());
            }
        }
    }

}
