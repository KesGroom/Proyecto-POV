package Entidades;

import Entidades.Permiso;
import Entidades.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
@StaticMetamodel(RolHasPermiso.class)
public class RolHasPermiso_ { 

    public static volatile SingularAttribute<RolHasPermiso, Integer> idRolPermiso;
    public static volatile SingularAttribute<RolHasPermiso, Permiso> permiso;
    public static volatile SingularAttribute<RolHasPermiso, Rol> rol;

}