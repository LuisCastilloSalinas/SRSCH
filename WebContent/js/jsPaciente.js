/**
 * 
 */
$("#calcular").click(function obtenerPacientes() {

	
	  var fecha1 = $('#dpd1').val();
	  var fecha2 = $('#dpd2').val();
	  if(fecha1!="" && fecha2!=""){
	  $(function (){
			$(".tabla").find('tr:gt(0)').remove();
		});
	  
	  $.getJSON("PacienteUsaMasSistema?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
	            $.each(responseJson, function(key, value) {
	                      $('.tabla tr:last').after(
	                          '<tr><td>' + value.nombrePaciente + '</td><td>' + value.porcentajeOcupacion
	                              + '</td></tr>');
	                    });
	          });
	  $("#reporte").fadeIn(1000);
	}else {
		alert("debe ingresar rango de fechas");
	}
	  });

$("#buscarM").click(function buscarHorasAPSM(){
	
	var myselect=$("#myselect").val();
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	
	if(fecha1!="" && fecha2!=""){
	$(function (){
		$(".tabla").find('tr:gt(0)').remove();
	});
	
	 $.getJSON("BuscarHoraAPSM?myselect="+myselect+"&fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
         $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td><td>'+myselect+'</td></tr>');
                 });
         $("#reporte").fadeIn(1000);
       });
	}else {
		alert("debe ingresar rango de fechas");
	}
	
});


$("#buscarR").click(function buscarHorasAPSR(){
	
	var fecha1 = $('#dpd1').val();
	var fecha2 = $('#dpd2').val();
	if(fecha1!="" && fecha2!=""){
	$(function (){
		$(".tabla").find('tr:gt(0)').remove();
	});
	
	 $.getJSON("BuscarHoraAPSR?fecha1=" + fecha1 + "&fecha2=" + fecha2+"",function(responseJson) {
		
		 if(responseJson.length>0){
		
		 $.each(responseJson, function(key, value) {
                   $('.tabla tr:last').after(
                       '<tr><td>' + value.id + '</td><td>' + value.fecha
                           + '</td><td>'+value.nombreMedico+'</td>'
                           +'<td><button id="btnReserva" value="reservar" class="btn btn-default">reservar</button></td></tr>');
                 });
        $(".tabla").show();
        $("#reporte").fadeIn(1000);
	 }else {
		 $(".tabla").hide();
		 alert("no existen horas medicas");
		 
	 }
       });
	}else {
		alert("debe ingresar rango de fechas");
	}
	
	
});

("#btnReserva").click(function(){
	alert("reserva");
});



