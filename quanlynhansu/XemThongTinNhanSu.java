package quanlynhansu;

import dichvuchung.DichVuNhanSu;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class XemThongTinNhanSu extends javax.swing.JFrame {

    private final DichVuNhanSu dichVuNhanSu;


    public XemThongTinNhanSu() {
    	getContentPane().setBackground(new Color(255, 255, 153));
        initComponents();
        this.dichVuNhanSu = new DichVuNhanSu();
        performFileRelatedTask();
    }

    
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        text.setBackground(new Color(204, 255, 204));
        backButton = new javax.swing.JButton();
        backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        backButton.setBackground(new Color(255, 204, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 13));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã ID");

        jLabel2.setText("Tên ");

        jLabel3.setText("Lương");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        			.addGap(53)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
        			.addComponent(jLabel3)
        			.addGap(102))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(304, Short.MAX_VALUE)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
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
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(XemThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemThongTinNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
    	
    	java.awt.EventQueue.invokeLater(() -> {
            new XemThongTinNhanSu().setVisible(true);
        });
    }

    
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text;
    
}
