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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-02T00:11:11")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:31:36")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-01T23:24:52")
>>>>>>> e9ffd11de3bc4d6cb7da994a8f50d81be0407e24
>>>>>>> 215acba729b7b7afca6f69be5aa8ba7d72a2a2fb
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