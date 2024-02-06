   import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.SQLException;

   public class ConexionBD {
       private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=BDPersianas";
       private static final String USUARIO = "sa";
       private static final String PASS = "1234567";

       public static Connection obtenerConexion() {
           try {
               return DriverManager.getConnection(URL, USUARIO, PASS);
           } catch (SQLException ex) {
               ex.printStackTrace();
               return null;
           }
       }
   }
