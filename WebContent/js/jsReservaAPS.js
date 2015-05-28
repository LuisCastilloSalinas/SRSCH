/**
 * 
 */

$("document").ready(function() {
	
	
	$.getJSON('ServletObPaciente', function(responseJson) {
		var $select = $('#selectPaciente');

		$.each(responseJson, function(key, text) {
			$('#selectPaciente').append($('<option>', {
				
				value : text.id,
				text : text.nombre
			}));
		});
	});

});

$("#myselect").change(function(){
	var myselect=$("#myselect").val();
	
	
	$.getJSON('ObtenerHorasAPSMedico?myselect='+myselect+"", function(responseJson) {
		var $select = $('#selectFecha').html('')

		$.each(responseJson, function(key, text) {
			$('#selectFecha').append($('<option>', {
				
				value : text.id,
				text : text.fecha
			}));
		});
	});
	
});

$("#reservar").click(function(){
	var selectPaciente=$("#selectPaciente").val();
	var selectFecha=$("#selectFecha").val();
	alert("hola")
	
	$.getJSON('ReservarHoraAPS?selectFecha='+selectFecha+"&selectPaciente="+selectPaciente+"", function(responseJson) {
		var $select = $('#numeroReserva')
		
		$.each(responseJson, function(key, text) {
			$('#numeroReserva').append($('<div>', {
				
				text : text.id
				
			}));
		});
	});
	
});
