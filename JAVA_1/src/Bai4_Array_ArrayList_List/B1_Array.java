/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_Array_ArrayList_List;

/**
 *
 * @author Van Anh
 */
public class B1_Array {
 /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
                    - Hai câu lệnh đi kèm vòng lặp: 
                      break; Ngắt vòng lặp
                      continue; Bỏ qua đoạn code phía sau và chạy sang vòng lặp tiếp theo
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    public static void main(String[] args) {
        //Phan 1: Khai bao bien
        int a = 5;
        //Phan 2: Khai bao mang
        int[] arrNumbers;//Khai bao mang
        arrNumbers = new int[5];//Khoi tao mot mang va kich thuoc mang thi moi su dung duoc
        String arrMonHoc[] = new String[6];

        String arrNames[] = {"Java 1", "Java 2", "Java 3"};//Khai bao khong tuong minh
        String arrNames1[] = new String[]{"Java 1", "Java 2", "Java 3"};//Khai bao tuong minh
        var arrNames2 = new String[4];
        var arrNums = new int[]{1, 2, 3, 4, 5, 6};
        //Phan 3:Gan gia tri cua mang thong qua index
        //arrNumbers = 6 (Sai)
        arrNumbers[0] = 88;//Gan gia tri cho index 0
        arrNumbers[1] = 89;
        arrNumbers[2] = 87;
        arrNumbers[0] = 1;//Ghi de gia tri tai index
        //Phan 4: Xuat gia tri - Gan vao index nao thi lay ra index do
        System.out.println(arrNumbers[1]);

        //In tat ca cac phan tu trong mang thi dung vong lap
        for (int x : arrNumbers) {
            System.out.println(x + " ");
        }
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i] + " ");
        }
        System.out.println("");
        //In tat ca so le ra man hinh
        for (int x : arrNumbers) {
           if (x % 2 == 0){
               continue;
           }
            System.out.println(x + "");
        }
        
    }
}
