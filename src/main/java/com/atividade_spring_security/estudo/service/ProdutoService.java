package com.atividade_spring_security.estudo.service;

import com.atividade_spring_security.estudo.model.ProdutoModel;
import com.atividade_spring_security.estudo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoModel>listar(){
        return repository.findAll();
    }

    public ProdutoModel save(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
