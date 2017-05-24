
$(document).ready(function(){
	 $("#userList").on('click','.btnDelete',function(){
	       $(this).closest('tr').remove();
	     });
	});