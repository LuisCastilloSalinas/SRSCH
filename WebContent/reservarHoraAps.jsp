<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html lang="es">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css"> 
<title>SRHMSC</title>

</head>
<body style="background-color:black;">

	<div class="container well" style="margin-top: 20px; ">
	 <div class="dropdown col-md-3">
    <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Seleccionar
    <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
      <li role="presentation"><a role="menuitem" tabindex="-1" href="obtenerPorcentajeBox.jsp">Director</a></li>
       <li role="presentation" class="divider"></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="reservarHoraAps.jsp">Paciente</a></li>
       <li role="presentation" class="divider"></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="obtenerHorarioMedico.jsp">M�dico</a></li>
    </ul>
  </div>
  <div class="col-md-3 col-md-offset-6">
  <span class="badge badge-inverse">Paciente</span>
  </div>
		<div class="col-md-12">
			
				<h2 class="text-center">Reservar hora m�dica APS</h2>
			
		</div>
	</div>
	<form action="ReservarHoraAPS" method="post">
		<div class="container">



			<div class="row well">
				<div class="col-md-4 well">
					<ul class="nav nav-pills nav-stacked">
						<li><a href="obtenerHoraAPSPorMedico.jsp">Buscar hora m�dica APS por m�dico</a></li>
						<li><a href="obtenerHoraAPSPorRango.jsp">Buscar hora m�dica APS por rango</a></li>
						<li><a href="reservarHoraAps.jsp">Reservar hora m�dica APS</a></li>
					</ul>

				</div>
				<div class="col-md-8 well">
					<div class="row ">


						<div class="col-md-2">
							<label>M�dico:</label>
						</div>
						<div class="col-md-3  ">

							<select  id="myselect" name="myselect" style="width: 100%">
								<option>----</option>
							</select>
						</div>
					</div>


					

					<div class="row ">


						<div class="col-md-2">
							<label>Hora M�dica:</label>
						</div>
						<div class="col-md-3  ">

							<select  id="selectFecha" name="selectFecha" style="width: 100%">
								<option>----</option>
							</select>
						</div>
					</div>
					
					<div class="row ">


						<div class="col-md-2">
							<label>Paciente:</label>
						</div>
						<div class="col-md-3  ">

							<select  id="selectPaciente" name="selectPaciente" style="width: 100%">
								<option>----</option>
							</select>
						</div>
					</div>

					<div class="row" style="margin-top: 2em;">
						<div class="col-md-2 col-md-offset-4">
							<input type="submit" value="Reservar" >
						</div>
						<div class="col-md-2">
						<button class="btn- btn-danger" type="reset">Limpiar</button>
						</div>
						
					</div>
					
					<div class="row">
					
					${reserva} 
					</div>


				</div>
				
				


			</div>
			<div class="row well">
				<p class='text-center'>---Hospital San Carlos---</p>
				</div>

		</div>


	</form>



	

	<script src="js/jquery-2.1.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-ui.js"></script>
		<script src="js/jquery.datetimepicker.js"></script>
	<script src="js/jsMedico.js"></script>
	<script src="js/jsReservaAPS.js"></script>
	<script src="js/jsUtil.js"></script>
</body>
</html>