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
                int matOri[][] = new int[filas][columnas];
                //Creación de matriz dispersa
                matriz.Matri(filas, columnas, matOri);
                System.out.println("****Matriz Original****");
                matriz.imprimirmat(filas, columnas, matOri);
                System.out.println();
                //Matriz original a la lista
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (matOri[i][j] != 0){  
                          matriz.Agregar(matOri[i][j], i, j); 
                        }
                    }
                }
                matriz.listar();
                int mat[][] = new int[filas][columnas];
                //Llevar la lista a una matriz
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        mat[i][j] = matriz.recorrer(i, j, valorm);
                        
                    }
                }
                System.out.println();
                matriz.imprimirmat(filas, columnas, mat);
               
                break;
            case 2:
                ListaSimple matrizc = new ListaSimple();
                ListaDoble matrizD = new ListaDoble();
                int matD[][] = new int[filas][columnas];
                matrizc.Matri(filas, columnas, matD);
                System.out.println("****Matriz Original****");
                System.out.println();
                matrizc.imprimirmat(filas, columnas, matD);
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (matD[i][j] != 0){  
                          matrizD.Agregar(matD[i][j], i, j); 
                        }
                    }
                }
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matD[i][j] = matrizD.recorrer(i, j, valorm);
                    }
                }
                matrizD.listar();
                System.out.println();
                matrizc.imprimirmat(filas, columnas, matD);
                break;
       }
    }

}
