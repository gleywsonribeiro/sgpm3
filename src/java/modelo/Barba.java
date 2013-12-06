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
public class Barba implements Serializable{
    @Column(name = "barba_cor")
    private String cor;
    @Column(name = "barba_natureza")
    private String natureza;
    @Column(name = "barba_particularidade")
    private String particularidade;

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
}
