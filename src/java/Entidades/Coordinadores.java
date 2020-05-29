/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "coordinadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coordinadores.findAll", query = "SELECT c FROM Coordinadores c")
    , @NamedQuery(name = "Coordinadores.findByIdCoordinador", query = "SELECT c FROM Coordinadores c WHERE c.idCoordinador = :idCoordinador")})
public class Coordinadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Coordinador")
    private Integer idCoordinador;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coordinador", fetch = FetchType.LAZY)
    private List<BitacoraServicioSocial> bitacoraServicioSocialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCoordinador", fetch = FetchType.LAZY)
    private List<Pqrs> pqrsList;

    public Coordinadores() {
    }

    public Coordinadores(Integer idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    public Integer getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(Integer idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<BitacoraServicioSocial> getBitacoraServicioSocialList() {
        return bitacoraServicioSocialList;
    }

    public void setBitacoraServicioSocialList(List<BitacoraServicioSocial> bitacoraServicioSocialList) {
        this.bitacoraServicioSocialList = bitacoraServicioSocialList;
    }

    @XmlTransient
    public List<Pqrs> getPqrsList() {
        return pqrsList;
    }

    public void setPqrsList(List<Pqrs> pqrsList) {
        this.pqrsList = pqrsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCoordinador != null ? idCoordinador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coordinadores)) {
            return false;
        }
        Coordinadores other = (Coordinadores) object;
        if ((this.idCoordinador == null && other.idCoordinador != null) || (this.idCoordinador != null && !this.idCoordinador.equals(other.idCoordinador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Coordinadores[ idCoordinador=" + idCoordinador + " ]";
    }
    
}
