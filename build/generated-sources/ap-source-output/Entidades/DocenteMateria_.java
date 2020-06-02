package Entidades;

import Entidades.Actividad;
import Entidades.AgendaWeb;
import Entidades.Docente;
import Entidades.HorarioDeClase;
import Entidades.Materia;
import Entidades.PlanMejoramiento;
import Entidades.RegistroAsistencia;
import Entidades.RegistroNota;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
@StaticMetamodel(DocenteMateria.class)
public class DocenteMateria_ { 

    public static volatile ListAttribute<DocenteMateria, AgendaWeb> agendaWebList;
    public static volatile ListAttribute<DocenteMateria, Actividad> actividadList;
    public static volatile ListAttribute<DocenteMateria, RegistroNota> registroNotaList;
    public static volatile SingularAttribute<DocenteMateria, Materia> idMateria;
    public static volatile ListAttribute<DocenteMateria, RegistroAsistencia> registroAsistenciaList;
    public static volatile ListAttribute<DocenteMateria, PlanMejoramiento> planMejoramientoList;
    public static volatile SingularAttribute<DocenteMateria, Docente> idDocente;
    public static volatile ListAttribute<DocenteMateria, HorarioDeClase> horarioDeClaseList;
    public static volatile SingularAttribute<DocenteMateria, Integer> idDocMat;

}