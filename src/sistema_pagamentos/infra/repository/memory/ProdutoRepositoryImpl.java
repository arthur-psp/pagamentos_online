package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ProdutoRepository;
import sistema_pagamentos.core.domain.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositoryImpl implements ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        produtos.forEach(produto -> {
            System.out.println("\nNome do produto: " + produto.getNome());
            System.out.println("Valor do produto: " + produto.getValor());
        });
        return produtos;
    }

    @Override
    public void removerProduto(int id) {
        produtos.remove(id);
    }
}
