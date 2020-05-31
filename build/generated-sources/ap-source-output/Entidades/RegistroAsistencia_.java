package Entidades;

import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.Periodo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:19")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
@StaticMetamodel(RegistroAsistencia.class)
public class RegistroAsistencia_ { 

    public static volatile SingularAttribute<RegistroAsistencia, Estudiante> estudiante;
    public static volatile SingularAttribute<RegistroAsistencia, Date> fecha;
    public static volatile SingularAttribute<RegistroAsistencia, Short> asistencia;
    public static volatile SingularAttribute<RegistroAsistencia, Periodo> periodo;
    public static volatile SingularAttribute<RegistroAsistencia, String> observaciones;
    public static volatile SingularAttribute<RegistroAsistencia, Integer> idRegistroAsistencia;
    public static volatile SingularAttribute<RegistroAsistencia, String> temaTrabajado;
    public static volatile SingularAttribute<RegistroAsistencia, DocenteMateria> docenteMateria;

}