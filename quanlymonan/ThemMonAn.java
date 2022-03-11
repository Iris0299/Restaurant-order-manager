package quanlymonan;

import javax.swing.*;

import quanlymonan.QuanLyMonAn;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import cacnhantochung.MonAn;
import dichvuchung.DichVuMonAn;
import java.awt.Color;
import java.awt.Font;

public class ThemMonAn extends javax.swing.JFrame {
    
    private final DichVuMonAn dichVuMonAn; 

    public ThemMonAn() {
    	getContentPane().setBackground(new Color(51, 204, 255));
        initComponents();
        this.dichVuMonAn = new DichVuMonAn();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel1.setBackground(new Color(102, 255, 153));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel2.setBackground(new Color(102, 255, 153));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel3.setBackground(new Color(102, 255, 153));
        oGhiGia = new javax.swing.JTextField();
        oGhiGia.setBackground(new Color(255, 204, 153));
        oGhiTen = new javax.swing.JTextField();
        oGhiTen.setBackground(new Color(255, 204, 153));
        oGhiSoLuong = new javax.swing.JTextField();
        oGhiSoLuong.setBackground(new Color(255, 204, 153));
        nutThem = new javax.swing.JButton();
        nutThem.setForeground(new Color(0, 0, 153));
        nutThem.setFont(new Font("Tahoma", Font.BOLD, 16));
        backButton = new javax.swing.JButton();
        backButton.setForeground(new Color(0, 0, 153));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        backButton.setBackground(new Color(255, 204, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setText("Nhập Tên Món Ăn");

        jLabel2.setText("Nhập Giá Món Ăn");

        jLabel3.setText("Nhập Số Lượng Món Ăn");

        nutThem.setBackground(new Color(255, 204, 51));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
        					.addComponent(nutThem, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
        					.addGap(94)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(oGhiSoLuong, Alignment.TRAILING, 169, 169, 169)
        						.addComponent(oGhiTen, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        						.addComponent(oGhiGia, Alignment.TRAILING, 169, 169, 169))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(19)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiTen, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiGia, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiSoLuong, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        			.addGap(124)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(nutThem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(backButton, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        			.addGap(8))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void nutThemActionPerformed(java.awt.event.ActionEvent evt) {
       
        String name = oGhiTen.getText();
        String price = oGhiGia.getText();
        String quantity = oGhiSoLuong.getText();
        
        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên món ăn");
            return;
        }
       
        if(price.isEmpty() || !price.chars().allMatch( Character::isDigit) ||
                Double.parseDouble(price) <= 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá món ăn");
            return;
        }
        
        if(quantity.isEmpty() || !quantity.chars().allMatch( Character::isDigit) 
                || Integer.parseInt(quantity) <=0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng món ăn");
            return;
        }
        
        MonAn item = new MonAn(name,
                    Double.parseDouble(oGhiGia.getText()),
                    Integer.parseInt(oGhiSoLuong.getText()));
        
        dichVuMonAn.create(item);
      
        oGhiTen.setText("");
        oGhiGia.setText("");
        oGhiSoLuong.setText("");
        JOptionPane.showMessageDialog(this, "Món ăn đã được thêm");
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        QuanLyMonAn im = new QuanLyMonAn();
        im.setVisible(true);
        this.setVisible(false);
    }
    private javax.swing.JButton nutThem;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField oGhiTen;
    private javax.swing.JTextField oGhiGia;
    private javax.swing.JTextField oGhiSoLuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
   
}
