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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jusag
 */
@Entity
@Table(name = "docente_citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocenteCita.findAll", query = "SELECT d FROM DocenteCita d WHERE d.estado = 1")
    , @NamedQuery(name = "DocenteCita.findByIdDocCitas", query = "SELECT d FROM DocenteCita d WHERE d.idDocCitas = :idDocCitas")
    , @NamedQuery(name = "DocenteCita.findByEstado", query = "SELECT d FROM DocenteCita d WHERE d.estado = :estado")})
public class DocenteCita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_DocCitas")
    private Integer idDocCitas;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Id_Cita", referencedColumnName = "Id_Cita")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cita idCita;
    @JoinColumn(name = "Id_Docente", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docente idDocente;

    public DocenteCita() {
    }

    public DocenteCita(Integer idDocCitas) {
        this.idDocCitas = idDocCitas;
    }

    public Integer getIdDocCitas() {
        return idDocCitas;
    }

    public void setIdDocCitas(Integer idDocCitas) {
        this.idDocCitas = idDocCitas;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Cita getIdCita() {
        return idCita;
    }

    public void setIdCita(Cita idCita) {
        this.idCita = idCita;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocCitas != null ? idDocCitas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocenteCita)) {
            return false;
        }
        DocenteCita other = (DocenteCita) object;
        if ((this.idDocCitas == null && other.idDocCitas != null) || (this.idDocCitas != null && !this.idDocCitas.equals(other.idDocCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DocenteCita[ idDocCitas=" + idDocCitas + " ]";
    }
    
}
