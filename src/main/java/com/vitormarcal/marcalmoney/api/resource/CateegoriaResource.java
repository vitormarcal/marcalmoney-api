package com.vitormarcal.marcalmoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitormarcal.marcalmoney.api.model.Categoria;
import com.vitormarcal.marcalmoney.api.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CateegoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
}
