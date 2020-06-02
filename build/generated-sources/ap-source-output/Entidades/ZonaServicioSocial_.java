package Entidades;

import Entidades.BitacoraServicioSocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
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