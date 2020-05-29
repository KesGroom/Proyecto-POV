package Entidades;

import Entidades.Actividades;
import Entidades.AgendaWeb;
import Entidades.Docentes;
import Entidades.HorarioDeClase;
import Entidades.Materias;
import Entidades.PlanesMejoramiento;
import Entidades.RegistroAsistencia;
import Entidades.RegistroNotas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(DocenteMateria.class)
public class DocenteMateria_ { 

    public static volatile ListAttribute<DocenteMateria, AgendaWeb> agendaWebList;
    public static volatile ListAttribute<DocenteMateria, PlanesMejoramiento> planesMejoramientoList;
    public static volatile ListAttribute<DocenteMateria, Actividades> actividadesList;
    public static volatile SingularAttribute<DocenteMateria, Materias> idMateria;
    public static volatile ListAttribute<DocenteMateria, RegistroAsistencia> registroAsistenciaList;
    public static volatile ListAttribute<DocenteMateria, RegistroNotas> registroNotasList;
    public static volatile SingularAttribute<DocenteMateria, Docentes> idDocente;
    public static volatile ListAttribute<DocenteMateria, HorarioDeClase> horarioDeClaseList;
    public static volatile SingularAttribute<DocenteMateria, Integer> idDocMat;

}