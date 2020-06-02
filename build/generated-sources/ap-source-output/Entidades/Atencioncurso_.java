package Entidades;

import Entidades.Curso;
import Entidades.Docente;
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
@StaticMetamodel(Atencioncurso.class)
public class Atencioncurso_ { 

    public static volatile SingularAttribute<Atencioncurso, Integer> idAtencionCurso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaInicioAtencion;
    public static volatile SingularAttribute<Atencioncurso, Integer> diaSemana;
    public static volatile SingularAttribute<Atencioncurso, Docente> docenteACargo;
    public static volatile SingularAttribute<Atencioncurso, Curso> curso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaFinalAtencion;

}