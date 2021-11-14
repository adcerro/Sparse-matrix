
package matriz;


public class Nodo {

    private int fila,columna;
    private int valor;
    private Nodo link;

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

    public void Nodo(){
        this.valor = 0;
        this.fila = 0;
        this.columna = 0;
        this.link = null;
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
