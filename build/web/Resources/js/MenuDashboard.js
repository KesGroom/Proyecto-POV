

  //Se crea una constante que lee el elemnto identificado con la clase .toogle-btn
var BtnToogle = document.querySelector('.toogle_btn');

//Se realiza una funcion donde al presionar el boton con la clase .toogle-btn activará la clase active a los id seleccionados
BtnToogle.addEventListener('click', function(){

    document.getElementById('slide-out').classList.toggle('active');
    document.getElementById('main').classList.toggle('active');
    document.getElementById('header').classList.toggle('active');

});


