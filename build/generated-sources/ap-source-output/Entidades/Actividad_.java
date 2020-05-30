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

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
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