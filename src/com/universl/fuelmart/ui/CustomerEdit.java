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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Update/Delete Existing Customer
 */
public class CustomerEdit extends javax.swing.JFrame {

    private DBConnect dbConnect;
    private Connection con;
    private Statement stm;
    private List<String> autoCompany = new ArrayList<String>();
    private boolean strictMatching = false;

    public CustomerEdit() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(CustomerEdit.class.getResource("/resources/logo.png")));

        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Update/Delete Customers");
//      setPreferredSize(new Dimension(340, 285));

        dbConnect = new DBConnect();
        con = dbConnect.connect();
        stm = con.createStatement();
        AutoCompleteDecorator.decorate(txtCompanyAuto, addProductDataCompany(), strictMatching);
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
        mainPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        butSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCompanyAuto = new javax.swing.JTextField();
        butAutoProduct = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        butUpdate = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butClear = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Credit Slip"));

        jLabel2.setText("Customer");

        jLabel3.setText("Vehicles");

        jLabel7.setText("Company");

        jLabel1.setText("Type");

        jLabel4.setText("Address");

        jLabel5.setText("TotalAmount");

        jLabel8.setText("Crdit Limit");

        jLabel6.setText("Contact No");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Private Company", "Government" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVehicles)
                            .addComponent(txtCompany)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreditLimit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(cmbType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By"));

        jLabel9.setText("Company");

        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        txtCustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerIDKeyPressed(evt);
            }
        });

        butSearch.setText(">>");
        butSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearchActionPerformed(evt);
            }
        });

        jLabel10.setText("CustomerID");

        txtCompanyAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyAutoActionPerformed(evt);
            }
        });
        txtCompanyAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCompanyAutoKeyPressed(evt);
            }
        });

        butAutoProduct.setText(">>");
        butAutoProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAutoProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCompanyAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSearch)
                    .addComponent(butAutoProduct))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(butAutoProduct)
                    .addComponent(txtCompanyAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(butSearch))
                        .addGap(26, 26, 26))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        butUpdate.setText("Update");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butDelete.setText("Delete");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
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
                .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
        try {
            String sql2 = "select * from Customers where customerId='" + txtCustomerID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next()) {
                String sql = "update Customers set customer='" + txtCustomerName.getText()
                        + "', company='" + txtCompany.getText() + "', vehicles='" + txtVehicles.getText() + "',"
                        + " type='" + cmbType.getSelectedItem().toString() + "', creditLimit='" + txtCreditLimit.getText() + "', "
                        + "totalAmount='" + txtTotalAmount.getText() + "', address='" + txtAddress.getText() + "',"
                        + " contactNo='" + txtContactNo.getText() + "' where customerId='" + txtCustomerID.getText() + "'";

                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Your record Updated!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clear();
                AutoCompleteDecorator.decorate(txtCompanyAuto, addProductDataCompany(), strictMatching);
            } else {
                JOptionPane.showMessageDialog(this, "No Record to Update!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            Logger.getLogger(CustomerEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butUpdateActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
        try {
            String sql2 = "select * from Customers where customerId='" + txtCustomerID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next()) {
                String sql = "delete from Customers where customerId='" + txtCustomerID.getText() + "'";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Record Deleted!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clear();
                AutoCompleteDecorator.decorate(txtCompanyAuto, addProductDataCompany(), strictMatching);
            } else {
                JOptionPane.showMessageDialog(this, "Nothing to Delete!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            Logger.getLogger(CustomerEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        clear();
    }//GEN-LAST:event_butClearActionPerformed

    public void clear() {
        txtCustomerName.setText("");
        txtCompany.setText("");
        txtVehicles.setText("");
        txtCustomerID.setFocusable(true);
        txtAddress.setText("");
        txtContactNo.setText("");
        txtCreditLimit.setText("");
        txtTotalAmount.setText("");
        cmbType.setSelectedItem(0);
    }
    private void butSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearchActionPerformed
        try {
            clear();
            String sql2 = "select * from Customers where customerId='" + txtCustomerID.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtCustomerName.setText(rst.getString("customer"));
                txtCompany.setText(rst.getString("company"));
                cmbType.setSelectedItem(rst.getString("type"));
                txtVehicles.setText(rst.getString("vehicles"));
                txtCreditLimit.setText(rst.getString("creditLimit"));
                txtTotalAmount.setText(rst.getString("totalAmount"));
                txtAddress.setText(rst.getString("address"));
                txtContactNo.setText(rst.getString("contactNo"));
            }
            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butSearchActionPerformed

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtCustomerIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIDKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtCustomerIDKeyPressed

    private void txtCompanyAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyAutoActionPerformed
    }//GEN-LAST:event_txtCompanyAutoActionPerformed

    private void txtCompanyAutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanyAutoKeyPressed
    }//GEN-LAST:event_txtCompanyAutoKeyPressed

    private void butAutoProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAutoProductActionPerformed
        try {
            clear();
            String sql2 = "select * from Customers where company='" + txtCompanyAuto.getText() + "'";
            ResultSet rst = stm.executeQuery(sql2);

            if (rst.next() == false) {
                JOptionPane.showMessageDialog(this, "No Record Found!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                txtCustomerID.setText(rst.getString("customerId"));
                txtCustomerName.setText(rst.getString("customer"));
                txtCompany.setText(rst.getString("company"));
                cmbType.setSelectedItem(rst.getString("type"));
                txtVehicles.setText(rst.getString("vehicles"));
                txtCreditLimit.setText(rst.getString("creditLimit"));
                txtTotalAmount.setText(rst.getString("totalAmount"));
                txtAddress.setText(rst.getString("address"));
                txtContactNo.setText(rst.getString("contactNo"));
            }
            rst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Occured!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butAutoProductActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new CustomerEdit().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerEdit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAutoProduct;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butSearch;
    private javax.swing.JButton butUpdate;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtCompanyAuto;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCreditLimit;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtVehicles;
    // End of variables declaration//GEN-END:variables
}
