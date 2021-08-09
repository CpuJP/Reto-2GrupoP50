package actividadreto2;

public class UsuarioNormal extends Usuario {

    private int Codigo1;
    public UsuarioNormal() {
    }

    public UsuarioNormal(int Codigo1, String Nombre, String Email, String Nick, int Telefono, int Edad, int Codigo) {
        super(Nombre, Email, Nick, Telefono, Edad, Codigo);
        this.Codigo1 = Codigo1;
    }

    String mostrar = "Usuario Normal:" + "\n" + "Nombre -> " + getNombre() + "\n" + "Email -> " + getEmail() + "\n" + "Edad -> " + getEdad() + "\n" + "Codigo -> " + getCodigo() + "\n";

    @Override
    public void mostrar() {
        System.out.println("Usuario Normal:");
        System.out.println("Nombre -> " + getNombre());
        System.out.println("Email -> " + getEmail());
        System.out.println(" Edad -> " + getEdad());
        System.out.println("Codigo -> " + getCodigo());
    }

    

}
