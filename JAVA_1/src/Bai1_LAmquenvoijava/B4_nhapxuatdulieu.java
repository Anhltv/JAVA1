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
public class B4_nhapxuatdulieu {
    public static void main(String[] args) {
        //1. Xuat du lieu ra man hinh
        System.out.print("Toi muon hoc gioi java 1"); //khong xuong dong
        System.out.println("Tai nganh PTPM"); // tu dong xuong dong
        System.out.print("SP2022 \t cung thay Dungna29 \n");
        
        String name = "Hoa";
        System.out.printf("Toi ten: %s Sinh nam : %d \n ",name,2003); // khong tu xuong dong
        System.out.println("Toi ten : " + name + "Sinh nam: " +2003);
        
        //2. Nhap du lieu tu ban phim
        //Viet mot chuong trinh nhap ten va in ra
        
        //Buoc 1: Khai bao thu vien
        Scanner sc = new Scanner(System.in);
        //Buoc 2: Xac dinh so luong bien can phai su dung
        String name1; 
        //Buoc 3: Huong dan nguoi su dung va gan gia tri
        System.out.print("Moi ban nhap ten: ");
        name1 = sc.nextLine(); //sc.nextLine() co kieu du lieu la String va hanh dong o day la do gia tri cua nguoi dung vao cho bien
        
        //Buoc 4: Thuc thi
        System.out.printf("Chao ban : %s", name1);
        
        
        
    }
    
}
