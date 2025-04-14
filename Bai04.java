package Lab2;
import java.util.Scanner;

public class Bai04 {

    // Các thuộc tính cho mỗi xe
    String tenChuXe;
    String loaiXe;
    int dungTich;
    double triGia;

    // Constructor (khởi tạo)
    public Bai04(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    // Phương thức tính thuế
    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    // Phương thức in thông tin xe
    public void hienThi() {
        System.out.printf("%-20s %-15s %10d %15.2f %15.2f\n",
                tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }

    // Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai04[] dsXe = new Bai04[3]; // danh sách 3 xe

        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat bang ke thue");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine(); // bỏ dòng thừa

            switch (chon) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("\nNhap thong tin xe thu " + (i + 1));
                        System.out.print("Ten chu xe: ");
                        String ten = sc.nextLine();

                        System.out.print("Loai xe: ");
                        String loai = sc.nextLine();

                        System.out.print("Dung tich (cc): ");
                        int dungTich = sc.nextInt();

                        System.out.print("Tri gia: ");
                        double triGia = sc.nextDouble();
                        sc.nextLine(); // bỏ dòng thừa

                        dsXe[i] = new Bai04(ten, loai, dungTich, triGia);
                    }
                    break;

                case 2:
                    System.out.println("\nTen chu xe          Loai xe         Dung tich       Tri gia       Thue phai nop");
                    System.out.println("==================================================================================");
                    for (int i = 0; i < 3; i++) {
                        if (dsXe[i] != null) {
                            dsXe[i].hienThi();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Cya!");
                    break;

                default:
                    System.out.println("Chon sai! Moi chon lai.");
            }

        } while (chon != 0);

    }
}

