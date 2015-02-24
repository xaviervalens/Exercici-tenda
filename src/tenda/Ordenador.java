/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenda;

/**
 *
 * @author Joan
 */
import java.util.Vector;

class Ordenador {

  private String model;

  private String observacions;

  private int id;

  private double preu;

    public Vector  myMagatzem;
    public Vector  myComanda;

    public String getModel() {
        return model;
    }

    public String getObservacions() {
        return observacions;
    }

    public double getPreu() {
        return preu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }


}
