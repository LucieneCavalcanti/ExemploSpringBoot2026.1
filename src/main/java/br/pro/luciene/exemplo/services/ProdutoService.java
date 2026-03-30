package br.pro.luciene.exemplo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
