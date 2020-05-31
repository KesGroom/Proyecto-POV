package Entidades;

import Entidades.AgendaWeb;
import Entidades.Curso;
import Entidades.DocenteMateria;
import Entidades.RegistroNota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, String> descripcion;
    public static volatile ListAttribute<Actividad, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<Actividad, Integer> idActividad;
    public static volatile SingularAttribute<Actividad, Date> fechaAsignacion;
    public static volatile ListAttribute<Actividad, RegistroNota> registroNotaList;
    public static volatile SingularAttribute<Actividad, Curso> curso;
    public static volatile SingularAttribute<Actividad, Date> fechaEntrega;
    public static volatile SingularAttribute<Actividad, String> nombre;
    public static volatile SingularAttribute<Actividad, DocenteMateria> idDocenteMateria;
    public static volatile SingularAttribute<Actividad, String> identificador;

}