
package dichvuchung;

import java.util.ArrayList;

import cacnhantochung.GioHang;
import cacnhantochung.MonAnTrongGio;


public class DichVuGoiMon {
    
    private GioHang gioHang;
    
    public DichVuGoiMon() {
        this.gioHang = new GioHang(new ArrayList<>(), 0);
    }
    
    public void addToCart(MonAnTrongGio monAnTrongGio) {
        this.gioHang.themMonAnVaoGio(monAnTrongGio);
    }
    
    public void clearCart() {
        this.gioHang = new GioHang(new ArrayList<>(), 0);
    }
    
    public GioHang getCart() {
        return this.gioHang;
    }
}
