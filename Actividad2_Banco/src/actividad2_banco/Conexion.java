/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2_banco;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kathy
 */
public class Conexion {
    //Declaracion de metodo getConnection
    public Connection getConnection () {
        Connection con = null; 
        
        //Definir los parametros para la conexion
        String base = "banco_mx";
        String url = "jdbc:mysql://localhost:3306/"+base;
        String user = "root";
        String password = "";
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection (url, user, password);
        } catch (Exception e){
            System.err.println(e);
        }
        return con;
    }
    
}
