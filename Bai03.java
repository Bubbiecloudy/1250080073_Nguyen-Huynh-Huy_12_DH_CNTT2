package Lab2;
import java.util.Scanner; // Dùng để nhập từ bàn phím

// Lớp SinhVien dùng để lưu thông tin của một sinh viên
class SinhVien {
    // Các thuộc tính (biến lưu thông tin)
    private int maSV;          // Mã sinh viên
    private String hoTen;      // Họ tên sinh viên
    private float diemLT;      // Điểm lý thuyết
    private float diemTH;      // Điểm thực hành

    // Constructor mặc định (không có thông tin sẵn)
    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0;
        diemTH = 0;
    }

    // Constructor có đầy đủ thông tin (dùng khi biết sẵn thông tin)
    public SinhVien(int ma, String ten, float lt, float th) {
        maSV = ma;
        hoTen = ten;
        diemLT = lt;
        diemTH = th;
    }

    // Các phương thức "setter" dùng để gán giá trị
    public void setMaSV(int ma) {
        maSV = ma;
    }

    public void setHoTen(String ten) {
        hoTen = ten;
    }

    public void setDiemLT(float diem) {
        diemLT = diem;
    }

    public void setDiemTH(float diem) {
        diemTH = diem;
    }

    // Tính điểm trung bình
    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    // Hiển thị thông tin sinh viên dưới dạng chuỗi
    public String toString() {
        return String.format("%-6d %-20s %6.2f %8.2f %8.2f",
                maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}

// Lớp chính chứa hàm main
public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Dùng để nhập từ bàn phím

        // Tạo sinh viên sv1 (chính mình) - không cần nhập
        SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5f, 8.5f);

        // Tạo sinh viên sv2 (bạn thân) - không cần nhập
        SinhVien sv2 = new SinhVien(22222, "Le Thi Bong", 7.5f, 8.0f);

        // Tạo sinh viên sv3 (dùng constructor mặc định, sau đó nhập thông tin)
        SinhVien sv3 = new SinhVien();

        // Nhập thông tin sv3 từ bàn phím
        System.out.print("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSV(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap ho va ten cua sinh vien sv3: ");
        sv3.setHoTen(sc.nextLine());

        System.out.print("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(Float.parseFloat(sc.nextLine()));

        System.out.print("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(Float.parseFloat(sc.nextLine()));

        // In bảng danh sách sinh viên
        System.out.println(); // xuống dòng cho đẹp
        System.out.println("masv  hoten               diemlt  diemth  diemtb");
        System.out.println(sv1); // gọi toString() của sv1
        System.out.println(sv2); // gọi toString() của sv2
        System.out.println(sv3); // gọi toString() của sv3

        sc.close(); // đóng đối tượng Scanner lại
    }
}


