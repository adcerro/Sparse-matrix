package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int filas, columnas, valor, valorm = 0, opcion = 0;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¿De que tamaño desea su matriz?");
        System.out.println("Inserte el número de filas: ");
        filas = leer.nextInt();
        System.out.println("Inserte el número de columnas: ");
        columnas = leer.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.println("Seleccione tipo de lista que contendrá a la matriz");
            System.out.println("1. Lista simple");
            System.out.println("2. Lista doblemente enlazada");
            System.out.println("3. Multilista");
            opcion = leer.nextInt();
        }

        switch (opcion) {
            case 1:
                ListaSimple matriz = new ListaSimple();
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        valor = random.nextInt(11);
                        if (valor % 2 == 0 || valor % 3 == 0) {
                            valor = 0;
                        }
                        matriz.Agregar(valor, i, j);
                    }
                }
                matriz.listar();

                int mat[][] = new int[filas][columnas];

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        mat[i][j] = matriz.recorrer(i, j, valorm);
                    }
                }
                System.out.println();

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(mat[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                ListaDoble matrizD = new ListaDoble();
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        valor = random.nextInt(11);
                        if (valor % 2 == 0 || valor % 3 == 0) {
                            valor = 0;
                        }
                        matrizD.Agregar(valor, i, j);
                    }
                }
                matrizD.listar();

                int matD[][] = new int[filas][columnas];

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matD[i][j] = matrizD.recorrer(i, j, valorm);
                    }
                }
                System.out.println();

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matD[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }

}
