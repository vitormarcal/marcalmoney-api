package com.vitormarcal.marcalmoney.api.repository;

import com.vitormarcal.marcalmoney.api.model.Categoria;
import com.vitormarcal.marcalmoney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
