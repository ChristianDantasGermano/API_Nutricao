
$(document).ready(function() {
	var max_fields = 10; //maximum input boxes allowed
	var wrapper = $("#ingredientes_form"); //Fields wrapper
	var add_button = $("#button_add"); //Add button ID

	var x = 1; //initial text box count
	$(add_button).click(function(e) { //on add input button click
		e.preventDefault();
		if (x < max_fields) { //max input box allowed
			x++; //text box increment
			
			$(wrapper).append('<div class="input-group"> <select id="inputAlimento" class="form-control"> <option selected>Café</option> <option>Canela</option> <option>Banana</option> <option>Açúcar</option> <option>Chocolate</option></select> <input type="number" aria-label="Last name" class="form-control" placeholder = "Quantidade"><button class="remove_field">X</button></div>'); //add input box
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