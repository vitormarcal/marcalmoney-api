package com.vitormarcal.marcalmoney.api.repository;

import com.vitormarcal.marcalmoney.api.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
