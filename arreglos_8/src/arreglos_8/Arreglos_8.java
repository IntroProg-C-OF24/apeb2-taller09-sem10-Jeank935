package arreglos_8;

import java.util.Scanner;

public class Arreglos_8 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese cuantas marcas de vehiculo desea ingresar:");
        int limMarcas = tcl.nextInt();
        String[] marcas = new String[limMarcas];
        for (int i = 0; i < limMarcas; i++) {
            System.out.println("Ingrese el nombre de la marca: " + (i + 1));
            marcas[i] = tcl.next();

            if (marcas[i].startsWith("C") || marcas[i].startsWith("A") || marcas[i].startsWith("T")) {
                System.out.println("==NO SE ACEPTAN MARCAS QUE INICIEN CON C, A, O T==");
                i--;
            }
        }
    }

}
