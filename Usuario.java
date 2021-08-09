/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadreto2;

/**
 *
 * @author jp-co
 */
public class Usuario {

    private String Nombre, Email, Nick;
    private int Telefono, Edad, Codigo;

    public Usuario() {
    }

    public Usuario(String Nombre, String Email, String Nick, int Telefono, int Edad, int Codigo) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Nick = Nick;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.Codigo = Codigo;
    }

    

    public void mostrar() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    

}
