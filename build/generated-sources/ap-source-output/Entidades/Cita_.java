package Entidades;

import Entidades.Acudiente;
import Entidades.DocenteCita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile SingularAttribute<Cita, Date> fechaCita;
    public static volatile ListAttribute<Cita, DocenteCita> docenteCitaList;
    public static volatile SingularAttribute<Cita, Acudiente> acudiente;
    public static volatile SingularAttribute<Cita, Date> fechaRegistro;
    public static volatile SingularAttribute<Cita, String> asunto;

}