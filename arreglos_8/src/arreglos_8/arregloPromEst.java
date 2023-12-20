package arreglos_8;

import java.util.Scanner;

public class arregloPromEst {

    public static void main(String[] args) {
        String[] promediosCuali = new String[7];
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez",
            "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        for (int i = 0; i < promediosCuali.length; i++) {
            if (promedios[i] > 9) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo sobresaliente");
            } else if (promedios[i] < 9 && promedios[i] > 6) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo bueno");
            } else if (promedios[i] < 6) {
                System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo regular");
            }

        }
    }
}
