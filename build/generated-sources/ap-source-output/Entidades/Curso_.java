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

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:19")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:31")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
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