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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jusag
 */
@Entity
@Table(name = "permisos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p")
    , @NamedQuery(name = "Permiso.findByIdPermiso", query = "SELECT p FROM Permiso p WHERE p.idPermiso = :idPermiso")
    , @NamedQuery(name = "Permiso.findByNombre", query = "SELECT p FROM Permiso p WHERE p.nombre = :nombre")
<<<<<<< HEAD
    , @NamedQuery(name = "Permiso.findByIcon", query = "SELECT p FROM Permiso p WHERE p.icon = :icon")})
=======
    , @NamedQuery(name = "Permiso.findByIcon", query = "SELECT p FROM Permiso p WHERE p.icon = :icon")
    , @NamedQuery(name = "Permiso.findByPermisoPadre", query = "SELECT p FROM Permiso p WHERE p.permisoPadre = :permisoPadre")
    , @NamedQuery(name = "Permiso.findByEstado", query = "SELECT p FROM Permiso p WHERE p.estado = :estado")})
>>>>>>> 29c006b257c9ac6ede6135119a6c1ff6fedcc0bf
public class Permiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPermiso")
    private Integer idPermiso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "url")
    private String url;
    @Size(max = 45)
    @Column(name = "icon")
    private String icon;
<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permiso", fetch = FetchType.LAZY)
    private List<RolHasPermiso> rolHasPermisoList;
    @OneToMany(mappedBy = "permisoPadre", fetch = FetchType.LAZY)
    private List<Permiso> permisoList;
    @JoinColumn(name = "permiso_Padre", referencedColumnName = "idPermiso")
    @ManyToOne(fetch = FetchType.LAZY)
    private Permiso permisoPadre;
=======
    @Basic(optional = false)
    @NotNull
    @Column(name = "permiso_padre")
    private int permisoPadre;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permiso", fetch = FetchType.LAZY)
    private List<RolHasPermisos> rolHasPermisosList;
>>>>>>> 29c006b257c9ac6ede6135119a6c1ff6fedcc0bf

    public Permiso() {
    }

    public Permiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Permiso(Integer idPermiso, String nombre) {
        this.idPermiso = idPermiso;
        this.nombre = nombre;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

<<<<<<< HEAD
=======
    public int getPermisoPadre() {
        return permisoPadre;
    }

    public void setPermisoPadre(int permisoPadre) {
        this.permisoPadre = permisoPadre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

>>>>>>> 29c006b257c9ac6ede6135119a6c1ff6fedcc0bf
    @XmlTransient
    public List<RolHasPermisos> getRolHasPermisosList() {
        return rolHasPermisosList;
    }

    public void setRolHasPermisosList(List<RolHasPermisos> rolHasPermisosList) {
        this.rolHasPermisosList = rolHasPermisosList;
    }

    @XmlTransient
    public List<Permiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<Permiso> permisoList) {
        this.permisoList = permisoList;
    }

    public Permiso getPermisoPadre() {
        return permisoPadre;
    }

    public void setPermisoPadre(Permiso permisoPadre) {
        this.permisoPadre = permisoPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Permiso[ idPermiso=" + idPermiso + " ]";
    }
    
}
