package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.PagamentoBoleto;
import sistema_pagamentos.core.domain.contract.PagamentoCartaoCreditoRepository;
import sistema_pagamentos.core.domain.contract.PagamentoPixRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoPixRepositoryImpl implements PagamentoPixRepository, PagamentoCartaoCreditoRepository, PagamentoBoleto {
    @Override
    public void realizarPagamentoPix(String tipo, Produto produto, Pix pix) {
        System.out.println("Pagamento com pix realizado com sucesso!");
    }

    @Override
    public void pagamentoCartaoDeCredito(String tipo, Produto produto, CartaoDeCredito cartaoDeCredito) {
        System.out.println("Pagamento com cartão de crédito realizado com sucesso!");
    }

    @Override
    public void realizarPagamentoBoleto(String tipo, Produto produto, BoletoBancario boletoBancario) {
        System.out.println("Pagamento com boleto realizado com sucesso!");
    }
}
