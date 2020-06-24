package com.gabriel.cursospringionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.cursospringionic.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}
