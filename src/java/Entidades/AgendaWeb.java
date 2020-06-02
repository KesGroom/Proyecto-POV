/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kesgr
 */
@Entity
@Table(name = "agenda_web")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgendaWeb.findAll", query = "SELECT a FROM AgendaWeb a")
    , @NamedQuery(name = "AgendaWeb.findByIdAgendaWeb", query = "SELECT a FROM AgendaWeb a WHERE a.idAgendaWeb = :idAgendaWeb")
    , @NamedQuery(name = "AgendaWeb.findByCategoria", query = "SELECT a FROM AgendaWeb a WHERE a.categoria = :categoria")})
public class AgendaWeb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Agenda_Web")
    private Integer idAgendaWeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "Categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne(fetch = FetchType.LAZY)
    private Actividad actividad;
    @JoinColumn(name = "DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteMateria;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id_Estudiante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiante estudiante;
    @JoinColumn(name = "Plan_Mejoramiento", referencedColumnName = "Id_Plan_Mejoramiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanesMejoramiento planMejoramiento;

    public AgendaWeb() {
    }

    public AgendaWeb(Integer idAgendaWeb) {
        this.idAgendaWeb = idAgendaWeb;
    }

    public AgendaWeb(Integer idAgendaWeb, String categoria, String descripcion) {
        this.idAgendaWeb = idAgendaWeb;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public Integer getIdAgendaWeb() {
        return idAgendaWeb;
    }

    public void setIdAgendaWeb(Integer idAgendaWeb) {
        this.idAgendaWeb = idAgendaWeb;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public PlanesMejoramiento getPlanMejoramiento() {
        return planMejoramiento;
    }

    public void setPlanMejoramiento(PlanesMejoramiento planMejoramiento) {
        this.planMejoramiento = planMejoramiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendaWeb != null ? idAgendaWeb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaWeb)) {
            return false;
        }
        AgendaWeb other = (AgendaWeb) object;
        if ((this.idAgendaWeb == null && other.idAgendaWeb != null) || (this.idAgendaWeb != null && !this.idAgendaWeb.equals(other.idAgendaWeb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AgendaWeb[ idAgendaWeb=" + idAgendaWeb + " ]";
    }
    
}
