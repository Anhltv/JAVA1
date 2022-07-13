/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeThiVanAnh_PH25818_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class NhanVienService {

    //Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.
    public ArrayList<NhanVien> searchTheoMa(ArrayList<NhanVien> listNhanVien, String maNV) {
        ArrayList<NhanVien> nhanVienSearch = new ArrayList<>();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMaNhanVien().contains(maNV)) {
                nhanVienSearch.add(listNhanVien.get(i));
            }
        }

        return nhanVienSearch;
    }
//Y4. Xóa nhân viên theo mã nhập từ bàn phím.

    public boolean removeEmployee(ArrayList<NhanVien> listNhanVien, String maNV) {
        boolean isRemove = false;
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNhanVien().equalsIgnoreCase(maNV)) {
                listNhanVien.remove(maNV);
                isRemove = true;
                break;
            }

        }
        return isRemove;
    }

    //Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.
    public ArrayList<NhanVien> updateNhanVien(ArrayList<NhanVien> listNhanVien, String maNV) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> updateNhanVien = new ArrayList<>();
        int size = listNhanVien.size();
        for (int i = 0; i < size; i++) {
            if (listNhanVien.get(i).getMaNhanVien().equals(maNV)) {
                System.out.print("Họ tên mới: ");
                String hoTenMoi = scanner.nextLine();
                System.out.print("Lương mới: ");
                int luong = scanner.nextInt();

                listNhanVien.get(i).setHoTen(hoTenMoi);
                listNhanVien.get(i).setLuong(luong);
            }
        }
        return updateNhanVien;
    }

    //Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
    public ArrayList<NhanVien> searchKhoangLuong(ArrayList<NhanVien> listNhanVien, double luongMin, double luongMax) {
        ArrayList<NhanVien> listNhanVienLuong = new ArrayList<>();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (luongMin < listNhanVien.get(i).getLuong() && listNhanVien.get(i).getLuong() < luongMax) {
                listNhanVienLuong.add(listNhanVien.get(i));
            }
        }
        return listNhanVienLuong;
    }

    //Y7. Sắp xếp nhân viên theo họ và tên.
    public void sortEmployee(ArrayList<NhanVien> listEmployee) {
        listEmployee.sort((NhanVien n1, NhanVien n2) -> n1.getHoTen().compareTo(n2.getHoTen()));
    }

    //Y8. Sắp xếp nhân viên theo thu nhập.
    public void sortThuNhap(ArrayList<NhanVien> listEmployee) {
        listEmployee.sort((NhanVien n1, NhanVien n2) -> n2.getthuNhap() - n1.getthuNhap());
    }

    //Y9. Xuất 5 nhân viên có thu nhập cao nhất.
    public void nhanVienTop5(ArrayList<NhanVien> listNhanVien) {
        listNhanVien.sort((NhanVien n1, NhanVien n2) -> n2.getthuNhap() - n1.getthuNhap());
        System.out.println("Danh sach 5 nhan vien co thu nhap cao nhat la: ");
        for (int i = 0; i < 5 && i < listNhanVien.size(); i++) {
            listNhanVien.get(i).display();
        }
    }
    //Y1 Y2

    public NhanVien nhap() {
        NhanVien nhanVien = new NhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma nhan vien: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhap vao ho ten nhan vien: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap vao luong: ");
        int luong = sc.nextInt();
        sc.nextLine();
        nhanVien.setMaNhanVien(maNhanVien);
        nhanVien.setHoTen(hoTen);
        nhanVien.setLuong(luong);
        return nhanVien;

    }

    public TiepThi inputTiepThi() {
        TiepThi tiepThi = new TiepThi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma nhan vien: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhap vao ho ten nhan vien: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap vao luong: ");
        int luong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao doanh so: ");
        double doanhSo = sc.nextDouble();
        System.out.println("Nhap vao hoa hong: ");
        double hoaHong = sc.nextDouble();
        tiepThi.setMaNhanVien(maNhanVien);
        tiepThi.setHoTen(hoTen);
        tiepThi.setLuong(luong);
        tiepThi.setDoanhSo(doanhSo);
        tiepThi.setHueHong(hoaHong);
        return tiepThi;
    }

    public TruongPhong inputTruongPhong() {
        TruongPhong truongPhong = new TruongPhong();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma nhan vien: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhap vao ho ten nhan vien: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap vao luong: ");
        int luong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao trach nghiem: ");
        double trachNghiem = sc.nextDouble();
        truongPhong.setMaNhanVien(maNhanVien);
        truongPhong.setHoTen(hoTen);
        truongPhong.setLuong(luong);
        truongPhong.setTrachNhiem(trachNghiem);
        return truongPhong;
    }

}
