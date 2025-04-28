package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.core.usecase.PagamentoPixUseCase;
import sistema_pagamentos.infra.repository.memory.PagamentoPixRepositoryImpl;

public interface ComprovantePixRepository {
    void comprovante(PagamentoPixRepositoryImpl p, Produto produto, Pix pix);
}
