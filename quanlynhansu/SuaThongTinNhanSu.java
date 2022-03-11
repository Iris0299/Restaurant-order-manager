package quanlynhansu;


import javax.swing.JOptionPane;

import cacnhantochung.NhanSu;
import dichvuchung.DichVuNhanSu;
import quanlynhansu.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Font;

public class SuaThongTinNhanSu extends javax.swing.JFrame {

    private final DichVuNhanSu dichVuNhanSu;

   
    public SuaThongTinNhanSu() {
    	getContentPane().setBackground(new Color(153, 255, 255));
        initComponents();
        this.dichVuNhanSu = new DichVuNhanSu();
        performFileRelatedTask();
    }

   
    private void initComponents() {

        nutTenMoi = new javax.swing.JTextField();
        nutTenMoi.setBackground(new Color(255, 255, 153));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 13));
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        text.setBackground(new Color(204, 255, 204));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 13));
        nutLuong = new javax.swing.JTextField();
        nutLuong.setBackground(new Color(255, 255, 153));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        nutIdCu = new javax.swing.JTextField();
        nutIdCu.setBackground(new Color(255, 255, 153));
        nutUpdate = new javax.swing.JButton();
        nutUpdate.setBackground(new Color(255, 204, 0));
        nutUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 204, 0));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        nutIdMoi = new javax.swing.JTextField();
        nutIdMoi.setBackground(new Color(255, 255, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jLabel3.setText("Nhập tên nhân viên mới");

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel4.setText("Nhập lương mới");

        jLabel1.setText("Nhập ID nhân viên muốn thay đổi");

        nutUpdate.setText("Cập Nhật");
        nutUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutUpdateActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập ID mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
        					.addComponent(nutUpdate))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
        					.addGap(194)
        					.addComponent(nutLuong, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addGap(84)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(nutIdCu, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        						.addComponent(nutTenMoi, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        						.addComponent(nutIdMoi, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
        			.addGap(36))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        				.addComponent(nutIdCu, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(nutIdMoi, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        			.addGap(11)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(nutTenMoi, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(nutLuong, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(backButton)
        				.addComponent(nutUpdate))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }
    private void performFileRelatedTask() {
        StringBuilder stringBuilder = new StringBuilder();

        dichVuNhanSu.getAll().forEach((labour) -> {
            stringBuilder.append(labour.getMaNhanSu())
                    .append("\t")
                    .append(labour.getTenNhanSu())
                    .append("\t\t")
                    .append(labour.getLuongNhanSu())
                    .append("\n");
        });

        text.setText(stringBuilder.toString());
    }
    private void nutUpdateActionPerformed(java.awt.event.ActionEvent evt) {

        String sourceId = nutIdCu.getText();

        String id = nutIdMoi.getText();
        String name = nutTenMoi.getText();
        double salary = Double.parseDouble(nutLuong.getText());

        if (sourceId.isEmpty() || id.isEmpty() || name.isEmpty() || nutLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền hết thông tin");
            return;
        }

        if (!nutLuong.getText().chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập lương");
            return;
        }

        NhanSu updatedLabour = new NhanSu(id, name, salary);

        boolean isUpdated = dichVuNhanSu.update(sourceId, updatedLabour);
        
        if (!isUpdated) {
            JOptionPane.showConfirmDialog(this, "Không thấy nhân viên này");
            return;
        }

        
        nutIdCu.setText("");
        nutIdMoi.setText("");
        nutTenMoi.setText("");
        nutLuong.setText("");

        
        JOptionPane.showMessageDialog(this, "Thông tin nhân viên đã update");

        
        performFileRelatedTask();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        QuanLyNhanSu lm = new QuanLyNhanSu();
        lm.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
             java.awt.EventQueue.invokeLater(() -> {
            new SuaThongTinNhanSu().setVisible(true);
        });
    }

    
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nutIdMoi;
    private javax.swing.JTextField nutTenMoi;
    private javax.swing.JTextField nutLuong;
    private javax.swing.JTextField nutIdCu;
    private javax.swing.JTextArea text;
    private javax.swing.JButton nutUpdate;
  
}
