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
public class InformacaoTecnica implements Serializable {
    private String linhaTelefonica;
    private String centralTelefonica;
    private String redeLogicaSf;
    private String redeLogicaCf;
    private String internet;
    private String conexao;
    private int velocidadeConexao;
    private String ipWan;
    private String servidorRemoto;
    private String ipServidor;
    private String dominio;
    private int computadores;
    private int notebooks;
    private int impressoras;
    private String sistemaOperacional;

    public String getLinhaTelefonica() {
        return linhaTelefonica;
    }

    public void setLinhaTelefonica(String linhaTelefonica) {
        this.linhaTelefonica = linhaTelefonica.toUpperCase();
    }

    public String getCentralTelefonica() {
        return centralTelefonica;
    }

    public void setCentralTelefonica(String centralTelefonica) {
        this.centralTelefonica = centralTelefonica.toUpperCase();
    }

    public String getRedeLogicaSf() {
        return redeLogicaSf;
    }

    public void setRedeLogicaSf(String redeLogicaSf) {
        this.redeLogicaSf = redeLogicaSf.toUpperCase();
    }

    public String getRedeLogicaCf() {
        return redeLogicaCf;
    }

    public void setRedeLogicaCf(String redeLogicaCf) {
        this.redeLogicaCf = redeLogicaCf.toUpperCase();
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet.toUpperCase();
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao.toUpperCase();
    }

    public int getVelocidadeConexao() {
        return velocidadeConexao;
    }

    public void setVelocidadeConexao(int velocidadeConexao) {
        this.velocidadeConexao = velocidadeConexao;
    }

    public String getIpWan() {
        return ipWan;
    }

    public void setIpWan(String ipWan) {
        this.ipWan = ipWan.toUpperCase();
    }

    public String getServidorRemoto() {
        return servidorRemoto;
    }

    public void setServidorRemoto(String servidorRemoto) {
        this.servidorRemoto = servidorRemoto.toUpperCase();
    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor.toUpperCase();
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio.toUpperCase();
    }

    public int getComputadores() {
        return computadores;
    }

    public void setComputadores(int computadores) {
        this.computadores = computadores;
    }

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public int getImpressoras() {
        return impressoras;
    }

    public void setImpressoras(int impressoras) {
        this.impressoras = impressoras;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional.toUpperCase();
    }
    
    
    
}
