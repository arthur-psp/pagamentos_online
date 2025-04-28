package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.PagamentoCartaoCreditoRepository;
import sistema_pagamentos.core.domain.contract.PagamentoPixRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoCartaoUseCase {

    private PagamentoCartaoCreditoRepository pagamentoCartaoCreditoRepository;

    public PagamentoCartaoUseCase(PagamentoCartaoCreditoRepository pagamentoCartaoCreditoRepository){
        this.pagamentoCartaoCreditoRepository = pagamentoCartaoCreditoRepository;
    }

    public void pagamentoCartaoDeCredito(String tipo, Produto produto, CartaoDeCredito cartaoDeCredito) throws Exception{
        if (tipo.equals("cartao")){
            if (produto.getValor() != cartaoDeCredito.getValor()){
                throw new Exception("Erro ao realizar pagamento com cartão de crédito.");
            }
            pagamentoCartaoCreditoRepository.pagamentoCartaoDeCredito(tipo, produto, cartaoDeCredito);
        } else{
            throw new Exception("Tipo de pagamento indisponível.");
        }
    }
}
