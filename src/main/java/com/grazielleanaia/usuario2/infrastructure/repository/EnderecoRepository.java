package com.grazielleanaia.usuario2.infrastructure.repository;


import com.grazielleanaia.usuario2.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
