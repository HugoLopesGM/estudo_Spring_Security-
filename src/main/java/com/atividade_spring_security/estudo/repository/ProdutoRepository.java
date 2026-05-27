package com.atividade_spring_security.estudo.repository;

import com.atividade_spring_security.estudo.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Long> {
}
