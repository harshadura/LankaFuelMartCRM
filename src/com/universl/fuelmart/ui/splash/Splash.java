package com.universl.fuelmart.ui.splash;

import com.universl.fuelmart.db.DBConnect;
import com.universl.fuelmart.ui.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Splash Screen of the Program.(Alternative) and validation of the DB connection
 */
public class Splash extends javax.swing.JFrame {
    private static DBConnect dbConnect;
    private static Connection con;
    private static Statement stm;
    private static int i = 0;

    public Splash() throws InterruptedException {
        try {
            setUndecorated(true);
            initComponents();
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            setLocation(wdwLeft, wdwTop);
        } catch (Exception ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/universl/fuelmart/ui/splash/splash.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean checkDBConnection() throws SQLException {
        try {
            dbConnect = new DBConnect();
            con = dbConnect.connect();
            stm = con.createStatement();
            String sql1 = "select * from Login";
            ResultSet results = stm.executeQuery(sql1);
            return true;
        } catch (Exception ee) {
            return false;
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    Splash splash = new Splash();
                    splash.setVisible(true);
                    Thread.sleep(500);
                    if (!checkDBConnection()) {
                        JOptionPane.showMessageDialog(null, "Error Connecting to the Database!", "Lanka Fuel Mart Sys.", javax.swing.JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
                    splash.setVisible(false);
                    Login login = new Login();
                    login.setVisible(true);
          
                } catch (Exception ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
