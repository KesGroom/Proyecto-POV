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
 * @author kesgr
 */
@Entity
@Table(name = "atencionarea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atencionarea.findAll", query = "SELECT a FROM Atencionarea a")
    , @NamedQuery(name = "Atencionarea.findByIdAtencionArea", query = "SELECT a FROM Atencionarea a WHERE a.idAtencionArea = :idAtencionArea")
    , @NamedQuery(name = "Atencionarea.findByDiaSemana", query = "SELECT a FROM Atencionarea a WHERE a.diaSemana = :diaSemana")
    , @NamedQuery(name = "Atencionarea.findByHoraInicioAtencion", query = "SELECT a FROM Atencionarea a WHERE a.horaInicioAtencion = :horaInicioAtencion")
    , @NamedQuery(name = "Atencionarea.findByHoraFinalAtencion", query = "SELECT a FROM Atencionarea a WHERE a.horaFinalAtencion = :horaFinalAtencion")})
public class Atencionarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_AtencionArea")
    private Integer idAtencionArea;
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
    @JoinColumn(name = "Area", referencedColumnName = "Id_Area")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Area area;
    @JoinColumn(name = "DocenteACargo", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docente docenteACargo;

    public Atencionarea() {
    }

    public Atencionarea(Integer idAtencionArea) {
        this.idAtencionArea = idAtencionArea;
    }

    public Atencionarea(Integer idAtencionArea, int diaSemana, Date horaInicioAtencion, Date horaFinalAtencion) {
        this.idAtencionArea = idAtencionArea;
        this.diaSemana = diaSemana;
        this.horaInicioAtencion = horaInicioAtencion;
        this.horaFinalAtencion = horaFinalAtencion;
    }

    public Integer getIdAtencionArea() {
        return idAtencionArea;
    }

    public void setIdAtencionArea(Integer idAtencionArea) {
        this.idAtencionArea = idAtencionArea;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Docente getDocenteACargo() {
        return docenteACargo;
    }

    public void setDocenteACargo(Docente docenteACargo) {
        this.docenteACargo = docenteACargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtencionArea != null ? idAtencionArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atencionarea)) {
            return false;
        }
        Atencionarea other = (Atencionarea) object;
        if ((this.idAtencionArea == null && other.idAtencionArea != null) || (this.idAtencionArea != null && !this.idAtencionArea.equals(other.idAtencionArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Atencionarea[ idAtencionArea=" + idAtencionArea + " ]";
    }
    
}
