package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.PagamentoPixRepository;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoPixUseCase {
    private PagamentoPixRepository pagamentoRepository;

    public PagamentoPixUseCase(PagamentoPixRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    public void realizarPagamentoPix(String tipo, Produto produto, Pix pix) throws Exception{
        if (tipo.equals("pix")){
            pagamentoRepository.realizarPagamentoPix(tipo, produto, pix);
        } else {
            throw new Exception("Tipo de pagamento indisponível.");
        }

    }
}
