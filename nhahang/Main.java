package nhahang;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import dangnhap.DangNhap;
import nhahang.Main;

public class Main extends JFrame {


    public static void main(String[] args) {
       
    	// thoát ctr nếu ko tồn tại
        createRequiredFileIfDoesNotExist();
        
        DangNhap im = new DangNhap();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
    }
    
    private static void createRequiredFileIfDoesNotExist() {
        String fileNames [];
        
        File rootDir = new File("luutruthongtin");
        rootDir.mkdirs();
        
        fileNames = new String [] {"luutruthongtin/danhsachmonan.txt",
            "luutruthongtin/danhsachnhansu.txt",
            "luutruthongtin/goimon.txt",
            "luutruthongtin/danhsachgoimon.txt"};
        
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if(!file.exists())
            {  
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       
    }

}
