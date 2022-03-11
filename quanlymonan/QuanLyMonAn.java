
package quanlymonan;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import nhahang.MainMenu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;


public class QuanLyMonAn extends javax.swing.JFrame {


    public QuanLyMonAn() {
    	getContentPane().setBackground(new Color(153, 102, 255));
        initComponents();
    }

  
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nutThem = new javax.swing.JButton();
        nutThem.setBackground(new Color(204, 153, 255));
        nutThem.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        nutXem = new javax.swing.JButton();
        nutXem.setBackground(new Color(204, 153, 255));
        nutXem.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        nutXoa = new javax.swing.JButton();
        nutXoa.setBackground(new Color(204, 153, 255));
        nutXoa.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        nutSua = new javax.swing.JButton();
        nutSua.setBackground(new Color(204, 153, 255));
        nutSua.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(51, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new Color(153, 255, 204));
        jPanel1.setBorder(new LineBorder(new Color(255, 102, 51), 10));

        nutThem.setText("Thêm Món Ăn");
        nutThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutThem(evt);
            }
        });

        nutXem.setText("Xem Danh Sách Món Ăn");
        nutXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutXem(evt);
            }
        });

        nutXoa.setText("Xóa Món Ăn");
        nutXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutXoa(evt);
            }
        });

        nutSua.setText("Thay Món Ăn Khác");
        nutSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	nutSua(evt);
            }
        });
        jButton6 = new javax.swing.JButton();
        jButton6.setFont(new Font("Tahoma", Font.BOLD, 13));
        
                jButton6.setText("Back");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(nutSua, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        						.addComponent(nutXoa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        						.addComponent(nutXem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        						.addComponent(nutThem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(155)
        					.addComponent(jButton6)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(nutThem, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(nutXem, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(nutXoa, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(nutSua, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addComponent(jButton6)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(46)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void nutSua(java.awt.event.ActionEvent evt) {
        SuaThongTinMonAn mi = new SuaThongTinMonAn();
        mi.setVisible(true);
        this.dispose();
    }

    private void nutThem(java.awt.event.ActionEvent evt) {
        ThemMonAn i = new ThemMonAn();
        i.setVisible(true);
        this.dispose();


    }

    private void nutXem(java.awt.event.ActionEvent evt) {
        XemThongTinMonAn vm = new XemThongTinMonAn();
        vm.setVisible(true);
        this.dispose();
    }

    private void nutXoa(java.awt.event.ActionEvent evt) {
        XoaMonAn d = new XoaMonAn();
        d.setVisible(true);
        this.dispose();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu rm = new MainMenu();
        rm.setVisible(true);
        this.dispose();
    }
    private javax.swing.JButton nutThem;
    private javax.swing.JButton nutXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nutSua;
    private javax.swing.JButton nutXem;
    
}
