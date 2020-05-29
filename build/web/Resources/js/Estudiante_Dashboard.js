var date = new Date();
var weekdays = ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"];

var weekday = weekdays[date.getDay()];

var Lun = document.getElementsByClassName("Lunes"); 
var Mar = document.getElementsByClassName("Martes"); 
var Mie = document.getElementsByClassName("Miercoles"); 
var Jue = document.getElementsByClassName("Jueves"); 
var Vie = document.getElementsByClassName("Viernes"); 

function Horario(){

    if(weekday==="Lunes"){
        for(var i=0; i<Lun.length; i++){
            Lun[i].classList.add("today");
        };
        
    }

    else if(weekday==="Martes"){
        for(var i=0; i<Mar.length; i++){
            Mar[i].classList.add("today");
        };
    }
    
    else if(weekday==="Miercoles"){
        for(var i=0; i<Mie.length; i++){
            Mie[i].classList.add("today");
        };
    }

    else if(weekday==="Jueves"){
        for(var i=0; i<Jue.length; i++){
            Jue[i].classList.add("today");
        };
    }

    else if(weekday==="Viernes"){
        for(var i=0; i<Vie.length; i++){
            Vie[i].classList.add("today");
        };
    }
};

//comillas = &quot;
//á = &aacute;
//é = &eacute;
//í = &iacute;
//ó = &oacute;
//ú = &uacute;
//ñ = &ntilde;

var mensajes = [
    "&quot;El mejor momento para plantar un &aacute;rbol fue hace 20 a&ntilde;os. El segundo mejor momento es AHORA.&quot;",
    "&quot;Cada d&iacute;a es una nueva oportunidad para cambiar tu vida.&quot;",
    "“Ningún mar en calma hizo experto a un marinero.”",
    "“El momento que da más miedo es siempre justo antes de empezar.”",
    "&quot;El &eacute;xito en la vida no se mide por lo que logras sino por los obst&aacute;culos que superas.&quot;",
    "«Mañana es una excusa maravillosa, ¿No crees?»","«Esperar ser otra persona es una pérdida de tiempo.»",
    "«Debes hacer las cosas que crees que no puedes hacer.»",
    "«Tu mejor profesor es tu mayor error.»",
    "“Las cosas buenas llegan a los que saben esperar.”",
    "“No busques el momento perfecto, solo busca el momento y hazlo perfecto.”",
    "“Si te sientes perdido en el mundo es porque todavía no has salido a buscarte.”",
    "“No importa lo que pase, siempre tendrás una historia que contar.”",
    "“Queda terminantemente prohibido levantarse sin ilusiones.”",
    "“Levántate, suspira, sonríe, y sigue adelante.”",
    "“Ojalá vivas todos los días de tu vida.”",
    "“Las dificultades no existen para hacerte renunciar sino para hacerte más fuerte.”",
    "“Una persona que nunca se equivocó nunca intentó nada nuevo.”",
    "«Los retos son lo que hacen la vida interesante, y superarlos es lo que hace que la vida tenga un significado.»",
    "“Aquél que lo piensa mucho antes de dar un paso, se pasará toda su vida en un solo pie.”",
    "“Rara vez nos damos cuenta que estamos rodeados por lo extraordinario.”",
    "“Vive. El dinero se recupera, el tiempo no.”",
    "“Lo único imposible es aquello que no intentas.”",
    "“La disciplina es el puente entre tus metas y tus logros.”",
    "“Si la montaña que subes parece cada vez más imponente es que la cima está cada vez más cerca.”",
    "”Si buscas resultados distintos, no hagas siempre lo mismo.”",
    "“Mientras más fuertes sean tus pruebas, más grandes serán tus victorias.”",
    "“Si el plan no funciona, cambia el plan, pero no cambies la meta.”",
    "“Trabaja en silencio, haz que el éxito haga todo el ruido.”",
    "«Si te cansas, aprende a descansar, no a renunciar»",
    "«Ser positiva en una situación negativa no es ser inocente, es ser líder.»",
    "“¿Quieres renunciar? Pues entonces es el momento de insistir más.”",
    "“Trabajar duro te llevará a la cima, disfrutar el camino te llevará más lejos.”"];
  
document.getElementById("mensaje").innerHTML = mensajes[date.getDay()-1];
    
