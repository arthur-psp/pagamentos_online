package sistema_pagamentos.core.domain.contract;

import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public interface ValidarPagamentoBoletoRepository {
    void validar(BoletoBancario boletoBancario, Produto produto);
}
