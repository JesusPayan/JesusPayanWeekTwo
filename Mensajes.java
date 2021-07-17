/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

/**
 *
 * @author j.hernandez.payan
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String author_mensaje;
    String fecha_mensaje;
    public Mensajes(){
        
    }

    public Mensajes(String mensaje, String author_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.author_mensaje = author_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAuthor_mensaje() {
        return author_mensaje;
    }

    public void setAuthor_mensaje(String author_mensaje) {
        this.author_mensaje = author_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
}
