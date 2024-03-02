package br.com.escola.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.escola.api.model.Estudante;


@RestController
@RequestMapping("/estudante")
class EstudanteController{
	private List<Estudante> estudantes = new ArrayList<>();
	
    public EstudanteController() {
    	estudantes.addAll(List.of(
    				new Estudante ("Paulo"),
    				new Estudante ("Romero"),
    				new Estudante ("Cássio"),
    				new Estudante ("Sergio")
    			
    			));
    }
    
    @GetMapping
    Iterable<Estudante> getEstudantes(){
    	return estudantes;
    }
    
    @GetMapping("/{id}")
    Optional<Estudante> getEstudanteById(@PathVariable String id){
    	for(Estudante e: estudantes) {
    		if(e.getId().equals(id)) {
    			return Optional.of(e);
    		}
    	}
    	return Optional.empty();
    }
    
    @PostMapping
	Estudante postEstudante(@RequestBody Estudante estudante) {
		estudantes.add(estudante);
		return estudante;
	}
	
    @PutMapping("/{id}")
	ResponseEntity<Estudante> putCoffee(@PathVariable String id,
									 @RequestBody Estudante estudante) {
		int EstudanteIndex = -1;

		for (Estudante e: estudantes) {
			if (e.getId().equals(id)) {
				EstudanteIndex = estudantes.indexOf(e);
				estudantes.set(EstudanteIndex, estudante);
			}
		}

		return (EstudanteIndex == -1) ?
				new ResponseEntity<>(postEstudante(estudante), HttpStatus.CREATED) :
				new ResponseEntity<>(estudante, HttpStatus.OK);
	}
    
    @DeleteMapping("/{id}")
	void deleteEstudante(@PathVariable String id) {
		estudantes.removeIf(c -> c.getId().equals(id));
	}
    
}
