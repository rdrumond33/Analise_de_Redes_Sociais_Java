/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesfociais;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Aresta {

    private Integer peso;
    private String ID;
    private Vertice v1, v2;
    private boolean orientada;

    public Aresta(Vertice v1, Vertice v2, Integer peso, String ID, boolean orientada) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = peso;
        this.ID = ID;
        this.orientada = this.orientada;

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
     * @return the v1
     */
    public Vertice getV1() {
        return v1;
    }

    /**
     * @param v1 the v1 to set
     */
    public void setV1(Vertice v1) {
        this.v1 = v1;
    }

    /**
     * @return the v2
     */
    public Vertice getV2() {
        return v2;
    }

    /**
     * @param v2 the v2 to set
     */
    public void setV2(Vertice v2) {
        this.v2 = v2;
    }

    /**
     * @return the orientada
     */
    public boolean isOrientada() {
        return orientada;
    }

    /**
     * @param orientada the orientada to set
     */
    public void setOrientada(boolean orientada) {
        this.orientada = orientada;
    }





}
