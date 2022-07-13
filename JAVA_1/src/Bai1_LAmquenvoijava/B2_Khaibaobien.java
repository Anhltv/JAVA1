/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_LAmquenvoijava;

/**
 *
 * @author Van Anh
 */
public class B2_Khaibaobien {
    /*
      *********** Biến khái niệm cơ bản ***********
      Định nghĩa: Dùng để lưu trữ giá trị trong lập trình. Biến được lưu trữ ở trong Ram.
      Công thức: <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
      <kiểu dữ liệu>: Giúp định nghĩa giá trị muốn lưu trữ có kiểu dữ liệu là gì
      <tên biến>:Giúp định danh và gọi biến đó khi sử dụng. Có phân biệt chữ hoa chữ thường.
      [=giá trị khởi đầu]: Đưa giá trị đúng kiểu dữ liệu
  
      *********** Quy tắc đặt tên ***********
      Tên biến có phân biệt chữ hoa và chữ thường. Nên đặt tên biến bằng Tiếng Anh.
         String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
         String FirstName; //Kiểu CamelCase //Sử dụng khi tên Class có 2 từ trở lên hoặc 1 từ
         String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
         Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
         int int = 5; //Vi phạm nguyên tắc đặt biến
         Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
      *********** Các kiểu dữ liệu có trong java ***********  
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean (true, false)
            + Kiểu var: tự định nghĩa theo giá trị
  
      *********** Biến toàn cục và biến cục bộ ***********        
      + Biến toàn bộ: Khai báo bên ngoài của phương thức
        - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
        Ví dụ đặt tên: _firtName, _firstName;
      + Biến cục bộ: Khai báo bên trong phương thức. Biến cục bộ sẽ chỉ được sử dụng ở bên trong của 1 phương thức.  
     */

    String _temp = "FPOLY";//Khai báo biến toàn cục

    public static void main(String[] args) {
        //1. Char ký tự
        char c1 = 'a';//Các ký tự khác như + - * & ^ 1 2 3 a b c

        //2. String kiểu chuỗi
        String s1 = "UDPM";//Khai báo 1 biến có kiểu dữ liệu String và có khởi tạo giá trị ban đầu.
        String s2;//Khai báo 1 biến có kiểu dữ liệu String và không khởi tạo giá trị ban đầu.

        //3. Kiểu số nguyên:
        int i1 = 5;
        long l1 = 5;
        short sh1 = 6;
        //......
        
        //4. Số thực
        float f1 = 8.6f;
        double d1 = 3.6;
        
        //5. Kiểu dữ liệu ngầm định
        var v1 = 1;
        var v2 = 6.2;
        var v3 = "aaaaa";
        var v4 = 'a';
        var v5 = true;
        
        //6. Kiểu Logic:
        boolean b1 = true;//true hoặc false
    }
}
