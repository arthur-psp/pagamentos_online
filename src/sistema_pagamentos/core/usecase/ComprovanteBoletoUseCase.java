package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ComprovanteBoletoRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.infra.repository.memory.PagamentoBoletoRepositoryImpl;

public class ComprovanteBoletoUseCase {
    private ComprovanteBoletoRepository comprovanteBoletoRepository;

    public ComprovanteBoletoUseCase(ComprovanteBoletoRepository comprovanteBoletoRepository){
        this.comprovanteBoletoRepository = comprovanteBoletoRepository;
    }

    public void comprovante(PagamentoBoletoRepositoryImpl pagamentoBoletoRepository, Produto produto, BoletoBancario boletoBancario){
        comprovanteBoletoRepository.comprovante(pagamentoBoletoRepository, produto, boletoBancario);
    }
}
