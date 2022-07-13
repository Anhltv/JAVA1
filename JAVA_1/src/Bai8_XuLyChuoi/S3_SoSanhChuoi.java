/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8_XuLyChuoi;

/**
 *
 * @author Van Anh
 */
public class S3_SoSanhChuoi {
    public static void main(String[] args) {
        String[] arrNames = {"abc","ABC","adea","eadc"};
        for (String x : arrNames) {
            if (x.equals("abc")) {
                System.out.println(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrNames) {
            if (x.startsWith("a")) {
                System.out.println(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrNames) {
            if (x.contains("a")) {
                System.out.println(x + " ");
            }
        }
                
    }
}
