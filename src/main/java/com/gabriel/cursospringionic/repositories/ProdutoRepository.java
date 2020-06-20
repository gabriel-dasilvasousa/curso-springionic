package com.gabriel.cursospringionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.cursospringionic.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
