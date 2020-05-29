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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kesgr
 */
@Entity
@Table(name = "bitacora_servicio_social")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BitacoraServicioSocial.findAll", query = "SELECT b FROM BitacoraServicioSocial b")
    , @NamedQuery(name = "BitacoraServicioSocial.findByIdBitacoraServicio", query = "SELECT b FROM BitacoraServicioSocial b WHERE b.idBitacoraServicio = :idBitacoraServicio")
    , @NamedQuery(name = "BitacoraServicioSocial.findByFechaRegistro", query = "SELECT b FROM BitacoraServicioSocial b WHERE b.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "BitacoraServicioSocial.findByTiempoPrestado", query = "SELECT b FROM BitacoraServicioSocial b WHERE b.tiempoPrestado = :tiempoPrestado")})
public class BitacoraServicioSocial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Bitacora_Servicio")
    private Integer idBitacoraServicio;
    @Column(name = "Fecha_Registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "Tiempo_Prestado")
    private Integer tiempoPrestado;
    @Lob
    @Size(max = 65535)
    @Column(name = "Observaciones")
    private String observaciones;
    @Lob
    @Size(max = 65535)
    @Column(name = "Labores_Realizadas")
    private String laboresRealizadas;
    @JoinColumn(name = "Coordinador", referencedColumnName = "Id_Coordinador")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Coordinador coordinador;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id_Estudiante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiante estudiante;
    @JoinColumn(name = "Zona_de_Servicio", referencedColumnName = "Id_ZonaSS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ZonaServicioSocial zonadeServicio;

    public BitacoraServicioSocial() {
    }

    public BitacoraServicioSocial(Integer idBitacoraServicio) {
        this.idBitacoraServicio = idBitacoraServicio;
    }

    public Integer getIdBitacoraServicio() {
        return idBitacoraServicio;
    }

    public void setIdBitacoraServicio(Integer idBitacoraServicio) {
        this.idBitacoraServicio = idBitacoraServicio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getTiempoPrestado() {
        return tiempoPrestado;
    }

    public void setTiempoPrestado(Integer tiempoPrestado) {
        this.tiempoPrestado = tiempoPrestado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLaboresRealizadas() {
        return laboresRealizadas;
    }

    public void setLaboresRealizadas(String laboresRealizadas) {
        this.laboresRealizadas = laboresRealizadas;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ZonaServicioSocial getZonadeServicio() {
        return zonadeServicio;
    }

    public void setZonadeServicio(ZonaServicioSocial zonadeServicio) {
        this.zonadeServicio = zonadeServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBitacoraServicio != null ? idBitacoraServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BitacoraServicioSocial)) {
            return false;
        }
        BitacoraServicioSocial other = (BitacoraServicioSocial) object;
        if ((this.idBitacoraServicio == null && other.idBitacoraServicio != null) || (this.idBitacoraServicio != null && !this.idBitacoraServicio.equals(other.idBitacoraServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.BitacoraServicioSocial[ idBitacoraServicio=" + idBitacoraServicio + " ]";
    }
    
}
