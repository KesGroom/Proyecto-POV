// Activador del Sidenav de materialize
document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.sidenav');
    var instances = M.Sidenav.init(elems);
  });

  //Se crea una constante que lee el elemnto identificado con la clase .toogle-btn
const BtnToogle = document.querySelector('.toogle_btn');

//Se realiza una funcion donde al presionar el boton con la clase .toogle-btn activará la clase active a los id seleccionados
BtnToogle.addEventListener('click', function(){

    document.getElementById('slide-out').classList.toggle('active');
    document.getElementById('main').classList.toggle('active');
    document.getElementById('header').classList.toggle('active');

});

//Esta sección permite controlar la selección del menú del dashboard
//Al seleccionar una opcion esta aplicará las clases indicadas
//y las eliminará de las otras opciones

var Editar = document.getElementById("Editar"),
    Opcion1 = document.getElementById("Opcion1"),
    Opcion2 = document.getElementById("Opcion2"),
    Opcion3 = document.getElementById("Opcion3"),
    Opcion4 = document.getElementById("Opcion4"),
    Opcion5 = document.getElementById("Opcion5")
    Opcion6 = document.getElementById("Opcion6");

Editar.addEventListener('click', function(){

  Editar.classList.add("white-text");
  Editar.classList.add("red");
  Editar.classList.add("darken-4");

  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");
  
  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

})

Opcion1.addEventListener('click', function(){

  Opcion1.classList.add("white-text");
  Opcion1.classList.add("red");
  Opcion1.classList.add("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");

  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");

})

Opcion2.addEventListener('click', function(){

  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.add("white-text");
  Opcion2.classList.add("red");
  Opcion2.classList.add("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");

  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");

})

Opcion3.addEventListener('click',function(){
  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.add("white-text");
  Opcion3.classList.add("red");
  Opcion3.classList.add("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");

  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");

})

Opcion4.addEventListener('click',function(){
  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.add("red");
  Opcion4.classList.add("darken-4");
  Opcion4.classList.add("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");

  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");
})

Opcion5.addEventListener('click',function(){
  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.add("red");
  Opcion5.classList.add("darken-4");
  Opcion5.classList.add("white-text");

  Opcion6.classList.remove("red");
  Opcion6.classList.remove("darken-4");
  Opcion6.classList.remove("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");
})

Opcion6.addEventListener('click', function(){

  Opcion1.classList.remove("white-text");
  Opcion1.classList.remove("red");
  Opcion1.classList.remove("darken-4");

  Opcion2.classList.remove("white-text");
  Opcion2.classList.remove("red");
  Opcion2.classList.remove("darken-4");

  Opcion3.classList.remove("white-text");
  Opcion3.classList.remove("red");
  Opcion3.classList.remove("darken-4");

  Opcion4.classList.remove("red");
  Opcion4.classList.remove("darken-4");
  Opcion4.classList.remove("white-text");
  
  Opcion5.classList.remove("red");
  Opcion5.classList.remove("darken-4");
  Opcion5.classList.remove("white-text");

  Opcion6.classList.add("red");
  Opcion6.classList.add("darken-4");
  Opcion6.classList.add("white-text");

  Editar.classList.remove("white-text");
  Editar.classList.remove("red");
  Editar.classList.remove("darken-4");

});

const LMC = document.getElementById("LateralCel");

  LMC.addEventListener('click',function(){

  document.getElementById("MenuCel").classList.toggle("cerrado")  

  });