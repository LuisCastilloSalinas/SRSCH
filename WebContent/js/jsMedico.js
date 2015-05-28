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

$("#calcular").click(function obtenerMedicos() {

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

$("#buscar").click(function buscarSusHoras(){
	var myselect=$("#myselect").val();
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	$(function (){
		$(".tabla").find('tr:gt(0)').remove();
	});
	
	 $.getJSON("BuscarSuDisponibilidadHora?myselect="+myselect+"&fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
         $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td></tr>');
                 });
         $("#reporte").fadeIn(1000);
       });
	
});
