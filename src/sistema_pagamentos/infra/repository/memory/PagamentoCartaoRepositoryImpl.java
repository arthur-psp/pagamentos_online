package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.PagamentoCartaoCreditoRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoCartaoRepositoryImpl implements PagamentoCartaoCreditoRepository {
    @Override
    public void pagamentoCartaoDeCredito(String tipo, Produto produto, CartaoDeCredito cartaoDeCredito) {
        System.out.println("Pagamento com cartão de crédito realizado com sucesso!");
    }
}
