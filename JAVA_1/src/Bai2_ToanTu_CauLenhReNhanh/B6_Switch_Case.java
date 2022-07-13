/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_ToanTu_CauLenhReNhanh;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class B6_Switch_Case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        while (true) {
            String input;
            System.out.println("Menu quan FPOLY");
            System.out.println("1. Pho");
            System.out.println("2. Bun");
            System.out.println("3. Com rang");
            System.out.println("4. Banh mi");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("Moi ban chon mon: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Ban chon mon pho");
                    break;
                case "2":
                    System.out.println("Ban chon mon bun");
                    break;
                case "3":
                    System.out.println("Ban chon mon com");
                    break;
                case "4":
                    System.out.println("Ban chon mon banh");
                    break;
                case "5":
                    System.out.println("Hen gap lai");
                    System.exit(0);//Thoat chuong trinh
                    break;
                default:
                    System.out.println("Hen gap lai");
                    break;//co cung dc khong cung duoc
            }

        }

    }
}
