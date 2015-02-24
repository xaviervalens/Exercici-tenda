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
import java.util.ArrayList;

class Empleat {

  private int id;

  private ArrayList<Comanda> comandesAturades;

  private ArrayList<Comanda> comandesRealitzades;

  private Comanda comandaActiva;

  private boolean actiu;

  public void aturarComanda() {
  }

  public void historialComandes(Comanda) {
  }

  public ArrayList<Comanda> mostrarAturades() {
  return null;
  }

  public Empleat mostrarEmpleat(id) {
  return null;
  }

    public int getId() {
        return id;
    }

    public ArrayList<Comanda> getComandesAturades() {
        return comandesAturades;
    }

    public ArrayList<Comanda> getComandesRealitzades() {
        return comandesRealitzades;
    }

    public Comanda getComandaActiva() {
        return comandaActiva;
    }

    public boolean isActiu() {
        return actiu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComandesAturades(ArrayList<Comanda> comandesAturades) {
        this.comandesAturades = comandesAturades;
    }

    public void setComandesRealitzades(ArrayList<Comanda> comandesRealitzades) {
        this.comandesRealitzades = comandesRealitzades;
    }

    public void setComandaActiva(Comanda comandaActiva) {
        this.comandaActiva = comandaActiva;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    
  

}