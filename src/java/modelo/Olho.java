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
public class Olho implements Serializable{
    @Column(name = "olho_cor")
    private String cor;
    @Column(name = "olho_natureza")
    private String natureza;

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
}
