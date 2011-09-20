package com.universl.fuelmart.db;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author      : Harsha Siriwardena     <harshadura@gmail.com>
 * @copyrights  : UniverSL Software Ltd  <http://www.universlsoftware.com>
 * @license     : GNU GPL v3             <http://www.gnu.org/licenses/>
 *
 * Main Database Connection Class
 */
public class DBConnect {
    private static Logger logger = Logger.getLogger(DBConnect.class);
    private static Connection con = null;
    private static String dbName = "LankaFuelMart";
    private static String dbUser = "root";
    private static String dbPass = "sa";

    public Connection connect() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + dbName + "?autoReconnect=true", dbUser, dbPass);

                if (!con.isClosed()) {
                    logger.info("Successfully connected to " + "MySQL server using TCP/IP.");
                }
            } catch (Exception e) {
                logger.error("Exception: " + e.getMessage());
            }
        }
        return con;
    }
}
