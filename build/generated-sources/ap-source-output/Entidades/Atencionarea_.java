package Entidades;

import Entidades.Area;
import Entidades.Docente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T10:01:57")
@StaticMetamodel(Atencionarea.class)
public class Atencionarea_ { 

    public static volatile SingularAttribute<Atencionarea, Area> area;
    public static volatile SingularAttribute<Atencionarea, Date> horaInicioAtencion;
    public static volatile SingularAttribute<Atencionarea, Integer> diaSemana;
    public static volatile SingularAttribute<Atencionarea, Docente> docenteACargo;
    public static volatile SingularAttribute<Atencionarea, Integer> idAtencionArea;
    public static volatile SingularAttribute<Atencionarea, Date> horaFinalAtencion;

}