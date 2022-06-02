package UPS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Conector{
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3366/sys","root","cuenca");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("_________");
            System.out.println("Conectado");
            System.out.println("_________");
                    
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("_________________");
            System.out.println("error de Conexion");
            System.out.println("_________________");
        }
    }  
}

