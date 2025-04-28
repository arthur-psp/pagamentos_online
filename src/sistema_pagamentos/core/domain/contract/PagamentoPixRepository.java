package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public interface PagamentoPixRepository {
    void realizarPagamentoPix(String tipo, Produto produto, Pix pix);

}
