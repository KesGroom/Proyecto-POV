package Entidades;

import Entidades.Actividad;
import Entidades.Atencioncurso;
import Entidades.CursoDocente;
import Entidades.Estudiante;
import Entidades.Grado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T16:22:05")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Grado> grado;
    public static volatile ListAttribute<Curso, Atencioncurso> atencioncursoList;
    public static volatile ListAttribute<Curso, Actividad> actividadList;
    public static volatile SingularAttribute<Curso, String> curso;
    public static volatile ListAttribute<Curso, Estudiante> estudianteList;
    public static volatile SingularAttribute<Curso, Integer> idCurso;
    public static volatile ListAttribute<Curso, CursoDocente> cursoDocenteList;
    public static volatile SingularAttribute<Curso, String> salon;

}