package Entidades;

import Entidades.Citas;
import Entidades.Estudiantes;
import Entidades.Pqrs;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Acudientes.class)
public class Acudientes_ { 

    public static volatile SingularAttribute<Acudientes, Integer> idAcudiente;
    public static volatile ListAttribute<Acudientes, Estudiantes> estudiantesList;
    public static volatile ListAttribute<Acudientes, Pqrs> pqrsList;
    public static volatile SingularAttribute<Acudientes, Usuarios> idUsuario;
    public static volatile ListAttribute<Acudientes, Citas> citasList;

}