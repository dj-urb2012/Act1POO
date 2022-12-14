/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelos.Persona;

/**
 *
 * @author Diego
 */
public class Operacion {
   private Persona persona;

    public Operacion() {
        persona = new Persona();
    }

    public Operacion(String nombres, String apellidos, int anioNac, String mesNac, String email, char[] password) {
        this.persona = new Persona(nombres, apellidos, anioNac, mesNac, email, password);
    }
    //Asigna un numero a cada mes (1 - 12)
    public int asignarNumMes(String mes) {
        switch(mes) {
            case "Enero":
                return 1;
            case "Febrero":
                return 2;
            case "Marzo":
                return 3;
            case "Abril":
                return 4;
            case "Mayo":
                return 5;
            case "Junio":
                return 6;
            case "Julio":
                return 7;
            case "Agosto":
                return 8;
            case "Septiembre":
                return 9;
            case "Octubre":
                return 10;
            case "Noviembre":
                return 11;
            case "Diciembre":
                return 12;
        }
       return 0;
    } 
    
    //Verificar que el usuario sea mayor de 13 años, teniendo en cuenta el mes de nacimiento
    public int obtenerEdad() {
        int anioActual = 2022;
        int edad = anioActual - persona.getAnioNac();
        int mesUsr = this.asignarNumMes(persona.getMesNac());
        if(edad > 13 && mesUsr > 9) {
            return (anioActual - persona.getAnioNac()) - 1;
        }
        return anioActual - persona.getAnioNac();
    }
    //Retorna verdadero solo si el usuario es mayor a 13 años
    public boolean verificarEdad() {
        int edad = this.obtenerEdad();
        if(edad > 13) {
            return true;
        }
        return false;
    }
    //Verifica que el correo a crearse sea valido
    public boolean verificarCorreo() {
        String correo = persona.getEmail();
        if(correo.contains("@") && correo.contains(".com")) {
            return true;
        }
        return false;
    }
    //Detecta si ambas cadenas son iguales, de este modo se podra saber si ambos campos son iguales
    public boolean confirmarPasswd(char[] cadena) {
        String contra = new String(persona.getPassword());
        String conf = new String(cadena);
        if(conf.equals(contra)) {
            return true;
        }
        return false;
    }
    //Verifica si el largo de la cadena es menor a 5 caracteres
    public boolean verificarTamCadena() {
        String contra = new String(persona.getPassword());
        if(contra.length() <= 4) {
            return false;
        }
        return true;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
    
}
