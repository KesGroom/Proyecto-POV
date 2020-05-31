package Entidades;

import Entidades.RolHasPermiso;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T09:42:32")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile ListAttribute<Rol, RolHasPermiso> rolHasPermisoList;
    public static volatile SingularAttribute<Rol, Integer> idRoles;
    public static volatile SingularAttribute<Rol, String> rol;

}