/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Entidades.Rol;
import Entidades.Permiso;
import Entidades.RolHasPermiso;
import Entidades.Usuario;
import Facade.PermisoFacade;
import Facade.RolFacade;

import Facade.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author kesgr
 */
@Named(value = "sesionControlador")
@SessionScoped
public class SesionControlador implements Serializable {

    /**
     * Creates a new instance of SesionControlador
     */
    public SesionControlador() {
        FacesContext fc = FacesContext.getCurrentInstance();
        rolFacade = new RolFacade();
        usuarioFacade = new UsuarioFacade();
        
    }

    @EJB
    UsuarioFacade usuarioFacade;

    @EJB
    RolFacade rolFacade;
    
    @EJB
    PermisoFacade permisoFacade; 
    

    private String documento;
    private String clave;
    private Rol rolSeleccionado;
    private Usuario usuario;
    

    public String iniciarSesion() {
        FacesContext fc = FacesContext.getCurrentInstance();
        usuario = usuarioFacade.UserLog(documento, clave);
        if (usuario != null) {
            rolSeleccionado = usuario.getIdRoles();

            return "Resources/Pages/Dashboard?faces-redirect=true";
        } else {
            return "index?faces-redirect=true";
        }
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        this.usuario = null;
        this.documento = "";
        this.clave = "";
        return "/index.xhtml?faces-redirect=true";
    }

    public Boolean inicioSesion() {
        return (usuario != null);
    }

    public Boolean validarPermiso() {
        FacesContext fc = FacesContext.getCurrentInstance();
        String urlRecurso = fc.getExternalContext().getRequestPathInfo();
        for (RolHasPermiso p : rolSeleccionado.getRolHasPermisoList()) {
            if (p.getPermiso().getUrl() != null && (p.getPermiso().getUrl().equals(urlRecurso)
                    || p.getPermiso().getUrl().equals("index.xhtml"))) {
                return true;
            }
        }
        return false;
    }

    public List<Permiso> hijos(int id){
        return permisoFacade.consultarHijos(id);
    }
    
    public String Mensaje(){
        ArrayList<String> Mensajes = new ArrayList<>();
        Mensajes.add("“El mejor momento para plantar un árbol fue hace 20 años. El segundo mejor momento es AHORA.”");
        Mensajes.add("Mi mujer y yo fuimos felices durante 20 años. Luego, nos conocimos");
        Mensajes.add("“Cada día es una nueva oportunidad para cambiar tu vida.”");
        Mensajes.add("“El momento que da más miedo es siempre justo antes de empezar.”");
        Mensajes.add("“El éxito en la vida no se mide por lo que logras sino por los obstáculos que superas.”");
        Mensajes.add("«Mañana es una excusa maravillosa, ¿No crees?»");
        Mensajes.add("«Esperar ser otra persona es una pérdida de tiempo.»");
        Mensajes.add("«Debes hacer las cosas que crees que no puedes hacer.»");
        Mensajes.add("«Tu mejor profesor es tu mayor error.»");
        Mensajes.add("“Las cosas buenas llegan a los que saben esperar.”");
        Mensajes.add("Seguramente existen muchas razones para los divorcios, pero la principal es y será la boda");
        Mensajes.add("“No busques el momento perfecto, solo busca el momento y hazlo perfecto.”");
        Mensajes.add("“No importa lo que pase, siempre tendrás una historia que contar.”");
        Mensajes.add("Tener la conciencia limpia es señal de mala memoria");
        Mensajes.add("“Queda terminantemente prohibido levantarse sin ilusiones.”");
        Mensajes.add("“Levántate, suspira, sonríe, y sigue adelante.”");
        Mensajes.add("Me gustaría tomarte en serio pero hacerlo sería ofender tu inteligencia");
        Mensajes.add("“Ojalá vivas todos los días de tu vida.”");
        Mensajes.add("Sólo hay dos cosas infinitas: el universo y la estupidez humana. Y no estoy tan seguro de la primera");
        Mensajes.add("“Una persona que nunca se equivocó nunca intentó nada nuevo.”");
        Mensajes.add("Nunca olvido una cara, pero en su caso estaré encantado de hacer una excepción");
        Mensajes.add("“Aquél que lo piensa mucho antes de dar un paso, se pasará toda su vida en un solo pie.”");
        Mensajes.add("“Lo único imposible es aquello que no intentas.”");
        Mensajes.add("“La disciplina es el puente entre tus metas y tus logros.”");
        Mensajes.add("«Los retos son lo que hacen la vida interesante, y superarlos es lo que hace que la vida tenga un significado.»");
        Mensajes.add("La edad es algo que no importa, a menos que sea usted un queso");
        Mensajes.add("“Si la montaña que subes parece cada vez más imponente es que la cima está cada vez más cerca.”");
        Mensajes.add("“Vive. El dinero se recupera, el tiempo no.”");
        Mensajes.add("Me gustan los largos paseos, especialmente cuando los toman gente molesta");
        Mensajes.add("“Mientras más fuertes sean tus pruebas, más grandes serán tus victorias.”");
        Mensajes.add("Claro que lo entiendo. Incluso un niño de cinco años podría entenderlo. Traigan un niño de cinco años!");
        Mensajes.add("No te tomes la vida demasiado en serio. No saldrás de ella con vida");
        Mensajes.add("”Si buscas resultados distintos, no hagas siempre lo mismo.”");
        Mensajes.add("«Ser positiva en una situación negativa no es ser inocente, es ser líder.»");
        Mensajes.add("“¿Quieres renunciar? Pues entonces es el momento de insistir más.”");
        Mensajes.add("Todo es divertido, con tal de que le suceda a otra persona");
        Mensajes.add("“Ningún mar en calma hizo experto a un marinero.”");
        Mensajes.add("“Si el plan no funciona, cambia el plan, pero no cambies la meta.”");
        Mensajes.add("“Las dificultades no existen para hacerte renunciar sino para hacerte más fuerte.”");
        Mensajes.add("«Si te cansas, aprende a descansar, no a renunciar»");
        Mensajes.add("Un experto es alguien que te explica algo sencillo de forma confusa de tal manera que te hace pensar que la confusión sea culpa tuya");
        Mensajes.add("Fuera del perro, un libro es probablemente el mejor amigo del homnre, y dentro del perro probablemente está demasiado oscuro para leer");
        Mensajes.add("Si pudieras patear en el trasero al responsable de casi todos tus problemas, no podrías sentarte por un mes");
        Mensajes.add("Suelo cocinar con vino, a veces incluso se lo agrego a la comida");
        Mensajes.add("La vida es dura. Después de todo, te mata");
        Mensajes.add("“Si te sientes perdido en el mundo es porque todavía no has salido a buscarte.”");
        Mensajes.add("Esas personas que creen que lo saben todo son una verdadera molestia para aquellos que de verdad lo sabemos todo");
        Mensajes.add("Cuando la vida te da limones, arrójaselos a alguien a los ojos");
        Mensajes.add("El sexo es como el mus: sí no tienes buena pareja... más te vale tener una buena mano");
        Mensajes.add("“Trabaja en silencio, haz que el éxito haga todo el ruido.”");
        Mensajes.add("“Rara vez nos damos cuenta que estamos rodeados por lo extraordinario.”");
        Mensajes.add("Nunca dejes para mañana lo que puedes hacer pasado mañana");
        Mensajes.add("Ríe y el mundo reirá contigo, ronca y dormirás solo");
        Mensajes.add("Encuentro la telvisión muy educativa. Cada vez que alguien la enciende, me retiro a otra habitación y leo un libro");
        Mensajes.add("Hago ejercicio a menudo. Mira, precisamente ayer tomé el desayuno en la cama");
        Mensajes.add("Mi idea de una persona agradable es una persona que está de acuerdo conmigo");
        Mensajes.add("“Trabajar duro te llevará a la cima, disfrutar el camino te llevará más lejos.”");
        Mensajes.add("El amor nunca muere de hambre; con frecuencia, de indigestión");
        Mensajes.add("Santa Claus tenía la idea correcta: visita a la gente una vez al año");
        Mensajes.add("Para volver a ser joven yo haría cualquier cosa en el mundo excepto ejercicio, levantarme temprano o ser respetable");
        Mensajes.add("Mis plantas de plástico murieron porque no aparenté regarlas");
        Mensajes.add("Me puse a dieta, juré que no volvería a beber ni a comer con exceso y en catorce días había perdido dos semanas");
        Mensajes.add("¡Odio las tareas del hogar! Haces las camas, limpias los platos y seis meses después tienes que empezar de nuevo");
        
        int numMsg = (int) Math.floor(Math.random()*62+1);
        
        String Mensaje = Mensajes.get(numMsg);
        
        return Mensaje;
    }

    public Rol getRolSeleccionado() {
        return rolSeleccionado;
    }

    public void setRolSeleccionado(Rol rolSeleccionado) {
        System.out.println("Rol - " + rolSeleccionado.getRol());
        this.rolSeleccionado = rolSeleccionado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
