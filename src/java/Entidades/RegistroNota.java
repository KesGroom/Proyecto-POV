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
 * @author jusag
 */
@Entity
@Table(name = "registro_notas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroNota.findAll", query = "SELECT r FROM RegistroNota r WHERE r.estado = 1")
    , @NamedQuery(name = "RegistroNota.findByIdRegistroNotas", query = "SELECT r FROM RegistroNota r WHERE r.idRegistroNotas = :idRegistroNotas")
    , @NamedQuery(name = "RegistroNota.findByCalificacion", query = "SELECT r FROM RegistroNota r WHERE r.calificacion = :calificacion")
    , @NamedQuery(name = "RegistroNota.findByEstado", query = "SELECT r FROM RegistroNota r WHERE r.estado = :estado")})
public class RegistroNota implements Serializable {

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
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Actividad", referencedColumnName = "Id_Actividad")
    @ManyToOne(fetch = FetchType.LAZY)
    private Actividad actividad;
    @JoinColumn(name = "Plan_Mejoramiento", referencedColumnName = "Id_Plan_Mejoramiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanMejoramiento planMejoramiento;
    @JoinColumn(name = "DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteMateria;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id_Estudiante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estudiante estudiante;
    @JoinColumn(name = "Periodo", referencedColumnName = "Id_Periodo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Periodo periodo;

    public RegistroNota() {
    }

    public RegistroNota(Integer idRegistroNotas) {
        this.idRegistroNotas = idRegistroNotas;
    }

    public RegistroNota(Integer idRegistroNotas, double calificacion) {
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public PlanMejoramiento getPlanMejoramiento() {
        return planMejoramiento;
    }

    public void setPlanMejoramiento(PlanMejoramiento planMejoramiento) {
        this.planMejoramiento = planMejoramiento;
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

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
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
        if (!(object instanceof RegistroNota)) {
            return false;
        }
        RegistroNota other = (RegistroNota) object;
        if ((this.idRegistroNotas == null && other.idRegistroNotas != null) || (this.idRegistroNotas != null && !this.idRegistroNotas.equals(other.idRegistroNotas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RegistroNota[ idRegistroNotas=" + idRegistroNotas + " ]";
    }
    
}
