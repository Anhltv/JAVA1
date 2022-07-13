/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_OOP;

/**
 *
 * @author Van Anh
 */
public class NguoiYeuCu {
    //Phần 1: Liệt kê tất cả các thuộc tính của đối tượng
    private String ten;
    private int ns;
    private double canNang;
    private String queQuan;
    private String  soThich;
    private int gioiTinh;//1 = Nam | 0 = Nữ
    private String  truong;
    
    //Phần 2: Contructor khi mới học luôn có 2 Contructor
 /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên
            trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  để khởi tạo đối tượng có ngay giá trị
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
 */
 
    //2.1 Contructor không tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor

    public NguoiYeuCu() {
    }
     //2.2 Contructor có tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor - Select All

    public NguoiYeuCu(String ten, int ns, double canNang, String queQuan, String soThich, int gioiTinh, String truong) {
        this.ten = ten;
        this.ns = ns;
        this.canNang = canNang;
        this.queQuan = queQuan;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
        this.truong = truong;
    }
    
      //Phần 3:Getter và Setter Vì khi thuộc tính bị Priavate muốn lấy và gán giá trị cho nó thì phải sử dụng
  // Alt + Insert chọn Getter và Setter -> Select All

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }
    
    //Phần 4: Các phương thức đối tượng
    public void inRaManHinh(){
        System.out.printf("%s | %d | %f | %s | %s | %s | %s \n",ten,ns,canNang,queQuan,soThich,gioiTinh==1?"Nam":"Nữ",truong);
    }
}
