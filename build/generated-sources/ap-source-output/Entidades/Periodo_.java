package Entidades;

import Entidades.RegistroAsistencia;
import Entidades.RegistroNota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:35")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Integer> numeroPeriodo;
    public static volatile SingularAttribute<Periodo, Date> fechaInicio;
    public static volatile ListAttribute<Periodo, RegistroNota> registroNotaList;
    public static volatile ListAttribute<Periodo, RegistroAsistencia> registroAsistenciaList;
    public static volatile SingularAttribute<Periodo, Date> fechaFinal;
    public static volatile SingularAttribute<Periodo, Integer> idPeriodo;

}