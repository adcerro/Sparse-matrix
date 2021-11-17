package matriz;

public class NodoMulti {
    private int fila;
    private int columna;
    private int valor;
    private NodoMulti Link1;
    private Nodo Link2;
    
    public void NodoMulti(){
        valor = 0;
        fila = 0;
        columna = 0;
        Link1 = null;
        Link2 = null;
    }
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public NodoMulti getLink1() {
        return Link1;
    }

    public void setLink1(NodoMulti Link1) {
        this.Link1 = Link1;
    }   
    
    public Nodo getLink2() {
        return Link2;
    }

    public void setLink2(Nodo Link2) {
        this.Link2 = Link2;
    }  
    
}
