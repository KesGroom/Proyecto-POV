
    //Validaciones index
    //Inicio de sesión

    var tipoDocumento = document.getElementById("Tipo"),
        documentoInicio = document.getElementById("NoDoc"),
        contrasennaInicio = document.getElementById("Pass");
        btnInicio = document.getElementById("btnInicio");

    btnInicio.addEventListener('click', function(){

        if(tipoDocumento.value == "0"){
            alert("No se permiten campos vacios. Por favor seleccione una opción");
            tipoDocumento.focus();
            return;
        }

        if(documentoInicio.value == ""){
            alert("No se permiten campos vacios. Por favor ingrese la información solicitada");
            documentoInicio.focus();
            return;
        }

        if(isNaN(documentoInicio.value) || documentoInicio.value.length >10){
            alert("El documento ingresado es érroneo o no existe, por favor válide nuevamente la información");
            documentoInicio.focus();
            return;
        };

        if(contrasennaInicio.value == ""){
            alert("No se permiten campos vacios. Por favor ingrese la información solicitada");
            contrasennaInicio.focus();
            return;
        };

        if(contrasennaInicio.value.length<8){
            alert("Este campo requiere el ingreso de una contraseña de 8 o más caracteres, por favor válide la información")
            return;
        };

        alert("Se ha completado el formulario satisfactoriamente")
        //Se comenta el submit para evitar ser redireccionado
        btnInicio.submit();
    });

    //Sección contactenos
        // var name = $('#Nombre'),
        //     Tel = $('#Tel'),
        //     mail = $('#email'),
        //     Asunto = $('#textarea1'),
        //     btnEnvio = $('#btnContacto');
 

    Contactos.btnContacto.addEventListener('click',function(){

            if(Contactos.Nombre.value == ""){
                alert("Se solicita que ingrese su nombre completo.");
                Contactos.Nombre.focus();
                return;
            }

            if(Contactos.Tel.value == ""){
                alert("Se solicita un contacto para remitir la respuesta. Por favor ingrese la información solicitada");
                Contactos.Tel.focus();
                return;
            }

            if(isNaN(Contactos.Tel.value) || Contactos.Tel.value.length !=10){
                alert("Asegurese de ingresar el número correctamente, solo números y sin espacios, gracias");
                Contactos.Tel.focus();
                return;
            }

            if(Contactos.email.value == ""){
                alert("Se solicita un correo para poder remitir la respuesta. Por favor ingrese la información solicitada");
                Contactos.email.focus();
                return;
            }

            if(Contactos.Asunto.value == ""){
                alert("Por favor dinos cual es el inconveniente que se presentao en que podemos ayudarte. Por favor ingrese la información solicitada");
                Contactos.Asunto.focus();
                return;
            }

            alert("El formulario se realizo correctamente");
            //Se comenta el submit para evitar ser redireccionado
            // Contactos.submit();
        });


