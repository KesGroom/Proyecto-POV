package Entidades;

import Entidades.Actividades;
import Entidades.Atencioncurso;
import Entidades.CursoDocente;
import Entidades.Estudiantes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:43")
@StaticMetamodel(Cursos.class)
public class Cursos_ { 

    public static volatile ListAttribute<Cursos, Atencioncurso> atencioncursoList;
    public static volatile ListAttribute<Cursos, Estudiantes> estudiantesList;
    public static volatile ListAttribute<Cursos, Actividades> actividadesList;
    public static volatile SingularAttribute<Cursos, String> curso;
    public static volatile SingularAttribute<Cursos, Integer> idCurso;
    public static volatile ListAttribute<Cursos, CursoDocente> cursoDocenteList;
    public static volatile SingularAttribute<Cursos, String> salon;

}