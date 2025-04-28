package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ComprovanteCartaoRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public class ComprovanteCartaoUseCase {
    private ComprovanteCartaoRepository comprovanteCartaoRepository;

    public ComprovanteCartaoUseCase(ComprovanteCartaoRepository comprovanteCartaoRepository){
        this.comprovanteCartaoRepository = comprovanteCartaoRepository;
    }

    public void comprovante(PagamentoCartaoUseCase pagamentoCartaoUseCase, Produto produto, CartaoDeCredito cartaoDeCredito){
        comprovanteCartaoRepository.comprovante(pagamentoCartaoUseCase, produto, cartaoDeCredito);
    }
}
