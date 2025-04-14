package Lab2;
public class Bai05_Main {
    public static void main(String[] args) {
        // Test SanPham
        Bai05_SanPham sp = new Bai05_SanPham();
        sp.nhap();
        sp.xuat();

        // Test Student
        Bai05_HocSinh st1 = new Bai05_HocSinh("SV01", "Nguyen Van A", "12A1");
        Bai05_HocSinh st2 = new Bai05_HocSinh(st1); // constructor copy
        System.out.println("\nThong tin sinh vien:");
        System.out.println(st2.toString());

        // Test Book
        Bai05_Sach bo1 = new Bai05_Sach("B001", "Lap trinh Java", "Tran Teo");
        Bai05_Sach bo2 = new Bai05_Sach(bo1); // constructor copy
        System.out.println("\nThong tin sach:");
        System.out.println("Ma: " + bo2.getboCode());
        System.out.println("Tieu de: " + bo2.getBoTitle());
        System.out.println("Tac gia: " + bo2.getBoAuthor());
    }
}

