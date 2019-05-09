/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Adriano Zanette
 */
public class ModeloUsuario {
    
    private int    codigo;
    private String nome;
    private String usuario;
    private String senha;
    private String nivel;
    private String codigoStatus;
    private String descStatus;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCodigoStatus() {
        return codigoStatus;
    }

    public void setCodigoStatus(String codigoStatus) {
        this.codigoStatus = codigoStatus;
    }

    public String getDescStatus() {
        return descStatus;
    }

    public void setDescStatus(String descStatus) {
        this.descStatus = descStatus;
    }
 
    
     
    
}
