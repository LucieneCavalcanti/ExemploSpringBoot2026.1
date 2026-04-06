package br.pro.luciene.exemplo.services;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;
import br.pro.luciene.exemplo.entities.CategoriaEntity;
import br.pro.luciene.exemplo.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> listarTodos() {
        return categoriaRepository.findAll();
    }

    public CategoriaEntity editar(int id, CategoriaEntity Categoria) {
        // Verifique se a Categoria existe
        Optional<CategoriaEntity> CategoriaExistente = categoriaRepository.findById(id);

        if (CategoriaExistente.isPresent()) {
            // Atualiza a Categoria
            CategoriaEntity CategoriaAtualizada = CategoriaExistente.get();
            CategoriaAtualizada.setDescricao(Categoria.getDescricao()); // Atualiza os campos necessários
            return categoriaRepository.save(CategoriaAtualizada); // Salva a Categoria atualizada
        } else {
            // Caso a Categoria não exista, retorna null
            return null;
        }
    }

    public void excluir(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public CategoriaEntity incluir(CategoriaEntity Categoria) {
        return categoriaRepository.save(Categoria);
    }
}
