package Entidades;

import Entidades.Area;
import Entidades.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T16:43:04")
@StaticMetamodel(Grado.class)
public class Grado_ { 

    public static volatile SingularAttribute<Grado, String> grado;
    public static volatile SingularAttribute<Grado, Integer> idGrado;
    public static volatile ListAttribute<Grado, Area> areaList;
    public static volatile ListAttribute<Grado, Curso> cursoList;

}