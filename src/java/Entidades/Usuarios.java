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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios.findByNumerodeDocumento", query = "SELECT u FROM Usuarios u WHERE u.numerodeDocumento = :numerodeDocumento")
    , @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuarios.findByApellido", query = "SELECT u FROM Usuarios u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "Usuarios.findByFechadeNacimiento", query = "SELECT u FROM Usuarios u WHERE u.fechadeNacimiento = :fechadeNacimiento")
    , @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "Usuarios.findByCelular", query = "SELECT u FROM Usuarios u WHERE u.celular = :celular")
    , @NamedQuery(name = "Usuarios.findByTelefonoFijo", query = "SELECT u FROM Usuarios u WHERE u.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "Usuarios.findByGenero", query = "SELECT u FROM Usuarios u WHERE u.genero = :genero")
    , @NamedQuery(name = "Usuarios.findByCorreoElectronico", query = "SELECT u FROM Usuarios u WHERE u.correoElectronico = :correoElectronico")
    , @NamedQuery(name = "Usuarios.findByContrasenna", query = "SELECT u FROM Usuarios u WHERE u.contrasenna = :contrasenna")
    , @NamedQuery(name = "Usuarios.findByFoto", query = "SELECT u FROM Usuarios u WHERE u.foto = :foto")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Numero_de_Documento")
    private String numerodeDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_de_Nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechadeNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Celular")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Telefono_Fijo")
    private String telefonoFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Correo_Electronico")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Contrasenna")
    private String contrasenna;
    @Size(max = 150)
    @Column(name = "Foto")
    private String foto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Coordinadores> coordinadoresList;
    @JoinColumn(name = "Id_Roles", referencedColumnName = "Id_Roles")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Roles idRoles;
    @JoinColumn(name = "Id_Tipo", referencedColumnName = "Id_Tipo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipos idTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Acudientes> acudientesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Docentes> docentesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Estudiantes> estudiantesList;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(Integer idUsuario, String numerodeDocumento, String nombre, String apellido, Date fechadeNacimiento, String direccion, String celular, String telefonoFijo, String genero, String correoElectronico, String contrasenna) {
        this.idUsuario = idUsuario;
        this.numerodeDocumento = numerodeDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadeNacimiento = fechadeNacimiento;
        this.direccion = direccion;
        this.celular = celular;
        this.telefonoFijo = telefonoFijo;
        this.genero = genero;
        this.correoElectronico = correoElectronico;
        this.contrasenna = contrasenna;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNumerodeDocumento() {
        return numerodeDocumento;
    }

    public void setNumerodeDocumento(String numerodeDocumento) {
        this.numerodeDocumento = numerodeDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(Date fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @XmlTransient
    public List<Coordinadores> getCoordinadoresList() {
        return coordinadoresList;
    }

    public void setCoordinadoresList(List<Coordinadores> coordinadoresList) {
        this.coordinadoresList = coordinadoresList;
    }

    public Roles getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Roles idRoles) {
        this.idRoles = idRoles;
    }

    public Tipos getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Tipos idTipo) {
        this.idTipo = idTipo;
    }

    @XmlTransient
    public List<Acudientes> getAcudientesList() {
        return acudientesList;
    }

    public void setAcudientesList(List<Acudientes> acudientesList) {
        this.acudientesList = acudientesList;
    }

    @XmlTransient
    public List<Docentes> getDocentesList() {
        return docentesList;
    }

    public void setDocentesList(List<Docentes> docentesList) {
        this.docentesList = docentesList;
    }

    @XmlTransient
    public List<Estudiantes> getEstudiantesList() {
        return estudiantesList;
    }

    public void setEstudiantesList(List<Estudiantes> estudiantesList) {
        this.estudiantesList = estudiantesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
