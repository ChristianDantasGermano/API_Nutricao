$(document).ready(function() {
	var max_fields      = 10;
	var wrapper   		= $("#input_minerais");
	var add_button      = $("#add_minerais_button");
	
	var x = 1; //initlal text box count
	$(add_button).click(function(e){ //on add input button click
		e.preventDefault();
		if(x < max_fields){ //max input box allowed
			$(wrapper).append('<div class="input-group">'+
			'<input name="minerios['+x+'].nomeMinerio" type="text" aria-label="mineral"'+
			'class="form-control" placeholder="Mineral">'+ 
			'<input name="minerios['+x+'].quantidade" type="text"'+
			'aria-label="quantidadeMin" class="form-control" placeholder="Quantidade(mg)">'+
			'<a id="remove_field" href="#" class="dynamicButtons"><h5 class="red">X</h5></a>'+
			'</div>'); //add input box
			x++; //text box increment
		}
	});
	
	$(wrapper).on("click","#remove_field", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); x--;
	})
});

$(document).ready(function() {
	var max_fields_vit      = 10;
	var wrapper_vit   		= $("#input_vitamina");
	var add_button_vit     = $("#add_vitamina_button");
	
	var i = 1; //initlal text box count
	$(add_button_vit).click(function(e){ //on add input button click
		e.preventDefault();
		if(i < max_fields_vit){ //max input box allowed
			$(wrapper_vit).append('<div class="input-group">'+
			'<input name="vitaminas['+i+'].nomeVitamina" type="text" aria-label="vitaminas"'+
			'class="form-control" placeholder="Vitamina">'+ 
			'<input name="vitaminas['+i+'].quantidade" type="number"'+
			'aria-label="quantidadeVit" class="form-control" placeholder="Quantidade(mg)">'+
			'<a id="remove_field" href="#" class="dynamicButtons"><h5 class="red">X</h5></a>'+
			'</div>'); //add input box
			i++; //text box increment
		}
	});
	
	$(wrapper_vit).on("click","#remove_field", function(e){ //user click on remove text
		e.preventDefault(); $(this).parent('div').remove(); i--;
	})
});