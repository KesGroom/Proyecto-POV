package Entidades;

import Entidades.Acudientes;
import Entidades.DocenteCitas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Citas.class)
public class Citas_ { 

    public static volatile SingularAttribute<Citas, Integer> idCita;
    public static volatile SingularAttribute<Citas, Date> fechaCita;
    public static volatile SingularAttribute<Citas, Acudientes> acudiente;
    public static volatile SingularAttribute<Citas, Date> fechaRegistro;
    public static volatile ListAttribute<Citas, DocenteCitas> docenteCitasList;
    public static volatile SingularAttribute<Citas, String> asunto;

}