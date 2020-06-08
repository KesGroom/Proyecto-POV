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
@Table(name = "curso_docente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CursoDocente.findAll", query = "SELECT c FROM CursoDocente c WHERE c.estado = 1")
    , @NamedQuery(name = "CursoDocente.findByIdDocCur", query = "SELECT c FROM CursoDocente c WHERE c.idDocCur = :idDocCur")
    , @NamedQuery(name = "CursoDocente.findByEstado", query = "SELECT c FROM CursoDocente c WHERE c.estado = :estado")})
public class CursoDocente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_DocCur")
    private Integer idDocCur;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Id_Curso", referencedColumnName = "Id_Curso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso idCurso;
    @JoinColumn(name = "Id_Docente", referencedColumnName = "Id_Docente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Docente idDocente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "docenteCurso", fetch = FetchType.LAZY)
    private List<HorarioDeClase> horarioDeClaseList;

    public CursoDocente() {
    }

    public CursoDocente(Integer idDocCur) {
        this.idDocCur = idDocCur;
    }

    public Integer getIdDocCur() {
        return idDocCur;
    }

    public void setIdDocCur(Integer idDocCur) {
        this.idDocCur = idDocCur;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    @XmlTransient
    public List<HorarioDeClase> getHorarioDeClaseList() {
        return horarioDeClaseList;
    }

    public void setHorarioDeClaseList(List<HorarioDeClase> horarioDeClaseList) {
        this.horarioDeClaseList = horarioDeClaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocCur != null ? idDocCur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoDocente)) {
            return false;
        }
        CursoDocente other = (CursoDocente) object;
        if ((this.idDocCur == null && other.idDocCur != null) || (this.idDocCur != null && !this.idDocCur.equals(other.idDocCur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CursoDocente[ idDocCur=" + idDocCur + " ]";
    }
    
}
