
package matriz;

public class ListaDoble {
      private NodoDoble PTR;

    private int tamaño;

    public void Lista(){
        PTR = null;
        tamaño = 0;
    }

    public int getTamaño(){
        return tamaño;
    }

    public void Agregar(int valor,int fila, int columna){
        NodoDoble newnodo = new NodoDoble();
        newnodo.setValor(valor);
        newnodo.setFila(fila);
        newnodo.setColumna(columna);
        if (PTR == null) {
            PTR = newnodo;
        }else{
            NodoDoble Q = PTR;
            while (Q.getRlink() != null){
                Q = Q.getRlink();
            }
            Q.setRlink(newnodo);
            newnodo.setLlink(Q);
        }
        tamaño++;
    }
    
    
    
    public void listar(){
        System.out.print("[ fila,columna | valor ]");
        System.out.println("\n");
        if (PTR != null) {
            NodoDoble Q = PTR;
            while(Q != null){
                System.out.print("[ "+Q.getFila()+","+Q.getColumna()+"|"+Q.getValor()+ " ]" + " <->  ");
                Q = Q.getRlink();
            }
        }
        System.out.println("fin de la matriz");
        
    }
    public int recorrer(int fila, int columna,int valorm){
        if (PTR != null) {
            NodoDoble Q = PTR;
            while(Q != null){
                if (Q.getFila()==fila && Q.getColumna()==columna){
                    valorm = Q.getValor();
                }
                Q = Q.getRlink();
            }
        }
        return valorm;
    }
}

