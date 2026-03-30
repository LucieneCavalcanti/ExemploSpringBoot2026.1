package br.pro.luciene.exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pro.luciene.exemplo.entities.CategoriaEntity;
@Repository
public interface CategoriaRepository 
extends JpaRepository<CategoriaEntity,
 Integer>
{

}
