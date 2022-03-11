package quanlymonan;

import java.awt.event.ActionEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import dichvuchung.DichVuMonAn;
import quanlymonan.QuanLyMonAn;
import quanlymonan.XemThongTinMonAn;
import java.awt.Font;
import java.awt.Color;


public class XemThongTinMonAn extends javax.swing.JFrame {

    private final DichVuMonAn dichVuMonAn;

    public XemThongTinMonAn() {
    	getContentPane().setBackground(new Color(153, 255, 102));
        initComponents();
        this.dichVuMonAn = new DichVuMonAn();
        performFileRelatedTask();
    }

    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        dichVuMonAn.getAll().forEach((item) -> {
            fullnames.append(item.getTenMon())
                    .append("\t\t")
                    .append(item.getGiaTien())
                    .append("    \t")
                    .append(item.getSoLuong())
                    .append("\n");
        });

        text.setText(fullnames.toString());
    }


    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 204, 51));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        text.setBackground(new Color(255, 255, 153));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên");

        jLabel2.setText("Giá tiền");

        jLabel3.setText("Số Lượng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGap(34)
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
        					.addComponent(jLabel2)
        					.addGap(81)
        					.addComponent(jLabel3)
        					.addGap(9))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(291, Short.MAX_VALUE)
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(28, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
        			.addGap(42)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(XemThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemThongTinMonAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    	
        java.awt.EventQueue.invokeLater(() -> {
            new XemThongTinMonAn().setVisible(true);
        });
    }

  
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text;
  

    public void actionPerformed(ActionEvent e) {

    }
}
