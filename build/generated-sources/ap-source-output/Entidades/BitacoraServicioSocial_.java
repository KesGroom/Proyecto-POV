package Entidades;

import Entidades.Coordinador;
import Entidades.Estudiante;
import Entidades.ZonaServicioSocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T09:42:31")
@StaticMetamodel(BitacoraServicioSocial.class)
public class BitacoraServicioSocial_ { 

    public static volatile SingularAttribute<BitacoraServicioSocial, Estudiante> estudiante;
    public static volatile SingularAttribute<BitacoraServicioSocial, ZonaServicioSocial> zonadeServicio;
    public static volatile SingularAttribute<BitacoraServicioSocial, Coordinador> coordinador;
    public static volatile SingularAttribute<BitacoraServicioSocial, Date> fechaRegistro;
    public static volatile SingularAttribute<BitacoraServicioSocial, String> observaciones;
    public static volatile SingularAttribute<BitacoraServicioSocial, Integer> idBitacoraServicio;
    public static volatile SingularAttribute<BitacoraServicioSocial, Integer> tiempoPrestado;
    public static volatile SingularAttribute<BitacoraServicioSocial, String> laboresRealizadas;

}