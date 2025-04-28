package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoBoletoRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoBoletoImpl implements ValidarPagamentoBoletoRepository {
    @Override
    public void validar(BoletoBancario boletoBancario, Produto produto) {
        System.out.println("O produto já é quase seu...");
    }
}
