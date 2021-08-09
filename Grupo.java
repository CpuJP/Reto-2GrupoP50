package actividadreto2;

import java.util.Scanner;

public class Grupo {

    
    UsuarioNormal UN = new UsuarioNormal();
    UsuarioPremium UP = new UsuarioPremium();
    String imprimirS = "";
    String hola = "";
    String Entrada,Entrada2,Entrada3,Entrada4,Entrada5;
    

    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.procesarMenu();
    }

    public void agregarUsuario() {
        Scanner sc = new Scanner(System.in);
        String tipoU;
        String menu [] = Entrada.split(";");
        tipoU = menu[1];
        switch (tipoU) {
            case "Premium":
                try {
                String NombreP, EmailP, Nick;
                int TelefonoP, EdadP;
                NombreP = menu[2];
                TelefonoP = Integer.parseInt(menu[3]);
                EmailP = menu[4];
                EdadP = Integer.parseInt(menu[5]);
                Nick = menu[6];
                //System.out.println(Nick);
                //UP.setNick(Nick);
                UP = new UsuarioPremium(null, NombreP, EmailP, Nick, TelefonoP, EdadP, 0);
                imprimirS += UP.mostrar;
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            case "Normal":
                try {
                String NombreN, EmailN;
                int TelefonoN, EdadN, Codigo;
                NombreN = menu[2];
                TelefonoN = Integer.parseInt(menu[3]);
                EmailN = menu[4];
                EdadN = Integer.parseInt(menu[5]);
                Codigo = Integer.parseInt(menu[6]);
                //System.out.println(Codigo);
                //UN.setCodigo(Codigo);
                UN = new UsuarioNormal(0,NombreN, EmailN, null, TelefonoN, EdadN, Codigo);
                imprimirS += UN.mostrar;
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            default:
                System.out.println("Digite un tipo de usuario válido");
                break;
        }
    }

    public void listarUsuario() {
        hola+="---Usuarios del grupo---";
        hola+="\n";
        hola+=imprimirS;
        
    }

    public void procesarMenu() {
        Scanner sc = new Scanner(System.in);
        try {
            
            int contador = 0;
            Entrada = sc.next();
            String menu [] = Entrada.split(";");
            String menu1 = menu[0];
            
                while (contador != 5) {
                    switch (menu1) {
                        case "1":
                            listarUsuario();
                            Entrada = sc.next();
                            String menu2 [] = Entrada.split(";");
                            menu1 = menu2[0];
                            break;
                        case "2":
                            agregarUsuario();
                            Entrada = sc.next();
                            String menu3 [] = Entrada.split(";");
                            menu1 = menu3[0];
                            break;
                        case "3":
                           
                            System.out.println(hola);
                            menu1 = "3";
                            break;
                        default:
                            System.out.println("Ingrese una opción válida");
                            break;
                    }
                    contador++;
                }
            
        } catch (Exception e) {
        }
    }
}