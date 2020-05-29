
var clave = document.getElementById("Clave"); 

var numeros="0123456789";

function tiene_numeros(clave){
   for(i=0; i<clave.length; i++){
      if (numeros.indexOf(clave.charAt(i),0)!=-1){
         return 1;
      }
   }
   return 0;
}

var letras="abcdefghyjklmnñopqrstuvwxyz";

function tiene_minusculas(clave){
   for(i=0; i<clave.length; i++){
      if (letras.indexOf(clave.charAt(i),0)!=-1){
         return 1;
      }
   }
   return 0;
}

var letras_mayusculas="ABCDEFGHYJKLMNÑOPQRSTUVWXYZ";

function tiene_mayusculas(clave){
   for(i=0; i<clave.length; i++){
      if (letras_mayusculas.indexOf(clave.charAt(i),0)!=-1){
         return 1;
      }
   }
   return 0;
}

function seguridad_clave(clave){
    var seguridad = 0;
    if (clave.length!=0){
       if (tiene_numeros(clave) && tiene_letras(clave)){
          seguridad += 30;
       }
       if (tiene_minusculas(clave) && tiene_mayusculas(clave)){
          seguridad += 30;
       }
       if (clave.length >= 4 && clave.length <= 5){
          seguridad += 10;
       }else{
          if (clave.length >= 6 && clave.length <= 8){
             seguridad += 30;
          }else{
             if (clave.length > 8){
                seguridad += 40;
             }
          }
       }
    }
    return seguridad            
 } 

 function muestra_seguridad_clave(clave,formulario){
    seguridad=seguridad_clave(clave);
    var Nivel;
    
    if(seguridad_clave(clave)<40){
        Nivel = "Bajo"; 
    } 
    else if(seguridad_clave(clave)>=40 && seguridad_clave(clave)<70){
        Nivel = "Medio"
    }
    else if(seguridad_clave(clave)>70){
        Nivel = "Alto"
    };


    formulario.seguridad.value=seguridad + "%   "+Nivel;
 }


    //Válida si el formato del correo es correcto

document.getElementById('email').addEventListener('input', function() {
    campo = event.target;
    valido = document.getElementById('emailOK');
        
    emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
    //Se muestra un texto a modo de ejemplo, luego va a ser un icono
    if (emailRegex.test(campo.value)) {
      valido.innerText = "Correo válido";
    } else {
      valido.innerText = "Correo incorrecto. Por favor válide la información suministrada ";
    }
});


var btnCorreo = document.getElementById("btnCorreo"),
    validacion = document.getElementById("ValidacionContenedor"),
    Correo = document.getElementById("Correo");

var btnValidar = document.getElementById("btnValidar"),
    ChandePass = document.getElementById("NewContenedor"),
    Verificar = document.getElementById("Veri");

var Pass= document.getElementById("password"),
    Pass2= document.getElementById("repassword"),
    Guardar= document.getElementById("Guardar");



btnCorreo.addEventListener('click',function(){

    if(document.getElementById("email").value == "" ){
        alert('Este campo es obligatorio, por favor introduzca su correo electrónico');
        document.getElementById("email").focus();
        return;
    }

    Correo.classList.add("Oculto");
    validacion.classList.remove("Oculto");
    Verificar.focus();

})



btnValidar.addEventListener('click',function(){
    
    if(Verificar.value == ""){
        alert("Por favor ingrese el código enviado a su correo electrónico");
        Verficiar.focus();
        return;
    };

    if(Verificar.value.length !=6 || isNaN(Verificar.value)){
        alert("El código proporcionado no es válido");
        Verificar.focus();
        return;
    }

    validacion.classList.add("Oculto");
    ChandePass.classList.remove("Oculto");
    Pass.focus();

})    

Guardar.addEventListener('click', function(){

    if(Pass.value == ""){
        alert("No se pueden dejar campos vacios")
        Pass.focus();
        return;
    }

    if(Pass2.value == ""){
        alert("No se pueden dejar campos vacios")
        Pass2.focus();
        return;
    }

    if(Pass.value != Pass2.value){
        alert("Las contraseñas no coinciden. Por favor valide nuevamente la información");
        Pass2.focus();
        return;
    }

    alert("La contraseña fue reestablecida correctamente");
    location.href="/index.html";
})


