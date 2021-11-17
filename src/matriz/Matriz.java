package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    static Random random = new Random();

    public static void main(String[] args) {
        int filas, columnas, opcion = 0, sw = 1;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("¿De que tamaño desea su matriz?");
            do{
                System.out.println("Inserte el número de filas: ");
                filas = leer.nextInt();
            } while (filas <= 0);
            do{
                System.out.println("Inserte el número de columnas: ");
                columnas = leer.nextInt();
            } while (columnas <= 0);
            do{
                System.out.println("Seleccione tipo de lista que contendrá a la matriz");
                System.out.println("1. Lista simple");
                System.out.println("2. Lista doblemente enlazada");
                System.out.println("3. Multilista");
                opcion = leer.nextInt();
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    ListaSimple listaS = new ListaSimple();
                    int matrizS[][] = new int[filas][columnas];
                    //Creación de matriz dispersa
                    Matriz.crearMatriz(filas, columnas, matrizS);
                    System.out.println("---- Matriz Original ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizS);
                    //Matriz original a la lista
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (matrizS[i][j] != 0){  
                              listaS.Agregar(matrizS[i][j], i, j); 
                            }
                        }
                    }
                    listaS.listar();
                    int matrizRS[][] = new int[filas][columnas];
                    //Llevar la lista a una matriz
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matrizRS[i][j] = listaS.recorrer(i, j);
                        }
                    }
                    System.out.println("---- Matriz Generada a partir de Lista ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizRS);         
                    break;
                case 2:
                    ListaDoble listaD = new ListaDoble();
                    int matrizD[][] = new int[filas][columnas];
                    Matriz.crearMatriz(filas, columnas, matrizD);
                    System.out.println("---- Matriz Original ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizD);
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (matrizD[i][j] != 0){  
                              listaD.Agregar(matrizD[i][j], i, j); 
                            }
                        }
                    }
                    listaD.listar();
                    int matrizRD[][] = new int [filas][columnas];
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matrizRD[i][j] = listaD.recorrer(i, j);
                        }
                    }
                    System.out.println("---- Matriz Generada a partir de Lista ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizRD);
                    break;
                case 3:
                    MultiLista multiL = new MultiLista();
                    int matrizM[][] = new int [filas][columnas];
                    Matriz.crearMatriz(filas, columnas, matrizM);
                    System.out.println("---- Matriz Original ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizM);
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (matrizM[i][j] != 0){  
                              multiL.Agregar(matrizM[i][j], i, j); 
                            }
                        }
                    }
                    multiL.listar();
                    int matrizRM[][] = new int [filas][columnas];
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            matrizRM[i][j] = multiL.recorrer(i, j);
                        }
                    }
                    System.out.println("---- Matriz Generada a partir de Lista ----"+"\n");
                    Matriz.imprimirMatriz(filas, columnas, matrizRM);     
                    break;
           }
            do{
                System.out.println("¿Quieres probar con otra matriz? 1. Si 0. No");
                sw = leer.nextInt();
            } while (sw > 1 || sw < 0);
        } while (sw == 1);
    }
    
    public static void imprimirMatriz(int filas, int columnas, int[][]matriz){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static int[][] crearMatriz(int filas, int columnas, int[][]matriz){
        int valor,conta;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                valor = random.nextInt(100);
                conta = random.nextInt(2);
                if (conta == 0){
                    matriz[i][j] = 0;
                }else{
                    matriz[i][j] = valor;  
                }
            }
        }
        Verifica(filas,columnas,matriz);
        return matriz;
    }
    
     public static int[][] Verifica(int filas, int columnas, int[][]matriz){
        int conta = 0, conta2;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j]!=0){
                    conta += 1;
                }
                if (j == columnas-1 && conta>=columnas/2){
                    j=0;
                    for (int k = 0; k < columnas; k++) {
                        conta2 = random.nextInt(2);
                        if (conta2 == 0 && matriz[i][k] != 0){                           
                            matriz[i][k] = 0;
                        } 
                    }
                    conta = 0;
                }
            }
        }
        return matriz;
    }
}
