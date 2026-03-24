package controller;

import entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestController
@RequestMapping
public class ProdutoController {

        @Autowired
        private ProdutoService produtoService;


        @GetMapping
        public List<Produto> buscarTodos(){
            return produtoService.buscarTodos();
        }


        @GetMapping("/{id}")
        public Optional<Produto> buscarPorId(@PathVariable Long id){
            return produtoService.buscarPorId(id);
        }

        @PostMapping
        public Produto criarProduto(@RequestBody Produto produto){
            return produtoService.criarProduto(produto);
        }

        @DeleteMapping("/{id}")
        public void deletarLivro(@PathVariable Long id){
            produtoService.deletarProduto(id);
        }


    }

}
