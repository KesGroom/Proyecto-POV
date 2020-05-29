package Entidades;

import Entidades.Acudientes;
import Entidades.Coordinadores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Pqrs.class)
public class Pqrs_ { 

    public static volatile SingularAttribute<Pqrs, Date> fecha;
    public static volatile SingularAttribute<Pqrs, Acudientes> idAcudiente;
    public static volatile SingularAttribute<Pqrs, String> tipo;
    public static volatile SingularAttribute<Pqrs, String> asunto;
    public static volatile SingularAttribute<Pqrs, String> respuesta;
    public static volatile SingularAttribute<Pqrs, Coordinadores> idCoordinador;
    public static volatile SingularAttribute<Pqrs, Integer> idPQRS;

}