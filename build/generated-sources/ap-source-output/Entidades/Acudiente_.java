package Entidades;

import Entidades.Cita;
import Entidades.Estudiante;
import Entidades.Pqrs;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(Acudiente.class)
public class Acudiente_ { 

    public static volatile SingularAttribute<Acudiente, Integer> idAcudiente;
    public static volatile SingularAttribute<Acudiente, Integer> estado;
    public static volatile ListAttribute<Acudiente, Pqrs> pqrsList;
    public static volatile SingularAttribute<Acudiente, Usuario> idUsuario;
    public static volatile ListAttribute<Acudiente, Estudiante> estudianteList;
    public static volatile ListAttribute<Acudiente, Cita> citaList;

}