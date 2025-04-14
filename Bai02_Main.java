package Lab2;
import java.util.Scanner;

public class Bai02_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai02_HCN hcn = new Bai02_HCN();

        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();

        hcn.setChieuDai(dai);
        hcn.setChieuRong(rong);

        System.out.println("\n--- Thong tin hinh chu nhat ---");
        System.out.println(hcn.toString());
    }
}
   