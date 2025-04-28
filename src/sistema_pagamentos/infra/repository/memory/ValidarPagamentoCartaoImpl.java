package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoCartaoRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoCartaoImpl implements ValidarPagamentoCartaoRepository {
    @Override
    public void validar(CartaoDeCredito cartaoDeCredito, Produto produto) {
        System.out.println("O produto já é quase seu...");
    }
}
