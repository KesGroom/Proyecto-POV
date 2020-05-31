
var actUsers = document.getElementById("actAddUser");
var formUser = document.getElementById("formAddUser");

actUsers.addEventListener('click', function() {
    actUsers.classList.toggle("active");
    formUser.classList.toggle("active");
});
