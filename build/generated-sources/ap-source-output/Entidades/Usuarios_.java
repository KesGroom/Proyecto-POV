package Entidades;

import Entidades.Acudientes;
import Entidades.Coordinadores;
import Entidades.Docentes;
import Entidades.Estudiantes;
import Entidades.Roles;
import Entidades.Tipos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> numerodeDocumento;
    public static volatile ListAttribute<Usuarios, Docentes> docentesList;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> contrasenna;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, Roles> idRoles;
    public static volatile SingularAttribute<Usuarios, Date> fechadeNacimiento;
    public static volatile SingularAttribute<Usuarios, String> nombre;
    public static volatile SingularAttribute<Usuarios, String> telefonoFijo;
    public static volatile SingularAttribute<Usuarios, String> foto;
    public static volatile ListAttribute<Usuarios, Estudiantes> estudiantesList;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> genero;
    public static volatile SingularAttribute<Usuarios, String> celular;
    public static volatile SingularAttribute<Usuarios, Tipos> idTipo;
    public static volatile SingularAttribute<Usuarios, String> correoElectronico;
    public static volatile ListAttribute<Usuarios, Coordinadores> coordinadoresList;
    public static volatile ListAttribute<Usuarios, Acudientes> acudientesList;

}