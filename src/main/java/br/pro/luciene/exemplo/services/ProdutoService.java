package br.pro.luciene.exemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pro.luciene.exemplo.entities.ProdutoEntity;
import br.pro.luciene.exemplo.entities.ProdutoEntity;
import br.pro.luciene.exemplo.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProdutoService {
 //    @Autowired - retirar o final
    private final ProdutoRepository
    produtoRepository;
     public List<ProdutoEntity> listarTodos() {
        return produtoRepository.findAll();
    }
        public ProdutoEntity editar(int id, ProdutoEntity Produto) {
        // Verifique se a Produto existe
        Optional<ProdutoEntity> ProdutoExistente = produtoRepository.findById(id);

        if (ProdutoExistente.isPresent()) {
            // Atualiza a Produto
            ProdutoEntity ProdutoAtualizado = ProdutoExistente.get();
            ProdutoAtualizado.setDescricao(Produto.getDescricao()); // Atualiza os campos necessários
            ProdutoAtualizado.setEstoque(Produto.getEstoque());
            ProdutoAtualizado.setCategoria(Produto.getCategoria());
            ProdutoAtualizado.setPrecoCusto(Produto.getPrecoCusto());
            ProdutoAtualizado.setPrecoVenda(Produto.getPrecoVenda());
            ProdutoAtualizado.setId(Produto.getId());
            return produtoRepository.save(ProdutoAtualizado); // Salva a Produto atualizada
        } else {
            // Caso a Produto não exista, retorna null
            return null;
        }
    }

    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoEntity incluir(ProdutoEntity Produto) {
        return produtoRepository.save(Produto);
    }
}
