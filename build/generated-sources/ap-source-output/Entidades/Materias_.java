package Entidades;

import Entidades.Areas;
import Entidades.DocenteMateria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:43")
@StaticMetamodel(Materias.class)
public class Materias_ { 

    public static volatile SingularAttribute<Materias, Integer> idMateria;
    public static volatile ListAttribute<Materias, DocenteMateria> docenteMateriaList;
    public static volatile SingularAttribute<Materias, Areas> idArea;
    public static volatile SingularAttribute<Materias, String> materia;
    public static volatile SingularAttribute<Materias, String> temas;

}