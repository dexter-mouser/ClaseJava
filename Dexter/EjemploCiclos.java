import java.util.Scanner;

public class EjemploCiclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        boolean opcion = true;
    
        while (opcion) {
            System.out.println("Ingresa la edad");
            edad = leer.nextInt();

            System.out.println("¿Quieres salir? Si o No");
            String continuar = leer.next();
            if (continuar.equalsIgnoreCase(continuar)){
                opcion = false;
            }
        }
    }
}
