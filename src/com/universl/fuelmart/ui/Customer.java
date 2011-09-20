package com.universl.fuelmart.ui;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.universl.fuelmart.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Add new Customer
 */
public class Customer extends javax.swing.JFrame {

    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;

    public Customer() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(Customer.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Add New Customers");
//      setPreferredSize(new Dimension(340, 285));

        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtVehicles = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtCreditLimit = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        butSave = new javax.swing.JButton();
        butClear = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit Slip"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Customer");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Vehicles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 131, -1, -1));
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 87, 230, -1));
        jPanel1.add(txtVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 125, 115, -1));

        jLabel7.setText("Company");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel1.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, -1));

        jLabel1.setText("Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 166, -1, -1));
        jPanel1.add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 232, 107, -1));
        jPanel1.add(txtCreditLimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 194, 107, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 270, 107, -1));

        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 273, -1, -1));

        jLabel5.setText("TotalAmount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel8.setText("Credit Limit");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 200, -1, -1));
        jPanel1.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 107, -1));

        jLabel6.setText("Contact No");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 304, -1, -1));

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Private Company", "Government" }));
        jPanel1.add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 163, -1, -1));

        butSave.setText("Save");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        butClear.setText("Clear");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butClear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
        try {
            if (txtCompany.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the details!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtContactNo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter the details!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            String CustomerID = "";
            ResultSet results = stm.executeQuery("select count(*) cc from Customers");
            while (results.next()) {
                CustomerID = results.getString("cc");
            }
            CustomerID = "CID-" + CustomerID;

            String sql1 = "insert into Customers (customerId, customer, company, vehicles, type, creditLimit, totalAmount, address, contactNo) "
                    + "values('" + CustomerID + "','" + txtCustomerName.getText() + "','" + txtCompany.getText()
                    + "','" + txtVehicles.getText() + "','" + cmbType.getSelectedItem().toString() + "','" + txtCreditLimit.getText() + "','"
                    + txtTotalAmount.getText() + "','" + txtAddress.getText() + "','" + txtContactNo.getText() + "')";

            stm.executeUpdate(sql1);
            JOptionPane.showMessageDialog(this, "Thanks your record Saved!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butSaveActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        clear();
    }//GEN-LAST:event_butClearActionPerformed

    public void clear() {
        txtCustomerName.setText("");
        txtCompany.setText("");
        txtVehicles.setText("");
        txtAddress.setText("");
        txtContactNo.setText("");
        txtCreditLimit.setText("");
        txtTotalAmount.setText("");
        cmbType.setSelectedItem(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Customer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butClear;
    private javax.swing.JButton butSave;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCreditLimit;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtVehicles;
    // End of variables declaration//GEN-END:variables
}
