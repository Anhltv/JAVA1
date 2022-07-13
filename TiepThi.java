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
public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi(double doanhSo, double hueHong, String maNhanVien, String hoTen, int luong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hoaHong;
    }

    public void setHueHong(double hueHong) {
        this.hoaHong = hueHong;
    }

    public TiepThi() {
    }

    public void display() {
        super.display();
        System.out.println("- Doanh so: " + doanhSo + " - Hoa hong: " + hoaHong);
    }

    @Override
    public int getthuNhap() {
        return super.getthuNhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
