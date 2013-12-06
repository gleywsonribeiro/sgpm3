/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gleywson
 */
@Entity
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    //@Lob @Basic(fetch = FetchType.EAGER)
    //private String foto;
    
    private String nomeDeGuerra;
    private String nomePai;
    private String nomeMae;
    private String pisPasep;
    
    //v.civil, civil ou militar
    private String tipo;
    private String sexo;
    private String matricula;
    private String rgMilitar;
    private String rgCivil;
    private Float altura;
    private String boca;
    private String cutis;
    private String nariz;
    private String rosto;
    private int vestuario;
    private int calcado;
    private int cobertura;
    private String habilidadeProfissional;
    private String habilidadeEsportiva;
    
    //Composicao
    private Cabelo cabelo;
    private Barba barba;
    private Bigode bigode;
    private Olho olho;
    private TituloEleitor tituloEleitor;
    private Habilitacao habilitacao;
    private InformacaoBancaria informacaoBancaria;
        
    //referencias
    @ManyToOne
    private Unidade unidade;
    @ManyToOne
    private SituacaoFuncional situacaoFuncional;
    @ManyToOne
    private Escolaridade escolaridade;
    @ManyToOne
    private Sangue sangue;
    @ManyToOne
    private EstadoCivil estadoCivil;
    @ManyToOne
    private Moradia moradia;
    @ManyToOne
    private Religiao religiao;
    
    //um para um - agregacao
    @OneToOne
    private Graduacao graduacao;
    @OneToOne
    private Contato contato;
    @OneToOne
    private Endereco endereco;
    
    @OneToOne(mappedBy = "pessoa")
    private Usuario usuario;
    
    //Colecoes
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Punicao> punicoes = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<DispensaLicenca> dispensasLicencas = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Movimentacao> movimentacoes = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Atribuicao> atribuicoes = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Internacao> internacoes = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Curso> cursos = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Deslocamento> deslocamentos = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Dependente> dependentes = new ArrayList<>();
    
    @OneToMany(mappedBy = "pessoa",fetch = FetchType.EAGER)
    private List<Promocao> promocoes = new ArrayList<>();

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    public String getFoto() {
//        return foto;
//    }
//
//    public void setFoto(String foto) {
//        this.foto = foto;
//    }


    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra.toUpperCase();
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai.toUpperCase();
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae.toUpperCase();
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep.toUpperCase();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toUpperCase();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRgMilitar() {
        return rgMilitar;
    }

    public void setRgMilitar(String rgMilitar) {
        this.rgMilitar = rgMilitar;
    }

    public String getRgCivil() {
        return rgCivil;
    }

    public void setRgCivil(String rgCivil) {
        this.rgCivil = rgCivil;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca.toUpperCase();
    }

    public String getCutis() {
        return cutis;
    }

    public void setCutis(String cutis) {
        this.cutis = cutis.toUpperCase();
    }

    public String getNariz() {
        return nariz;
    }

    public void setNariz(String nariz) {
        this.nariz = nariz.toUpperCase();
    }

    public String getRosto() {
        return rosto;
    }

    public void setRosto(String rosto) {
        this.rosto = rosto.toUpperCase();
    }

    public int getVestuario() {
        return vestuario;
    }

    public void setVestuario(int vestuario) {
        this.vestuario = vestuario;
    }

    public int getCalcado() {
        return calcado;
    }

    public void setCalcado(int calcado) {
        this.calcado = calcado;
    }

    public int getCobertura() {
        return cobertura;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    public String getHabilidadeProfissional() {
        return habilidadeProfissional;
    }

    public void setHabilidadeProfissional(String habilidadeProfissional) {
        this.habilidadeProfissional = habilidadeProfissional.toUpperCase();
    }

    public String getHabilidadeEsportiva() {
        return habilidadeEsportiva;
    }

    public void setHabilidadeEsportiva(String habilidadeEsportiva) {
        this.habilidadeEsportiva = habilidadeEsportiva.toUpperCase();
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public Barba getBarba() {
        return barba;
    }

    public void setBarba(Barba barba) {
        this.barba = barba;
    }

    public Bigode getBigode() {
        return bigode;
    }

    public void setBigode(Bigode bigode) {
        this.bigode = bigode;
    }

    public Olho getOlho() {
        return olho;
    }

    public void setOlho(Olho olho) {
        this.olho = olho;
    }

    public TituloEleitor getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(TituloEleitor tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacao habilitacao) {
        this.habilitacao = habilitacao;
    }

    public InformacaoBancaria getInformacaoBancaria() {
        return informacaoBancaria;
    }

    public void setInformacaoBancaria(InformacaoBancaria informacaoBancaria) {
        this.informacaoBancaria = informacaoBancaria;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public SituacaoFuncional getSituacaoFuncional() {
        return situacaoFuncional;
    }

    public void setSituacaoFuncional(SituacaoFuncional situacaoFuncional) {
        this.situacaoFuncional = situacaoFuncional;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Sangue getSangue() {
        return sangue;
    }

    public void setSangue(Sangue sangue) {
        this.sangue = sangue;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Moradia getMoradia() {
        return moradia;
    }

    public void setMoradia(Moradia moradia) {
        this.moradia = moradia;
    }

    public Religiao getReligiao() {
        return religiao;
    }

    public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

    public Graduacao getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(Graduacao graduacao) {
        this.graduacao = graduacao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Punicao> getPunicoes() {
        return punicoes;
    }

    public void setPunicoes(List<Punicao> punicoes) {
        this.punicoes = punicoes;
    }

    public List<DispensaLicenca> getDispensasLicencas() {
        return dispensasLicencas;
    }

    public void setDispensasLicencas(List<DispensaLicenca> dispensasLicencas) {
        this.dispensasLicencas = dispensasLicencas;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public List<Atribuicao> getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(List<Atribuicao> atribuicoes) {
        this.atribuicoes = atribuicoes;
    }

    public List<Internacao> getInternacoes() {
        return internacoes;
    }

    public void setInternacoes(List<Internacao> internacoes) {
        this.internacoes = internacoes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Deslocamento> getDeslocamentos() {
        return deslocamentos;
    }

    public void setDeslocamentos(List<Deslocamento> deslocamentos) {
        this.deslocamentos = deslocamentos;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public List<Promocao> getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(List<Promocao> promocoes) {
        this.promocoes = promocoes;
    }
}
