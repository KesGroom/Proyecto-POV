package Entidades;

import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(Tipo.class)
public class Tipo_ { 

    public static volatile SingularAttribute<Tipo, String> tipo;
    public static volatile SingularAttribute<Tipo, Integer> estado;
    public static volatile ListAttribute<Tipo, Usuario> usuarioList;
    public static volatile SingularAttribute<Tipo, Integer> idTipo;

}