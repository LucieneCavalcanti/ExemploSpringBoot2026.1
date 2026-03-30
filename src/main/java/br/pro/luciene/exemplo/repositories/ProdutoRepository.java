package br.pro.luciene.exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pro.luciene.exemplo.entities.ProdutoEntity;
@Repository
public interface ProdutoRepository 
extends JpaRepository<ProdutoEntity,
 Integer>
{

}
