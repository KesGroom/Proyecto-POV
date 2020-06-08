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

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-08T13:14:45")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> estado;
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