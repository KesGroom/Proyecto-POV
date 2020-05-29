package Entidades;

import Entidades.Atencionarea;
import Entidades.Atencioncurso;
import Entidades.CursoDocente;
import Entidades.DocenteCitas;
import Entidades.DocenteMateria;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:43")
@StaticMetamodel(Docentes.class)
public class Docentes_ { 

    public static volatile ListAttribute<Docentes, Atencioncurso> atencioncursoList;
    public static volatile ListAttribute<Docentes, DocenteMateria> docenteMateriaList;
    public static volatile ListAttribute<Docentes, DocenteCitas> docenteCitasList;
    public static volatile ListAttribute<Docentes, Atencionarea> atencionareaList;
    public static volatile SingularAttribute<Docentes, Usuarios> idUsuario;
    public static volatile ListAttribute<Docentes, CursoDocente> cursoDocenteList;
    public static volatile SingularAttribute<Docentes, Integer> idDocente;

}