package matriz;

public class ListaSimple {
    
    private Nodo PTR;

    private int tamaño;

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
    public void EliminarCola(int cantidad){
        for(int i=0; i<cantidad; i++){
            Nodo p = new Nodo();
            p = PTR;
            PTR = p.getLink();
            p.setLink(null);
            p = null;
        }
        tamaño--;
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
