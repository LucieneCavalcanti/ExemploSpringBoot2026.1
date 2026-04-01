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
    private final CategoriaRepository
    categoriaRepository;

    public List<CategoriaEntity> listarTodos() {
        return categoriaRepository.findAll();
    }
     public CategoriaEntity editar(int id, CategoriaEntity categoria) {
        // Verifique se a categoria existe
        Optional<CategoriaEntity> categoriaExistente = 
        categoriaRepository.findById(id);
        
        if (categoriaExistente.isPresent()) {
            // Atualiza a categoria
            CategoriaEntity categoriaAtualizada = categoriaExistente.get();
            categoriaAtualizada.setDescricao(categoria.getDescricao());  // Atualiza os campos necessários
            return categoriaRepository.save(categoriaAtualizada);  // Salva a categoria atualizada
        } else {
            // Caso a categoria não exista, retorna null
            return null;
        }
    }
    public void excluir(Integer id) {
        categoriaRepository.deleteById(id);
}
    public CategoriaEntity incluir(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }
}
