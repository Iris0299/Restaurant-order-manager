
package cacnhantochung;


public class DanhSachGoiMon {
    private int maGoiMon;
    private String tenGoiMon;
    private int soLuongGoiMon;
    private double giaTienGoiMon;

    public DanhSachGoiMon(int maGoiMon, String tenGoiMon, int soLuongGoiMon, double giaTienGoiMon) {
        this.maGoiMon = maGoiMon;
        this.tenGoiMon = tenGoiMon;
        this.soLuongGoiMon = soLuongGoiMon;
        this.giaTienGoiMon = giaTienGoiMon;
    }

    public int getMaGoiMon() {
        return maGoiMon;
    }

    public void setMaGoiMon(int maGoiMon) {
        this.maGoiMon = maGoiMon;
    }

    public String getTenGoiMon() {
        return tenGoiMon;
    }

    public void setTenGoiMon(String tenGoiMon) {
        this.tenGoiMon = tenGoiMon;
    }

    public int getSoLuongGoiMon() {
        return soLuongGoiMon;
    }

    public void setSoLuongGoiMon(int soLuongGoiMon) {
        this.soLuongGoiMon = soLuongGoiMon;
    }

    public double getGiaTienGoiMon() {
        return giaTienGoiMon;
    }

    public void setGiaTienGoiMon(double giaTienGoiMon) {
        this.giaTienGoiMon = giaTienGoiMon;
    }
}
