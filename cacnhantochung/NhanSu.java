
package cacnhantochung;


public class NhanSu {
    private String maNhanSu;
    private String tenNhanSu;
    private double luongNhanSu;

    public NhanSu(String maNhanSu, String tenNhanSu, double luongNhanSu) {
        this.maNhanSu = maNhanSu;
        this.tenNhanSu = tenNhanSu;
        this.luongNhanSu = luongNhanSu;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getTenNhanSu() {
        return tenNhanSu;
    }
    public void setTenNhanSu(String tenNhanSu) {
        this.tenNhanSu = tenNhanSu;
    }

    public double getLuongNhanSu() {
        return luongNhanSu;
    }
    public void setLuongNhanSu(double luongNhanSu) {
        this.luongNhanSu = luongNhanSu;
    }
}
