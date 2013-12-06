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
public class Deslocamento implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date dataSeguimento;
    
    @Temporal(TemporalType.DATE)
    private Date dataRegresso;
    
    private String localidade;
    private String carater;
    private String publicacao;
    @ManyToOne
    private Pessoa pessoa;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataSeguimento() {
        return dataSeguimento;
    }

    public void setDataSeguimento(Date dataSeguimento) {
        this.dataSeguimento = dataSeguimento;
    }

    public Date getDataRegresso() {
        return dataRegresso;
    }

    public void setDataRegresso(Date dataRegresso) {
        this.dataRegresso = dataRegresso;
    }

   

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade.toUpperCase();
    }

    public String getCarater() {
        return carater;
    }

    public void setCarater(String carater) {
        this.carater = carater.toUpperCase();
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao.toUpperCase();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        if (!(object instanceof Deslocamento)) {
            return false;
        }
        Deslocamento other = (Deslocamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidade.Deslocamento[ id=" + id + " ]";
    }
    
}
