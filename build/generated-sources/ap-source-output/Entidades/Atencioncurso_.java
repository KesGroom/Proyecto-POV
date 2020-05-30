package Entidades;

import Entidades.Curso;
import Entidades.Docente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
@StaticMetamodel(Atencioncurso.class)
public class Atencioncurso_ { 

    public static volatile SingularAttribute<Atencioncurso, Integer> idAtencionCurso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaInicioAtencion;
    public static volatile SingularAttribute<Atencioncurso, Integer> diaSemana;
    public static volatile SingularAttribute<Atencioncurso, Docente> docenteACargo;
    public static volatile SingularAttribute<Atencioncurso, Curso> curso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaFinalAtencion;

}