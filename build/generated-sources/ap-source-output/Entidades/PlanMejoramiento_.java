package Entidades;

import Entidades.AgendaWeb;
import Entidades.DocenteMateria;
import Entidades.RegistroNota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
@StaticMetamodel(PlanMejoramiento.class)
public class PlanMejoramiento_ { 

    public static volatile SingularAttribute<PlanMejoramiento, String> descripcion;
    public static volatile ListAttribute<PlanMejoramiento, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<PlanMejoramiento, Date> fechaAsignacion;
    public static volatile SingularAttribute<PlanMejoramiento, DocenteMateria> docenteAsigna;
    public static volatile SingularAttribute<PlanMejoramiento, Integer> idPlanMejoramiento;
    public static volatile ListAttribute<PlanMejoramiento, RegistroNota> registroNotaList;
    public static volatile SingularAttribute<PlanMejoramiento, Date> fechaEntrega;
    public static volatile SingularAttribute<PlanMejoramiento, String> recursos;

}