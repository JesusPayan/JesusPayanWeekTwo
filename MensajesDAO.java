/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author j.hernandez.payan
 */
public class MensajesDAO {

    public static void crearMensaje(Mensajes mensajes){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps =  null;
            try {
             String query =  "INSERT INTO `mensajes` ( `mensaje`, `autor_mensaje`) VALUES (?,?)";
             ps =  conexion.prepareStatement(query);
             ps.setString(1, mensajes.getMensaje());
             ps.setString(2,mensajes.getAuthor_mensaje());
             ps.executeUpdate();
            }catch (SQLException e2){
                System.out.println(e2);
            }
        }catch (SQLException e){
            System.out.println(e);
        }


    }
    public static void leerMensajesDB(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet resutadoBD = null;

        try(Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            resutadoBD = ps.executeQuery();

            while (resutadoBD.next()){
                System.out.println("ID: "+ resutadoBD.getInt("id_mensaje"));
                System.out.println("Mensaje: "+ resutadoBD.getString("mensaje"));
                System.out.println("Autor: "+ resutadoBD.getString("autor_mensaje"));
                System.out.println("Fecha Publicacion: "+ resutadoBD.getInt("fecha_mensaje"));
                System.out.println("");
            }

        }catch(SQLException e){

        }

        
    }
    public static void borrarMensajesDB(int id_mensaje){
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM `mensajes` WHERE `id_mensaje` = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                 if(ps.executeUpdate()==1) {
                     System.out.println("Mensaje eliminado");
                 }
            } catch (SQLException e) {

            }
        }catch (SQLException e){
            System.out.println("No se pudo borrar el mensaje");
        }
        
    }
    public static void actualizarMensajesDB(Mensajes mensaje){
       //UPDATE `mensajes` SET `mensaje` = 'este sera un mensaje editado' WHERE `mensajes`.`id_mensaje` = 5;
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensajes SET mensaje = ?  WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId_mensaje());
                if(ps.executeUpdate() == 1) {
                    System.out.println("Mensaje editado");
                }
            } catch (SQLException e) {

            }
        }catch (SQLException e){
            System.out.println("No se pudo borrar el mensaje");
        }
    }
    
}
