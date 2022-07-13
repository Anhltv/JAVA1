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
public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong(double trachNhiem, String maNhanVien, String hoTen, int luong) {
        super(maNhanVien, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong() {
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public void display() {
        super.display();
        System.out.println("- Luong trach nhiem: " + trachNhiem);
    }

    @Override
    public int getthuNhap() {
        return super.getthuNhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
