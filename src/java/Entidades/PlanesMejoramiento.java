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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusag
 */
@Entity
@Table(name = "planes_mejoramiento")
@XmlRootElement
@NamedQueries({
<<<<<<< HEAD:src/java/Entidades/PlanesMejoramiento.java
    @NamedQuery(name = "PlanesMejoramiento.findAll", query = "SELECT p FROM PlanesMejoramiento p")
    , @NamedQuery(name = "PlanesMejoramiento.findByIdPlanMejoramiento", query = "SELECT p FROM PlanesMejoramiento p WHERE p.idPlanMejoramiento = :idPlanMejoramiento")
    , @NamedQuery(name = "PlanesMejoramiento.findByFechaAsignacion", query = "SELECT p FROM PlanesMejoramiento p WHERE p.fechaAsignacion = :fechaAsignacion")
    , @NamedQuery(name = "PlanesMejoramiento.findByFechaEntrega", query = "SELECT p FROM PlanesMejoramiento p WHERE p.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "PlanesMejoramiento.findByRecursos", query = "SELECT p FROM PlanesMejoramiento p WHERE p.recursos = :recursos")})
public class PlanesMejoramiento implements Serializable {
=======
    @NamedQuery(name = "PlanMejoramiento.findAll", query = "SELECT p FROM PlanMejoramiento p WHERE p.estado = 1")
    , @NamedQuery(name = "PlanMejoramiento.findByIdPlanMejoramiento", query = "SELECT p FROM PlanMejoramiento p WHERE p.idPlanMejoramiento = :idPlanMejoramiento")
    , @NamedQuery(name = "PlanMejoramiento.findByFechaAsignacion", query = "SELECT p FROM PlanMejoramiento p WHERE p.fechaAsignacion = :fechaAsignacion")
    , @NamedQuery(name = "PlanMejoramiento.findByFechaEntrega", query = "SELECT p FROM PlanMejoramiento p WHERE p.fechaEntrega = :fechaEntrega")
    , @NamedQuery(name = "PlanMejoramiento.findByRecursos", query = "SELECT p FROM PlanMejoramiento p WHERE p.recursos = :recursos")
    , @NamedQuery(name = "PlanMejoramiento.findByEstado", query = "SELECT p FROM PlanMejoramiento p WHERE p.estado = :estado")})
public class PlanMejoramiento implements Serializable {
>>>>>>> 29c006b257c9ac6ede6135119a6c1ff6fedcc0bf:src/java/Entidades/PlanMejoramiento.java

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Plan_Mejoramiento")
    private Integer idPlanMejoramiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Asignacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Size(max = 150)
    @Column(name = "Recursos")
    private String recursos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(mappedBy = "planMejoramiento", fetch = FetchType.LAZY)
    private List<RegistroNota> registroNotaList;
    @OneToMany(mappedBy = "planMejoramiento", fetch = FetchType.LAZY)
    private List<AgendaWeb> agendaWebList;
    @JoinColumn(name = "Docente_Asigna", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteAsigna;

    public PlanesMejoramiento() {
    }

    public PlanesMejoramiento(Integer idPlanMejoramiento) {
        this.idPlanMejoramiento = idPlanMejoramiento;
    }

    public PlanesMejoramiento(Integer idPlanMejoramiento, Date fechaAsignacion, Date fechaEntrega, String descripcion) {
        this.idPlanMejoramiento = idPlanMejoramiento;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }

    public Integer getIdPlanMejoramiento() {
        return idPlanMejoramiento;
    }

    public void setIdPlanMejoramiento(Integer idPlanMejoramiento) {
        this.idPlanMejoramiento = idPlanMejoramiento;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<RegistroNota> getRegistroNotaList() {
        return registroNotaList;
    }

    public void setRegistroNotaList(List<RegistroNota> registroNotaList) {
        this.registroNotaList = registroNotaList;
    }

    @XmlTransient
    public List<AgendaWeb> getAgendaWebList() {
        return agendaWebList;
    }

    public void setAgendaWebList(List<AgendaWeb> agendaWebList) {
        this.agendaWebList = agendaWebList;
    }

    public DocenteMateria getDocenteAsigna() {
        return docenteAsigna;
    }

    public void setDocenteAsigna(DocenteMateria docenteAsigna) {
        this.docenteAsigna = docenteAsigna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanMejoramiento != null ? idPlanMejoramiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanesMejoramiento)) {
            return false;
        }
        PlanesMejoramiento other = (PlanesMejoramiento) object;
        if ((this.idPlanMejoramiento == null && other.idPlanMejoramiento != null) || (this.idPlanMejoramiento != null && !this.idPlanMejoramiento.equals(other.idPlanMejoramiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PlanesMejoramiento[ idPlanMejoramiento=" + idPlanMejoramiento + " ]";
    }
    
}
