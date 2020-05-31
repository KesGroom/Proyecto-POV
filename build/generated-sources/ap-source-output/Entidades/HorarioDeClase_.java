package Entidades;

import Entidades.CursoDocente;
import Entidades.DocenteMateria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:28")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
@StaticMetamodel(HorarioDeClase.class)
public class HorarioDeClase_ { 

    public static volatile SingularAttribute<HorarioDeClase, CursoDocente> docenteCurso;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaFinal;
    public static volatile SingularAttribute<HorarioDeClase, Integer> idHorarioClase;
    public static volatile SingularAttribute<HorarioDeClase, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<HorarioDeClase, String> dia;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaInicio;

}