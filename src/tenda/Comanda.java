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
import java.util.Vector;

class Comanda {

  private Client client;

  private Empleat empleat;

  private Ordenador ordenador;

  private ArrayList<MetodePagament> metodeDePagament;

  private String observacions;

  private String direccióEntrega;

  private integer id;

  private Estat estat;

  private Date dataComanda;

  private Double preu;

    public Vector  myMagatzem;
    public Vector  myOrdenador;
    public Vector  myEmpleat;
    public Vector  myEmpleat;
    public Vector  myEstat;
    public Vector  myClient;
    public Vector  myMetodePagament;

  public void afegirMetodePagament( nom,  informació,  DataPagament,  Import) {
  }

  public void cambiarEstat( Estat) {
  }

    public Client getClient() {
        return client;
    }

    public Empleat getEmpleat() {
        return empleat;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    public ArrayList<MetodePagament> getMetodeDePagament() {
        return metodeDePagament;
    }

    public String getObservacions() {
        return observacions;
    }

    public String getDireccióEntrega() {
        return direccióEntrega;
    }

    public int getId() {
        return id;
    }

    public Estat getEstat() {
        return estat;
    }

    public Date getDataComanda() {
        return dataComanda;
    }

    public Double getPreu() {
        return preu;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEmpleat(Empleat empleat) {
        this.empleat = empleat;
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public void setMetodeDePagament(ArrayList<MetodePagament> metodeDePagament) {
        this.metodeDePagament = metodeDePagament;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public void setDireccióEntrega(String direccióEntrega) {
        this.direccióEntrega = direccióEntrega;
    }

    public void setId(integer id) {
        this.id = id;
    }

    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    public void setDataComanda(Date dataComanda) {
        this.dataComanda = dataComanda;
    }

    public void setPreu(Double preu) {
        this.preu = preu;
    }

    public void setMyOrdenador(Vector myOrdenador) {
        this.myOrdenador = myOrdenador;
    }

}