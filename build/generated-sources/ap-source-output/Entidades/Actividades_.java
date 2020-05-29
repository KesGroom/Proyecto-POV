package Entidades;

import Entidades.AgendaWeb;
import Entidades.Cursos;
import Entidades.DocenteMateria;
import Entidades.RegistroNotas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:43")
@StaticMetamodel(Actividades.class)
public class Actividades_ { 

    public static volatile SingularAttribute<Actividades, String> descripcion;
    public static volatile ListAttribute<Actividades, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<Actividades, Integer> idActividad;
    public static volatile SingularAttribute<Actividades, Date> fechaAsignacion;
    public static volatile SingularAttribute<Actividades, Cursos> curso;
    public static volatile SingularAttribute<Actividades, Date> fechaEntrega;
    public static volatile ListAttribute<Actividades, RegistroNotas> registroNotasList;
    public static volatile SingularAttribute<Actividades, String> nombre;
    public static volatile SingularAttribute<Actividades, DocenteMateria> idDocenteMateria;
    public static volatile SingularAttribute<Actividades, String> identificador;

}