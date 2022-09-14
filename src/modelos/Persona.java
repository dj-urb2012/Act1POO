package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int anioNac;
    private String mesNac;
    private String email;
    private char[] password;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int anioNac, String mesNac, String email, char[] password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.anioNac = anioNac;
        this.mesNac = mesNac;
        this.email = email;
        this.password = password;
    }

    
 
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public String getMesNac() {
        return mesNac;
    }

    public void setMesNac(String mesNac) {
        this.mesNac = mesNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
    
    
    
}
