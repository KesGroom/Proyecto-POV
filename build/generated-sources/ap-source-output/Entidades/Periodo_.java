package Entidades;

import Entidades.RegistroAsistencia;
import Entidades.RegistroNota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Integer> numeroPeriodo;
    public static volatile SingularAttribute<Periodo, Date> fechaInicio;
    public static volatile ListAttribute<Periodo, RegistroNota> registroNotaList;
    public static volatile ListAttribute<Periodo, RegistroAsistencia> registroAsistenciaList;
    public static volatile SingularAttribute<Periodo, Date> fechaFinal;
    public static volatile SingularAttribute<Periodo, Integer> idPeriodo;

}