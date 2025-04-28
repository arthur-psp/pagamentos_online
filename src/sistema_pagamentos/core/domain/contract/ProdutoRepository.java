package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.Produto;

import java.util.List;

public interface ProdutoRepository {
    void adicionarProduto(Produto produto);
    List<Produto> listarProdutos();
    void removerProduto(int id);
}
