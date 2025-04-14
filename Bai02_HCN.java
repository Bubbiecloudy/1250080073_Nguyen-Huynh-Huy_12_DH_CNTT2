package Lab2;
public class Bai02_HCN {
    // Attributes (thuộc tính)
    private double chieuDai;
    private double chieuRong;

    // Constructor không đối số (mặc định)
    public Bai02_HCN() {
        chieuDai = 0;
        chieuRong = 0;
    }

    // Constructor có đối số (nếu muốn dùng)
    public Bai02_HCN(double dai, double rong) {
        chieuDai = dai;
        chieuRong = rong;
    }

    // Setter
    public void setChieuDai(double dai) {
        chieuDai = dai;
    }

    public void setChieuRong(double rong) {
        chieuRong = rong;
    }

    // Getter
    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    // Tính diện tích
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Tính chu vi
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    // toString: hiển thị thông tin
    @Override
    public String toString() {
        return "Chieu dai: " + chieuDai +
               "\nChieu rong: " + chieuRong +
               "\nDien tich: " + tinhDienTich() +
               "\nChu vi: " + tinhChuVi();
    }
}

