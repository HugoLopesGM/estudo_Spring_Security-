package com.atividade_spring_security.estudo.controllers;


import com.atividade_spring_security.estudo.model.ProdutoModel;
import com.atividade_spring_security.estudo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")

public class ProdutoControler {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<ProdutoModel>listar(){
        return service.listar();
    }

    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel){
        return service.save(produtoModel);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
