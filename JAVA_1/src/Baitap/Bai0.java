/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

import java.util.Scanner;

/**
 *
 * @author Van Anh
 */
public class Bai0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max;
        System.out.println("Moi nhap số đầu của khoảng: ");
        min = input.nextInt();
        System.out.println("Moi nhập số cuối của mảng: ");

        max = input.nextInt();
        int i, j;
        for (i = min; i <= max; i++) {
               System.out.println("");
            for (j = 1; j <= 10; j++) {
                System.out.println("" + i + "x" + j + "=" + i * j);

            }
        }
    }
}
