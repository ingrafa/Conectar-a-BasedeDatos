



package Conexion_PostgreSQL;


import java.sql.*;
//UTLIZARÉ LA PRIMERA FORMA DE CONExión(url,user,password)

public class PostgreSQLJDBC {

    public static void main(String[] args) {
        Connection cn;
        String url= "jdbc:postgresql://localhost:5432/cliente";
        String user= "postgres";
        String password= "cuenca";
        try{
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection(url,user,password);
            System.out.println("CONEXIÓN ESTABLECIDA");
        }

        catch(Exception e)
        {
            System.out.println("Error de conexión"+e.getMessage());
        }


    }

}
