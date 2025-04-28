package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoPixRepository;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoPixImpl implements ValidarPagamentoPixRepository {
    @Override
    public void validar(Pix pix, Produto produto) {
        System.out.println("O produto já é quase seu...");
    }
}
