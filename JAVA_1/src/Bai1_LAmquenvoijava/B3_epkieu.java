/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LAmquenvoijava;

/**
 *
 * @author Van Anh
 */
public class B3_epkieu {
    public static void main(String[] args) 
    {
          //1. Ep kieu tring ve so
        String a = "1",b = "2",c;
        c = a + b; //=12 cong chuoi
        System.out.println("a+c= "+c);//=12
        //int d = a + b; //Loi vi 1 bien kieu so nguyen khong the = Chuoi
        int d = Integer.parseInt(a)+Integer.parseInt(b);
        // Integer.parseInt(a) = Hành dong ép kieu tu chuoi ve so
        System.out.println("a+b= "+d);//=3
          //2. Ep kieu giua cac so
        int n1=5;
        double n2= 5.6;
        n2 = n1; //Ep kieu tu dong
        // n1 = n2 ; Không the do gia tri cua kieu du lieu lon ve nho
        n1 = (int) n2; // Mat di phan thap phan cua double
        
    }
    
  
    
}