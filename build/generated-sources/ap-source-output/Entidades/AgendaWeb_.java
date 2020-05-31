package Entidades;

import Entidades.Actividad;
import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.PlanMejoramiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:26")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
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