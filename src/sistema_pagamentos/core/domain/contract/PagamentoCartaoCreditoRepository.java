package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public interface PagamentoCartaoCreditoRepository {
    void pagamentoCartaoDeCredito(String tipo, Produto produto, CartaoDeCredito cartaoDeCredito);
}
