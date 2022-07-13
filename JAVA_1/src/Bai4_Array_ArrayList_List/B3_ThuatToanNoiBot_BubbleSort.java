/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

/**
 *
 * @author Van Anh
 */
public class B3_ThuatToanNoiBot_BubbleSort {
     public static void main(String[] args) {
        int[] arrNumber = {99, 11, 22, 00};

        //In mảng chưa sắp xếp
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");
        /*
            99 11 22 00
        i = 0
            arr[0] > arr[1] | 99 > 11 = true
            11 99 22 00
            arr[0] > arr[2] | 11 > 22 = false
            11 99 22 00
            arr[0] > arr[3] | 11 > 00 = true
            00 99 22 11
        i = 1
            arr[1] > arr[2] | 99 > 22 = true
            00 22 99 11
            arr[1] > arr[3] | 22 > 11 = true
            00 11 99 22
        i = 2
             arr[2] > arr[3] | 99 > 22 = true
            00 11 22 99 
        
         */
//        for (int i = 0; i < arrNumber.length -1; i++) {
//            for (int j = i+1; j < arrNumber.length; j++) {
//                if (arrNumber[i] >arrNumber[j]) {
//                    int temp = arrNumber[i];
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//            }

        //Cách 2:
        System.out.println("");
        for (int i = 0; i < arrNumber.length-1; i++) {
            System.out.println("Lần chay thứ: " + i);
            for (int x : arrNumber) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumber.length; j++) {
                System.out.printf("Điều kiện %d > %d \n", arrNumber[i], arrNumber[j]);
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                    System.out.printf("Hoán vị của: %d & %d \n", arrNumber[i], arrNumber[j]);
                    for (int x : arrNumber) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }

    }
    //Cách 2:
}
