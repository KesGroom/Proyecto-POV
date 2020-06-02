package Entidades;

import Entidades.Permiso;
import Entidades.RolHasPermiso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T17:13:04")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, Permiso> permisoPadre;
    public static volatile SingularAttribute<Permiso, Integer> idPermiso;
    public static volatile ListAttribute<Permiso, RolHasPermiso> rolHasPermisoList;
    public static volatile SingularAttribute<Permiso, String> icon;
    public static volatile SingularAttribute<Permiso, String> nombre;
    public static volatile SingularAttribute<Permiso, String> url;
    public static volatile ListAttribute<Permiso, Permiso> permisoList;

}