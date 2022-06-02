/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author sangamarcam
 */
import java.sql.*;
public class Listar {
public static void main(String[] args) {
    Connection conn = null;
    try {
        String myConnectionString =
                "jdbc:mysql://127.0.0.1:3366?" +
                "useUnicode=yes&characterEncoding=UTF-8";
        conn = DriverManager.getConnection(myConnectionString, "root", "cuenca");
        Statement stmt = conn.createStatement();
        stmt.execute("SHOW DATABASES");
        ResultSet rs = stmt.getResultSet();
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

}
