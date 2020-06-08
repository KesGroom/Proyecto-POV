package Entidades;

import Entidades.Curso;
import Entidades.Docente;
import Entidades.HorarioDeClase;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(CursoDocente.class)
public class CursoDocente_ { 

    public static volatile SingularAttribute<CursoDocente, Integer> estado;
    public static volatile SingularAttribute<CursoDocente, Curso> idCurso;
    public static volatile SingularAttribute<CursoDocente, Docente> idDocente;
    public static volatile ListAttribute<CursoDocente, HorarioDeClase> horarioDeClaseList;
    public static volatile SingularAttribute<CursoDocente, Integer> idDocCur;

}