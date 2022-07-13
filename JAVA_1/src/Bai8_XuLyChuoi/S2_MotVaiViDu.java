/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8_XuLyChuoi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class S2_MotVaiViDu {

    //Bài 1: Viết 1 chương trình nhập vào Full Name sao đó viết hoa chữ cái đầu của từ lên.  nguyen thi hoa = Nguyen Thi Hoa
    //Bài 2: Viết 1 chương trình zen mã tự động như sinh viên tại FPOLY.  nguyễn thị hoa = HoaNTPHXXX
    //Giải quyết 2 bài trên dựa vào lý thuyết xử lý chuỗi thầy đã up.
    
    //Bai 1:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi ban nhap vao ho ten: ");
            String ten = sc.nextLine();
            System.out.println("Ten ban vua nhap: " +vietHoaFullName(ten));
            System.out.println("Ma sinh vien: " +zenMSVFpoly(ten, "24081"));
        } while (true);

    }

    public static String vietHoaFullName(String text) {
        String temp = text.trim().toLowerCase();
        String[] arrNames = temp.split("\\s+");
        String FullName = "";
        for (String x : arrNames) {
            FullName += vietHoaChuCaiDau(x) + " ";
        }
        return FullName;
    }

    public static String vietHoaChuCaiDau(String text) {
        String temp = text.trim().toLowerCase();
        return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1);
    }
    
    public static String zenMSVFpoly(String text,String ms){
        String temp = text.trim().toLowerCase();
        String[] arrNames = temp.split("\\s+");
        String mSSV = vietHoaChuCaiDau(arrNames[arrNames.length-1]);
        for (int i = 0; i < arrNames.length-1; i++) {
            mSSV += String.valueOf(arrNames[i].charAt(0)).toUpperCase();
        }
        String maSo = mSSV + "PH" + ms;
        return maSo;
    }
    
}
