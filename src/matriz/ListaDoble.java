package matriz;

public class ListaDoble {
    private NodoDoble PTR;

    public void ListaDoble(){
        PTR = null;
    }

    public void Agregar(int valor, int fila, int columna){
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
    }
      
    public void listar(){
        System.out.println("---- Lista Doble que representa Matriz dispersa ----" + "\n");
        if (PTR != null) {
            System.out.println("[ fila,columna | valor ]" + "\n");
            NodoDoble Q = PTR;
            while(Q != null){
                if(Q.getRlink() != null){
                    System.out.print("[ " + Q.getFila() + "," + Q.getColumna() + "|" + Q.getValor() + " ]" + " <->  ");
                } else{
                    System.out.print("[ " + Q.getFila() + "," + Q.getColumna() + "|" + Q.getValor() + " ]" + " --> nulo");
                }
                Q = Q.getRlink();
            }
            System.out.println("\n");
        } else{
            System.out.println("No hay elementos distintos de 0 en la matriz" + "\n");
        }      
    }
    
    public int recorrer(int fila, int columna){
        int valorm = 0;
        if (PTR != null) {
            NodoDoble Q = PTR;
            while(Q != null){
                if (Q.getFila() == fila && Q.getColumna() == columna){
                    valorm = Q.getValor();
                }
                Q = Q.getRlink();
            }
        }
        return valorm;
    }
    
}

