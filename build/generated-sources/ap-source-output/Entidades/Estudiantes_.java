package Entidades;

import Entidades.Acudientes;
import Entidades.AgendaWeb;
import Entidades.BitacoraServicioSocial;
import Entidades.Cursos;
import Entidades.RegistroAsistencia;
import Entidades.RegistroNotas;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Estudiantes.class)
public class Estudiantes_ { 

    public static volatile ListAttribute<Estudiantes, AgendaWeb> agendaWebList;
    public static volatile SingularAttribute<Estudiantes, Acudientes> idAcudiente;
    public static volatile ListAttribute<Estudiantes, RegistroAsistencia> registroAsistenciaList;
    public static volatile SingularAttribute<Estudiantes, Usuarios> idUsuario;
    public static volatile ListAttribute<Estudiantes, BitacoraServicioSocial> bitacoraServicioSocialList;
    public static volatile SingularAttribute<Estudiantes, Cursos> idCurso;
    public static volatile ListAttribute<Estudiantes, RegistroNotas> registroNotasList;
    public static volatile SingularAttribute<Estudiantes, Integer> idEstudiante;

}