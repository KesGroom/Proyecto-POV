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
@Table(name = "estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiantes.findAll", query = "SELECT e FROM Estudiantes e")
    , @NamedQuery(name = "Estudiantes.findByIdEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.idEstudiante = :idEstudiante")})
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Estudiante")
    private Integer idEstudiante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<RegistroNotas> registroNotasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<BitacoraServicioSocial> bitacoraServicioSocialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<RegistroAsistencia> registroAsistenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<AgendaWeb> agendaWebList;
    @JoinColumn(name = "Id_Acudiente", referencedColumnName = "Id_Acudiente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Acudientes idAcudiente;
    @JoinColumn(name = "Id_Curso", referencedColumnName = "Id_Curso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cursos idCurso;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios idUsuario;

    public Estudiantes() {
    }

    public Estudiantes(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @XmlTransient
    public List<RegistroNotas> getRegistroNotasList() {
        return registroNotasList;
    }

    public void setRegistroNotasList(List<RegistroNotas> registroNotasList) {
        this.registroNotasList = registroNotasList;
    }

    @XmlTransient
    public List<BitacoraServicioSocial> getBitacoraServicioSocialList() {
        return bitacoraServicioSocialList;
    }

    public void setBitacoraServicioSocialList(List<BitacoraServicioSocial> bitacoraServicioSocialList) {
        this.bitacoraServicioSocialList = bitacoraServicioSocialList;
    }

    @XmlTransient
    public List<RegistroAsistencia> getRegistroAsistenciaList() {
        return registroAsistenciaList;
    }

    public void setRegistroAsistenciaList(List<RegistroAsistencia> registroAsistenciaList) {
        this.registroAsistenciaList = registroAsistenciaList;
    }

    @XmlTransient
    public List<AgendaWeb> getAgendaWebList() {
        return agendaWebList;
    }

    public void setAgendaWebList(List<AgendaWeb> agendaWebList) {
        this.agendaWebList = agendaWebList;
    }

    public Acudientes getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(Acudientes idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public Cursos getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Cursos idCurso) {
        this.idCurso = idCurso;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.idEstudiante == null && other.idEstudiante != null) || (this.idEstudiante != null && !this.idEstudiante.equals(other.idEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estudiantes[ idEstudiante=" + idEstudiante + " ]";
    }
    
}
