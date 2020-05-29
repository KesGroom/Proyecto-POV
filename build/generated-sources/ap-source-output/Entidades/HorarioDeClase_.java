package Entidades;

import Entidades.CursoDocente;
import Entidades.DocenteMateria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(HorarioDeClase.class)
public class HorarioDeClase_ { 

    public static volatile SingularAttribute<HorarioDeClase, CursoDocente> docenteCurso;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaFinal;
    public static volatile SingularAttribute<HorarioDeClase, Integer> idHorarioClase;
    public static volatile SingularAttribute<HorarioDeClase, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<HorarioDeClase, String> dia;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaInicio;

}