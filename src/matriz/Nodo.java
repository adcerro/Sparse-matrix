package matriz;

public class Nodo {
    private int fila;
    private int columna;
    private int valor;
    private Nodo link;
    
    public void Nodo(){
        valor = 0;
        fila = 0;
        columna = 0;
        link = null;
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
    
    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }   
    
}
