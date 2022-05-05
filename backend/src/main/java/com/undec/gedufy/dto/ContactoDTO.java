package com.undec.gedufy.dto;

import com.undec.gedufy.model.Contacto;

public class ContactoDTO {
    //Nombre, Correo y Mensaje.
    private String nombre;
    private String correo;
    private String mensaje;

    public ContactoDTO(){}
    public ContactoDTO(String nombre, String correo, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Contacto getContacto(ContactoDTO contactoDTO) {
        Contacto contacto = new Contacto();
        contacto.setId(null);
        contacto.setNombre(contactoDTO.getNombre());
        contacto.setCorreo(contactoDTO.getCorreo());
        contacto.setMensaje(contactoDTO.getMensaje());
        return contacto;
    }
}
