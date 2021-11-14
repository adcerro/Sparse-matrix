
package matriz;

public class NodoDoble {
    private int fila,columna;
    private int valor;
    private NodoDoble Llink, Rlink;

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
        this.Llink = null;
        this.Rlink = null;
    }

    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public NodoDoble getLlink() {
        return Llink;
    }

    public void setLlink(NodoDoble link) {
        this.Llink = link;
    }   
    public NodoDoble getRlink() {
        return Rlink;
    }

    public void setRlink(NodoDoble link) {
        this.Rlink = link;
    }   
}
