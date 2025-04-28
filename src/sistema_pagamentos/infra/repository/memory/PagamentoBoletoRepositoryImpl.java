package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.PagamentoBoleto;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoBoletoRepositoryImpl implements PagamentoBoleto {
    @Override
    public void realizarPagamentoBoleto(String tipo, Produto produto, BoletoBancario boletoBancario) {
        System.out.println("Pagamento com boleto bancário realizado com sucesso!");
    }
}
