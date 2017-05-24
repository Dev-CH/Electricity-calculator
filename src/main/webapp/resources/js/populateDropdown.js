
$(document).ready(
		function(){
			$.getJSON('/Bill_Calculator/data.json', {
				ajax : 'true'
			}, function(data){
					var dropDown ='<option value="">Nothing Selected</option>';
					var len = data.length;
					for (var i = 0; i < len; i++) {
						dropDown += '<option data-subtext="'+ data[i].name + '" "value="">'
								+ data[i].model + '</option>';
					}
					dropDown += '</option>';
		
					$('#data').html(dropDown);
					$('#data').selectpicker('refresh');
			});
		});	