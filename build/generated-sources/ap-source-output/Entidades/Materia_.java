package Entidades;

import Entidades.Area;
import Entidades.DocenteMateria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T09:42:32")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, Integer> idMateria;
    public static volatile ListAttribute<Materia, DocenteMateria> docenteMateriaList;
    public static volatile SingularAttribute<Materia, Area> idArea;
    public static volatile SingularAttribute<Materia, String> materia;
    public static volatile SingularAttribute<Materia, String> temas;

}