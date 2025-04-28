package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ComprovanteCartaoRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.core.usecase.PagamentoCartaoUseCase;

public class ComprovanteCartaoImpl implements ComprovanteCartaoRepository {
    @Override
    public void comprovante(PagamentoCartaoUseCase pagamentoCartaoUseCase, Produto produto, CartaoDeCredito cartaoDeCredito) {
        System.out.println("\nComprovante");
        System.out.println("Valor: " + cartaoDeCredito.getValor());
        System.out.println("No cartão de: " + cartaoDeCredito.getNome());
        System.out.println("Número do cartão: " + cartaoDeCredito.getNumeroCartao());
        System.out.println("Nome do produto: " + produto.getNome());
    }
}
