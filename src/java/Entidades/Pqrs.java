/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusag
 */
@Entity
@Table(name = "pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqrs.findAll", query = "SELECT p FROM Pqrs p WHERE p.estado = 1")
    , @NamedQuery(name = "Pqrs.findByIdPQRS", query = "SELECT p FROM Pqrs p WHERE p.idPQRS = :idPQRS")
    , @NamedQuery(name = "Pqrs.findByTipo", query = "SELECT p FROM Pqrs p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "Pqrs.findByFecha", query = "SELECT p FROM Pqrs p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Pqrs.findByEstado", query = "SELECT p FROM Pqrs p WHERE p.estado = :estado")})
public class Pqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_PQRS")
    private Integer idPQRS;
    @Size(max = 11)
    @Column(name = "Tipo")
    private String tipo;
    @Lob
    @Size(max = 65535)
    @Column(name = "Asunto")
    private String asunto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Lob
    @Size(max = 65535)
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Id_Acudiente", referencedColumnName = "Id_Acudiente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Acudiente idAcudiente;
    @JoinColumn(name = "Id_Coordinador", referencedColumnName = "Id_Coordinador")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Coordinador idCoordinador;

    public Pqrs() {
    }

    public Pqrs(Integer idPQRS) {
        this.idPQRS = idPQRS;
    }

    public Pqrs(Integer idPQRS, Date fecha) {
        this.idPQRS = idPQRS;
        this.fecha = fecha;
    }

    public Integer getIdPQRS() {
        return idPQRS;
    }

    public void setIdPQRS(Integer idPQRS) {
        this.idPQRS = idPQRS;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Acudiente getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(Acudiente idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public Coordinador getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(Coordinador idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPQRS != null ? idPQRS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqrs)) {
            return false;
        }
        Pqrs other = (Pqrs) object;
        if ((this.idPQRS == null && other.idPQRS != null) || (this.idPQRS != null && !this.idPQRS.equals(other.idPQRS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Pqrs[ idPQRS=" + idPQRS + " ]";
    }
    
}
