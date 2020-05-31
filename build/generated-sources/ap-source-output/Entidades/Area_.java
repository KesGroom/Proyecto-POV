package Entidades;

import Entidades.Atencionarea;
import Entidades.Grado;
import Entidades.Materia;
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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> area;
    public static volatile SingularAttribute<Area, Grado> grado;
    public static volatile SingularAttribute<Area, Integer> idArea;
    public static volatile ListAttribute<Area, Atencionarea> atencionareaList;
    public static volatile ListAttribute<Area, Materia> materiaList;
    public static volatile SingularAttribute<Area, String> competencias;

}