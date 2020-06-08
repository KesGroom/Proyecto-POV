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
 * @author jusag
 */
@Entity
@Table(name = "zonas_servicio_social")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZonaServicioSocial.findAll", query = "SELECT z FROM ZonaServicioSocial z WHERE z.estado = 1")
    , @NamedQuery(name = "ZonaServicioSocial.findByIdZonaSS", query = "SELECT z FROM ZonaServicioSocial z WHERE z.idZonaSS = :idZonaSS")
    , @NamedQuery(name = "ZonaServicioSocial.findByNombre", query = "SELECT z FROM ZonaServicioSocial z WHERE z.nombre = :nombre")
    , @NamedQuery(name = "ZonaServicioSocial.findByLugar", query = "SELECT z FROM ZonaServicioSocial z WHERE z.lugar = :lugar")
    , @NamedQuery(name = "ZonaServicioSocial.findByEncargado", query = "SELECT z FROM ZonaServicioSocial z WHERE z.encargado = :encargado")
    , @NamedQuery(name = "ZonaServicioSocial.findByHoraEntrada", query = "SELECT z FROM ZonaServicioSocial z WHERE z.horaEntrada = :horaEntrada")
    , @NamedQuery(name = "ZonaServicioSocial.findByHoraSalida", query = "SELECT z FROM ZonaServicioSocial z WHERE z.horaSalida = :horaSalida")
    , @NamedQuery(name = "ZonaServicioSocial.findByTiempodeServicio", query = "SELECT z FROM ZonaServicioSocial z WHERE z.tiempodeServicio = :tiempodeServicio")
    , @NamedQuery(name = "ZonaServicioSocial.findByCupos", query = "SELECT z FROM ZonaServicioSocial z WHERE z.cupos = :cupos")
    , @NamedQuery(name = "ZonaServicioSocial.findByEstado", query = "SELECT z FROM ZonaServicioSocial z WHERE z.estado = :estado")})
public class ZonaServicioSocial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_ZonaSS")
    private Integer idZonaSS;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Lugar")
    private String lugar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Encargado")
    private String encargado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora_Entrada")
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora_Salida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tiempo_de_Servicio")
    private int tiempodeServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cupos")
    private int cupos;
    @Column(name = "Estado")
    private Integer estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonadeServicio", fetch = FetchType.LAZY)
    private List<BitacoraServicioSocial> bitacoraServicioSocialList;

    public ZonaServicioSocial() {
    }

    public ZonaServicioSocial(Integer idZonaSS) {
        this.idZonaSS = idZonaSS;
    }

    public ZonaServicioSocial(Integer idZonaSS, String nombre, String lugar, String encargado, Date horaEntrada, Date horaSalida, int tiempodeServicio, int cupos) {
        this.idZonaSS = idZonaSS;
        this.nombre = nombre;
        this.lugar = lugar;
        this.encargado = encargado;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tiempodeServicio = tiempodeServicio;
        this.cupos = cupos;
    }

    public Integer getIdZonaSS() {
        return idZonaSS;
    }

    public void setIdZonaSS(Integer idZonaSS) {
        this.idZonaSS = idZonaSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getTiempodeServicio() {
        return tiempodeServicio;
    }

    public void setTiempodeServicio(int tiempodeServicio) {
        this.tiempodeServicio = tiempodeServicio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<BitacoraServicioSocial> getBitacoraServicioSocialList() {
        return bitacoraServicioSocialList;
    }

    public void setBitacoraServicioSocialList(List<BitacoraServicioSocial> bitacoraServicioSocialList) {
        this.bitacoraServicioSocialList = bitacoraServicioSocialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZonaSS != null ? idZonaSS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZonaServicioSocial)) {
            return false;
        }
        ZonaServicioSocial other = (ZonaServicioSocial) object;
        if ((this.idZonaSS == null && other.idZonaSS != null) || (this.idZonaSS != null && !this.idZonaSS.equals(other.idZonaSS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ZonaServicioSocial[ idZonaSS=" + idZonaSS + " ]";
    }
    
}
