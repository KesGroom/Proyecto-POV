package Entidades;

import Entidades.Cita;
import Entidades.Docente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(DocenteCita.class)
public class DocenteCita_ { 

    public static volatile SingularAttribute<DocenteCita, Cita> idCita;
    public static volatile SingularAttribute<DocenteCita, Integer> estado;
    public static volatile SingularAttribute<DocenteCita, Integer> idDocCitas;
    public static volatile SingularAttribute<DocenteCita, Docente> idDocente;

}