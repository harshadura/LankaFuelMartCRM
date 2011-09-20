package com.universl.fuelmart.ui;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.universl.fuelmart.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 *  Add New CreditSlip Operation Form
 */
public class CreditSlipOperations extends javax.swing.JFrame {
    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;
    private String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
    private List<String> autoCompany = new ArrayList<String>();
    private boolean strictMatching = false;
    private List<String> autoProduct = new ArrayList<String>();

    public CreditSlipOperations() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(CreditSlipOperations.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Add New Credit Slip Operation");
//      setPreferredSize(new Dimension(340, 285));

        txtTime.setText(sdf.format(cal.getTime()));
        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
        AutoCompleteDecorator.decorate(txtCompany, addProductDataCompany(), strictMatching);
        AutoCompleteDecorator.decorate(txtItem, addProductData(), strictMatching);
    }

    private List<String> addProductData() {
        try {
            ResultSet rst = stm.executeQuery("select item from Products");
            while (rst.next()) {
                autoProduct.add(rst.getString("item"));
            }
            rst.close();
            return autoProduct;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<String> addProductDataCompany() {
        try {
            ResultSet rst = stm.executeQuery("select company from Customers");
            while (rst.next()) {
                autoCompany.add(rst.getString("company"));
            }
            rst.close();
            return autoCompany;
        } catch (Exception e) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        butCheckItem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbShift = new javax.swing.JComboBox();
        txtRate = new javax.swing.JLabel();
        txtAmount = new javax.swing.JLabel();
        txtAlertTot = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtVehicleNo = new javax.swing.JTextField();
        butCheckCompany = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAlert = new javax.swing.JLabel();
        butSave = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtTime = new javax.swing.JLabel();
        butClear = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit Slip"));

        jLabel2.setText("Item/Des");

        jLabel3.setText("Qty");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        jLabel4.setText("Amount");

        jLabel6.setText("Shift");

        butCheckItem.setText(">>");
        butCheckItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCheckItemActionPerformed(evt);
            }
        });

        jLabel7.setText("Rate");

        cmbShift.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6-2", "2-10", "10-6", "Other" }));

        txtRate.setText("RATE");

        txtAmount.setText("AMOUNT");

        txtAlertTot.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtAlertTot.setForeground(new java.awt.Color(255, 0, 0));
        txtAlertTot.setText("None");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(txtItem, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(cmbShift, 0, 179, Short.MAX_VALUE)
                                    .addComponent(txtRate, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtAlertTot, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butCheckItem)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butCheckItem))
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtRate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(txtAlertTot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CustomerInfo"));

        jLabel5.setText("Vehicle Number");

        jLabel1.setText("Company");

        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });

        butCheckCompany.setText(">>");
        butCheckCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCheckCompanyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(butCheckCompany)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel1)
                    .addContainerGap(266, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCheckCompany))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Statistics"));

        jLabel8.setText("CreditLimit");

        jLabel10.setText("TotalAmount");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel11.setText("Status");

        txtAlert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAlert.setForeground(new java.awt.Color(255, 0, 0));
        txtAlert.setText("STATUS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCredit, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(txtAlert)
                    .addComponent(txtTotal))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlert)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        butSave.setText("Do Transaction!");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTime.setText("DATE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTime)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        butClear.setText("Clear");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSave, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butClear, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed

        double qty = Double.parseDouble(txtQty.getText());
        double rate = Double.parseDouble(txtRate.getText());
        double amount = qty * rate;
        txtAmount.setText(String.valueOf(amount));

        double creditLimit = Double.parseDouble(txtCredit.getText());
        double tot = Double.parseDouble(txtTotal.getText());

        if (tot + amount > creditLimit) {
            JOptionPane.showMessageDialog(this, "Credit Limit Exceeded!!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (qty<=0) {
            JOptionPane.showMessageDialog(this, "Invalid Transaction!!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }


        try {
            String CreditSlipID="";
            ResultSet results = stm.executeQuery("select count(*) cc from CreditSlipOrders");
            while (results.next()) {
                CreditSlipID = results.getString("cc");
            }
            CreditSlipID = "CRSO-" + CreditSlipID;

            String sql1 = "insert into CreditSlipOrders (orderNo, date, company, vehicleNo, item, qty, rate, amount, shift) "
                    + "values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql1);
            stmt.setString(1, CreditSlipID);
            stmt.setTimestamp(2, new java.sql.Timestamp(cal.getTimeInMillis()));
            stmt.setString(3, txtCompany.getText());
            stmt.setString(4, txtVehicleNo.getText());
            stmt.setString(5, txtItem.getText());
            stmt.setString(6, txtQty.getText());
            stmt.setString(7, txtRate.getText());
            stmt.setString(8, txtAmount.getText());
            stmt.setString(9, cmbShift.getSelectedItem().toString());
            stmt.executeUpdate() ;

            String sql2 = "update Customers set totalAmount='" + (tot + amount) + "' where company='" + txtCompany.getText() + "'";
            stm.executeUpdate(sql2);
            JOptionPane.showMessageDialog(this, "Thanks your record Saved!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(CreditSlipOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butSaveActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        clear();
    }//GEN-LAST:event_butClearActionPerformed

    public void clear() {
        txtCredit.setText("");
        txtTotal.setText("");
        txtAlert.setText("STATUS");
        txtAmount.setText("");
        txtCompany.setText("");
        txtItem.setText("");
txtAlertTot.setText("None");
        txtRate.setText("");
        txtQty.setText("");
        txtRate.setText("");
        txtVehicleNo.setText("");
        cmbShift.setSelectedItem(1);
        txtTime.setText(sdf.format(cal.getTime()));
    }
    private void butCheckItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCheckItemActionPerformed

        try {
            String sql2 = "select * from Products where item='" + txtItem.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtRate.setText(rst.getString("rate"));
            }
            rst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_butCheckItemActionPerformed

    private void butCheckCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCheckCompanyActionPerformed
        try {
            String sql2 = "select * from Customers where company='" + txtCompany.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtCredit.setText(rst.getString("creditLimit"));
                txtTotal.setText(rst.getString("totalAmount"));
            }
            rst.close();

            double credit = Double.parseDouble(txtCredit.getText());
            double total = Double.parseDouble(txtTotal.getText());

            if (total > credit) {
                txtAlert.setText("Limit Exceeded");
            } else if (total > credit * 80 / 100) {
                txtAlert.setText("80% Exceeded");
            } else {
                txtAlert.setText("Okay");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butCheckCompanyActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased

        double qty = Double.parseDouble(txtQty.getText());
        double rate = Double.parseDouble(txtRate.getText());
        double amount = qty * rate;
        txtAmount.setText(String.valueOf(amount));
        double creditLimit = Double.parseDouble(txtCredit.getText());
        double tot = Double.parseDouble(txtTotal.getText());
        if (tot + amount > creditLimit) {
            txtAlertTot.setText("CreditLimit Exceeded!");
        } else {
            txtAlertTot.setText("None");
        }

    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new CreditSlipOperations().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CreditSlipOperations.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCheckCompany;
    private javax.swing.JButton butCheckItem;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butSave;
    private javax.swing.JComboBox cmbShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtAlert;
    private javax.swing.JLabel txtAlertTot;
    private javax.swing.JLabel txtAmount;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtRate;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables
}
