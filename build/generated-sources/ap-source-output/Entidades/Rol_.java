package Entidades;

import Entidades.RolHasPermiso;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:19")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile ListAttribute<Rol, RolHasPermiso> rolHasPermisoList;
    public static volatile SingularAttribute<Rol, Integer> idRoles;
    public static volatile SingularAttribute<Rol, String> rol;

}