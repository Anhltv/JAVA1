/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeThiVanAnh_PH25818_Assignment;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class NhanVien {

    private String maNhanVien;
    private String hoTen;
    private int luong;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public NhanVien(String maNhanVien, String hoTen, int luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {
    }

    public int getthuNhap() {
        return this.luong - this.getthueTN();
    }

    public int getthueTN() {
        if (this.luong > 15000000) {
            return luong - ((luong / 100) * 12);
        } else if (this.luong >= 9000000 && this.luong <= 15000000) {
            return luong - ((luong / 100) * 10);
        } else {
            return luong;
        }

    }


    public void display() {
        System.out.println("Ma nhan vien: " + maNhanVien + " - Ho ten: " + hoTen + " - Luong: " + luong);
    }
}
