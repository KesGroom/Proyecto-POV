package Entidades;

import Entidades.CursoDocente;
import Entidades.DocenteMateria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
@StaticMetamodel(HorarioDeClase.class)
public class HorarioDeClase_ { 

    public static volatile SingularAttribute<HorarioDeClase, CursoDocente> docenteCurso;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaFinal;
    public static volatile SingularAttribute<HorarioDeClase, Integer> idHorarioClase;
    public static volatile SingularAttribute<HorarioDeClase, DocenteMateria> docenteMateria;
    public static volatile SingularAttribute<HorarioDeClase, String> dia;
    public static volatile SingularAttribute<HorarioDeClase, Date> horaInicio;

}