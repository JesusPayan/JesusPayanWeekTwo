/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author j.hernandez.payan
 */
public class MensajesService {

    public static void crearMensaje(){
        Scanner sc  = new Scanner(System.in) ;
        String mensaje,autorMensaje;
        System.out.println("Escribe tu mensaje (presiona enter al finalizar)");
        System.out.println("Mensaje:");
        mensaje =  sc.nextLine();
        System.out.println("Escribe tu nombre (presiona enter al finalizar)");
        System.out.println("Nombre:");
        autorMensaje =  sc.nextLine();

        Mensajes registro =  new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAuthor_mensaje(autorMensaje);
        MensajesDAO.crearMensaje(registro);

    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensajes(){
        Scanner scanner =  new Scanner(System.in);
        int idMensajeAEliminar = 0;
        System.out.println("Escribe el ID del mensaje a eliminar:");
        idMensajeAEliminar =  scanner.nextInt();
        MensajesDAO.borrarMensajesDB(idMensajeAEliminar);
    }
    public static void editarMensaje(){

        Scanner scanner =  new Scanner(System.in);
        int idMensajeAModificar = 0;
        System.out.println("Escribe tu nuevo mensaje");
        String textoActualizado =  scanner.nextLine();


        System.out.println("Escribe el ID del mensaje a modificar:");
        idMensajeAModificar =  scanner.nextInt();

        Mensajes mensajeActualizado = new Mensajes();
        mensajeActualizado.setId_mensaje(idMensajeAModificar);
        mensajeActualizado.setMensaje(textoActualizado);
        MensajesDAO.actualizarMensajesDB(mensajeActualizado);

                           
    }
                               
}
