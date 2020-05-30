package Entidades;

import Entidades.DocenteMateria;
import Entidades.Estudiante;
import Entidades.Periodo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:19")
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