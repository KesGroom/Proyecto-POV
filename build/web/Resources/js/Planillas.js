var meses = new Array ("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
var f=new Date();

document.getElementById('Fecha_Actual').innerHTML = (meses[f.getMonth()] + " " + f.getDate());


var Frases = [

    "No te tomes la vida demasiado en serio. No saldrás de ella con vida (Elbert Hubbard)",
    "Tener la conciencia limpia es señal de mala memoria (Steven Wright)",
    "Me gustan los largos paseos, especialmente cuando los toman gente molesta (Fred Allen)",
    "Todo es divertido, con tal de que le suceda a otra persona (Will Rogers)",
    "Sólo hay dos cosas infinitas: el universo y la estupidez humana. Y no estoy tan seguro de la primera (Albert Einstein)",
    "Un experto es alguien que te explica algo sencillo de forma confusa de tal manera que te hace pensar que la confusión sea culpa tuya (William Castle)",
    "Claro que lo entiendo. Incluso un niño de cinco años podría entenderlo. Que me traigan un niño de cinco años! (Groucho Marx)",
    "Fuera del perro, un libro es probablemente el mejor amigo del homnre, y dentro del perro probablemente está demasiado oscuro para leer (Grouche Marx)",
    "La edad es algo que no importa, a menos que sea usted un queso (Luis Buñuel)",
    "Suelo cocinar con vino, a veces incluso se lo agregoa la comida (W.C Fields)",
    "Mi mujer y yo fuimos felices durante 20 años. Luego, nos conocimos (Rodney Dangerfield)",
    "La vida es dura. Después de todo, te mata (Katherine Hepburn)",
    "Cuando la vida te da limones, arrójaselos a alguien a los ojos (Cathy Guisewite)",
    "Seguramente existen muchas razones para los divorcios, pero la principal es y será la boda (Jerry Lewis)",
    "Si pudieras patear en el trasero al responsable de casi todos tus problemas, no podrías sentarte por un mes (Theodore Roosevelt)",
    "Nunca dejes para mañana lo que puedes hacer pasado mañana (Mark Twain)",
    "Mi idea de una persona agradable es una persona que está de acuerdo conmigo (Benjamin Disraeli)",
    "Me gustaría tomarte en serio pero hacerlo sería ofender tu inteligencia (George Bernand Shaw)",
    "Nunca olvido una cara, pero en su caso estaré encantado de hacer una excepción (Groucho Marx)",
    "Ríe y el mundo reirá contigo, ronca y dormirás solo (Anthony Burgess)",
    "Encuentro la telvisión muy educativa. Cada vez que alguien la enciende, me retiro a otra habitación y leo un libro (Groucho Marx)",
    "El sexo es como el mus: sí no tienes buena pareja... más te vale tener una buena mano (Woody Allen)",
    "Esas personas que creen que lo saben todo son una verdadera molestia para aquellos que de verdad lo sabemos todo (Isaac Asimov)",
    "El amor nunca muere de hablre; con frecuencia, de indigestión (Ninon de Lenclos)",
    "Santa Claus tenía la idea correcta: visita a la gente una vez al año (Víctor Borge)",
    "Para volver a ser joven yo haría cualquier cosa en el mundo excepto ejercicio, levantarme temprano o ser respetable (Oscar Wilde)",
    "Mis plantas de plástico murieron porque no aparenté regarlas (Mitch Herberg)",
    "Me puse a dieta, juré que no volvería a beber ni a comer con exceso y en catorce días había perdido dos semanas (Joe E. Lewis)",
    "Hago ejercicio a menudo. Mira, precisamente ayer tomé el desayuno en la cama (Oscar Wilde)",
    "¡Odio las tareas del hogar! Haces las camas, limpias los platos y seis meses después tienes que empezar de nuevo (Joan Rivers)"
]

document.getElementById('Mensajes').innerHTML=Frases[(f.getDay()-1)];

var Per = document.getElementById('periodo');



    var Periodo;

    if(f.getDate() >= 1 && f.getMonth() < 3){
        Periodo = "Primer Periodo";
    }
    else if(f.getDate() >= 1 && f.getMonth() >=3 && f.getMonth() < 7 ){
        Periodo = "Segundo Periodo";
    }
    else if(f.getDate() >= 1 && f.getMonth() >= 7){
        Periodo = "Tercer Periodo";
    };

    Per.innerHTML = Periodo;
