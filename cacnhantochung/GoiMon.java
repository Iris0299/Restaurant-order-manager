
package cacnhantochung;

public class GoiMon {
    private int maGoiMon;
    private double giaTien;
    private String ngayGoiMon;

    public GoiMon(int maGoiMon, double giaTien, String ngayGoiMon) {
        this.maGoiMon = maGoiMon;
        this.giaTien = giaTien;
        this.ngayGoiMon = ngayGoiMon;
    }

    public int getMaGoiMon() {
        return maGoiMon;
    }

    public void setMaGoiMon(int maGoiMon) {
        this.maGoiMon = maGoiMon;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getNgayGoiMon() {
        return ngayGoiMon;
    }

    public void setNgayGoiMon(String ngayGoiMon) {
        this.ngayGoiMon = ngayGoiMon;
    }
}
