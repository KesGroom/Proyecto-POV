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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:37")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
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