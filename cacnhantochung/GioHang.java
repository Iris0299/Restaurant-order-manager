
package cacnhantochung;

import java.util.List;

import cacnhantochung.MonAnTrongGio;


public class GioHang {
    
   private List<MonAnTrongGio> nhungMonAnTrongGio;
   private double tongTien;

    public GioHang(List<MonAnTrongGio> nhungMonAnTrongGio, double tongTien) {
        this.nhungMonAnTrongGio = nhungMonAnTrongGio;
        this.tongTien = tongTien;
    }

    public List<MonAnTrongGio> getNhungMonAnTrongGio() {
        return nhungMonAnTrongGio;
    }

    public void setNhungMonAnTrongGio(List<MonAnTrongGio> nhungMonAnTrongGio) {
        this.nhungMonAnTrongGio = nhungMonAnTrongGio;
    }
    
    public void themMonAnVaoGio(MonAnTrongGio monAnTrongGio) {
        this.nhungMonAnTrongGio.add(monAnTrongGio);
    }

    public double getTongTien() {
        tongTien = 0;
        nhungMonAnTrongGio.forEach((monAnTrongGio) -> {
            tongTien += monAnTrongGio.getGiaTien();
        });
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    } 
}
