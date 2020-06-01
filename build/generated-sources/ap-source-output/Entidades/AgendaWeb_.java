package Entidades;

import Entidades.Actividad;
import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.PlanMejoramiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T10:01:57")
@StaticMetamodel(AgendaWeb.class)
public class AgendaWeb_ { 

    public static volatile SingularAttribute<AgendaWeb, String> descripcion;
    public static volatile SingularAttribute<AgendaWeb, Estudiante> estudiante;
    public static volatile SingularAttribute<AgendaWeb, Integer> idAgendaWeb;
    public static volatile SingularAttribute<AgendaWeb, PlanMejoramiento> planMejoramiento;
    public static volatile SingularAttribute<AgendaWeb, String> categoria;
    public static volatile SingularAttribute<AgendaWeb, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<AgendaWeb, Actividad> actividad;

}