package Redes_sociais;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Vertice implements Comparable<Vertice>{

    private String ID;
    private Integer peso;
    private ArrayList<Vertice> listaAdjacentes;
    private String estaados;
    
     public Vertice(String ID, Integer peso) {
        this.ID = ID;
        this.peso = peso;
        this.listaAdjacentes = new ArrayList<Vertice>();
        this.estaados="branca";
    }

    
    
    public void addAdjacentes(Vertice n) {
        this.listaAdjacentes.add(n);

    }

    public void removeAdjacentes(Vertice n) {
        this.listaAdjacentes.add(n);

    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the peso
     */
    public Integer getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /**
     * @return the listaAdjacentes
     */
    public ArrayList<Vertice> getListaAdjacentes() {
        return listaAdjacentes;
    }

    /**
     * @param listaAdjacentes the listaAdjacentes to set
     */
    public void setListaAdjacentes(ArrayList<Vertice> listaAdjacentes) {
        this.listaAdjacentes = listaAdjacentes;
    }

    @Override
    public int compareTo(Vertice t) {
        if (this.peso<t.getPeso()) {
            return 1;
        }else if(this.peso>t.getPeso()){
            
             return -1;
            
        }
     
         return 0;
        
    }

    /**
     * @return the estaados
     */
    public String getEstaados() {
        return estaados;
    }

    /**
     * @param estaados the estaados to set
     */
    public void setEstaados(String estaados) {
        this.estaados = estaados;
    }
     
}
