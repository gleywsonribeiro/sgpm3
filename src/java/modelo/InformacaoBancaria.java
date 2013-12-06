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
public class InformacaoBancaria implements Serializable{
    private String banco;
    private String agencia;
    private String conta;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco.toUpperCase();
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
    
}
