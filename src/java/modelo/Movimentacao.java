/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
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
public class Movimentacao implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date dataApresentacao;
    
    private String publicacaoApresentacao;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataTransferencia;
    
    private String publicacaoTransferencia;
    
    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Unidade unidade;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataApresentacao() {
        return dataApresentacao;
    }

    public void setDataApresentacao(Date dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

    

    public String getPublicacaoApresentacao() {
        return publicacaoApresentacao;
    }

    public void setPublicacaoApresentacao(String publicacaoApresentacao) {
        this.publicacaoApresentacao = publicacaoApresentacao.toUpperCase();
    }

    public Calendar getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Calendar dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public String getPublicacaoTransferencia() {
        return publicacaoTransferencia;
    }

    public void setPublicacaoTransferencia(String publicacaoTransferencia) {
        this.publicacaoTransferencia = publicacaoTransferencia.toUpperCase();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
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
        if (!(object instanceof Movimentacao)) {
            return false;
        }
        Movimentacao other = (Movimentacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidade.Movimentacao[ id=" + id + " ]";
    }
    
}
