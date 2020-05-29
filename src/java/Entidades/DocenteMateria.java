/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JSAntiago
 */
@Entity
@Table(name = "docente_materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocenteMateria.findAll", query = "SELECT d FROM DocenteMateria d")
    , @NamedQuery(name = "DocenteMateria.findByIdDocMat", query = "SELECT d FROM DocenteMateria d WHERE d.idDocMat = :idDocMat")})
public class DocenteMateria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_DocMat")
    private Integer idDocMat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocenteMateria", fetch = FetchType.LAZY)
    private List<Actividades> actividadesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteMateria", fetch = FetchType.LAZY)
    private List<RegistroNotas> registroNotasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteMateria", fetch = FetchType.LAZY)
    private List<RegistroAsistencia> registroAsistenciaList;
    @JoinColumn(name = "Id_Docente", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docentes idDocente;
    @JoinColumn(name = "Id_Materia", referencedColumnName = "Id_Materia")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materias idMateria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteMateria", fetch = FetchType.LAZY)
    private List<AgendaWeb> agendaWebList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteMateria", fetch = FetchType.LAZY)
    private List<HorarioDeClase> horarioDeClaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteAsigna", fetch = FetchType.LAZY)
    private List<PlanesMejoramiento> planesMejoramientoList;

    public DocenteMateria() {
    }

    public DocenteMateria(Integer idDocMat) {
        this.idDocMat = idDocMat;
    }

    public Integer getIdDocMat() {
        return idDocMat;
    }

    public void setIdDocMat(Integer idDocMat) {
        this.idDocMat = idDocMat;
    }

    @XmlTransient
    public List<Actividades> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<Actividades> actividadesList) {
        this.actividadesList = actividadesList;
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

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
        this.idDocente = idDocente;
    }

    public Materias getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materias idMateria) {
        this.idMateria = idMateria;
    }

    @XmlTransient
    public List<AgendaWeb> getAgendaWebList() {
        return agendaWebList;
    }

    public void setAgendaWebList(List<AgendaWeb> agendaWebList) {
        this.agendaWebList = agendaWebList;
    }

    @XmlTransient
    public List<HorarioDeClase> getHorarioDeClaseList() {
        return horarioDeClaseList;
    }

    public void setHorarioDeClaseList(List<HorarioDeClase> horarioDeClaseList) {
        this.horarioDeClaseList = horarioDeClaseList;
    }

    @XmlTransient
    public List<PlanesMejoramiento> getPlanesMejoramientoList() {
        return planesMejoramientoList;
    }

    public void setPlanesMejoramientoList(List<PlanesMejoramiento> planesMejoramientoList) {
        this.planesMejoramientoList = planesMejoramientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocMat != null ? idDocMat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocenteMateria)) {
            return false;
        }
        DocenteMateria other = (DocenteMateria) object;
        if ((this.idDocMat == null && other.idDocMat != null) || (this.idDocMat != null && !this.idDocMat.equals(other.idDocMat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DocenteMateria[ idDocMat=" + idDocMat + " ]";
    }
    
}
