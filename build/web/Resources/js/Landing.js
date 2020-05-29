$(function(){

    var header = document.getElementById("header");
    var headroom = new Headroom(header);

    headroom.init();

    //menu responsive
    //calculamos el ancho de la página

    var ancho = $(window).width(),
        enlaces = $('#enlaces'),
        btnMenu = $('#btn-menu'),
        icono = $('#btn-menu .icono');


        if(ancho < 865){
            enlaces.hide();
            icono.addClass('fa-bars');   
        }

        btnMenu.on('click', function(e){
            enlaces.slideToggle();
            icono.toggleClass('fa-bars');
            icono.toggleClass('fa-times');
        });

        $(window).on('resize', function(){
            if($(this).width() > 865){
                enlaces.show();
                icono.addClass('fa-times');
                icono.removeClass('fa-bars');
            } else{
                enlaces.hide();
                icono.addClass('fa-bars');
                icono.removeClass('fa-times');
            }
        });

    var anun = $('#Anuncios'),
        dep = $('#Deportes'),
        mus = $('#Musica'),
        art = $('#Arte'),
        tab1 = $('#tab1'),
        tab2 = $('#tab2'),
        tab3 = $('#tab3'),
        tab4 = $('#tab4');

        tab1.on('click', function(e){
            anun.addClass('important');
            dep.removeClass('important');
            mus.removeClass('important');
            art.removeClass('important');
        });
        tab2.on('click', function(e){
            anun.removeClass('important');
            dep.addClass('important');
            mus.removeClass('important');
            art.removeClass('important');
        });
        tab3.on('click', function(e){
            anun.removeClass('important');
            dep.removeClass('important');
            mus.addClass('important');
            art.removeClass('important');
        });
        tab4.on('click', function(e){
            anun.removeClass('important');
            dep.removeClass('important');
            mus.removeClass('important');
            art.addClass('important');
        });

    var GroupFotos1 = $('#grop1'),
        GroupFotos2 = $('#grop2'),
        GroupFotos3 = $('#grop3'),
        Page1 = $('#Page1'),
        Page2 = $('#Page2'),
        Page3 = $('#Page3');

        Page1.on('click', function(e){

            GroupFotos1.removeClass('GrupoFotosOculto');
            GroupFotos2.addClass('GrupoFotosOculto');
            GroupFotos3.addClass('GrupoFotosOculto');

            Page1.addClass('red');
            Page1.addClass('darken-4');
            Page1.addClass('white-text');
            
            Page2.removeClass('red');
            Page2.removeClass('darken-4');
            Page2.removeClass('white-text');
            
            Page3.removeClass('red');
            Page3.removeClass('darken-4');
            Page3.removeClass('white-text');
        });

        Page2.on('click', function(e){
            GroupFotos1.addClass('GrupoFotosOculto');
            GroupFotos2.removeClass('GrupoFotosOculto');
            GroupFotos3.addClass('GrupoFotosOculto');

            Page1.removeClass('red');
            Page1.removeClass('darken-4');
            Page1.removeClass('white-text');
            
            Page2.addClass('red');
            Page2.addClass('darken-4');
            Page2.addClass('white-text');
            
            Page3.removeClass('red');
            Page3.removeClass('darken-4');
            Page3.removeClass('white-text');
        });

        Page3.on('click', function(e){
            GroupFotos1.addClass('GrupoFotosOculto');
            GroupFotos2.addClass('GrupoFotosOculto');
            GroupFotos3.removeClass('GrupoFotosOculto');

            Page1.removeClass('red');
            Page1.removeClass('darken-4');
            Page1.removeClass('white-text');
            
            Page2.removeClass('red');
            Page2.removeClass('darken-4');
            Page2.removeClass('white-text');
            
            Page3.addClass('red');
            Page3.addClass('darken-4');
            Page3.addClass('white-text');
        });


});