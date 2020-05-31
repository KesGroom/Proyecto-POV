package Entidades;

import Entidades.BitacoraServicioSocial;
import Entidades.Pqrs;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:31")
@StaticMetamodel(Coordinador.class)
public class Coordinador_ { 

    public static volatile ListAttribute<Coordinador, Pqrs> pqrsList;
    public static volatile SingularAttribute<Coordinador, Usuario> idUsuario;
    public static volatile ListAttribute<Coordinador, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<Coordinador, Integer> idCoordinador;

}