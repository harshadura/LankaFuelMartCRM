package com.universl.fuelmart.ui.tables;

import com.universl.fuelmart.db.DBConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.*;
import java.sql.Connection;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Generate the Table of Products / Listing of All Products in the corresponding table
 */
public class TableProducts extends javax.swing.JFrame {

    private Vector<String> header;
    private DBConnect dbConnect;
    private Connection con;
    private Vector data;

    public TableProducts() {
        try {
            dbConnect = new DBConnect();
            con = dbConnect.connect();
            data = getAbbr();
            header = new Vector<String>();
            header.add("productId");
            header.add("item");
            header.add("unit");
            header.add("rate");
            header.add("lastChanged");
            initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(TableProducts.class.getResource("/resources/logo.png")));

            setResizable(false);
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            pack();
            setLocation(wdwLeft, wdwTop);
            setTitle("Listing of All Products");
//      setPreferredSize(new Dimension(340, 285));

        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }

    public Vector getAbbr() throws Exception {
        Vector<Vector<String>> AbbrVector = new Vector<Vector<String>>();
        PreparedStatement pre = con.prepareStatement("select * from Products");
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            Vector<String> Abbr = new Vector<String>();
            Abbr.add(rs.getString(1));
            Abbr.add(rs.getString(2));
            Abbr.add(rs.getString(3));
            Abbr.add(rs.getString(4));
            Abbr.add(rs.getString(5));
            AbbrVector.add(Abbr);
        }
        return AbbrVector;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TableProducts().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
