/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8_XuLyChuoi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Van Anh
 */
public class S4_BieuThucChinhQuy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {

            System.out.println("Moi ban nhap so: ");
            input = sc.nextLine();

        } while (!checkSo_Chu(input, 1));
        System.out.println("Ban thong minh lam");
    }

    public static boolean checkSo_Chu(String text, int kieuCheck) {
        if (kieuCheck == 1) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);
            return matcher.matches();
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
