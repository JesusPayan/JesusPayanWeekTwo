/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author j.hernandez.payan
 */
public class Inicio {
    public static void main(String args[]){
        System.out.println("Arrancando el proyecto");
        System.out.println("....");

        Conexion Conexion =  new Conexion();
        try(Connection cnx =  Conexion.get_connection()){

        }
        catch(SQLException e){

        }
                
    }
    
}
