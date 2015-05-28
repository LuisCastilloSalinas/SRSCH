/**
 * 
 */
$("#calcular").click(function obtenerPacientes() {

	  var fecha1 = $('#dpd1').val();
	  var fecha2 = $('#dpd2').val();
	
	  $.getJSON("PacienteUsaMasSistema?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
	            $.each(responseJson, function(key, value) {
	                      $('.tabla tr:last').after(
	                          '<tr><td>' + value.nombrePaciente + '</td><td>' + value.porcentajeOcupacion
	                              + '</td></tr>');
	                    });
	          });
	  $("#reporte").fadeIn(1000);
	});

$("#reset").click(function (){
	$("#dpd1").empty();
});