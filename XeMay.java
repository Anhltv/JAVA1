/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_8;

/**
 *
 * @author Van Anh
 */
public class XeMay {
    private String maXeMay;
    private String hangXe;
    private int giaTien;

    @Override
    public String toString() {
        return "XeMay{" + "maXeMay=" + maXeMay + ", hangXe=" + hangXe + ", giaTien=" + giaTien + '}';
    }

    public String getMaXeMay() {
        return maXeMay;
    }

    public void setMaXeMay(String maXeMay) {
        this.maXeMay = maXeMay;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public XeMay(String maXeMay, String hangXe, int giaTien) {
        this.maXeMay = maXeMay;
        this.hangXe = hangXe;
        this.giaTien = giaTien;
    }

    public XeMay() {
    }
    
    public void inThongTin(){
        System.out.println("Ma xe: " + maXeMay + " - Hang xe: " + hangXe + " - Gia tien: " + giaTien);
    }
}
