package redesfociais;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Grafo {

    private ArrayList<Vertice> V;
    private ArrayList<Aresta> E;
    Pilha P;

    public Grafo() {
        this.V = new ArrayList<>();
        this.E = new ArrayList<>();

    }

    public Vertice BuscarVertice(String ID) {
        for (Vertice v : this.getV()) {
            if (v.getID().equals(ID)) {
                return v;
            }
        }
        return null;

    }

    public void addVertice(String ID, Integer peso) {
        this.getV().add(new Vertice(ID, peso));

    }

    public void addAresta(Integer peso, String ID, String idv1, String idv2, boolean orientada) {
        //buscar o Vertice V1;
        Vertice v1 = BuscarVertice(idv1);

        Vertice v2 = BuscarVertice(idv2);

        this.getE().add(new Aresta(v1, v2, peso, ID, orientada));

        if (orientada) {
            v1.addAdjacentes(v2);

        } else {
            v1.addAdjacentes(v2);
            v2.addAdjacentes(v1);

        }

    }

    public void Busca() {

        for (Vertice V : this.getV()) {
            V.setEstaados("branca");

        }

        for (Vertice V : this.getV()) {

            if (V.getEstaados().equals("branca")) {
                this.Busca_prof(V);
            }

        }

    }

    public void Busca_prof(Vertice V) {
        P = new Pilha();
        V.setEstaados("cinza");
        P.Empilha(V);

        for (int k = 0; k < V.getListaAdjacentes().size(); k++) {
            if (V.getListaAdjacentes().get(k).getEstaados().equalsIgnoreCase("branca")) {
                visitar(V, V.getListaAdjacentes().get(k));
                Busca_prof(V.getListaAdjacentes().get(k));

            } else {
                V = P.Desempilha();
                V.setEstaados("preto");
            }
        }

    }

    void visitar(Vertice V, Vertice W) {
        V.setPeso(V.getPeso() + 1);
        W.setEstaados("cinza");

    }

    public void Ordenar() {
        Collections.sort(this.V);

    }

    public void acrecentarpeso() {
        for (Vertice vertice : getV()) {
            vertice.setPeso(vertice.getListaAdjacentes().size());//Como o ja tenho q quantidade dem meu arry de adjacencia pegue o Size que e meu peso e acrecentei nos ids

        }

    }

    public void printGraph() {
        System.out.println("Lista de Vertices: ");

        for (Vertice V : getV()) {
            System.out.println("\n ID: " + V.getID() + " Grau: " + V.getPeso());

        }

    }

    /**
     * @return the V
     */
    public ArrayList<Vertice> getV() {
        return V;
    }

    /**
     * @param V the V to set
     */
    public void setV(ArrayList<Vertice> V) {
        this.V = V;
    }

    /**
     * @return the E
     */
    public ArrayList<Aresta> getE() {
        return E;
    }

    /**
     * @param E the E to set
     */
    public void setE(ArrayList<Aresta> E) {
        this.E = E;
    }

}
