package Entidades;

import Entidades.Actividad;
import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.Periodo;
import Entidades.PlanMejoramiento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:19")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
@StaticMetamodel(RegistroNota.class)
public class RegistroNota_ { 

    public static volatile SingularAttribute<RegistroNota, Estudiante> estudiante;
    public static volatile SingularAttribute<RegistroNota, Double> calificacion;
    public static volatile SingularAttribute<RegistroNota, PlanMejoramiento> planMejoramiento;
    public static volatile SingularAttribute<RegistroNota, Periodo> periodo;
    public static volatile SingularAttribute<RegistroNota, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<RegistroNota, Integer> idRegistroNotas;
    public static volatile SingularAttribute<RegistroNota, Actividad> actividad;

}