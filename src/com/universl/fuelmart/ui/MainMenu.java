package com.universl.fuelmart.ui;

import com.universl.fuelmart.ui.reports.ReportsCenter;
import com.universl.fuelmart.ui.tables.TableProducts;
import com.universl.fuelmart.ui.tables.TableCustomers;
import com.universl.fuelmart.ui.tables.TableCreditCardOrders;
import com.universl.fuelmart.ui.tables.TableCreditSlipOrders;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Main Menu of the Application
 */
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
        txtUser.setText(Login.user);
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/resources/logo.png")));
         setExtendedState(MainMenu.MAXIMIZED_BOTH);
         setTitle("Lanka Fuel Mart CRM System - M.I.M SHERIFF & SONS - TRUCKERS HAVEN - LANKA FUEL MART");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        menuProducts = new javax.swing.JButton();
        menuExit = new javax.swing.JButton();
        menuListProducts = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        menuReports = new javax.swing.JButton();
        menuCustomers = new javax.swing.JButton();
        menuLockScreen = new javax.swing.JButton();
        menuCreditCard = new javax.swing.JButton();
        menuCreditSlip = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        tabCreditSlip_Save = new javax.swing.JMenuItem();
        tabCreditSlip_Edit = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        tabCreditCard111 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        tabCreditCard = new javax.swing.JMenuItem();
        tabCreditCardEdit = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        tabAddCustomer_Save = new javax.swing.JMenuItem();
        tabAddCustomer_Edit = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        tabProducts_Save = new javax.swing.JMenuItem();
        tabProducts_Edit = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        tabExit = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        tabProductsTable = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        tabCustTable = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        tabCreditSlipTable = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        tabCreditCardTable = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        tabGenerateReport = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        tabChangePass = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        tabNewUser = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        tabHelp = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        tabAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Logged as : ");

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtUser.setText("NAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings.png"))); // NOI18N
        menuProducts.setToolTipText("Update Prices of Products");
        menuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductsActionPerformed(evt);
            }
        });

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/22d.png"))); // NOI18N
        menuExit.setToolTipText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });

        menuListProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/33.png"))); // NOI18N
        menuListProducts.setToolTipText("List All Products");
        menuListProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListProductsActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/table.png"))); // NOI18N

        menuReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/table.png"))); // NOI18N
        menuReports.setToolTipText("Generate/Print Reports");
        menuReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportsActionPerformed(evt);
            }
        });

        menuCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/table2.png"))); // NOI18N
        menuCustomers.setToolTipText("Update Details of Customers");
        menuCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustomersActionPerformed(evt);
            }
        });

        menuLockScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3332.png"))); // NOI18N
        menuLockScreen.setToolTipText("Lock Screen");
        menuLockScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLockScreenActionPerformed(evt);
            }
        });

        menuCreditCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/card.png"))); // NOI18N
        menuCreditCard.setToolTipText("Add New Credit Card Order");
        menuCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditCardActionPerformed(evt);
            }
        });

        menuCreditSlip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/slip.png"))); // NOI18N
        menuCreditSlip.setToolTipText("Add New Credit Slip Order");
        menuCreditSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditSlipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuCreditSlip, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuListProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuReports, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuLockScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuProducts)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(menuCustomers, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuListProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuReports, 0, 0, Short.MAX_VALUE))
                                .addComponent(menuLockScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menuExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(menuCreditCard)
                    .addComponent(menuCreditSlip)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenu3.setText("Credit Slip Transactions");

        tabCreditSlip_Save.setText("New Transaction");
        tabCreditSlip_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditSlip_SaveActionPerformed(evt);
            }
        });
        jMenu3.add(tabCreditSlip_Save);

        tabCreditSlip_Edit.setText("Update/Delete Transaction");
        tabCreditSlip_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditSlip_EditActionPerformed(evt);
            }
        });
        jMenu3.add(tabCreditSlip_Edit);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        tabCreditCard111.setText("Credit Card Transactions");
        tabCreditCard111.add(jSeparator1);

        tabCreditCard.setText("New Transaction");
        tabCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditCardActionPerformed(evt);
            }
        });
        tabCreditCard111.add(tabCreditCard);

        tabCreditCardEdit.setText("Update/Delete Transaction");
        tabCreditCardEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditCardEditActionPerformed(evt);
            }
        });
        tabCreditCard111.add(tabCreditCardEdit);

        jMenu1.add(tabCreditCard111);
        jMenu1.add(jSeparator4);

        jMenu6.setText("Customers");

        tabAddCustomer_Save.setText("Add New Customer");
        tabAddCustomer_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddCustomer_SaveActionPerformed(evt);
            }
        });
        jMenu6.add(tabAddCustomer_Save);

        tabAddCustomer_Edit.setText("Edit Existing Customer");
        tabAddCustomer_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAddCustomer_EditActionPerformed(evt);
            }
        });
        jMenu6.add(tabAddCustomer_Edit);

        jMenu1.add(jMenu6);
        jMenu1.add(jSeparator5);

        jMenu7.setText("Products");

        tabProducts_Save.setText("Add New Product");
        tabProducts_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabProducts_SaveActionPerformed(evt);
            }
        });
        jMenu7.add(tabProducts_Save);

        tabProducts_Edit.setText("Edit Products/Change Prices");
        tabProducts_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabProducts_EditActionPerformed(evt);
            }
        });
        jMenu7.add(tabProducts_Edit);

        jMenu1.add(jMenu7);
        jMenu1.add(jSeparator6);

        tabExit.setText("Exit");
        tabExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabExitActionPerformed(evt);
            }
        });
        jMenu1.add(tabExit);

        jMenuBar1.add(jMenu1);

        jMenu8.setText("View");

        jMenu9.setText("Information Tables");

        tabProductsTable.setText("Products Table");
        tabProductsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabProductsTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabProductsTable);
        jMenu9.add(jSeparator7);

        tabCustTable.setText("Customers Table");
        tabCustTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCustTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabCustTable);
        jMenu9.add(jSeparator8);

        tabCreditSlipTable.setText("Credit Slip Orders History");
        tabCreditSlipTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditSlipTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabCreditSlipTable);
        jMenu9.add(jSeparator10);

        tabCreditCardTable.setText("Credit Card Orders History");
        tabCreditCardTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCreditCardTableActionPerformed(evt);
            }
        });
        jMenu9.add(tabCreditCardTable);

        jMenu8.add(jMenu9);
        jMenu8.add(jSeparator9);

        jMenu10.setText("Reports");

        tabGenerateReport.setText("Generate Report/Print");
        tabGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabGenerateReportActionPerformed(evt);
            }
        });
        jMenu10.add(tabGenerateReport);

        jMenu8.add(jMenu10);

        jMenuBar1.add(jMenu8);

        jMenu2.setText("Tools");

        tabChangePass.setText("Change Password");
        tabChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabChangePassActionPerformed(evt);
            }
        });
        jMenu2.add(tabChangePass);
        jMenu2.add(jSeparator11);

        tabNewUser.setText("Add New User");
        tabNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabNewUserActionPerformed(evt);
            }
        });
        jMenu2.add(tabNewUser);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Help");

        tabHelp.setText("Help");
        tabHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabHelpActionPerformed(evt);
            }
        });
        jMenu5.add(tabHelp);
        jMenu5.add(jSeparator3);

        tabAbout.setText("About");
        tabAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabAboutActionPerformed(evt);
            }
        });
        jMenu5.add(tabAbout);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabChangePassActionPerformed
        try {
            ChangeLoginPass changeLoginPass = new ChangeLoginPass();
            changeLoginPass.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tabChangePassActionPerformed

    private void tabAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAboutActionPerformed

        About about = new About();
        about.setVisible(true);

    }//GEN-LAST:event_tabAboutActionPerformed

    private void tabHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabHelpActionPerformed
        JOptionPane.showMessageDialog(this, "Lanka Fuel Mart CRM System is a Project of UniverSL Software Ltd.\nIf you have any problem/troubleshoot/to get clarify with this software component,\nplease Contact UniverSL Support Team", "Lanka Fuel Mart CRM", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tabHelpActionPerformed

    private void tabExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabExitActionPerformed
        int more = JOptionPane.YES_OPTION;
        more = JOptionPane.showConfirmDialog(null, "Are you sure want to Exit?", "Lanka Fuel Mart CRM", JOptionPane.YES_NO_OPTION);
        if (more == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_tabExitActionPerformed

    private void tabCreditSlip_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditSlip_SaveActionPerformed
        try {
            CreditSlipOperations creditSlipOperations = new CreditSlipOperations();
            creditSlipOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabCreditSlip_SaveActionPerformed

    private void tabProducts_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabProducts_SaveActionPerformed
        try {
            Products products = new Products();
            products.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabProducts_SaveActionPerformed

    private void tabCreditSlip_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditSlip_EditActionPerformed
        try {
            CreditSlipOperationsUpdate creditSlipOperationsUpdate = new CreditSlipOperationsUpdate();
            creditSlipOperationsUpdate.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabCreditSlip_EditActionPerformed

    private void tabAddCustomer_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddCustomer_SaveActionPerformed
        try {
            Customer customer = new Customer();
            customer.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabAddCustomer_SaveActionPerformed

    private void tabAddCustomer_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabAddCustomer_EditActionPerformed
        try {
            CustomerEdit customerEdit = new CustomerEdit();
            customerEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabAddCustomer_EditActionPerformed

    private void tabProducts_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabProducts_EditActionPerformed
        try {
            ProductsEdit productsEdit = new ProductsEdit();
            productsEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabProducts_EditActionPerformed

    private void tabProductsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabProductsTableActionPerformed

        TableProducts tableProducts = new TableProducts();
        tableProducts.setVisible(true);
    }//GEN-LAST:event_tabProductsTableActionPerformed

    private void tabCustTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCustTableActionPerformed
        TableCustomers tableCustomers = new TableCustomers();
        tableCustomers.setVisible(true);
    }//GEN-LAST:event_tabCustTableActionPerformed

    private void tabCreditSlipTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditSlipTableActionPerformed

        TableCreditSlipOrders tableCreditSlipOrders = new TableCreditSlipOrders();
        tableCreditSlipOrders.setVisible(true);
    }//GEN-LAST:event_tabCreditSlipTableActionPerformed

    private void tabCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditCardActionPerformed
        try {
            CreditCardOperations creditCardOperations = new CreditCardOperations();
            creditCardOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabCreditCardActionPerformed

    private void tabCreditCardEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditCardEditActionPerformed
        try {
            CreditCardOperationsUpdate cardOperationsUpdate = new CreditCardOperationsUpdate();
            cardOperationsUpdate.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabCreditCardEditActionPerformed

    private void tabCreditCardTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCreditCardTableActionPerformed

        TableCreditCardOrders tableCreditCardOrders = new TableCreditCardOrders();
        tableCreditCardOrders.setVisible(true);
    }//GEN-LAST:event_tabCreditCardTableActionPerformed

    private void tabNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabNewUserActionPerformed
        try {
            AddNewLogin addNewLogin = new AddNewLogin();
            addNewLogin.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabNewUserActionPerformed

    private void tabGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabGenerateReportActionPerformed

        ReportsCenter reportsCenter = new ReportsCenter();
        reportsCenter.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tabGenerateReportActionPerformed

    private void menuCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditCardActionPerformed
        try {
            CreditCardOperations creditCardOperations = new CreditCardOperations();
            creditCardOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_menuCreditCardActionPerformed

    private void menuCreditSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditSlipActionPerformed
        try {
            CreditSlipOperations creditSlipOperations = new CreditSlipOperations();
            creditSlipOperations.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_menuCreditSlipActionPerformed

    private void menuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductsActionPerformed
        try {
            ProductsEdit productsEdit = new ProductsEdit();
            productsEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }              // TODO add your handling code here:
    }//GEN-LAST:event_menuProductsActionPerformed

    private void menuCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustomersActionPerformed
        try {
            CustomerEdit customerEdit = new CustomerEdit();
            customerEdit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }                // TODO add your handling code here:
    }//GEN-LAST:event_menuCustomersActionPerformed

    private void menuListProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListProductsActionPerformed
        TableProducts tableProducts = new TableProducts();
        tableProducts.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_menuListProductsActionPerformed

    private void menuReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportsActionPerformed
        ReportsCenter reportsCenter = new ReportsCenter();
        reportsCenter.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_menuReportsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int more = JOptionPane.YES_OPTION;
        more = JOptionPane.showConfirmDialog(null, "Are you sure want to Exit?", "Lanka Fuel Mart CRM", JOptionPane.YES_NO_OPTION);
        if (more == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLockScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLockScreenActionPerformed
    JOptionPane.showMessageDialog(this, "System Locked! Press OK to Release", "Lanka Fuel Mart CRM", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             
    }//GEN-LAST:event_menuLockScreenActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JButton menuCreditCard;
    private javax.swing.JButton menuCreditSlip;
    private javax.swing.JButton menuCustomers;
    private javax.swing.JButton menuExit;
    private javax.swing.JButton menuListProducts;
    private javax.swing.JButton menuLockScreen;
    private javax.swing.JButton menuProducts;
    private javax.swing.JButton menuReports;
    private javax.swing.JMenuItem tabAbout;
    private javax.swing.JMenuItem tabAddCustomer_Edit;
    private javax.swing.JMenuItem tabAddCustomer_Save;
    private javax.swing.JMenuItem tabChangePass;
    private javax.swing.JMenuItem tabCreditCard;
    private javax.swing.JMenu tabCreditCard111;
    private javax.swing.JMenuItem tabCreditCardEdit;
    private javax.swing.JMenuItem tabCreditCardTable;
    private javax.swing.JMenuItem tabCreditSlipTable;
    private javax.swing.JMenuItem tabCreditSlip_Edit;
    private javax.swing.JMenuItem tabCreditSlip_Save;
    private javax.swing.JMenuItem tabCustTable;
    private javax.swing.JMenuItem tabExit;
    private javax.swing.JMenuItem tabGenerateReport;
    private javax.swing.JMenuItem tabHelp;
    private javax.swing.JMenuItem tabNewUser;
    private javax.swing.JMenuItem tabProductsTable;
    private javax.swing.JMenuItem tabProducts_Edit;
    private javax.swing.JMenuItem tabProducts_Save;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
