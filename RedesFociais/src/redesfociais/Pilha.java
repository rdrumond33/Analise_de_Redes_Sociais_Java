
package redesfociais;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Pilha {

    protected Nodo topo;
    protected int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    void Empilha(Vertice v) {
        Nodo n = new Nodo(v, this.topo);
        this.topo = n;
        this.tamanho++;
    }

    public Vertice Desempilha() {
        Nodo aux = this.topo;
        this.topo = this.topo.getNext();
        this.tamanho--;
        return aux.getV();
    }

    boolean isEmpty() {
        return topo == null;
    }

    public int Tamanho() {
        return this.tamanho;
    }

    public Vertice Topo() {
        return this.topo.getV();
    }

}
