$(document).ready(function() {
	var max_fields = 10; //maximum input boxes allowed
	var wrapper = $("#ingredientes_form"); //Fields wrapper
	var add_button = $("#button_add"); //Add button ID
	
	var x = 1; //initial text box count
	$(add_button).click(function(e) { //on add input button click
		e.preventDefault();
		if (x < max_fields) { //max input box allowed
			 //text box increment
			
			$(wrapper).append('<div class="input-group"> <input name = "ingredientes['+x+'].nomeIngrediente" type="text"'+
			' aria-label="Last name" class="form-control" placeholder="Alimento">'+ 
			'<input name = "ingredientes['+x+'].quantidade"  type="number" aria-label="Last name"'+
			' class="form-control"'+
			' placeholder = "Quantidade"><a href="#" class="dynamicButtons remove_field"><h5 class="red">X</h5></a></div>'); //add input box
			x++;
		}
	});

	$(wrapper).on("click", ".remove_field", function(e) { //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); x--;
	})
});


$(document).ready(function() {
$('#chEfeito').change(function() {
	$('#divEfeito').toggle();
})
});