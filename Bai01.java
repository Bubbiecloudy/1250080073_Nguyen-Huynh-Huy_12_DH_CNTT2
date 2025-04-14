package Lab2;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner jia = new Scanner(System.in);

        int[] a = new int[100];
        int n;

        // a. Nhập mảng
        System.out.print("Nhap so luong phan tu: ");
        n = jia.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = jia.nextInt();
        }

        // b. Xuất mảng
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // c. Tìm vị trí của số nguyên x
        System.out.print("Nhap so x can tim: ");
        int x = jia.nextInt();
        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Tim thay x tai vi tri: " + i);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay x trong mang.");
        }

        // d. Tìm giá trị lớn nhất
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat: " + max);

        // e. Tìm giá trị nhỏ nhất
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Gia tri nho nhat: " + min);

        // f. Tìm vị trí phần tử lớn nhất
        int viTriMax = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[viTriMax]) {
                viTriMax = i;
            }
        }
        System.out.println("Vi tri cua gia tri lon nhat: " + viTriMax);

        // g. Sắp xếp mảng tăng dần (bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
