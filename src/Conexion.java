/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.SQLException;

   public class Conexion {
       private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=cortinasYpersianas";
       private static final String USUARIO = "Desarrollador";
       private static final String PASS = "persianas123";

       public static Connection obtenerConexion() {
           try {
               return DriverManager.getConnection(URL, USUARIO, PASS);
           } catch (SQLException ex) {
               ex.printStackTrace();
               return null;
           }
       }
   }
