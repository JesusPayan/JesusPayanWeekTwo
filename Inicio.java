/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author j.hernandez.payan
 */
public class Inicio {
    public static void main(String args[]){
        System.out.println("Arrancando el proyecto");
        System.out.println("....");
        Scanner ft = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("-----------------------");
            System.out.println(" Menu Sistema Mensajes ");
             System.out.println("----------------------");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
            System.out.print("Selecione una opcion:");
            opcion =  ft.nextInt();
            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                break;
                case 2:
                    MensajesService.listarMensajes();
                break;
                case 3:
                    MensajesService.editarMensaje();
                break;
                case 4:
                    MensajesService.borrarMensajes();
                break;
            }
        }while(opcion != 5);

        Conexion Conexion =  new Conexion();
        try(Connection cnx =  Conexion.get_connection()){

        }
        catch(SQLException e){

        }
                
    }
    
}
