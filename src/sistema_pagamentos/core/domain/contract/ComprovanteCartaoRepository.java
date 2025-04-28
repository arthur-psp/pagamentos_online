package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.core.usecase.PagamentoCartaoUseCase;

public interface ComprovanteCartaoRepository {
    void comprovante(PagamentoCartaoUseCase pagamentoCartaoUseCase, Produto produto, CartaoDeCredito cartaoDeCredito);
}
