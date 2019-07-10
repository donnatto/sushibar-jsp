/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamachisushi.model;

/**
 *
 * @author Alumno
 */
public class Contacto {

  private int id;
  private String nombre;
  private String correo;
  private String asunto;
  private String mensaje;

  public Contacto(String nombre, String correo, String asunto, String mensaje) {
    this.nombre = nombre;
    this.correo = correo;
    this.asunto = asunto;
    this.mensaje = mensaje;
  }

  public Contacto(int id, String nombre, String correo, String asunto, String mensaje) {
    this.id = id;
    this.nombre = nombre;
    this.correo = correo;
    this.asunto = asunto;
    this.mensaje = mensaje;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getAsunto() {
    return asunto;
  }

  public void setAsunto(String asunto) {
    this.asunto = asunto;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

}
