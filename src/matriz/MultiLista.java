package matriz;

public class MultiLista {
    private NodoMulti PTR;
    
    public void MultiLista(){
        PTR = null;
    }
    
    public void Agregar(int valor, int fila, int columna){
        if (PTR == null) {
            NodoMulti newNodo = new NodoMulti();
            newNodo.setValor(valor);
            newNodo.setFila(fila);
            newNodo.setColumna(columna);
            PTR = newNodo;
        }else{
            NodoMulti P = PTR;
            while (P.getLink1() != null){
                P = P.getLink1();
            }
            if (P.getFila() == fila){
                Nodo newNodo = new Nodo();
                newNodo.setValor(valor);
                newNodo.setFila(fila);
                newNodo.setColumna(columna);
                if(P.getLink2() != null){
                    Nodo Q = P.getLink2();
                    while (Q.getLink() != null){
                        Q = Q.getLink();
                    }
                    Q.setLink(newNodo);
                } else{
                    P.setLink2(newNodo);
                }
            } else{
                NodoMulti newNodo = new NodoMulti();
                newNodo.setValor(valor);
                newNodo.setFila(fila);
                newNodo.setColumna(columna);
                P.setLink1(newNodo);
            }
        }     
    }
      
    public void listar(){
        System.out.println("---- MultiLista que representa Matriz dispersa ----" + "\n");
        if (PTR != null) {
            System.out.println("[ fila,columna | valor ]" + "\n");
            NodoMulti Q = PTR;
            while (Q != null){
                System.out.print("[ " + Q.getFila() + "," + Q.getColumna() + "|" + Q.getValor() + " ]" + " --> ");
                Nodo P = Q.getLink2();
                while(P != null){
                    System.out.print("[ " + P.getFila()+"," + P.getColumna() + "|" + P.getValor()+ " ]" + " --> ");
                    P = P.getLink();
                }
                System.out.print("nulo" + "\n");
                System.out.println("   |   ");
                System.out.println("   |   ");
                System.out.println("   V   ");
                Q = Q.getLink1();
            }
            System.out.println("  nulo   " + "\n");
        } else{
            System.out.println("No hay elementos distintos de 0 en la matriz" + "\n");
        }       
    }
    
    public int recorrer(int fila, int columna){
        int valorm = 0, con = 0;
        if (PTR != null) {
            NodoMulti Q = PTR;
            while (Q != null){
                if (Q.getFila() == fila && Q.getColumna() == columna){
                    valorm = Q.getValor();
                    break;
                }
                Nodo P = Q.getLink2();
                while(P != null){
                    if (P.getFila() == fila && P.getColumna() == columna){
                        valorm = P.getValor();
                        con = 1;
                        break;
                    }                    
                    P = P.getLink();
                }
                if(con == 1){
                    break;
                }
                Q = Q.getLink1();
            }
        }
        return valorm;
    }
    
}
