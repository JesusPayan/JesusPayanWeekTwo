/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author j.hernandez.payan
 */
public class Conexion {

    public Connection get_connection(){
        Connection connection = null;try {
            //System.out.println(connection.toString());
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            //System.out.println(connection.toString());
            if (connection!=null){
                System.out.println("!Conexion a la base de datos Exitosa¡");
            }else{
                System.out.println("! No se pudo conectar a la base de datos ¡");
            }
        } catch (Exception exception) {
            System.out.println("Algo salio mal" + exception.toString());
        }

            /*connection =  DriverManager.getConnection("jdbc:mysql://localhost:4040/mensajes_app","root","");
            System.out.println("Valor de la conexion" + connection.toString());
            if(connection != null){
                System.out.println("Conexion a la base de datos Exitosa");
                
            }else{
                System.out.println("No se pudo Conectar a la Base de datos");
            }
             
        } catch (SQLException e) {
            System.out.println("Algo ocurrio durante la conexion " + e.toString());
        }*/
        return connection;
    }
    
}
