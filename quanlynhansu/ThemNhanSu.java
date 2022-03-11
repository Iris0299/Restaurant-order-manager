package quanlynhansu;

import javax.swing.JOptionPane;

import cacnhantochung.NhanSu;
import dichvuchung.DichVuNhanSu;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;


public class ThemNhanSu extends javax.swing.JFrame {

    private final DichVuNhanSu dichVuNhanSu;

    public ThemNhanSu() {
    	getContentPane().setBackground(new Color(204, 255, 255));
        initComponents();
        this.dichVuNhanSu = new DichVuNhanSu();
    }

   
    private void initComponents() {

        nutThem = new javax.swing.JButton();
        nutThem.setBackground(new Color(51, 204, 51));
        nutThem.setFont(new Font("Tahoma", Font.BOLD, 15));
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 204, 0));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        oGhiTen = new javax.swing.JTextField();
        oGhiTen.setBackground(new Color(255, 255, 204));
        oGhiId = new javax.swing.JTextField();
        oGhiId.setBackground(new Color(255, 255, 204));
        oGhiLuong = new javax.swing.JTextField();
        oGhiLuong.setBackground(new Color(255, 255, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        nutThem.setText("Thêm");
        nutThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThemActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã ID Nhân Viên");

        jLabel2.setText("Tên Nhân Viên");

        jLabel3.setText("Lương Nhân Viên");

        oGhiId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oGhiIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
        					.addComponent(nutThem, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(oGhiLuong)
        						.addComponent(oGhiTen, Alignment.LEADING)
        						.addComponent(oGhiId, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        				.addComponent(oGhiId, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        				.addComponent(oGhiTen, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiLuong, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        			.addGap(60)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(nutThem, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nutThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThemActionPerformed

        String id = oGhiId.getText();
        String name = oGhiTen.getText();
        String salary = oGhiLuong.getText();

        if (id.isEmpty() || name.isEmpty() || salary.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống thông tin");
            return;
        }

        if (!salary.chars().allMatch(Character::isDigit) || Double.parseDouble(salary) <= 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lương nhân viên");
            return;
        }
        
        NhanSu nhanSu = new NhanSu(id, name, Double.parseDouble(salary));

        dichVuNhanSu.create(nhanSu);

        JOptionPane.showMessageDialog(this, "Nhân Viên đã được thêm");

       
        oGhiId.setText("");
        oGhiTen.setText("");
        oGhiLuong.setText("");
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        QuanLyNhanSu lb = new QuanLyNhanSu();
        lb.setVisible(true);
        this.setVisible(false);
    }

    private void oGhiIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oGhiIdActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    	java.awt.EventQueue.invokeLater(() -> {
            new ThemNhanSu().setVisible(true);
        });
    }

    
    private javax.swing.JButton nutThem;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField oGhiId;
    private javax.swing.JTextField oGhiTen;
    private javax.swing.JTextField oGhiLuong;
    
}
