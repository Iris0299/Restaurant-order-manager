package nhahang;

import quanlymonan.QuanLyMonAn;
import quanlynhansu.QuanLyNhanSu;
import quanlygoimon.QuanLyGoiMon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;



public class MainMenu extends javax.swing.JFrame {

    //tạo form cửa sổ menu chính
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nutQuanLyGoiMon = new javax.swing.JButton();
        nutQuanLyGoiMon.setForeground(new Color(47, 79, 79));
        nutQuanLyGoiMon.setBackground(new Color(255, 204, 204));
        nutQuanLyGoiMon.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
        nutQuanLyNhanSu = new javax.swing.JButton();
        nutQuanLyNhanSu.setForeground(new Color(47, 79, 79));
        nutQuanLyNhanSu.setBackground(new Color(255, 204, 204));
        nutQuanLyNhanSu.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
        nutQuanLyMonAn = new javax.swing.JButton();
        nutQuanLyMonAn.setForeground(new Color(47, 79, 79));
        nutQuanLyMonAn.setBackground(new Color(255, 204, 204));
        nutQuanLyMonAn.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
        nutThoat = new javax.swing.JButton();
        nutThoat.setBackground(new Color(255, 153, 51));
        nutThoat.setFont(new Font("Tahoma", Font.BOLD, 15));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        jPanel2.setBackground(new Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new Color(153, 255, 153));
        jPanel1.setBorder(new LineBorder(new Color(0, 139, 139), 6, true));
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

        nutQuanLyGoiMon.setText("Quản Lý Gọi Món");
        nutQuanLyGoiMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutGoiMon(evt);
            }
        });

        nutQuanLyNhanSu.setText("Quản Lý Nhân Sự");
        nutQuanLyNhanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutHienThiNhanSu(evt);
            }
        });

        nutQuanLyMonAn.setText("Quản Lý Món Ăn");
        nutQuanLyMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutHienThiMonAn(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(nutQuanLyGoiMon, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addComponent(nutQuanLyMonAn, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        					.addGap(10))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(nutQuanLyNhanSu, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(23)
        			.addComponent(nutQuanLyMonAn, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(nutQuanLyNhanSu, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(nutQuanLyGoiMon, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        nutThoat.setText("Thoát");
        nutThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutThoat(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(nutThoat, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addGap(187))
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(nutThoat, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void nutHienThiMonAn(java.awt.event.ActionEvent evt) {
        QuanLyMonAn im = new QuanLyMonAn();
        im.setVisible(true);
        this.dispose();

    }

    private void nutHienThiNhanSu(java.awt.event.ActionEvent evt) {
        QuanLyNhanSu l = new QuanLyNhanSu();
        l.setVisible(true);
        this.dispose();
    }

    private void nutThoat(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void nutGoiMon(java.awt.event.ActionEvent evt) {
        QuanLyGoiMon om = new QuanLyGoiMon();
        om.setVisible(true);
        this.dispose();
    }

    
    public static void main(String args[]) {

    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        // quay trở lại form menu chính
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton nutThoat;
    private javax.swing.JButton nutQuanLyMonAn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nutQuanLyNhanSu;
    private javax.swing.JButton nutQuanLyGoiMon;
    
}
