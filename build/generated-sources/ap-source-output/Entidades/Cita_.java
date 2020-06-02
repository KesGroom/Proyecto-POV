package Entidades;

import Entidades.Acudiente;
import Entidades.DocenteCita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:36")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile SingularAttribute<Cita, Date> fechaCita;
    public static volatile ListAttribute<Cita, DocenteCita> docenteCitaList;
    public static volatile SingularAttribute<Cita, Acudiente> acudiente;
    public static volatile SingularAttribute<Cita, Date> fechaRegistro;
    public static volatile SingularAttribute<Cita, String> asunto;

}