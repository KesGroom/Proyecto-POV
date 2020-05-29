package Entidades;

import Entidades.BitacoraServicioSocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(ZonasServicioSocial.class)
public class ZonasServicioSocial_ { 

    public static volatile SingularAttribute<ZonasServicioSocial, Integer> tiempodeServicio;
    public static volatile SingularAttribute<ZonasServicioSocial, String> encargado;
    public static volatile SingularAttribute<ZonasServicioSocial, Date> horaEntrada;
    public static volatile SingularAttribute<ZonasServicioSocial, String> lugar;
    public static volatile ListAttribute<ZonasServicioSocial, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<ZonasServicioSocial, Integer> cupos;
    public static volatile SingularAttribute<ZonasServicioSocial, Integer> idZonaSS;
    public static volatile SingularAttribute<ZonasServicioSocial, String> nombre;
    public static volatile SingularAttribute<ZonasServicioSocial, Date> horaSalida;

}