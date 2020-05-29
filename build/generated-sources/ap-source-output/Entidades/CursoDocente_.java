package Entidades;

import Entidades.Cursos;
import Entidades.Docentes;
import Entidades.HorarioDeClase;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:43")
@StaticMetamodel(CursoDocente.class)
public class CursoDocente_ { 

    public static volatile SingularAttribute<CursoDocente, Cursos> idCurso;
    public static volatile SingularAttribute<CursoDocente, Docentes> idDocente;
    public static volatile ListAttribute<CursoDocente, HorarioDeClase> horarioDeClaseList;
    public static volatile SingularAttribute<CursoDocente, Integer> idDocCur;

}