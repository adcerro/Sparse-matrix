package matriz;

public class NodoDoble {
    private int fila;
    private int columna;
    private int valor;
    private NodoDoble Llink;
    private NodoDoble Rlink;
    
    public void NodoDoble(){
        valor = 0;
        fila = 0;
        columna = 0;
        Llink = null;
        Rlink = null;
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
