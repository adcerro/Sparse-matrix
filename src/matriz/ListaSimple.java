package matriz;

import java.util.Random;

public class ListaSimple {
    
    private Nodo PTR;

    private int tamaño;
    
    Random random = new Random();

    public void Lista(){
        PTR = null;
        tamaño = 0;
    }

    public int getTamaño(){
        return tamaño;
    }

    public void Agregar(int valor,int fila, int columna){
        Nodo newnodo = new Nodo();
        newnodo.setValor(valor);
        newnodo.setFila(fila);
        newnodo.setColumna(columna);
        if (PTR == null) {
            PTR = newnodo;
        }else{
            Nodo Q = PTR;
            while (Q.getLink() != null){
                Q = Q.getLink();
            }
            Q.setLink(newnodo);

        }
        tamaño++;
    }
    
    public int[][] Matri(int filas,int columnas,int[][]matri){
        int valor,conta;
        for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    valor = random.nextInt(100);
                    conta = random.nextInt(2);
                    if (conta == 0){
                        matri[i][j] = 0;
                    }else{
                      matri[i][j] = valor;  
                    }
                }
        }
        Verifica(filas,columnas,matri);
        return matri;
    }
    
    public int[][] Verifica(int filas,int columnas,int[][]matri){
        int valor,conta=0,conta2;
        for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matri[i][j]!=0){
                        conta += 1;
                    }
                    if (j == columnas-1 && conta>=columnas/2){
                        j=0;
                        for (int k = 0; k < columnas; k++) {
                          conta2 = random.nextInt(2);
                          if (conta2 == 0 && matri[i][k] != 0){
                            matri[i][k] = 0;
                          } 
                        }
                        conta = 0;
                    }
                }
        }
        return matri;
    }
    
    public void imprimirmat(int filas,int columnas,int[][]matri){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matri[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    
    public void listar(){
        System.out.print("[ fila,columna | valor ]");
        System.out.println("\n");
        if (PTR != null) {
            Nodo Q = PTR;
            while(Q != null){
                System.out.print("[ "+Q.getFila()+","+Q.getColumna()+"|" + Q.getValor() + " ]" + " ->  ");
                Q = Q.getLink();
            }
        }
        System.out.println("fin de la matriz");
        
    }
    public int recorrer(int fila, int columna,int valorm){
        if (PTR != null) {
            Nodo Q = PTR;
            while(Q != null){
                if (Q.getFila()==fila && Q.getColumna()==columna){
                    valorm = Q.getValor();

                }
                Q = Q.getLink();
            }
        }
        return valorm;
    }
   
    
   
}
