/**
 * 
 */


$("document").ready(function() {
	var current = new Date(); //'Mar 11 2015' current.getTime() = 1426060964567
	var followingDay = new Date(current.getTime() + 86400000); // + 1 day in ms
	followingDay.toLocaleDateString();
	
	$('#dpd1').datetimepicker({
		 format : 'd-m-Y H:i',
		 lang:'es',
		 value:current,
		 allowTimes:['08:00','08:15','08:30','08:45',
		             '09:00','09:15','09:30','09:45',
		             '10:00','10:15','10:30','10:45',
		             '11:00','11:15','11:30','11:45',
		             '12:00','12:15','12:30','12:45',
		             '13:00','13:15','13:30','13:45',
		             '14:00','14:15','14:30','14:45',
		             '15:00','15:15','15:30','15:45',
		             '16:00','16:15','16:30','16:45',
		             '17:00','17:15','17:30'],
		 theme:'dark'
	});
	$('#dpd2').datetimepicker({
		 format : 'd-m-Y H:i',
		 value:followingDay,
		 lang:'es',
		 allowTimes:['08:00','08:15','08:30','08:45',
		             '09:00','09:15','09:30','09:45',
		             '10:00','10:15','10:30','10:45',
		             '11:00','11:15','11:30','11:45',
		             '12:00','12:15','12:30','12:45',
		             '13:00','13:15','13:30','13:45',
		             '14:00','14:15','14:30','14:45',
		             '15:00','15:15','15:30','15:45',
		             '16:00','16:15','16:30','16:45',
		             '17:00','17:15','17:30'],
		 theme:'dark'
	});
		 
	});
	