/**
 * 
 */
$("document").ready(function() {
	$.getJSON('ObtenerMedico', function(responseJson) {
		var $select = $('#myselect');

		$.each(responseJson, function(key, text) {
		
			$('#myselect').append($('<option>', {
				value : text.id,
				text : text.nombre
			}));
		});
	});

});

$("#calcular").click(function obtenerPacientes() {

	  var fecha1 = $('#dpd1').val();
	  var fecha2 = $('#dpd2').val();
	  $.getJSON("MedicoMasSolicitado?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
	            $.each(responseJson, function(key, value) {
	                      $('.tabla tr:last').after(
	                          '<tr><td>' + value.nombre + '</td><td>' + value.porcentajeOcupacion
	                              + '</td></tr>');
	                    });
	          });
	  $("#reporte").fadeIn(1000);
	});
