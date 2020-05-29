package Entidades;

import Entidades.BitacoraServicioSocial;
import Entidades.Pqrs;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Coordinadores.class)
public class Coordinadores_ { 

    public static volatile ListAttribute<Coordinadores, Pqrs> pqrsList;
    public static volatile SingularAttribute<Coordinadores, Usuarios> idUsuario;
    public static volatile ListAttribute<Coordinadores, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<Coordinadores, Integer> idCoordinador;

}