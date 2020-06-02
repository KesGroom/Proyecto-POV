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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:12")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
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