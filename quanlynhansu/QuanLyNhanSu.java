package quanlynhansu;

import nhahang.MainMenu;
import quanlynhansu.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;



public class QuanLyNhanSu extends javax.swing.JFrame {

    public QuanLyNhanSu() {
    	getContentPane().setBackground(new Color(255, 255, 153));
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nutThem = new javax.swing.JButton();
        nutThem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        nutThem.setBackground(new Color(204, 255, 153));
        nutXem = new javax.swing.JButton();
        nutXem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        nutXem.setBackground(new Color(204, 255, 153));
        nutXoa = new javax.swing.JButton();
        nutXoa.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        nutXoa.setBackground(new Color(204, 255, 153));
        nutSua = new javax.swing.JButton();
        nutSua.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        nutSua.setBackground(new Color(204, 255, 153));
        jButton6 = new javax.swing.JButton();
        jButton6.setBackground(new Color(255, 204, 51));
        jButton6.setFont(new Font("Tahoma", Font.BOLD, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(153, 255, 153));

        jPanel1.setBackground(new Color(102, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        nutThem.setText("Thêm Nhân Viên");
        nutThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThemActionPerformed(evt);
            }
        });

        nutXem.setText("Xem Danh Sách Nhân Viên");
        nutXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutXemActionPerformed(evt);
            }
        });

        nutXoa.setText("Xóa Nhân Viên");
        nutXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutXoaActionPerformed(evt);
            }
        });

        nutSua.setText("Thay Khác Thông Tin Nhân Viên");
        nutSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addGap(27)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(nutXem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        				.addComponent(nutSua, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        				.addComponent(nutXoa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        				.addComponent(nutThem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
        			.addGap(23))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(nutThem, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(nutXoa, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(nutSua, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(nutXem, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        			.addGap(52))
        );
        jPanel1.setLayout(jPanel1Layout);

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(18, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
        			.addGap(18))
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(170)
        			.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addGap(23)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void nutThemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
        ThemNhanSu i = new ThemNhanSu();
        i.setVisible(true);
        this.dispose();

    }

    private void nutXemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        XemThongTinNhanSu vl = new XemThongTinNhanSu();
        vl.setVisible(true);
        this.dispose();

    }

    private void nutXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutXoaActionPerformed
        // TODO add your handling code here:
        XoaNhanSu dl = new XoaNhanSu();
        dl.setVisible(true);
        this.dispose();
    }

    private void nutSuaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        SuaThongTinNhanSu ml = new SuaThongTinNhanSu();
        ml.setVisible(true);
        this.dispose();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MainMenu rm = new MainMenu();
        rm.setVisible(true);
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
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyNhanSu().setVisible(true);
        });
    }

    
    private javax.swing.JButton nutThem;
    private javax.swing.JButton nutXoa;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nutSua;
    private javax.swing.JButton nutXem;
    
}
