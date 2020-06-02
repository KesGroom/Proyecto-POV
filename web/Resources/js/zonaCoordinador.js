var actUsers = document.getElementById("actAddUser");
var actRol = document.getElementById("actAddRol");
var actTipo = document.getElementById("actAddTipo");
var formUser = document.getElementById("formAddUser");
var formRol = document.getElementById("formAddRol");
var formTipo = document.getElementById("formAddTipo");
var iconUser = document.getElementById("iconUser");
var iconRol = document.getElementById("iconRol");
var iconTipo = document.getElementById("iconTipo");

actUsers.addEventListener('click', function() {
    actUsers.classList.toggle("active");
    formUser.classList.toggle("active");
    actRol.classList.remove("active");
    formRol.classList.remove("active");
    actTipo.classList.remove("active");
    formTipo.classList.remove("active");
    
    var nameIcon = iconUser.getAttribute("name");
    if( nameIcon === 'person-add'){
        iconUser.setAttribute('name' , 'close-circle');
    } else{
        iconUser.setAttribute('name' , 'person-add');
    }
    
    iconRol.setAttribute('name','body');
    iconTipo.setAttribute('name','card');
    
});

actTipo.addEventListener('click', function() {
    actTipo.classList.toggle("active");
    formTipo.classList.toggle("active");
    actRol.classList.remove("active");
    formRol.classList.remove("active");
    actUsers.classList.remove("active");
    formUser.classList.remove("active");
    
    var nameIcon2 = iconTipo.getAttribute("name");
    if( nameIcon2 === 'card'){
        iconTipo.setAttribute('name' , 'close-circle');
    } else{
        iconTipo.setAttribute('name' , 'card');
    }
    
    iconRol.setAttribute('name','body');
    iconUser.setAttribute('name','person-add');
    
});

actRol.addEventListener('click', function() {
    actRol.classList.toggle("active");
    formRol.classList.toggle("active");
    actUsers.classList.remove("active");
    formUser.classList.remove("active");
    actTipo.classList.remove("active");
    formTipo.classList.remove("active");
    
    var nameIcon3 = iconRol.getAttribute("name");
    if( nameIcon3 === 'body'){
        iconRol.setAttribute('name' , 'close-circle');
    } else{
        iconRol.setAttribute('name' , 'body');
    }
    
    iconUser.setAttribute('name','person-add');
    iconTipo.setAttribute('name','card');
    
});

