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
	  if(fecha1!="" && fecha2!=""){
	  $(function (){
			$(".tabla").find('tr:gt(0)').remove();
		});
	  $.getJSON("MedicoMasSolicitado?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
	            $.each(responseJson, function(key, value) {
	                      $('.tabla tr:last').after(
	                          '<tr><td>' + value.nombre + '</td><td>' + value.porcentajeOcupacion
	                              + '</td></tr>');
	                    });
	          });
	  $("#reporte").fadeIn(1000);
	}else {
		alert("debe ingresar rango de fechas");
	}
	  
	  });

$("#buscar").click(function buscarSusHoras(){
	var myselect=$("#myselect").val();
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	if(fecha1!="" && fecha2!=""){
	$(function (){
		$(".tabla").find('tr:gt(0)').remove();
	});
	
	 $.getJSON("BuscarSuDisponibilidadHora?myselect="+myselect+"&fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
         if(responseJson.length >0){
		 $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td></tr>');
                 });
         $("#reporte").fadeIn(1000);
         }
         else {
        	 $("#reporte").hide();
        	 alert("no existen horas registradas");
         }
         
       });
	}else {
		alert("debe ingresar rango de fechas");
	}
	
});

