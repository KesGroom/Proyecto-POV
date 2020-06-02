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

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
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