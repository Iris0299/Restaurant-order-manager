package dichvuchung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import cacnhantochung.NhanSu;
import quanlynhansu.ThemNhanSu;
import quanlynhansu.XoaNhanSu;
import quanlynhansu.SuaThongTinNhanSu;

public class DichVuNhanSu {

    public DichVuNhanSu() {
    }

    public List<NhanSu> getAll() {
        List<NhanSu> danhSachNhanSu = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("luutruthongtin/danhsachnhansu.txt"))) {
            while (scanner.hasNextLine()) {

                String labourLine = scanner.nextLine();

                String thongTin[] = labourLine.split(",");

                NhanSu nhanSu = new NhanSu(thongTin[0], thongTin[1], Double.parseDouble(thongTin[2]));

                danhSachNhanSu.add(nhanSu);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XoaNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachNhanSu;
    }

    public void create(NhanSu nhanSu) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachnhansu.txt", true))) {
            pw.println(nhanSu.getMaNhanSu() + "," + nhanSu.getTenNhanSu() + "," + nhanSu.getLuongNhanSu());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThemNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized boolean update(String id, NhanSu ns) {
        // đọc danh sách mon an
        List<NhanSu> danhSachNhanSu = getAll();

        int soSua = -1;
        for (int i = 0; i < danhSachNhanSu.size(); i++) {
            NhanSu labour = danhSachNhanSu.get(i);

            if (labour.getMaNhanSu().equalsIgnoreCase(id)) {
            	soSua = i;
            }
        }

        if (soSua == -1) {
           return false;
        }

        danhSachNhanSu.set(soSua, ns);

        try {
            Files.delete(Paths.get("luutruthongtin/danhsachnhansu.txt"));
        } catch (IOException ex) {
            Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachnhansu.txt"))) {
        	danhSachNhanSu.forEach(labour -> {
                pw.println(labour.getMaNhanSu() + "," + labour.getTenNhanSu() + "," + labour.getLuongNhanSu());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public synchronized void delete(String id) {
        List<NhanSu> danhSachNhanSu = getAll();

        // tìm nhân sự để xóa
        for (int i = 0; i < danhSachNhanSu.size(); i++) {

            NhanSu labour = danhSachNhanSu.get(i);

            if (labour.getMaNhanSu().equalsIgnoreCase(id)) {
            	danhSachNhanSu.remove(labour);
            }
        }

        try {
         // Xóa file cũ
            Files.delete(Paths.get("luutruthongtin/danhsachnhansu.txt"));
        } catch (IOException ex) {
            Logger.getLogger(DichVuNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }

        // tạo file mới và ghi thông tin vào đó
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachnhansu.txt"))) {
        	danhSachNhanSu.forEach(ns -> {
                pw.println(ns.getMaNhanSu() + "," + ns.getTenNhanSu() + "," + ns.getLuongNhanSu());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DichVuNhanSu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
