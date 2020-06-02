package Entidades;

import Entidades.Acudiente;
import Entidades.Coordinador;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:36")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
@StaticMetamodel(Pqrs.class)
public class Pqrs_ { 

    public static volatile SingularAttribute<Pqrs, Date> fecha;
    public static volatile SingularAttribute<Pqrs, Acudiente> idAcudiente;
    public static volatile SingularAttribute<Pqrs, String> tipo;
    public static volatile SingularAttribute<Pqrs, String> asunto;
    public static volatile SingularAttribute<Pqrs, String> respuesta;
    public static volatile SingularAttribute<Pqrs, Coordinador> idCoordinador;
    public static volatile SingularAttribute<Pqrs, Integer> idPQRS;

}