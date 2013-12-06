/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Gleywson
 */
@Embeddable
public class Cabelo implements Serializable {
    @Column(name = "cabelo_cor")
    private String cor;
    @Column(name = "cabelo_natureza")
    private String natureza;
    @Column(name = "cabelo_particularidade")
    private String particularidade;
    private boolean calvo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor.toUpperCase();
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza.toUpperCase();
    }

    public String getParticularidade() {
        return particularidade;
    }

    public void setParticularidade(String particularidade) {
        this.particularidade = particularidade.toUpperCase();
    }

    public boolean isCalvo() {
        return calvo;
    }

    public void setCalvo(boolean calvo) {
        this.calvo = calvo;
    }
    
}
