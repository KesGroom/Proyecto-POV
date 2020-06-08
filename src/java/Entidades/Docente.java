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
 * @author jusag
 */
@Entity
@Table(name = "docentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT d FROM Docente d WHERE d.estado = 1")
    , @NamedQuery(name = "Docente.findByIdDocente", query = "SELECT d FROM Docente d WHERE d.idDocente = :idDocente")
    , @NamedQuery(name = "Docente.findByEstado", query = "SELECT d FROM Docente d WHERE d.estado = :estado")})
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Docente")
    private Integer idDocente;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente", fetch = FetchType.LAZY)
    private List<CursoDocente> cursoDocenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteACargo", fetch = FetchType.LAZY)
    private List<Atencionarea> atencionareaList;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente", fetch = FetchType.LAZY)
    private List<DocenteMateria> docenteMateriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteACargo", fetch = FetchType.LAZY)
    private List<Atencioncurso> atencioncursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocente", fetch = FetchType.LAZY)
    private List<DocenteCita> docenteCitaList;

    public Docente() {
    }

    public Docente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<CursoDocente> getCursoDocenteList() {
        return cursoDocenteList;
    }

    public void setCursoDocenteList(List<CursoDocente> cursoDocenteList) {
        this.cursoDocenteList = cursoDocenteList;
    }

    @XmlTransient
    public List<Atencionarea> getAtencionareaList() {
        return atencionareaList;
    }

    public void setAtencionareaList(List<Atencionarea> atencionareaList) {
        this.atencionareaList = atencionareaList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<DocenteMateria> getDocenteMateriaList() {
        return docenteMateriaList;
    }

    public void setDocenteMateriaList(List<DocenteMateria> docenteMateriaList) {
        this.docenteMateriaList = docenteMateriaList;
    }

    @XmlTransient
    public List<Atencioncurso> getAtencioncursoList() {
        return atencioncursoList;
    }

    public void setAtencioncursoList(List<Atencioncurso> atencioncursoList) {
        this.atencioncursoList = atencioncursoList;
    }

    @XmlTransient
    public List<DocenteCita> getDocenteCitaList() {
        return docenteCitaList;
    }

    public void setDocenteCitaList(List<DocenteCita> docenteCitaList) {
        this.docenteCitaList = docenteCitaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Docente[ idDocente=" + idDocente + " ]";
    }
    
}
