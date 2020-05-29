package Entidades;

import Entidades.AgendaWeb;
import Entidades.DocenteMateria;
import Entidades.RegistroNotas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(PlanesMejoramiento.class)
public class PlanesMejoramiento_ { 

    public static volatile SingularAttribute<PlanesMejoramiento, String> descripcion;
    public static volatile ListAttribute<PlanesMejoramiento, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<PlanesMejoramiento, Date> fechaAsignacion;
    public static volatile SingularAttribute<PlanesMejoramiento, DocenteMateria> docenteAsigna;
    public static volatile SingularAttribute<PlanesMejoramiento, Integer> idPlanMejoramiento;
    public static volatile SingularAttribute<PlanesMejoramiento, Date> fechaEntrega;
    public static volatile ListAttribute<PlanesMejoramiento, RegistroNotas> registroNotasList;
    public static volatile SingularAttribute<PlanesMejoramiento, String> recursos;

}