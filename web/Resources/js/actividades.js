$(document).ready(function() {
    $('#Actividades').DataTable({
        "language": {
            "lengthMenu": "Mostrar _MENU_ datos por página",
            "zeroRecords": "No se han encontrado datos",
            "info": "Página _PAGE_ de _PAGES_",
            "infoEmpty": "No se han encontrado resultados",
            "infoFiltered": "(Filtrado entre _MAX_ registros totales)"
        }
    });
    
} );

// function soloNums(e){
//     var key = window.Event?e.which:e.keyCode 
//     return ((key >= 48 && key <= 57) || (key==8))
//   }
  
//   function agregarFila(){
//     document.getElementById("Actividades").insertRow(-1).innerHTML = '<td><div class="input-field"><input type="text" class="validate"></div></td><td><div class="input-field"><input type="text" class="validate" maxlength="6"></div></td><td><div class="input-field"><input type="text" class="validate" maxlength="4" onkeypress="return soloNums(event);"></div></td><td><div class="input-field"><input type="date" class="validate" min="2020-03-01" max="2020-11-31"></div></td><td><div class="input-field"><input type="date" class="validate" min="2020-03-01" max="2020-11-31"></div></td><td><div class="input-field"><textarea class="materialize-textarea"></textarea></div></td>';
//   }
  
//   function eliminarFila(){
//     var table = document.getElementById("Actividades");
//     var rowCount = table.rows.length;
//     //console.log(rowCount);
    
//     if(rowCount <= 1)
//       alert('No se puede eliminar el encabezado');
//     else
//       table.deleteRow(rowCount -1);
//   }