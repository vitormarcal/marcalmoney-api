package com.vitormarcal.marcalmoney.api.repository.lancamento;

import com.vitormarcal.marcalmoney.api.model.Lancamento;
import com.vitormarcal.marcalmoney.api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
