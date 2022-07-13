/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_8;

/**
 *
 * @author Van Anh
 */
public class XeSo extends XeMay {

    private String nhienLieu;
    private String dongCo;

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public XeSo() {
    }

    public XeSo(String nhienLieu, String dongCo, String maXeMay, String hangXe, int giaTien) {
        super(maXeMay, hangXe, giaTien);
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    public XeSo(String nhienLieu, String dongCo) {
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    @Override
    public void inThongTin() {
        System.out.println("Ma xe: " + super.getMaXeMay() + " - Hang xe: " + super.getHangXe() + " - Gia tien: " + super.getGiaTien() + " - Nhien lieu: " + nhienLieu + " - Dong co: " + dongCo);
    }

}
