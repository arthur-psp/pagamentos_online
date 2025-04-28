package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public interface ValidarPagamentoPixRepository {
    void validar(Pix pix, Produto produto);
}
