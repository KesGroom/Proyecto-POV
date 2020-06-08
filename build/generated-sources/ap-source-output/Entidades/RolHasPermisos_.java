package Entidades;

import Entidades.Permiso;
import Entidades.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(RolHasPermisos.class)
public class RolHasPermisos_ { 

    public static volatile SingularAttribute<RolHasPermisos, Integer> estado;
    public static volatile SingularAttribute<RolHasPermisos, Integer> idRolPermiso;
    public static volatile SingularAttribute<RolHasPermisos, Permiso> permiso;
    public static volatile SingularAttribute<RolHasPermisos, Rol> rol;

}