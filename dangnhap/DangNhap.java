package dangnhap;

import javax.swing.JOptionPane;

import nhahang.MainMenu;


import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class DangNhap extends javax.swing.JFrame {

	
    public DangNhap() {
    	getContentPane().setBackground(new Color(224, 255, 255));
        initComponents();
        
        // hien thi giao dien dang nhap
        setDefaultUserName();
    }

    
    private void setDefaultUserName() {
        this.userNameField.setText("Your ID");
        this.passwordField.setText("Your password");
    }


    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        userNameField = new javax.swing.JTextField();
        userNameField.setBackground(new Color(255, 250, 240));
        userNameField.setFont(new Font("Tahoma", Font.ITALIC, 14));
        passwordLabel = new javax.swing.JLabel();
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        loginButton = new javax.swing.JButton();
        loginButton.setBackground(new Color(255, 218, 185));
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        passwordField = new javax.swing.JPasswordField();
        passwordField.setBackground(new Color(255, 250, 240));
        passwordField.setFont(new Font("Tahoma", Font.ITALIC, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new Color(216, 191, 216));
        loginPanel.setBorder(new LineBorder(new Color(127, 255, 0), 6, true)); 
        loginPanel.setForeground(new java.awt.Color(153, 153, 255));
        loginPanel.setToolTipText("");
        loginPanel.setName("");

        userNameLabel.setBackground(new java.awt.Color(255, 153, 153));
        userNameLabel.setForeground(new Color(0, 0, 0));
        userNameLabel.setText("Tên Đăng Nhập");

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        passwordLabel.setForeground(new Color(0, 0, 0));
        passwordLabel.setText("Mật Khẩu");

        loginButton.setText("Đăng Nhập");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanelLayout.setHorizontalGroup(
        	loginPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(loginPanelLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(userNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        			.addGap(57)
        			.addGroup(loginPanelLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(passwordField)
        				.addComponent(userNameField, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
        			.addContainerGap(265, Short.MAX_VALUE)
        			.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        			.addGap(42))
        );
        loginPanelLayout.setVerticalGroup(
        	loginPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(loginPanelLayout.createSequentialGroup()
        			.addGap(26)
        			.addGroup(loginPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(userNameField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(userNameLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(loginPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        			.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        loginPanel.setLayout(loginPanelLayout);
        
        JLabel lblNewLabel = new JLabel("     Mdu Kiuef JJIOHLJ");
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setBackground(new Color(169, 169, 169));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        				.addComponent(loginPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        			.addGap(18)
        			.addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        loginPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (userNameField.getText().equalsIgnoreCase("ngoducthang")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công !!!");
            this.dispose();
            MainMenu mainMenu = new MainMenu();
            mainMenu.setVisible(true);
        } else {
            userNameField.setText("");
            passwordField.setText("");
            JOptionPane.showMessageDialog(this, userNameField.getText() + " Tài khoản hoặc mật khẩu sai !!");
        }

    }

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
               java.awt.EventQueue.invokeLater(() -> {
            new DangNhap().setVisible(true);
        });
    }

    
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
}
