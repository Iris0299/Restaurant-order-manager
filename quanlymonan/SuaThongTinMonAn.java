package quanlymonan;

import javax.swing.JOptionPane;

import cacnhantochung.MonAn;
import dichvuchung.DichVuMonAn;
import quanlymonan.QuanLyMonAn;
import quanlymonan.SuaThongTinMonAn;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;


public class SuaThongTinMonAn extends javax.swing.JFrame {

    private final DichVuMonAn dichVuMonAn;

    public SuaThongTinMonAn() {
    	getContentPane().setBackground(new Color(102, 255, 102));
        initComponents();
        this.dichVuMonAn = new DichVuMonAn();
        performFileRelatedTask();
    }

    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        dichVuMonAn.getAll().forEach((item) -> {
            fullnames.append(item.getTenMon())
                    .append("\t\t\t")
                    .append(item.getGiaTien())
                    .append("\t\t")
                    .append(item.getSoLuong())
                    .append("\n");
        });

        text.setText(fullnames.toString());
    }
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBackground(new Color(102, 204, 204));
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 17));
        modText = new javax.swing.JTextField();
        modText.setBackground(new Color(255, 255, 153));
        nutSua = new javax.swing.JButton();
        nutSua.setBackground(new Color(255, 204, 0));
        nutSua.setFont(new Font("Tahoma", Font.BOLD, 14));
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 204, 0));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBackground(new Color(102, 204, 204));
        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        oTen = new javax.swing.JTextField();
        oTen.setBackground(new Color(255, 255, 153));
        oGia = new javax.swing.JTextField();
        oGia.setBackground(new Color(255, 255, 153));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBackground(new Color(102, 204, 204));
        jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 17));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBackground(new Color(102, 204, 204));
        jLabel4.setFont(new Font("Times New Roman", Font.BOLD, 17));
        oSoLuong = new javax.swing.JTextField();
        oSoLuong.setBackground(new Color(255, 255, 153));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        text.setEditable(false);
        text.setBackground(new Color(153, 255, 204));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel1.setText("Nhập tên món ăn cần thay đổi thông tin");

        nutSua.setText("Cập Nhật");
        nutSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutSuaActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập tên mới");

        jLabel3.setText("Nhập giá tiền mói");

        jLabel4.setText("Nhập số lượng mới");

        jLabel5.setText("Tên");

        jLabel6.setText("Số Lượng");

        jLabel7.setText("Giá Tiền");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(20)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        							.addGap(142)))
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(133)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(modText, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        								.addComponent(oTen, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        								.addComponent(oGia, 212, 212, Short.MAX_VALUE)
        								.addGroup(layout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(oSoLuong, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(nutSua, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(31)
        			.addComponent(jLabel5)
        			.addPreferredGap(ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
        			.addComponent(jLabel7)
        			.addGap(170)
        			.addComponent(jLabel6)
        			.addGap(58))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7)
        				.addComponent(jLabel5))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(modText, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oTen, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        			.addGap(10)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(oGia, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        				.addComponent(oSoLuong, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(backButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(nutSua, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nutSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutSuaActionPerformed
        String srcName = modText.getText();
        String modName = oTen.getText();
        String modPrice = oGia.getText();
        String modQuantity = oSoLuong.getText();

        if (srcName.isEmpty() || modName.isEmpty() || modPrice.isEmpty() || modQuantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Các ô thông tin cần được điền đầy đủ !");
            return;
        }

        if (!modPrice.chars().allMatch(Character::isDigit)
                || Double.parseDouble(modPrice) <= 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhaapj gias sản phammr !");
            return;
        }

        if (!modQuantity.chars().allMatch(Character::isDigit)
                || Integer.parseInt(modQuantity) <= 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ssos lượng sản phẩm");
            return;
        }

        MonAn updatedItem = new MonAn(modName, Double.parseDouble(modPrice), Integer.parseInt(modQuantity));

        boolean isUpdated = dichVuMonAn.update(srcName, updatedItem);

        if (!isUpdated) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy tên món ăn cần thay đoiỉ");
            return;
        }

       
        modText.setText("");
        oTen.setText("");
        oGia.setText("");
        oSoLuong.setText("");

        
        JOptionPane.showMessageDialog(this, "MÓn ăn đã dduocj thay đổi ");

       
        performFileRelatedTask();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        QuanLyMonAn im = new QuanLyMonAn();
        im.setVisible(true);
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
            java.util.logging.Logger.getLogger(SuaThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
            java.awt.EventQueue.invokeLater(() -> {
            new SuaThongTinMonAn().setVisible(true);
        });
    }

    
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oTen;
    private javax.swing.JTextField oGia;
    private javax.swing.JTextField oSoLuong;
    private javax.swing.JTextField modText;
    private javax.swing.JTextArea text;
    private javax.swing.JButton nutSua;
    
}
