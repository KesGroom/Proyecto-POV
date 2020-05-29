package Entidades;

import Entidades.Areas;
import Entidades.Docentes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Atencionarea.class)
public class Atencionarea_ { 

    public static volatile SingularAttribute<Atencionarea, Areas> area;
    public static volatile SingularAttribute<Atencionarea, Date> horaInicioAtencion;
    public static volatile SingularAttribute<Atencionarea, Integer> diaSemana;
    public static volatile SingularAttribute<Atencionarea, Docentes> docenteACargo;
    public static volatile SingularAttribute<Atencionarea, Integer> idAtencionArea;
    public static volatile SingularAttribute<Atencionarea, Date> horaFinalAtencion;

}