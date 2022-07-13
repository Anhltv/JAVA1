/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_8;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLXM quanLy = new QLXM();
        ArrayList<XeMay> listXeMay = new ArrayList<>();
        int choice;
        do {
            System.out.println("+---------------------Menu---------------------+");
            System.out.println("1. Nhập danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng");
            System.out.println("3. Hiển thị danh sách xe máy trong hãng xe bắt đầu bằng chữ “sa”");
            System.out.println("4. Hiển thị danh sách xe máy chứa hãng xe nhập từ bàn phím");
            System.out.println("5. Tìm kiếm xe máy trong khoảng giá tiền max, min");
            System.out.println("6. Sắp xếp giảm dần của giá tiền");
            System.out.println("7. Sắp xếp tăng dần theo hãng xe");
            System.out.println("8. Kế Thừa.");
            System.out.println("0. Thoát");
            System.out.println("+----------------------------------------------+");
            System.out.println("Moi ban chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    String tiepTuc;
                    do {
                        System.out.println("Nhap thong tin: ");
                        XeMay input = quanLy.input();
                        listXeMay.add(input);
                        do {
                            System.out.println("Ban co muon nhap tiep khong (Y/N): ");
                            tiepTuc = sc.nextLine();
                            if (tiepTuc.equalsIgnoreCase("n") == false && tiepTuc.equalsIgnoreCase("y") == false) {
                                System.out.println("Khong hop le");
                            }
                        } while (tiepTuc.equalsIgnoreCase("n") == false && tiepTuc.equalsIgnoreCase("y") == false);
                        if (tiepTuc.equalsIgnoreCase("n")) {
                            break;
                        }
                    } while (true);
                    break;

                case 2:
                    System.out.println("Xuat thong tin: ");
                    for (XeMay xeMay : listXeMay) {
                        xeMay.inThongTin();
                    }
                    break;
                case 3:
                    ArrayList<XeMay> listSa = quanLy.findSa(listXeMay);
                    if (listSa.isEmpty()) {
                        System.out.println("Khong co");
                    } else {
                        System.out.println("Danh sach xe may trong hang xe bat dau bang 'sa' la: ");
                        for (XeMay xeMay : listSa) {
                            xeMay.inThongTin();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Moi ban nhap ten hang can tim: ");
                    String tenHang = sc.nextLine();
                    ArrayList<XeMay> listSearchHang = quanLy.searchTheoYeuCau(listXeMay, tenHang);
                    if (listSearchHang.isEmpty()) {
                        System.out.println("Khong co.");
                    } else {
                        System.out.println("Danh sach co ten hang la: ");
                        for (XeMay item : listSearchHang) {
                            item.inThongTin();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap vao gia tien min: ");
                    int giaTienMin = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap vao gia tien max: ");
                    int giaTienMax = Integer.parseInt(sc.nextLine());
                    ArrayList<XeMay> listGiaTien = quanLy.searchGiaTien(listXeMay, giaTienMin, giaTienMax);
                    if (listGiaTien.isEmpty()) {
                        System.out.println("Khong co");
                    } else {
                        System.out.println("Danh sach gia tien trong khoang la: ");
                        for (XeMay xeMay : listGiaTien) {
                            xeMay.inThongTin();
                        }
                    }

                    break;
                case 6:
                    quanLy.sortGiaTien(listXeMay);
                    System.out.println("Mang sau khi sap xep la:");
                    for (XeMay xeMay : listXeMay) {
                        xeMay.inThongTin();
                    }
                    break;
                case 7:
                    quanLy.sortHangXe(listXeMay);
                    System.out.println("Mang sau khi sap xep la:");
                    for (XeMay xeMay : listXeMay) {
                        xeMay.inThongTin();
                    }
                    break;
                case 8:
                    XeSo xeSo = quanLy.inputXeSo();
                    xeSo.inThongTin();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang ban chon khong ton tai");
                    break;
            }
        } while (choice != 0);
    }

}
