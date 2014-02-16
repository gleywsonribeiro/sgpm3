/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.protocolo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gleywson
 */
@Entity
public class Protocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //private Documento documento;
    private String nomeRemetente;
    private String teor;
    private String Status;
    private int idDestino; //isso aqui vai ser uma chave estrangeira
    private String tipoDestino;
    private String sigilo;
    private String prioridade;
    
    /**
     * Esse arquivo precisa ser analisado com calma
     * Umas das observaçãoes que fiz eh que seja necessario criar
     * uma classe documento.
     * Observar as seguintes classes:
     *  transacao
        tramitacao
        protocolo

     *
     * @return 
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Protocolo)) {
            return false;
        }
        Protocolo other = (Protocolo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.protocolo.Protocolo[ id=" + id + " ]";
    }
    
}
