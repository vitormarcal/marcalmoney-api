package com.vitormarcal.marcalmoney.api.repository.lancamento;

import com.vitormarcal.marcalmoney.api.model.Lancamento;
import com.vitormarcal.marcalmoney.api.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
