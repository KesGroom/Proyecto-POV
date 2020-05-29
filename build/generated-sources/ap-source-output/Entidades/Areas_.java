package Entidades;

import Entidades.Atencionarea;
import Entidades.Materias;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, String> area;
    public static volatile SingularAttribute<Areas, Integer> idArea;
    public static volatile ListAttribute<Areas, Atencionarea> atencionareaList;
    public static volatile ListAttribute<Areas, Materias> materiasList;
    public static volatile SingularAttribute<Areas, String> competencias;

}