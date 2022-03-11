package quanlynhansu;

import javax.swing.JOptionPane;

import dichvuchung.DichVuNhanSu;
import quanlynhansu.QuanLyNhanSu;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;


public class XoaNhanSu extends javax.swing.JFrame {
    
    private final DichVuNhanSu dichVuNhanSu;

    
    public XoaNhanSu() {
    	getContentPane().setBackground(new Color(204, 255, 204));
        initComponents();
        this.dichVuNhanSu = new DichVuNhanSu();
        performFileRelatedTask();
    }
    
    private void performFileRelatedTask() {
        StringBuilder stringBuilder = new StringBuilder();
        dichVuNhanSu.getAll().forEach((labour) -> {
            stringBuilder.append(labour.getMaNhanSu())
                    .append("\t")
                    .append(labour.getTenNhanSu())
                    .append("\t")
                    .append(labour.getLuongNhanSu())
                    .append("\n");
        });
        text.setText(stringBuilder.toString());
    }

    
    private void initComponents() {

        oXoa = new javax.swing.JButton();
        oXoa.setFont(new Font("Tahoma", Font.BOLD, 14));
        oXoa.setBackground(new Color(255, 102, 0));
        backButton = new javax.swing.JButton();
        backButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        backButton.setBackground(new Color(255, 204, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        text.setBackground(new Color(255, 255, 153));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        oGhiId = new javax.swing.JTextField();
        oGhiId.setBackground(new Color(255, 255, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        oXoa.setText("Xóa");
        oXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oXoaActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel1.setText("Nhập ID nhân viên muốn xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
        					.addComponent(oXoa, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        					.addGap(40)
        					.addComponent(oGhiId, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(49)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(31)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        				.addComponent(oGhiId, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(oXoa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(backButton, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }

    private void oXoaActionPerformed(java.awt.event.ActionEvent evt) {
        
        String maIdXoa = oGhiId.getText();
        
        if (maIdXoa.isEmpty()) {
            oGhiId.setText("");
            JOptionPane.showMessageDialog(this, "Hyax Nhập ID nhân viên trước ");
            return;
        }
        
        dichVuNhanSu.delete(maIdXoa);

      
        JOptionPane.showMessageDialog(this, "Nhân Viên đã được xóa");

        
        oGhiId.setText("");

        
        performFileRelatedTask();

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
            java.util.logging.Logger.getLogger(XoaNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        
        java.awt.EventQueue.invokeLater(() -> {
            new XoaNhanSu().setVisible(true);
        });
    }

   
    private javax.swing.JButton backButton;
    private javax.swing.JButton oXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oGhiId;
    private javax.swing.JTextArea text;
   
}
