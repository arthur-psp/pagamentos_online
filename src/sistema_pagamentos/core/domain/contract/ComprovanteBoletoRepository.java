package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.infra.repository.memory.PagamentoBoletoRepositoryImpl;

public interface ComprovanteBoletoRepository {
    void comprovante(PagamentoBoletoRepositoryImpl pagamentoBoletoRepository, Produto produto, BoletoBancario boletoBancario);
}
