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
@Table(name = "acudientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acudientes.findAll", query = "SELECT a FROM Acudientes a")
    , @NamedQuery(name = "Acudientes.findByIdAcudiente", query = "SELECT a FROM Acudientes a WHERE a.idAcudiente = :idAcudiente")})
public class Acudientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Acudiente")
    private Integer idAcudiente;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acudiente", fetch = FetchType.LAZY)
    private List<Citas> citasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcudiente", fetch = FetchType.LAZY)
    private List<Estudiantes> estudiantesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcudiente", fetch = FetchType.LAZY)
    private List<Pqrs> pqrsList;

    public Acudientes() {
    }

    public Acudientes(Integer idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public Integer getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(Integer idAcudiente) {
        this.idAcudiente = idAcudiente;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<Citas> getCitasList() {
        return citasList;
    }

    public void setCitasList(List<Citas> citasList) {
        this.citasList = citasList;
    }

    @XmlTransient
    public List<Estudiantes> getEstudiantesList() {
        return estudiantesList;
    }

    public void setEstudiantesList(List<Estudiantes> estudiantesList) {
        this.estudiantesList = estudiantesList;
    }

    @XmlTransient
    public List<Pqrs> getPqrsList() {
        return pqrsList;
    }

    public void setPqrsList(List<Pqrs> pqrsList) {
        this.pqrsList = pqrsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcudiente != null ? idAcudiente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acudientes)) {
            return false;
        }
        Acudientes other = (Acudientes) object;
        if ((this.idAcudiente == null && other.idAcudiente != null) || (this.idAcudiente != null && !this.idAcudiente.equals(other.idAcudiente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Acudientes[ idAcudiente=" + idAcudiente + " ]";
    }
    
}
