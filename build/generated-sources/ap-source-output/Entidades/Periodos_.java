package Entidades;

import Entidades.RegistroAsistencia;
import Entidades.RegistroNotas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Periodos.class)
public class Periodos_ { 

    public static volatile SingularAttribute<Periodos, Integer> numeroPeriodo;
    public static volatile SingularAttribute<Periodos, Date> fechaInicio;
    public static volatile ListAttribute<Periodos, RegistroAsistencia> registroAsistenciaList;
    public static volatile SingularAttribute<Periodos, Date> fechaFinal;
    public static volatile SingularAttribute<Periodos, Integer> idPeriodo;
    public static volatile ListAttribute<Periodos, RegistroNotas> registroNotasList;

}