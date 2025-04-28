package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ProdutoRepository;
import sistema_pagamentos.core.domain.entity.Produto;

public class ProdutoUseCase {
    private ProdutoRepository produtoRepository;

    public ProdutoUseCase(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public void adicionarProduto(Produto produto){
        produtoRepository.adicionarProduto(produto);
    }

    public void listarProdutos(){
        produtoRepository.listarProdutos();
    }

    public void excluirProduto(int id){
        produtoRepository.removerProduto(id);
    }
}
