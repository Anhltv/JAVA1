/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LAmquenvoijava;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1;
        int namsinh;
        String masv;
        System.out.print("Moi ban nhap vao ten: ");
        name1 = sc.nextLine();
        System.out.print("Moi ban nhap vao nam sinh: ");
        //namsinh = sc.nextInt();
        //Troi lenh chi xay ra khi nhap mot so va phia sau no la nhap 1 chuoi
        //Cach 1: Chong troi
        //sc.nextLine();
        //Cach 2: Tu gio tro di khong can quan tam den next So chung ta se coi tat ca du lieu nguoi dung nhap la String
        namsinh = Integer.parseInt(sc.nextLine());
        System.out.print("Moi ban nhap vao ma sinh vien: ");
        masv = sc.nextLine();
        System.out.printf("Chao ban %s | %d | %s den voi chuong trinh lap trinh dau tien" ,name1,namsinh,masv);
        
    }
    
}
