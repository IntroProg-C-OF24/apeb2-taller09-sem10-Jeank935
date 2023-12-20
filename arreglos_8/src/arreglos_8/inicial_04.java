package arreglos_8;

import java.util.Scanner;

public class inicial_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine().toUpperCase();
            for (String estudiante : estudiantes) {
                if (estudiante.toUpperCase().startsWith(inicial)) {
                    System.out.println("Se encontró algo: Gracias");
                    bandera = false;
                    break;
                }
            }
        }
    }
}
