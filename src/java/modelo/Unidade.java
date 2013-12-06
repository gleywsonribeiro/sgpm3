/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gleywson
 */
@Entity
public class Unidade implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String sigla;
    
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    
    @Temporal(TemporalType.DATE)
    private Date dataExtincao;
    
    private String historico;
    
    @OneToOne
    private Endereco endereco;
    @OneToOne
    private  Contato contato;
    
    //colecoes
    @OneToMany(mappedBy = "unidade")
    private List<Pessoa> pessoas = new ArrayList<>();
    @OneToMany(mappedBy = "unidade")
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    
    //composicao
    private InformacaoTecnica informacaoTecnica;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla.toUpperCase();
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataExtincao() {
        return dataExtincao;
    }

    public void setDataExtincao(Date dataExtincao) {
        this.dataExtincao = dataExtincao;
    }

   
    public String getHistorico() {
        return historico;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setHistorico(String historico) {
        this.historico = historico.toUpperCase();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    
    
    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public InformacaoTecnica getInformacaoTecnica() {
        return informacaoTecnica;
    }

    public void setInformacaoTecnica(InformacaoTecnica informacaoTecnica) {
        this.informacaoTecnica = informacaoTecnica;
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
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidade.Unidade[ id=" + id + " ]";
    }
    
}
