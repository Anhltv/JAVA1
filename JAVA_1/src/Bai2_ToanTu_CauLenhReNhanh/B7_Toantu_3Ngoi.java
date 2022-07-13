/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class B7_Toantu_3Ngoi {

    public static void main(String[] args) {
        String temp1 = 8 > 9 ? "Ðúng" : "Sai";
        int temp2 = 8 > 9 ? 1 : 0;
        boolean temp3 = 8 > 9 ? true : false;
        double temp4 = 8 > 9 ? 8.9 : 8.8;

        //Bai tap
//        int namSinhBanThan = 2003, gioitinh = 1;
//        String tenBan;
//        int nsBan, gtBan;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi ban nhap vao ten: ");
//        tenBan = sc.nextLine();
//        System.out.println("Moi ban nhap vao nam sinh: ");
//        nsBan = sc.nextInt();
//        System.out.println("Moi ban nhap vao gioi tinh: ");
//        gtBan = sc.nextInt();
//        String temp5 = 1 > 0 ? "Nam" : "Nu";
//        Scanner sc = new Scanner (System.in);
//      int nsMe = 2003, nsND;
//      String tenND, gioiTinhND;
//      System.out.print("Mời bạn nhập tên: ");
//      tenND = sc.nextLine();
//      System.out.print("Mời bạn nhập ns: ");
//      nsND = Integer.parseInt(sc.nextLine());
//      System.out.print("Mời bạn nhập gt (nam hoặc nữ): ");
//      gioiTinhND = sc.nextLine();
//      String kq = (nsND < nsMe && gioiTinhND.toLowerCase().equals("nam")) ? "Anh"
//              : (nsND < nsMe && gioiTinhND.toLowerCase().equals("nu")) ? "Chị"
//              : (nsND > nsMe && gioiTinhND.toLowerCase().equals("nu")) ? "Em gái"
//              : (nsND > nsMe && gioiTinhND.toLowerCase().equals("nam")) ? "Em trai"
//              : "Bạn";
//      System.out.printf("Chào %s %s \n", kq, tenND);
        int namSinhBanThan = 2003, gioitinh = 0;
        Scanner sc = new Scanner(System.in);
        String tenBan;
        int nsBan, gtBan;
        System.out.println("Moi ban nhap vao ten: ");
        tenBan = sc.nextLine();
        System.out.println("Moi ban nhap vao nam sinh: ");
        nsBan = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap vao gioi tinh: ");
        gtBan = Integer.parseInt(sc.nextLine());

        String temp = (namSinhBanThan > nsBan && gtBan == 1) ? "Anh"
                : (namSinhBanThan > nsBan && gtBan == 0) ? "Chi"
                        : (namSinhBanThan < nsBan && gtBan == 1) ? "Em trai"
                                : (namSinhBanThan < nsBan && gtBan == 1) ? "Em gai" : "Ban";
        System.out.printf("Chao %s %s \n ", temp, tenBan);

    }
}
