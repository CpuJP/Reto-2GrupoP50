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
public class UsuarioPremium extends Usuario {

    private String Nick1;

    public UsuarioPremium() {
    }

    public UsuarioPremium(String Nick1, String Nombre, String Email, String Nick, int Telefono, int Edad, int Codigo) {
        super(Nombre, Email, Nick, Telefono, Edad, Codigo);
        this.Nick1 = Nick1;
    }

    

    String mostrar = "Usuario Premiun:" + "\n" + "Nombre -> " + getNombre() + "\n" + "Email -> " + getEmail() + "\n" + "Edad -> " + getEdad() + "\n" + "Nick -> " + getNick() + "\n";

    @Override
    public void mostrar() {
        System.out.println("Usuario Premiun:");
        System.out.println("Nombre -> " + getNombre());
        System.out.println("Email -> " + getEmail());
        System.out.println("Edad -> " + getEdad());
        System.out.println("Nick -> " + getNick());
    }

    

}
