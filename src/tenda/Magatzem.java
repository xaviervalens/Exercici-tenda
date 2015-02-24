/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenda;

import java.util.ArrayList;

/**
 *
 * @author Joan
 */
class Magatzem {

  private ArrayList<Comanda> comandes;

  private ArrayList<Empleat> empleats;

  private coaComandes<Comanda> comandesPendents;

  private ArrayList<ordenador> models;

  private ArrayList<Client> clients;

  public void afegirAEmpleats( Empleat) {
  }

  public void afegirAComandes( Comanda) {
  }

  public void afegirAModels( Ordinador) {
  }

  public void afegirAClients( Client) {
  }

  public void assignarComanda( Comanda) {
  }

  public Ordenador cercarModel( id) {
  return null;
  }

  public Ordenador ordenarModels( nom) {
  return null;
  }

  public Ordenador ordenarModelsPreus( preu) {
  return null;
  }

    public ArrayList<Comanda> getComandes() {
        return comandes;
    }

    public ArrayList<Empleat> getEmpleats() {
        return empleats;
    }

    public <any> getComandesPendents() {
        return comandesPendents;
    }

    public ArrayList<ordenador> getModels() {
        return models;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setComandes(ArrayList<Comanda> comandes) {
        this.comandes = comandes;
    }

    public void setEmpleats(ArrayList<Empleat> empleats) {
        this.empleats = empleats;
    }

    public void setComandesPendents(<any> comandesPendents) {
        this.comandesPendents = comandesPendents;
    }

    public void setModels(ArrayList<ordenador> models) {
        this.models = models;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
 
  
}