package Entidades;

import Entidades.Coordinadores;
import Entidades.Estudiantes;
import Entidades.ZonasServicioSocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(BitacoraServicioSocial.class)
public class BitacoraServicioSocial_ { 

    public static volatile SingularAttribute<BitacoraServicioSocial, Estudiantes> estudiante;
    public static volatile SingularAttribute<BitacoraServicioSocial, ZonasServicioSocial> zonadeServicio;
    public static volatile SingularAttribute<BitacoraServicioSocial, Coordinadores> coordinador;
    public static volatile SingularAttribute<BitacoraServicioSocial, Date> fechaRegistro;
    public static volatile SingularAttribute<BitacoraServicioSocial, String> observaciones;
    public static volatile SingularAttribute<BitacoraServicioSocial, Integer> idBitacoraServicio;
    public static volatile SingularAttribute<BitacoraServicioSocial, Integer> tiempoPrestado;
    public static volatile SingularAttribute<BitacoraServicioSocial, String> laboresRealizadas;

}