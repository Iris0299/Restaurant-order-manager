package cacnhantochung;

import cacnhantochung.MonAn;

public class MonAnTrongGio {
    
    private MonAn monAn;
    private int soLuong;
    private double giaTien;

    public MonAnTrongGio(MonAn item, int soLuong, double giaTien) {
        this.monAn = monAn;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public MonAn getItem() {
        return monAn;
    }

    public void setItem(MonAn monAn) {
        this.monAn = monAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
}
