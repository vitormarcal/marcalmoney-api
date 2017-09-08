package com.vitormarcal.marcalmoney.api.service;

import com.vitormarcal.marcalmoney.api.model.Lancamento;
import com.vitormarcal.marcalmoney.api.model.Pessoa;
import com.vitormarcal.marcalmoney.api.repository.LancamentoRepository;
import com.vitormarcal.marcalmoney.api.repository.PessoaRepository;
import com.vitormarcal.marcalmoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());

        if (pessoa == null || pessoa.isInativo()) {
            throw  new PessoaInexistenteOuInativaException();
        }

        return  lancamentoRepository.save(lancamento);
    }


}
