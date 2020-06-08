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
@Table(name = "roles_has_permisos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolHasPermisos.findAll", query = "SELECT r FROM RolHasPermisos r")
    , @NamedQuery(name = "RolHasPermisos.findByIdRolPermiso", query = "SELECT r FROM RolHasPermisos r WHERE r.idRolPermiso = :idRolPermiso")
    , @NamedQuery(name = "RolHasPermisos.findByEstado", query = "SELECT r FROM RolHasPermisos r WHERE r.estado = :estado")})
public class RolHasPermisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRolPermiso")
    private Integer idRolPermiso;
    @Column(name = "Estado")
    private Integer estado;
    @JoinColumn(name = "Permiso", referencedColumnName = "idPermiso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Permiso permiso;
    @JoinColumn(name = "Rol", referencedColumnName = "Id_Roles")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol;

    public RolHasPermisos() {
    }

    public RolHasPermisos(Integer idRolPermiso) {
        this.idRolPermiso = idRolPermiso;
    }

    public Integer getIdRolPermiso() {
        return idRolPermiso;
    }

    public void setIdRolPermiso(Integer idRolPermiso) {
        this.idRolPermiso = idRolPermiso;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolPermiso != null ? idRolPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolHasPermisos)) {
            return false;
        }
        RolHasPermisos other = (RolHasPermisos) object;
        if ((this.idRolPermiso == null && other.idRolPermiso != null) || (this.idRolPermiso != null && !this.idRolPermiso.equals(other.idRolPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RolHasPermisos[ idRolPermiso=" + idRolPermiso + " ]";
    }
    
}
