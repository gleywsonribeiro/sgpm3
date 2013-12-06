/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Gleywson
 */
@Embeddable
public class Habilitacao implements Serializable{
    private String numeroHabilitacao;
    private String categoria;

    public String getNumeroHabilitacao() {
        return numeroHabilitacao;
    }

    public void setNumeroHabilitacao(String numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao.toUpperCase();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
    }
    
    
}
