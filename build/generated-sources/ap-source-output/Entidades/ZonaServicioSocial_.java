package Entidades;

import Entidades.BitacoraServicioSocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T16:22:05")
@StaticMetamodel(ZonaServicioSocial.class)
public class ZonaServicioSocial_ { 

    public static volatile SingularAttribute<ZonaServicioSocial, Integer> tiempodeServicio;
    public static volatile SingularAttribute<ZonaServicioSocial, String> encargado;
    public static volatile SingularAttribute<ZonaServicioSocial, Date> horaEntrada;
    public static volatile SingularAttribute<ZonaServicioSocial, String> lugar;
    public static volatile ListAttribute<ZonaServicioSocial, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<ZonaServicioSocial, Integer> cupos;
    public static volatile SingularAttribute<ZonaServicioSocial, Integer> idZonaSS;
    public static volatile SingularAttribute<ZonaServicioSocial, String> nombre;
    public static volatile SingularAttribute<ZonaServicioSocial, Date> horaSalida;

}