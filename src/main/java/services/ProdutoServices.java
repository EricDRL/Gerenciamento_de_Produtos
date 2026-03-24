package services;

import entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoServices {

        @Autowired
        private ProdutoRepository produtoRepository;

        public List<Produto> buscarTodos(){
            return produtoRepository.findAll();
        }

        public void  deletarLivro(Long id){
            produtoRepository.deleteById(id);
        }

        public Produto criarProduto(Produto produto){
            return produtoRepository.save(produto);
        }

        public Optional<Produto> buscarPorId(Long id){
            return produtoRepository.findById(id);
        }
    }

}
