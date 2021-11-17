package matriz;

public class ListaSimple {
    private Nodo PTR;
    

    public void ListaSimple(){
        PTR = null;
    }

    public void Agregar(int valor, int fila, int columna){
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
    }
 
    public void listar(){
        System.out.println("---- Lista Simple que representa Matriz dispersa ----" + "\n");
        if (PTR != null) {
            System.out.println("[ fila,columna | valor ]" + "\n");
            Nodo Q = PTR;
            while(Q != null){
                System.out.print("[ " + Q.getFila() + "," + Q.getColumna() + "|" + Q.getValor() + " ]" + " --> ");
                Q = Q.getLink();
            }
            System.out.println("nulo" + "\n");
        } else{
            System.out.println("No hay elementos distintos de 0 en la matriz" + "\n");
        }       
    }
    
    public int recorrer(int fila, int columna){
        int valorm = 0;
        if (PTR != null) {
            Nodo Q = PTR;
            while(Q != null){
                if (Q.getFila() == fila && Q.getColumna() == columna){
                    valorm = Q.getValor();
                    break;
                }
                Q = Q.getLink();
            }
        }
        return valorm;
    } 
    
}
