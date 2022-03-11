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

import cacnhantochung.MonAn;
import quanlymonan.SuaThongTinMonAn;



public class DichVuMonAn {

    public DichVuMonAn() {
    }

    public List<MonAn> getAll() {
        List<MonAn> items = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("luutruthongtin/danhsachmonan.txt"))) {
            while (scanner.hasNextLine()) {
                String itemLine = scanner.nextLine();

                String itemInfo[] = itemLine.split(",");

                MonAn item = new MonAn(itemInfo[0], Double.parseDouble(itemInfo[1]),
                        Integer.parseInt(itemInfo[2]));

                items.add(item);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public MonAn getItemByIndex(int index) {
        List<MonAn> danhsachMonAn = getAll();

        if (danhsachMonAn.size() >= index) {
            return danhsachMonAn.get(index - 1);
        }

        return null;
    }

    public void create(MonAn monAn) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachmonan.txt", true))) {
            pw.println(monAn.getTenMon() + "," + monAn.getGiaTien() + "," + monAn.getSoLuong());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized boolean delete(String name) {

        List<MonAn> itemList = getAll();

        int soXoa = -1;
        // tìm món ăn để xóa
        for (int i = 0; i < itemList.size(); i++) {
            MonAn item = itemList.get(i);

            if (item.getTenMon().equalsIgnoreCase(name)) {
            	soXoa = i;
            }
        }

        if (soXoa == -1) {
            return false;
        }
        itemList.remove(soXoa);

        try {
            // Xóa file cũ
            Files.delete(Paths.get("luutruthongtin/danhsachmonan.txt"));
        } catch (IOException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        // tạo file mới và ghi thông tin vào
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachmonan.txt"))) {
            itemList.forEach(monAn -> {
                pw.println(monAn.getTenMon() + "," + monAn.getGiaTien() + "," + monAn.getSoLuong());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public synchronized boolean update(String srcName, MonAn updatedItem) {
        List<MonAn> itemList = new ArrayList<>();

        // đọc danh sách món ăn
        try (Scanner scanner = new Scanner(new FileInputStream("luutruthongtin/danhsachmonan.txt"))) {
            while (scanner.hasNextLine()) {
                String itemLine = scanner.nextLine();

                String itemInfo[] = itemLine.split(",");

                MonAn item = new MonAn(itemInfo[0], Double.parseDouble(itemInfo[1]),
                        Integer.parseInt(itemInfo[2]));
                itemList.add(item);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuaThongTinMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        int soSua = -1;

        for (int i = 0; i < itemList.size(); i++) {
            MonAn item = itemList.get(i);

            if (item.getTenMon().equalsIgnoreCase(srcName)) {
            	soSua = i;
            }
        }

        if (soSua == -1) {
            return false;
        }

        itemList.set(soSua, updatedItem);

        try {
            Files.delete(Paths.get("luutruthongtin/danhsachmonan.txt"));
        } catch (IOException ex) {
            Logger.getLogger(SuaThongTinMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachmonan.txt"))) {
            itemList.forEach(monAn -> {
                pw.println(monAn.getTenMon() + "," + monAn.getGiaTien() + "," + monAn.getSoLuong());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SuaThongTinMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public synchronized void giamSoLuongMonAn(String tenMon, int soGiam) {
        List<MonAn> danhsachMonAn = getAll();

        for (int i = 0; i < danhsachMonAn.size(); i++) {

            MonAn monAn = danhsachMonAn.get(i);

            if (monAn.getTenMon().equalsIgnoreCase(tenMon)) {
                monAn.setSoLuong(Math.max(0, monAn.getSoLuong() - soGiam));
                danhsachMonAn.set(i, monAn);
            }
        }

        try {
            Files.delete(Paths.get("luutruthongtin/danhsachmonan.txt"));
        } catch (IOException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("luutruthongtin/danhsachmonan.txt"))) {
        	danhsachMonAn.forEach(monAn -> {
                pw.println(monAn.getTenMon() + "," + monAn.getGiaTien() + "," + monAn.getSoLuong());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DichVuMonAn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
