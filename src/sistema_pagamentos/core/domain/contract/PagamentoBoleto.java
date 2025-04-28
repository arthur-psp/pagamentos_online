package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public interface PagamentoBoleto {
    void realizarPagamentoBoleto(String tipo, Produto produto, BoletoBancario boletoBancario);
}
