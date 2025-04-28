package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public interface ValidarPagamentoCartaoRepository {
    void validar(CartaoDeCredito cartaoDeCredito, Produto produto);
}
