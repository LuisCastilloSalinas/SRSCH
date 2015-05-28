/**
 * 
 */
$("document").ready(function() {
	$('#dpd1').datetimepicker();
	
	
	$.getJSON('ServletObBox', function(responseJson) {
		var $select = $('#myselect');

		$.each(responseJson, function(key, text) {
			$('#myselect').append($('<option>', {
				
				value : text.id,
				text : text.descripcion
			}));
		});
	});

});
