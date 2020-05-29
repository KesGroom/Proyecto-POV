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
 * @author JSAntiago
 */
@Entity
@Table(name = "actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividades.findAll", query = "SELECT a FROM Actividades a")
    , @NamedQuery(name = "Actividades.findByIdActividad", query = "SELECT a FROM Actividades a WHERE a.idActividad = :idActividad")
    , @NamedQuery(name = "Actividades.findByNombre", query = "SELECT a FROM Actividades a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Actividades.findByIdentificador", query = "SELECT a FROM Actividades a WHERE a.identificador = :identificador")
    , @NamedQuery(name = "Actividades.findByFechaAsignacion", query = "SELECT a FROM Actividades a WHERE a.fechaAsignacion = :fechaAsignacion")
    , @NamedQuery(name = "Actividades.findByFechaEntrega", query = "SELECT a FROM Actividades a WHERE a.fechaEntrega = :fechaEntrega")})
public class Actividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Actividad")
    private Integer idActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "Identificador")
    private String identificador;
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
    @Lob
    @Size(max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "Curso", referencedColumnName = "Id_Curso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cursos curso;
    @JoinColumn(name = "Id_DocenteMateria", referencedColumnName = "Id_DocMat")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DocenteMateria idDocenteMateria;
    @OneToMany(mappedBy = "actividad", fetch = FetchType.LAZY)
    private List<RegistroNotas> registroNotasList;
    @OneToMany(mappedBy = "actividad", fetch = FetchType.LAZY)
    private List<AgendaWeb> agendaWebList;

    public Actividades() {
    }

    public Actividades(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Actividades(Integer idActividad, String nombre, String identificador, Date fechaAsignacion, Date fechaEntrega) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.identificador = identificador;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public DocenteMateria getIdDocenteMateria() {
        return idDocenteMateria;
    }

    public void setIdDocenteMateria(DocenteMateria idDocenteMateria) {
        this.idDocenteMateria = idDocenteMateria;
    }

    @XmlTransient
    public List<RegistroNotas> getRegistroNotasList() {
        return registroNotasList;
    }

    public void setRegistroNotasList(List<RegistroNotas> registroNotasList) {
        this.registroNotasList = registroNotasList;
    }

    @XmlTransient
    public List<AgendaWeb> getAgendaWebList() {
        return agendaWebList;
    }

    public void setAgendaWebList(List<AgendaWeb> agendaWebList) {
        this.agendaWebList = agendaWebList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividades)) {
            return false;
        }
        Actividades other = (Actividades) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividades[ idActividad=" + idActividad + " ]";
    }
    
}
