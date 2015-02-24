/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extern;

/**
 *
 * @author Joan
 */
import java.util.Date;
import java.util.Vector;

class MetodePagament {

  private String nom;

  private String informació;

  private Date dataPagament;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setInformació(String informació) {
        this.informació = informació;
    }

    public void setDataPagament(Date dataPagament) {
        this.dataPagament = dataPagament;
    }

    public String getInformació() {
        return informació;
    }

    public Date getDataPagament() {
        return dataPagament;
    }

 

}
