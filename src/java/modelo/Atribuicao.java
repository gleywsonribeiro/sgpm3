/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gleywson
 */
@Entity
public class Atribuicao implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataDaAtribuicao;
    private String publicacao;
    //
    @ManyToOne
    private Pessoa pessoa;
    @ManyToOne
    private TipoAtribuicao tipoAtribuicao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoAtribuicao getTipoAtribuicao() {
        return tipoAtribuicao;
    }

    public void setTipoAtribuicao(TipoAtribuicao tipoAtribuicao) {
        this.tipoAtribuicao = tipoAtribuicao;
    }

    public Date getDataDaAtribuicao() {
        return dataDaAtribuicao;
    }

    public void setDataDaAtribuicao(Date dataDaAtribuicao) {
        this.dataDaAtribuicao = dataDaAtribuicao;
    }

    

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao.toUpperCase();
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
        if (!(object instanceof Atribuicao)) {
            return false;
        }
        Atribuicao other = (Atribuicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidade.Atribuicao[ id=" + id + " ]";
    }
    
}
