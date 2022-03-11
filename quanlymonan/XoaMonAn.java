package quanlymonan;

import javax.swing.JOptionPane;

import dichvuchung.DichVuMonAn;
import quanlymonan.XoaMonAn;
import quanlymonan.QuanLyMonAn;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;


public class XoaMonAn extends javax.swing.JFrame {

    private final DichVuMonAn dichVuMonAn;


    public XoaMonAn() {
    	getContentPane().setBackground(new Color(153, 255, 255));
        initComponents();
        this.dichVuMonAn = new DichVuMonAn();
        performFileRelatedTask();
    }
    
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        dlttext = new javax.swing.JTextField();
        dlttext.setBackground(new Color(255, 255, 153));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        nutXoa = new javax.swing.JButton();
        nutXoa.setFont(new Font("Tahoma", Font.BOLD, 15));
        nutXoa.setBackground(new Color(255, 0, 0));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Verdana", Font.BOLD, 13));
        jLabel2.setBackground(new Color(0, 255, 102));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Verdana", Font.BOLD, 13));
        jLabel3.setBackground(new Color(0, 255, 102));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Verdana", Font.BOLD, 13));
        jLabel4.setBackground(new Color(0, 255, 102));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new Color(153, 204, 204));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 255, 204));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel1.setText("Nhập tên món ăn muốn xóa !!!");

        nutXoa.setText("Xóa");
        nutXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutXoaActionPerformed(evt);
            }
        });
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 204, 0));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        
                backButton.setText("Back");
                backButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        backButtonActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(56)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
        							.addGap(1)
        							.addComponent(dlttext, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(nutXoa))
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(dlttext, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(nutXoa, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jLabel2.setText("Tên");

        jLabel3.setText("Giá Tiền");

        jLabel4.setText("Số Lượng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(106)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
        			.addComponent(jLabel3)
        			.addGap(111)
        			.addComponent(jLabel4)
        			.addGap(119))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(23, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jLabel4)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }
    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        dichVuMonAn.getAll().forEach((item) -> {
            fullnames.append(item.getTenMon())
                    .append("\t")
                    .append(item.getGiaTien())
                    .append("\t")
                    .append(item.getSoLuong())
                    .append("\n");
        });

        text.setText(fullnames.toString());
    }

    private void nutXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutXoaActionPerformed
        String name = dlttext.getText();

        if (name.isEmpty()) {
            dlttext.setText("");
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên món ăn cần xóa");
            return;
        }

        boolean isDeleted = dichVuMonAn.delete(name);

        if (!isDeleted) {
            dlttext.setText("");
            JOptionPane.showMessageDialog(this, "Không tồn tại món ăn này");
            return;
        }

       
        JOptionPane.showMessageDialog(this, "Món ăn đã được xóa");

       
        dlttext.setText("");// reset lại ô ghi 

        
        performFileRelatedTask();// in ra thông tin mới 
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        QuanLyMonAn im = new QuanLyMonAn();
        im.setVisible(true);
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
            java.util.logging.Logger.getLogger(XoaMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new XoaMonAn().setVisible(true);
        });
    }

    
    private javax.swing.JButton backButton;
    private javax.swing.JButton nutXoa;
    private javax.swing.JTextField dlttext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea text;
    
}
