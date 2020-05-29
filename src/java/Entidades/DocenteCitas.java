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
 * @author JSAntiago
 */
@Entity
@Table(name = "docente_citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocenteCitas.findAll", query = "SELECT d FROM DocenteCitas d")
    , @NamedQuery(name = "DocenteCitas.findByIdDocCitas", query = "SELECT d FROM DocenteCitas d WHERE d.idDocCitas = :idDocCitas")})
public class DocenteCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_DocCitas")
    private Integer idDocCitas;
    @JoinColumn(name = "Id_Cita", referencedColumnName = "Id_Cita")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Citas idCita;
    @JoinColumn(name = "Id_Docente", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docentes idDocente;

    public DocenteCitas() {
    }

    public DocenteCitas(Integer idDocCitas) {
        this.idDocCitas = idDocCitas;
    }

    public Integer getIdDocCitas() {
        return idDocCitas;
    }

    public void setIdDocCitas(Integer idDocCitas) {
        this.idDocCitas = idDocCitas;
    }

    public Citas getIdCita() {
        return idCita;
    }

    public void setIdCita(Citas idCita) {
        this.idCita = idCita;
    }

    public Docentes getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docentes idDocente) {
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
        if (!(object instanceof DocenteCitas)) {
            return false;
        }
        DocenteCitas other = (DocenteCitas) object;
        if ((this.idDocCitas == null && other.idDocCitas != null) || (this.idDocCitas != null && !this.idDocCitas.equals(other.idDocCitas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DocenteCitas[ idDocCitas=" + idDocCitas + " ]";
    }
    
}
