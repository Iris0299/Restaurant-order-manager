package cacnhantochung;

public class MonAn {
    private String tenMon;
    private double giaTien;
    private int soLuong;

    public MonAn(String tenMon, double giaTien, int soLuong) {
        this.tenMon = tenMon;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
