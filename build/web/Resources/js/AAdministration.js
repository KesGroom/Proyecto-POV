var actGrado = document.getElementById("actAddGrado");
var actCurso = document.getElementById("actAddCurso");
var actArea = document.getElementById("actAddArea");
var actMateria = document.getElementById("actAddMateria");
var formGrado = document.getElementById("formAddGrado");
var formCurso = document.getElementById("formAddCurso");
var formArea = document.getElementById("formAddArea");
var formMateria = document.getElementById("formAddMateria");
var iconGrado = document.getElementById("iconGrado");
var iconCurso = document.getElementById("iconCurso");
var iconArea = document.getElementById("iconArea");
var iconMateria = document.getElementById("iconMateria");

actGrado.addEventListener('click', function() {
    actGrado.classList.toggle("active");
    formGrado.classList.toggle("active");
    actCurso.classList.remove("active");
    formCurso.classList.remove("active");
    actArea.classList.remove("active");
    formArea.classList.remove("active");
    actMateria.classList.remove("active");
    formMateria.classList.remove("active");
    
    var nameIcon = iconGrado.getAttribute("name");
    if( nameIcon === 'people'){
        iconGrado.setAttribute('name' , 'close-circle');
    } else{
        iconGrado.setAttribute('name' , 'people');
    }
    
    iconCurso.setAttribute('name','people-circle');
    iconArea.setAttribute('name','folder-open');
    iconMateria.setAttribute('name','book');
    
});

actArea.addEventListener('click', function() {
    actArea.classList.toggle("active");
    formArea.classList.toggle("active");
    actCurso.classList.remove("active");
    formCurso.classList.remove("active");
    actGrado.classList.remove("active");
    formGrado.classList.remove("active");
    actMateria.classList.remove("active");
    formMateria.classList.remove("active");
    
    var nameIcon2 = iconArea.getAttribute("name");
    if( nameIcon2 === 'folder-open'){
        iconArea.setAttribute('name' , 'close-circle');
    } else{
        iconArea.setAttribute('name' , 'folder-open');
    }
    
    iconGrado.setAttribute('name','people');
    iconCurso.setAttribute('name','people-circle');
    iconMateria.setAttribute('name','book');
    
});

actCurso.addEventListener('click', function() {
    actCurso.classList.toggle("active");
    formCurso.classList.toggle("active");
    actGrado.classList.remove("active");
    formGrado.classList.remove("active");
    actArea.classList.remove("active");
    formArea.classList.remove("active");
    actMateria.classList.remove("active");
    formMateria.classList.remove("active");
    
    var nameIcon3 = iconCurso.getAttribute("name");
    if( nameIcon3 === 'people-circle'){
        iconCurso.setAttribute('name' , 'close-circle');
    } else{
        iconCurso.setAttribute('name' , 'people-circle');
    }
    
    iconGrado.setAttribute('name','people');
    iconArea.setAttribute('name','folder-open');
    iconMateria.setAttribute('name','book');
    
});


actMateria.addEventListener('click', function() {
    actMateria.classList.toggle("active");
    formMateria.classList.toggle("active");
    actGrado.classList.remove("active");
    formGrado.classList.remove("active");
    actArea.classList.remove("active");
    formArea.classList.remove("active");
    actCurso.classList.remove("active");
    formCurso.classList.remove("active");
    
    var nameIcon4 = iconCurso.getAttribute("name");
    if( nameIcon4 === 'book'){
        iconCurso.setAttribute('name' , 'close-circle');
    } else{
        iconCurso.setAttribute('name' , 'book');
    }
    
    iconGrado.setAttribute('name','people');
    iconArea.setAttribute('name','folder-open');
    iconCurso.setAttribute('name','people-open');
    
});




