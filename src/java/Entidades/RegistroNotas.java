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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "registro_notas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroNotas.findAll", query = "SELECT r FROM RegistroNotas r")
    , @NamedQuery(name = "RegistroNotas.findByIdRegistroNotas", query = "SELECT r FROM RegistroNotas r WHERE r.idRegistroNotas = :idRegistroNotas")
    , @NamedQuery(name = "RegistroNotas.findByCalificacion", query = "SELECT r FROM RegistroNotas r WHERE r.calificacion = :calificacion")})
public class RegistroNotas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Registro_Notas")
    private Integer idRegistroNotas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Calificacion")
    private double calificacion;
    @JoinColumn(name = "Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne(fetch = FetchType.LAZY)
    private Actividades actividad;
    @JoinColumn(name = "Plan_Mejoramiento", referencedColumnName = "Id_Plan_Mejoramiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanesMejoramiento planMejoramiento;
    @JoinColumn(name = "DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteMateria;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id_Estudiante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiantes estudiante;
    @JoinColumn(name = "Periodo", referencedColumnName = "Id_Periodo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Periodos periodo;

    public RegistroNotas() {
    }

    public RegistroNotas(Integer idRegistroNotas) {
        this.idRegistroNotas = idRegistroNotas;
    }

    public RegistroNotas(Integer idRegistroNotas, double calificacion) {
        this.idRegistroNotas = idRegistroNotas;
        this.calificacion = calificacion;
    }

    public Integer getIdRegistroNotas() {
        return idRegistroNotas;
    }

    public void setIdRegistroNotas(Integer idRegistroNotas) {
        this.idRegistroNotas = idRegistroNotas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Actividades getActividad() {
        return actividad;
    }

    public void setActividad(Actividades actividad) {
        this.actividad = actividad;
    }

    public PlanesMejoramiento getPlanMejoramiento() {
        return planMejoramiento;
    }

    public void setPlanMejoramiento(PlanesMejoramiento planMejoramiento) {
        this.planMejoramiento = planMejoramiento;
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
        hash += (idRegistroNotas != null ? idRegistroNotas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroNotas)) {
            return false;
        }
        RegistroNotas other = (RegistroNotas) object;
        if ((this.idRegistroNotas == null && other.idRegistroNotas != null) || (this.idRegistroNotas != null && !this.idRegistroNotas.equals(other.idRegistroNotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegistroNotas[ idRegistroNotas=" + idRegistroNotas + " ]";
    }
    
}
