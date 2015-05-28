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

$("#buscarM").click(function buscarHorasAPSM(){
	
	var myselect=$("#myselect").val();
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	
	 $.getJSON("BuscarHoraAPSM?myselect="+myselect+"&fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
         $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td><td>'+myselect+'</td></tr>');
                 });
         $("#reporte").fadeIn(1000);
       });
	
	
});


$("#buscarR").click(function buscarHorasAPSR(){
	
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	
	 $.getJSON("BuscarHoraAPSR?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
         $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td><td>'+nombreMedico+'</td></tr>');
                 });
         $("#reporte").fadeIn(1000);
       });
	
	
});

