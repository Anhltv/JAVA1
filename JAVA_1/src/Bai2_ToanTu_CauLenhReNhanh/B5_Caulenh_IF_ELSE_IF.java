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
public class B5_Caulenh_IF_ELSE_IF {
 /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
   */

 /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
        }
    
   */
 /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
   */
    public static void main(String[] args) {
        //Bai tap
        Scanner sc = new Scanner(System.in);
        double diemThi;
        System.out.println("Moi ban nhap diem thi: ");
        diemThi = Double.parseDouble(sc.nextLine());
        if (diemThi >= 9 && diemThi <= 10) {
            System.out.println("Xuat sac");
        } else if (diemThi >= 8 && diemThi < 9) {
            System.out.println("Gioi");
        } else if (diemThi >= 7 && diemThi < 8) {
            System.out.println("Kha");
        } else if (diemThi >= 5 && diemThi < 7) {
            System.out.println("Trung Binh");
        } else if (diemThi >= 0 && diemThi < 5) {
            System.out.println("Hoc Lai");
        } else {
            System.out.println("Ban vui long nhap diem he so 10");

        }
    }
}
