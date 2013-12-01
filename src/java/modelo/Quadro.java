/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Gleywson
 */
@Entity
public class Quadro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tpQuadro;
    
    @OneToMany(mappedBy = "quadro", fetch = FetchType.EAGER)
    private List<Graduacao> graduacoes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTpQuadro() {
        return tpQuadro;
    }

    public void setTpQuadro(String tpQuadro) {
        this.tpQuadro = tpQuadro.toUpperCase();
    }

    public List<Graduacao> getGraduacoes() {
        return graduacoes;
    }

    public void setGraduacoes(List<Graduacao> graduacoes) {
        this.graduacoes = graduacoes;
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
        if (!(object instanceof Quadro)) {
            return false;
        }
        Quadro other = (Quadro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Quadro[ id=" + id + " ]";
    }
    
}
