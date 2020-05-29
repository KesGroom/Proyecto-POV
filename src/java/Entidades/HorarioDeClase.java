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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "horario_de_clase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HorarioDeClase.findAll", query = "SELECT h FROM HorarioDeClase h")
    , @NamedQuery(name = "HorarioDeClase.findByIdHorarioClase", query = "SELECT h FROM HorarioDeClase h WHERE h.idHorarioClase = :idHorarioClase")
    , @NamedQuery(name = "HorarioDeClase.findByDia", query = "SELECT h FROM HorarioDeClase h WHERE h.dia = :dia")
    , @NamedQuery(name = "HorarioDeClase.findByHoraInicio", query = "SELECT h FROM HorarioDeClase h WHERE h.horaInicio = :horaInicio")
    , @NamedQuery(name = "HorarioDeClase.findByHoraFinal", query = "SELECT h FROM HorarioDeClase h WHERE h.horaFinal = :horaFinal")})
public class HorarioDeClase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_HorarioClase")
    private Integer idHorarioClase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "Dia")
    private String dia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora_Inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora_Final")
    @Temporal(TemporalType.TIME)
    private Date horaFinal;
    @JoinColumn(name = "DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria docenteMateria;
    @JoinColumn(name = "DocenteCurso", referencedColumnName = "Id_DocCur")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CursoDocente docenteCurso;

    public HorarioDeClase() {
    }

    public HorarioDeClase(Integer idHorarioClase) {
        this.idHorarioClase = idHorarioClase;
    }

    public HorarioDeClase(Integer idHorarioClase, String dia, Date horaInicio, Date horaFinal) {
        this.idHorarioClase = idHorarioClase;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Integer getIdHorarioClase() {
        return idHorarioClase;
    }

    public void setIdHorarioClase(Integer idHorarioClase) {
        this.idHorarioClase = idHorarioClase;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public DocenteMateria getDocenteMateria() {
        return docenteMateria;
    }

    public void setDocenteMateria(DocenteMateria docenteMateria) {
        this.docenteMateria = docenteMateria;
    }

    public CursoDocente getDocenteCurso() {
        return docenteCurso;
    }

    public void setDocenteCurso(CursoDocente docenteCurso) {
        this.docenteCurso = docenteCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorarioClase != null ? idHorarioClase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorarioDeClase)) {
            return false;
        }
        HorarioDeClase other = (HorarioDeClase) object;
        if ((this.idHorarioClase == null && other.idHorarioClase != null) || (this.idHorarioClase != null && !this.idHorarioClase.equals(other.idHorarioClase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.HorarioDeClase[ idHorarioClase=" + idHorarioClase + " ]";
    }
    
}
