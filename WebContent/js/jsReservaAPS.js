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
