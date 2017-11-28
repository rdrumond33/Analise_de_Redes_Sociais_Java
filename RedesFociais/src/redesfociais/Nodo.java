package redesfociais;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Nodo {

    private Vertice v;
    private Nodo next;

    public Nodo(Vertice s, Nodo n) {
        this.v = s;
        this.next = n;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Vertice getV() {
        return v;
    }

    public void setVtc(Vertice v) {
        this.v = v;
    }

}
