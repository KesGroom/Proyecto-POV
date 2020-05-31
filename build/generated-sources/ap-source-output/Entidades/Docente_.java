package Entidades;

import Entidades.Atencionarea;
import Entidades.Atencioncurso;
import Entidades.CursoDocente;
import Entidades.DocenteCita;
import Entidades.DocenteMateria;
import Entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T18:07:49")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-30T14:30:27")
>>>>>>> aba3498ac64a104e6897a57f6bc2a51a1872e524
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:30")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
@StaticMetamodel(Docente.class)
public class Docente_ { 

    public static volatile ListAttribute<Docente, Atencioncurso> atencioncursoList;
    public static volatile ListAttribute<Docente, DocenteCita> docenteCitaList;
    public static volatile ListAttribute<Docente, DocenteMateria> docenteMateriaList;
    public static volatile ListAttribute<Docente, Atencionarea> atencionareaList;
    public static volatile SingularAttribute<Docente, Usuario> idUsuario;
    public static volatile ListAttribute<Docente, CursoDocente> cursoDocenteList;
    public static volatile SingularAttribute<Docente, Integer> idDocente;

}