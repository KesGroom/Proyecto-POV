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
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
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