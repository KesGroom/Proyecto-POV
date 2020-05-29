/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "periodos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodos.findAll", query = "SELECT p FROM Periodos p")
    , @NamedQuery(name = "Periodos.findByIdPeriodo", query = "SELECT p FROM Periodos p WHERE p.idPeriodo = :idPeriodo")
    , @NamedQuery(name = "Periodos.findByNumeroPeriodo", query = "SELECT p FROM Periodos p WHERE p.numeroPeriodo = :numeroPeriodo")
    , @NamedQuery(name = "Periodos.findByFechaInicio", query = "SELECT p FROM Periodos p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Periodos.findByFechaFinal", query = "SELECT p FROM Periodos p WHERE p.fechaFinal = :fechaFinal")})
public class Periodos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Periodo")
    private Integer idPeriodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Numero_Periodo")
    private int numeroPeriodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodo", fetch = FetchType.LAZY)
    private List<RegistroNotas> registroNotasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodo", fetch = FetchType.LAZY)
    private List<RegistroAsistencia> registroAsistenciaList;

    public Periodos() {
    }

    public Periodos(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Periodos(Integer idPeriodo, int numeroPeriodo, Date fechaInicio, Date fechaFinal) {
        this.idPeriodo = idPeriodo;
        this.numeroPeriodo = numeroPeriodo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getNumeroPeriodo() {
        return numeroPeriodo;
    }

    public void setNumeroPeriodo(int numeroPeriodo) {
        this.numeroPeriodo = numeroPeriodo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @XmlTransient
    public List<RegistroNotas> getRegistroNotasList() {
        return registroNotasList;
    }

    public void setRegistroNotasList(List<RegistroNotas> registroNotasList) {
        this.registroNotasList = registroNotasList;
    }

    @XmlTransient
    public List<RegistroAsistencia> getRegistroAsistenciaList() {
        return registroAsistenciaList;
    }

    public void setRegistroAsistenciaList(List<RegistroAsistencia> registroAsistenciaList) {
        this.registroAsistenciaList = registroAsistenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodos)) {
            return false;
        }
        Periodos other = (Periodos) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Periodos[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
