package Entidades;

import Entidades.Acudiente;
import Entidades.Coordinador;
import Entidades.Docente;
import Entidades.Estudiante;
import Entidades.Rol;
import Entidades.Tipo;
import java.util.Date;
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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-31T10:14:31")
>>>>>>> a1202ed33a8079538f96fce776d42933a15a01b5
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> numerodeDocumento;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> contrasenna;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Rol> idRoles;
    public static volatile SingularAttribute<Usuario, Date> fechadeNacimiento;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> telefonoFijo;
    public static volatile SingularAttribute<Usuario, String> foto;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> genero;
    public static volatile ListAttribute<Usuario, Estudiante> estudianteList;
    public static volatile SingularAttribute<Usuario, String> celular;
    public static volatile ListAttribute<Usuario, Acudiente> acudienteList;
    public static volatile SingularAttribute<Usuario, Tipo> idTipo;
    public static volatile ListAttribute<Usuario, Coordinador> coordinadorList;
    public static volatile SingularAttribute<Usuario, String> correoElectronico;
    public static volatile ListAttribute<Usuario, Docente> docenteList;

}