package Entidades;

import Entidades.Actividades;
import Entidades.DocenteMateria;
import Entidades.Estudiantes;
import Entidades.Periodos;
import Entidades.PlanesMejoramiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(RegistroNotas.class)
public class RegistroNotas_ { 

    public static volatile SingularAttribute<RegistroNotas, Estudiantes> estudiante;
    public static volatile SingularAttribute<RegistroNotas, Double> calificacion;
    public static volatile SingularAttribute<RegistroNotas, PlanesMejoramiento> planMejoramiento;
    public static volatile SingularAttribute<RegistroNotas, Periodos> periodo;
    public static volatile SingularAttribute<RegistroNotas, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<RegistroNotas, Integer> idRegistroNotas;
    public static volatile SingularAttribute<RegistroNotas, Actividades> actividad;

}