package br.pro.luciene.exemplo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.pro.luciene.exemplo.entities.CategoriaEntity;
import br.pro.luciene.exemplo.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository
    categoriaRepository;

    public List<CategoriaEntity> listarTodos() {
        return categoriaRepository.findAll();
    }
}
