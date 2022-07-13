/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeThiVanAnh_PH25818_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class mainNhanVien {
    
    public static void main(String[] args) {
        NhanVienService nhanVienService = new NhanVienService();
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
        int choice;
        do {
            System.out.println("+---------------------Menu---------------------+");
            System.out.println("Y1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("Y2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
            System.out.println("Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("Y7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("Y8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("Y9. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("Y10. Thoát chương trình");
            System.out.println("+----------------------------------------------+");
            System.out.println("Moi ban chon chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    String tiepTuc;
                    do {
                        System.out.println("Nhap thong tin: ");
                        NhanVien input = nhanVienService.nhap();
                        nhanVienArrayList.add(input);
                        do {
                            System.out.println("Nhap tiep: ");
                            System.out.println("Moi chon (y/n): ");
                            tiepTuc = sc.nextLine();
                            if (tiepTuc.equalsIgnoreCase("n") == false && tiepTuc.equalsIgnoreCase("y") == false) {
                                System.out.println("Khong hop le");
                            }

                        } while (tiepTuc.equalsIgnoreCase("n") == false && tiepTuc.equalsIgnoreCase("y") == false);
                        if (tiepTuc.equalsIgnoreCase("n")) {
                            break;
                        }
                    } while (tiepTuc.equalsIgnoreCase("y"));
                    break;
                case 2:
                    for (NhanVien nhanVien : nhanVienArrayList) {
                        nhanVien.display();
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ten NV muon tim kiem: ");
                    String tenSearch = sc.nextLine();
                    ArrayList<NhanVien> searchTheoMa = nhanVienService.searchTheoMa(nhanVienArrayList, tenSearch);
                    if (searchTheoMa.isEmpty()) {
                        System.out.println("Khong tim thay nhan vien");
                    } else {
                        for (NhanVien nhanVien : searchTheoMa) {
                            nhanVien.display();
                        }
                    }
                    
                    break;
                case 4:
                    System.out.println("Nhap ma so nhan vien muon xoa : ");
                    String maNVRemove = sc.nextLine();
                    boolean check1 = nhanVienService.removeEmployee(nhanVienArrayList, maNVRemove);
                    if (check1) {
                        System.out.println("Xoa thanh cong");
                    } else {
                        System.out.println("Khong co phan tu nao duoc xoa");
                    }
                    break;
                case 5:
                   System.out.print("Nhập mã nhân viên muốn update: ");
                    String maNV = sc.nextLine();
                    ArrayList<NhanVien> updateNV = nhanVienService.updateNhanVien(nhanVienArrayList, maNV);
                    for (NhanVien nhanVien : updateNV) {
                        nhanVien.display();
                    }
                    break;
                case 6:
                    System.out.println("Moi ban nhap vao luong min: ");
                    double luongMin = sc.nextDouble();
                    System.out.println("Moi ban nhap vao luong max: ");
                    double luongMax = sc.nextDouble();
                    ArrayList<NhanVien> listLuongNhanVien = nhanVienService.searchKhoangLuong(nhanVienArrayList, luongMin, luongMax);
                    System.out.println("Cac nhan vien co luong trong khoang do la: ");
                    if (listLuongNhanVien.isEmpty()) {
                        System.out.println("Khong tim thay");
                    } else {
                        for (NhanVien nhanVien : listLuongNhanVien) {
                            nhanVien.display();
                        }
                    }
                    break;
                case 7:
                    nhanVienService.sortEmployee(nhanVienArrayList);
                    System.out.println("Mang sau khi sap xep la: ");
                    for (NhanVien nhanVienSort : nhanVienArrayList) {
                        nhanVienSort.display();
                    }
                    break;
                case 8:
                    nhanVienService.sortThuNhap(nhanVienArrayList);
                    System.out.println("Mang sau khi sap xep la: ");
                    for (NhanVien nhanVienSapXep : nhanVienArrayList) {
                        nhanVienSapXep.display();
                    }
                    break;
                case 9:
                    nhanVienService.nhanVienTop5(nhanVienArrayList);
                    break;
                case 10:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Chuc nang ban chon khong ton tai");
                    break;
            }
        } while ( choice != 10 );
    }
}
