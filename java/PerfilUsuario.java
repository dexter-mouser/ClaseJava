import java.util.Scanner;

public class PerfilUsuario {
    public static void main(String[] args) {
        System.out.println("PerfilUsuario");
        Scanner Leer = new Scanner (System.in);
        String nombre, rol, nivelAcceso;

        System.out.println("Ingresar Nombre");
        nombre = Leer.next();
        System.out.println("Ingresar Rol");
        rol = Leer.next();
        System.out.println("Ingresar Nivel de Acceso");
        nivelAcceso = Leer.next();
        Leer.close();
    }
}