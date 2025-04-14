package Lab2;
public class Bai05_Sach {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    // Constructor mặc định
    public Bai05_Sach() {
        boCode = "";
        boTitle = "";
        boAuthor = "";
    }

    // Constructor đầy đủ
    public Bai05_Sach(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    // Constructor sao chép
    public Bai05_Sach(Bai05_Sach bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    // Getter
    public String getboCode() { return boCode; }
    public String getBoTitle() { return boTitle; }
    public String getBoAuthor() { return boAuthor; }
}


