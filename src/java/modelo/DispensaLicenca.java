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
public class DispensaLicenca implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date dataConcessao;
    private int duracao;
    private String natureza;
    
    @Temporal(TemporalType.DATE)
    private Date dataApresentacao;
    private String publicacao;
    
    @Temporal(TemporalType.DATE)
    private Date dataSustacao;
    private String publicacaoSustacao;
    private String publicacaoDireito;
    @ManyToOne
    private Pessoa pessoa;
    
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Date getDataConcessao() {
        return dataConcessao;
    }

    public void setDataConcessao(Date dataConcessao) {
        this.dataConcessao = dataConcessao;
    }

    public Date getDataApresentacao() {
        return dataApresentacao;
    }

    public void setDataApresentacao(Date dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

    public Date getDataSustacao() {
        return dataSustacao;
    }

    public void setDataSustacao(Date dataSustacao) {
        this.dataSustacao = dataSustacao;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza.toUpperCase();
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao.toUpperCase();
    }

    public String getPublicacaoSustacao() {
        return publicacaoSustacao;
    }

    public void setPublicacaoSustacao(String publicacaoSustacao) {
        this.publicacaoSustacao = publicacaoSustacao.toUpperCase();
    }

    public String getPublicacaoDireito() {
        return publicacaoDireito;
    }

    public void setPublicacaoDireito(String publicacaoDireito) {
        this.publicacaoDireito = publicacaoDireito.toUpperCase();
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
        if (!(object instanceof DispensaLicenca)) {
            return false;
        }
        DispensaLicenca other = (DispensaLicenca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidade.DispensaLicenca[ id=" + id + " ]";
    }
    
}
