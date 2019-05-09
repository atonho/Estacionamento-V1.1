/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Adriano Zanette
 */
@Entity
@Table(name = "documento", catalog = "samu2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d")
    , @NamedQuery(name = "Documento.findByCodigo", query = "SELECT d FROM Documento d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Documento.findByCadastro", query = "SELECT d FROM Documento d WHERE d.cadastro = :cadastro")
    , @NamedQuery(name = "Documento.findByViatura", query = "SELECT d FROM Documento d WHERE d.viatura = :viatura")
    , @NamedQuery(name = "Documento.findByLotacao", query = "SELECT d FROM Documento d WHERE d.lotacao = :lotacao")
    , @NamedQuery(name = "Documento.findByCnpjLotacao", query = "SELECT d FROM Documento d WHERE d.cnpjLotacao = :cnpjLotacao")
    , @NamedQuery(name = "Documento.findByPlaca", query = "SELECT d FROM Documento d WHERE d.placa = :placa")
    , @NamedQuery(name = "Documento.findByRenavan", query = "SELECT d FROM Documento d WHERE d.renavan = :renavan")
    , @NamedQuery(name = "Documento.findByChassi", query = "SELECT d FROM Documento d WHERE d.chassi = :chassi")
    , @NamedQuery(name = "Documento.findByEspecieTipo", query = "SELECT d FROM Documento d WHERE d.especieTipo = :especieTipo")
    , @NamedQuery(name = "Documento.findByCombustivel", query = "SELECT d FROM Documento d WHERE d.combustivel = :combustivel")
    , @NamedQuery(name = "Documento.findByMarcaModelo", query = "SELECT d FROM Documento d WHERE d.marcaModelo = :marcaModelo")
    , @NamedQuery(name = "Documento.findByAnoFabricacao", query = "SELECT d FROM Documento d WHERE d.anoFabricacao = :anoFabricacao")
    , @NamedQuery(name = "Documento.findByAnoModelo", query = "SELECT d FROM Documento d WHERE d.anoModelo = :anoModelo")
    , @NamedQuery(name = "Documento.findByCap", query = "SELECT d FROM Documento d WHERE d.cap = :cap")
    , @NamedQuery(name = "Documento.findByCategoria", query = "SELECT d FROM Documento d WHERE d.categoria = :categoria")
    , @NamedQuery(name = "Documento.findByCor", query = "SELECT d FROM Documento d WHERE d.cor = :cor")
    , @NamedQuery(name = "Documento.findBySituacaoDocumento", query = "SELECT d FROM Documento d WHERE d.situacaoDocumento = :situacaoDocumento")
    , @NamedQuery(name = "Documento.findByObs", query = "SELECT d FROM Documento d WHERE d.obs = :obs")})
public class Documento implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "cadastro")
    @Temporal(TemporalType.DATE)
    private Date cadastro;
    @Basic(optional = false)
    @Column(name = "viatura")
    private String viatura;
    @Basic(optional = false)
    @Column(name = "lotacao")
    private String lotacao;
    @Basic(optional = false)
    @Column(name = "cnpj_lotacao")
    private String cnpjLotacao;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "renavan")
    private String renavan;
    @Basic(optional = false)
    @Column(name = "chassi")
    private String chassi;
    @Basic(optional = false)
    @Column(name = "especie_tipo")
    private String especieTipo;
    @Basic(optional = false)
    @Column(name = "combustivel")
    private String combustivel;
    @Basic(optional = false)
    @Column(name = "marca_modelo")
    private String marcaModelo;
    @Basic(optional = false)
    @Column(name = "ano_fabricacao")
    private String anoFabricacao;
    @Basic(optional = false)
    @Column(name = "ano_modelo")
    private String anoModelo;
    @Basic(optional = false)
    @Column(name = "cap")
    private String cap;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @Column(name = "situacao_documento")
    private String situacaoDocumento;
    @Basic(optional = false)
    @Column(name = "obs")
    private String obs;

    public Documento() {
    }

    public Documento(Integer codigo) {
        this.codigo = codigo;
    }

    public Documento(Integer codigo, String viatura, String lotacao, String cnpjLotacao, String placa, String renavan, String chassi, String especieTipo, String combustivel, String marcaModelo, String anoFabricacao, String anoModelo, String cap, String categoria, String cor, String situacaoDocumento, String obs) {
        this.codigo = codigo;
        this.viatura = viatura;
        this.lotacao = lotacao;
        this.cnpjLotacao = cnpjLotacao;
        this.placa = placa;
        this.renavan = renavan;
        this.chassi = chassi;
        this.especieTipo = especieTipo;
        this.combustivel = combustivel;
        this.marcaModelo = marcaModelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cap = cap;
        this.categoria = categoria;
        this.cor = cor;
        this.situacaoDocumento = situacaoDocumento;
        this.obs = obs;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        Date oldCadastro = this.cadastro;
        this.cadastro = cadastro;
        changeSupport.firePropertyChange("cadastro", oldCadastro, cadastro);
    }

    public String getViatura() {
        return viatura;
    }

    public void setViatura(String viatura) {
        String oldViatura = this.viatura;
        this.viatura = viatura;
        changeSupport.firePropertyChange("viatura", oldViatura, viatura);
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        String oldLotacao = this.lotacao;
        this.lotacao = lotacao;
        changeSupport.firePropertyChange("lotacao", oldLotacao, lotacao);
    }

    public String getCnpjLotacao() {
        return cnpjLotacao;
    }

    public void setCnpjLotacao(String cnpjLotacao) {
        String oldCnpjLotacao = this.cnpjLotacao;
        this.cnpjLotacao = cnpjLotacao;
        changeSupport.firePropertyChange("cnpjLotacao", oldCnpjLotacao, cnpjLotacao);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String oldPlaca = this.placa;
        this.placa = placa;
        changeSupport.firePropertyChange("placa", oldPlaca, placa);
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        String oldRenavan = this.renavan;
        this.renavan = renavan;
        changeSupport.firePropertyChange("renavan", oldRenavan, renavan);
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        String oldChassi = this.chassi;
        this.chassi = chassi;
        changeSupport.firePropertyChange("chassi", oldChassi, chassi);
    }

    public String getEspecieTipo() {
        return especieTipo;
    }

    public void setEspecieTipo(String especieTipo) {
        String oldEspecieTipo = this.especieTipo;
        this.especieTipo = especieTipo;
        changeSupport.firePropertyChange("especieTipo", oldEspecieTipo, especieTipo);
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        String oldCombustivel = this.combustivel;
        this.combustivel = combustivel;
        changeSupport.firePropertyChange("combustivel", oldCombustivel, combustivel);
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        String oldMarcaModelo = this.marcaModelo;
        this.marcaModelo = marcaModelo;
        changeSupport.firePropertyChange("marcaModelo", oldMarcaModelo, marcaModelo);
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        String oldAnoFabricacao = this.anoFabricacao;
        this.anoFabricacao = anoFabricacao;
        changeSupport.firePropertyChange("anoFabricacao", oldAnoFabricacao, anoFabricacao);
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        String oldAnoModelo = this.anoModelo;
        this.anoModelo = anoModelo;
        changeSupport.firePropertyChange("anoModelo", oldAnoModelo, anoModelo);
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        String oldCap = this.cap;
        this.cap = cap;
        changeSupport.firePropertyChange("cap", oldCap, cap);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        String oldCor = this.cor;
        this.cor = cor;
        changeSupport.firePropertyChange("cor", oldCor, cor);
    }

    public String getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(String situacaoDocumento) {
        String oldSituacaoDocumento = this.situacaoDocumento;
        this.situacaoDocumento = situacaoDocumento;
        changeSupport.firePropertyChange("situacaoDocumento", oldSituacaoDocumento, situacaoDocumento);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telas.Documento[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
