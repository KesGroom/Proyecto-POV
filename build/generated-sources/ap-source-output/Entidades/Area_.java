package Entidades;

import Entidades.Atencionarea;
import Entidades.Grado;
import Entidades.Materia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T23:00:48")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> area;
    public static volatile SingularAttribute<Area, Grado> grado;
    public static volatile SingularAttribute<Area, Integer> idArea;
    public static volatile ListAttribute<Area, Atencionarea> atencionareaList;
    public static volatile ListAttribute<Area, Materia> materiaList;
    public static volatile SingularAttribute<Area, String> competencias;

}