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
 * @author JSAntiago
 */
@Entity
@Table(name = "registro_asistencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroAsistencia.findAll", query = "SELECT r FROM RegistroAsistencia r")
    , @NamedQuery(name = "RegistroAsistencia.findByIdRegistroAsistencia", query = "SELECT r FROM RegistroAsistencia r WHERE r.idRegistroAsistencia = :idRegistroAsistencia")
    , @NamedQuery(name = "RegistroAsistencia.findByFecha", query = "SELECT r FROM RegistroAsistencia r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "RegistroAsistencia.findByAsistencia", query = "SELECT r FROM RegistroAsistencia r WHERE r.asistencia = :asistencia")})
public class RegistroAsistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Registro_Asistencia")
    private Integer idRegistroAsistencia;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Tema_Trabajado")
    private String temaTrabajado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Asistencia")
    private short asistencia;
    @Lob
    @Size(max = 65535)
    @Column(name = "Observaciones")
    private String observaciones;
    @JoinColumn(name = "DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteMateria;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id_Estudiante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiantes estudiante;
    @JoinColumn(name = "Periodo", referencedColumnName = "Id_Periodo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Periodos periodo;

    public RegistroAsistencia() {
    }

    public RegistroAsistencia(Integer idRegistroAsistencia) {
        this.idRegistroAsistencia = idRegistroAsistencia;
    }

    public RegistroAsistencia(Integer idRegistroAsistencia, String temaTrabajado, Date fecha, short asistencia) {
        this.idRegistroAsistencia = idRegistroAsistencia;
        this.temaTrabajado = temaTrabajado;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    public Integer getIdRegistroAsistencia() {
        return idRegistroAsistencia;
    }

    public void setIdRegistroAsistencia(Integer idRegistroAsistencia) {
        this.idRegistroAsistencia = idRegistroAsistencia;
    }

    public String getTemaTrabajado() {
        return temaTrabajado;
    }

    public void setTemaTrabajado(String temaTrabajado) {
        this.temaTrabajado = temaTrabajado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public short getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(short asistencia) {
        this.asistencia = asistencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Periodos getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodos periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroAsistencia != null ? idRegistroAsistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAsistencia)) {
            return false;
        }
        RegistroAsistencia other = (RegistroAsistencia) object;
        if ((this.idRegistroAsistencia == null && other.idRegistroAsistencia != null) || (this.idRegistroAsistencia != null && !this.idRegistroAsistencia.equals(other.idRegistroAsistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegistroAsistencia[ idRegistroAsistencia=" + idRegistroAsistencia + " ]";
    }
    
}
