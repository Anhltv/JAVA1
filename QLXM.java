/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class QLXM {

    public XeMay input() {
        Scanner sc = new Scanner(System.in);
        XeMay xeMay = new XeMay();
        System.out.println("Nhap vao ma xe may: ");
        String maXeMay = sc.nextLine();
        System.out.println("Nhap vao hang xe may: ");
        String hangXe = sc.nextLine();
        System.out.println("Nhap vao gia tien: ");
        int giaTien = Integer.parseInt(sc.nextLine());
        xeMay.setMaXeMay(maXeMay);
        xeMay.setHangXe(hangXe);
        xeMay.setGiaTien(giaTien);
        return xeMay;
    }

    //Y3
    public ArrayList<XeMay> findSa(ArrayList<XeMay> listXeMay) {
        ArrayList<XeMay> listSa = new ArrayList<>();
        int size = listXeMay.size();
        for (int i = 0; i < size; i++) {
            if (listXeMay.get(i).getHangXe().contains("sa")) {
                listSa.add(listXeMay.get(i));
            }
        }
        return listSa;
    }

    //Y4
    public ArrayList<XeMay> searchTheoYeuCau(ArrayList<XeMay> listXeMay, String tenHang) {
        ArrayList<XeMay> output = new ArrayList<>();
        for (int i = 0; i < listXeMay.size(); i++) {
            if (listXeMay.get(i).getHangXe().contains(tenHang)) {
                output.add(listXeMay.get(i));
            }
        }
        return output;
    }

    //Y5
    public ArrayList<XeMay> searchGiaTien(ArrayList<XeMay> listXeMay, int giaTienMin, int giaTienMax) {
        ArrayList<XeMay> listGiaTien = new ArrayList<>();
        int size = listXeMay.size();
        for (int i = 0; i < size; i++) {
            if (listXeMay.get(i).getGiaTien() > giaTienMin && listXeMay.get(i).getGiaTien() < giaTienMax) {
                listGiaTien.add(listXeMay.get(i));
            }
        }
        return listGiaTien;
    }

    //Y6
    public void sortGiaTien(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((XeMay x1, XeMay x2) -> x2.getGiaTien() - x1.getGiaTien());
    }

    //Y7
    public void sortHangXe(ArrayList<XeMay> listXeMay) {
        listXeMay.sort((XeMay x1, XeMay x2) -> x1.getHangXe().compareTo(x2.getHangXe()));
    }

    public XeSo inputXeSo() {
        Scanner sc = new Scanner(System.in);
        XeSo xeSo = new XeSo();
        System.out.println("Nhap vao ma xe may: ");
        String maXeMay = sc.nextLine();
        System.out.println("Nhap vao hang xe may: ");
        String hangXe = sc.nextLine();
        System.out.println("Nhap vao gia tien: ");
        int giaTien = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao nhien lieu: ");
        String nhienLieu = sc.nextLine();
        System.out.println("Nhap vao dong co: ");
        String dongCo = sc.nextLine();
        xeSo.setMaXeMay(maXeMay);
        xeSo.setHangXe(hangXe);
        xeSo.setGiaTien(giaTien);
        xeSo.setNhienLieu(nhienLieu);
        xeSo.setDongCo(dongCo);
        return xeSo;
    }
}
