package Entidades;

import Entidades.Actividades;
import Entidades.DocenteMateria;
import Entidades.Estudiantes;
import Entidades.PlanesMejoramiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(AgendaWeb.class)
public class AgendaWeb_ { 

    public static volatile SingularAttribute<AgendaWeb, String> descripcion;
    public static volatile SingularAttribute<AgendaWeb, Estudiantes> estudiante;
    public static volatile SingularAttribute<AgendaWeb, Integer> idAgendaWeb;
    public static volatile SingularAttribute<AgendaWeb, PlanesMejoramiento> planMejoramiento;
    public static volatile SingularAttribute<AgendaWeb, String> categoria;
    public static volatile SingularAttribute<AgendaWeb, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<AgendaWeb, Actividades> actividad;

}