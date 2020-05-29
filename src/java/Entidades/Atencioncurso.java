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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "atencioncurso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atencioncurso.findAll", query = "SELECT a FROM Atencioncurso a")
    , @NamedQuery(name = "Atencioncurso.findByIdAtencionCurso", query = "SELECT a FROM Atencioncurso a WHERE a.idAtencionCurso = :idAtencionCurso")
    , @NamedQuery(name = "Atencioncurso.findByDiaSemana", query = "SELECT a FROM Atencioncurso a WHERE a.diaSemana = :diaSemana")
    , @NamedQuery(name = "Atencioncurso.findByHoraInicioAtencion", query = "SELECT a FROM Atencioncurso a WHERE a.horaInicioAtencion = :horaInicioAtencion")
    , @NamedQuery(name = "Atencioncurso.findByHoraFinalAtencion", query = "SELECT a FROM Atencioncurso a WHERE a.horaFinalAtencion = :horaFinalAtencion")})
public class Atencioncurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_AtencionCurso")
    private Integer idAtencionCurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diaSemana")
    private int diaSemana;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaInicioAtencion")
    @Temporal(TemporalType.TIME)
    private Date horaInicioAtencion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaFinalAtencion")
    @Temporal(TemporalType.TIME)
    private Date horaFinalAtencion;
    @JoinColumn(name = "Curso", referencedColumnName = "Id_Curso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cursos curso;
    @JoinColumn(name = "DocenteACargo", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docentes docenteACargo;

    public Atencioncurso() {
    }

    public Atencioncurso(Integer idAtencionCurso) {
        this.idAtencionCurso = idAtencionCurso;
    }

    public Atencioncurso(Integer idAtencionCurso, int diaSemana, Date horaInicioAtencion, Date horaFinalAtencion) {
        this.idAtencionCurso = idAtencionCurso;
        this.diaSemana = diaSemana;
        this.horaInicioAtencion = horaInicioAtencion;
        this.horaFinalAtencion = horaFinalAtencion;
    }

    public Integer getIdAtencionCurso() {
        return idAtencionCurso;
    }

    public void setIdAtencionCurso(Integer idAtencionCurso) {
        this.idAtencionCurso = idAtencionCurso;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getHoraInicioAtencion() {
        return horaInicioAtencion;
    }

    public void setHoraInicioAtencion(Date horaInicioAtencion) {
        this.horaInicioAtencion = horaInicioAtencion;
    }

    public Date getHoraFinalAtencion() {
        return horaFinalAtencion;
    }

    public void setHoraFinalAtencion(Date horaFinalAtencion) {
        this.horaFinalAtencion = horaFinalAtencion;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public Docentes getDocenteACargo() {
        return docenteACargo;
    }

    public void setDocenteACargo(Docentes docenteACargo) {
        this.docenteACargo = docenteACargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtencionCurso != null ? idAtencionCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atencioncurso)) {
            return false;
        }
        Atencioncurso other = (Atencioncurso) object;
        if ((this.idAtencionCurso == null && other.idAtencionCurso != null) || (this.idAtencionCurso != null && !this.idAtencionCurso.equals(other.idAtencionCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Atencioncurso[ idAtencionCurso=" + idAtencionCurso + " ]";
    }
    
}
