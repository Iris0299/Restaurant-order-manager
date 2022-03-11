
package quanlygoimon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import cacnhantochung.GioHang;
import cacnhantochung.MonAnTrongGio;
import cacnhantochung.MonAn;
import cacnhantochung.GoiMon;
import cacnhantochung.DanhSachGoiMon;
import dichvuchung.DichVuMonAn;
import dichvuchung.DichVuGoiMon;
import nhahang.MainMenu;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;


public class QuanLyGoiMon extends javax.swing.JFrame {

    private final DichVuMonAn dichVuMonAn;
    private final DichVuGoiMon dichVuGoiMon;
	private final GioHang gioHang;
   
    public QuanLyGoiMon() {
    	getContentPane().setBackground(new Color(144, 238, 144));
        this.initComponents();
        this.dichVuMonAn = new DichVuMonAn();
        this.dichVuGoiMon = new DichVuGoiMon();
        this.performFileRelatedTask();
        this.gioHang = new GioHang(new ArrayList<>(), 0);
    }


    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        backButton.setBackground(new Color(255, 165, 0));
        backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel1.setBackground(new Color(173, 255, 47));
        oGhiSoLuongMonAn = new javax.swing.JTextField();
        oGhiSoLuongMonAn.setBackground(new Color(250, 235, 215));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        jLabel4.setBackground(new Color(173, 255, 47));
        nutThemVaoGioHang = new javax.swing.JButton();
        nutThemVaoGioHang.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nutThemVaoGioHang.setBackground(new Color(255, 215, 0));
        oGhiIdMonAn = new javax.swing.JTextField();
        oGhiIdMonAn.setBackground(new Color(250, 235, 215));
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 13));
        oGhiTongGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 13));
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Tahoma", Font.BOLD, 13));
        clearCartButton = new javax.swing.JButton();
        clearCartButton.setBackground(new Color(255, 204, 0));
        clearCartButton.setFont(new Font("Verdana", Font.BOLD, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new Color(176, 224, 230));
        jPanel3.setBorder(new LineBorder(new Color(153, 102, 153), 10));

        jPanel1.setBackground(new Color(143, 188, 143));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new Color(175, 238, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Nhập ID món ăn ");

        jLabel4.setText("Nhập số lượng ");

        nutThemVaoGioHang.setText("Thêm vào giỏ hàng");
        nutThemVaoGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThemVaoGioHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(nutThemVaoGioHang, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        						.addComponent(jLabel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(oGhiIdMonAn, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        						.addComponent(oGhiSoLuongMonAn, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
        			.addGap(25))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiIdMonAn, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(oGhiSoLuongMonAn, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        			.addGap(18)
        			.addComponent(nutThemVaoGioHang, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 428, Short.MAX_VALUE)
        				.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(28)
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jLabel2.setText("Tên");

        jLabel3.setText("Giá Tiền");

        jLabel5.setText("Số Lượng");
        oGhiTongGia.setBackground(new Color(255, 255, 102));

        jLabel6.setText("ID");

        jLabel8.setText("Giá Tiền");

        jLabel7.setText("Số Lượng");

        jLabel10.setText("Tên");

        clearCartButton.setText("Hủy");
        clearCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCartButtonActionPerformed(evt);
            }
        });
        orderButton = new javax.swing.JButton();
        orderButton.setBackground(new Color(51, 255, 0));
        orderButton.setFont(new Font("Verdana", Font.BOLD, 14));
        
                orderButton.setText("Order");
                orderButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        orderButtonActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(26)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGap(92)
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel6))
        					.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
        					.addComponent(jLabel3)
        					.addGap(91)
        					.addComponent(jLabel5)
        					.addGap(21))
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
        			.addGap(6)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, jPanel3Layout.createSequentialGroup()
        					.addComponent(jLabel10)
        					.addGap(97)
        					.addComponent(jLabel7)
        					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(oGhiTongGia)
        					.addGap(18)
        					.addComponent(orderButton))
        				.addComponent(clearCartButton, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
        			.addGap(429))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jLabel6)
        				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel8)
        				.addComponent(jLabel10)
        				.addComponent(jLabel5)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
        					.addGap(19)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(oGhiTongGia)
        						.addComponent(orderButton, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(clearCartButton, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
        			.addGap(224))
        );
        reciptArea = new javax.swing.JTextArea();
        jScrollPane2.setViewportView(reciptArea);
        
                reciptArea.setBackground(new Color(245, 222, 179));
                reciptArea.setColumns(20);
                reciptArea.setRows(5);
        text = new javax.swing.JTextArea();
        jScrollPane1.setViewportView(text);
                text.setBackground(new Color(204, 153, 255));
                text.setColumns(20);
                text.setRows(5);
        jPanel3.setLayout(jPanel3Layout);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 847, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(55, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
        setLocationRelativeTo(null);
    }
    private void performFileRelatedTask() {
        StringBuilder stringBuilder = new StringBuilder();
        int num = 1;
        for (MonAn item : dichVuMonAn.getAll()) {
            stringBuilder.append(num)
                    .append("\t")
                    .append(item.getTenMon())
                    .append(" \t")
                    .append(item.getGiaTien())
                    .append(" \t")
                    .append(item.getSoLuong())
                    .append("\n");
            num++;
        }
        text.setText(stringBuilder.toString());
    }

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed

        GioHang cart = dichVuGoiMon.getCart();
        
        if (cart.getNhungMonAnTrongGio().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa thêm gì vào giỏ hàng."
            		+ " Vui lòng gọi đồ trong danh sách! ");
            return;
        }

        int lastOrderNumber = 0;

        // Scan the order file and get the last order number
        try (Scanner scanner = new Scanner(new FileInputStream("storage/orderLine.txt"))) {
            while (scanner.hasNextLine()) {
                String orderLine = scanner.nextLine();
                if (orderLine.length() > 0) {
                    String orderParts[] = orderLine.split(",");

                    DanhSachGoiMon orderLineObj = new DanhSachGoiMon(
                            Integer.parseInt(orderParts[0]),
                            orderParts[1],
                            Integer.parseInt(orderParts[2]),
                            Double.parseDouble(orderParts[3]));

                    lastOrderNumber = orderLineObj.getMaGoiMon();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyGoiMon.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        int orderNumber = ++lastOrderNumber;

        
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/orderLine.txt", true))) {
            for (int i = 0; i < cart.getNhungMonAnTrongGio().size(); i++) {
                MonAnTrongGio cartItem = cart.getNhungMonAnTrongGio().get(i);

                DanhSachGoiMon orderLine = new DanhSachGoiMon(
                        orderNumber,
                        cartItem.getItem().getTenMon(),
                        cartItem.getSoLuong(),
                        cartItem.getGiaTien());

                pw.println(orderLine.getMaGoiMon() + "," + orderLine.getTenGoiMon() + "," + orderLine.getSoLuongGoiMon() + "," + orderLine.getGiaTienGoiMon());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyGoiMon.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/order.txt", true))) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();

            GoiMon order = new GoiMon(orderNumber, cart.getTongTien(), sdf.format(date));

            pw.println((order.getMaGoiMon() + ",") + order.getGiaTien() + "," + order.getNgayGoiMon());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyGoiMon.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        cart.getNhungMonAnTrongGio().forEach((item) -> {
        	dichVuMonAn.giamSoLuongMonAn(item.getItem().getTenMon(), item.getSoLuong());
        });

        
        this.clearCartButtonActionPerformed(evt);

       
        this.performFileRelatedTask();
        JOptionPane.showMessageDialog(this, "Yêu cầu gọi món đã được thực hiện thành công!");

    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainMenu im = new MainMenu();
        im.setVisible(true);
        this.setVisible(false);
    }

    private void nutThemVaoGioHangActionPerformed(java.awt.event.ActionEvent evt) {

     
        String newItemId = oGhiIdMonAn.getText();
        String newItemQuantityAsString = oGhiSoLuongMonAn.getText();

        if (newItemId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập ID món để thêm vào danh sách gọi món!");
            return;
        }

        if (newItemQuantityAsString.isEmpty()
                || !newItemQuantityAsString.chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Nhập số lượng bạn cần gọi!");
            return;
        }

        // new item quantity
        int newItemQuantity = Integer.parseInt(newItemQuantityAsString);

        MonAn newItem = dichVuMonAn.getItemByIndex(Integer.parseInt(newItemId));

        if (newItem == null) {
            JOptionPane.showMessageDialog(this, "Sorry , Vui lòng nhập ID món!");
            return;
        }

        if (newItemQuantity > newItem.getSoLuong()) {

            JOptionPane.showMessageDialog(this, "Món ăn này đã hết");
            oGhiSoLuongMonAn.setText("");
            oGhiIdMonAn.setText("");

        } else {

            MonAnTrongGio monAnTrongGio = new MonAnTrongGio(newItem, newItemQuantity, newItem.getGiaTien() * newItemQuantity);
            dichVuGoiMon.addToCart(monAnTrongGio);

            reciptArea.setText(getReciptStringByCart());
            oGhiTongGia.setText(String.valueOf(dichVuGoiMon.getCart().getTongTien()));

            JOptionPane.showMessageDialog(this, "Món ăn đã thêm vào giỏ hàng");

            oGhiIdMonAn.setText("");
            oGhiSoLuongMonAn.setText("");
        }
    }

    private void clearCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCartButtonActionPerformed
    	dichVuGoiMon.clearCart();
        this.reciptArea.setText("");
        this.oGhiTongGia.setText("");

    }

    public String getReciptStringByCart() {
        
        List<MonAnTrongGio> cartItems = dichVuGoiMon.getCart().getNhungMonAnTrongGio();

        StringBuilder stringBuilder = new StringBuilder();

        cartItems.forEach((item) -> {
            stringBuilder.append(item.getItem().getTenMon())
                    .append("\t")
                    .append(item.getSoLuong())
                    .append("\t")
                    .append(item.getGiaTien())
                    .append("\n");
        });

        return stringBuilder.toString();
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
            java.util.logging.Logger.getLogger(QuanLyGoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyGoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyGoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyGoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyGoiMon().setVisible(true);
        });
    }


    private javax.swing.JButton nutThemVaoGioHang;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearCartButton;
    private javax.swing.JTextField oGhiIdMonAn;
    private javax.swing.JTextField oGhiSoLuongMonAn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton orderButton;
    private javax.swing.JTextArea reciptArea;
    private javax.swing.JTextArea text;
    private javax.swing.JTextField oGhiTongGia;
   
}
