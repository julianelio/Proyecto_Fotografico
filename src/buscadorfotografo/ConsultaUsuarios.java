
package buscadorfotografo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsultaUsuarios {
    public static void main(String[] args) {
        System.out.println("hola");
        
        //1 Conectarnos a la base de datos
        
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mariadb://localhost:3306/fotografos"; 
        String consultaSql = "SELECT * FROM `usuarios` ";
         Connection miConexion = null;
        try {
         miConexion  = DriverManager.getConnection(url, usuario, clave);
         PreparedStatement miPreparacion = miConexion.prepareStatement(consultaSql);
        ResultSet miResultado = miPreparacion.executeQuery();
            while (miResultado.next()) {                
                System.out.println("Nombre:"+ miResultado.getNString("nombre"));  
            }
        } catch (SQLException ex) {
            System.out.println(" Alerta");
        }finally{
            try {
                if (miConexion != null){
                    miConexion.close();
                    System.out.println("Cerraste la conexion exitosamente");
                }
                miConexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion a la base de datos");
            }
                    }
        
      
        System.out.println("chau");
    }
}
