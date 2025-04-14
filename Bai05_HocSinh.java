package Lab2;

public class Bai05_HocSinh {
    private String stID;
    private String stName;
    private String stClass;

    // Constructor mặc định
    public Bai05_HocSinh() {
        stID = "";
        stName = "";
        stClass = "";
    }

    // Constructor đầy đủ
    public Bai05_HocSinh(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    // Constructor sao chép
    public Bai05_HocSinh(Bai05_HocSinh st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    // Getter
    public String getStID() { return stID; }
    public String getStName() { return stName; }
    public String getStClass() { return stClass; }

    // Setter
    public void setStID(String id) { this.stID = id; }
    public void setStName(String name) { this.stName = name; }
    public void setStClass(String cls) { this.stClass = cls; }

    // toString
    public String toString() {
        return "ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}

