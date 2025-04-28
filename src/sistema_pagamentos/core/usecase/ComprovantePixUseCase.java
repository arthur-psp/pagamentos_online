package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ComprovantePixRepository;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.infra.repository.memory.PagamentoPixRepositoryImpl;

public class ComprovantePixUseCase {
    private ComprovantePixRepository comprovantePixRepository;

    public ComprovantePixUseCase(ComprovantePixRepository comprovantePixRepository){
        this.comprovantePixRepository = comprovantePixRepository;
    }

    public void comprovante(PagamentoPixRepositoryImpl p, Produto produto, Pix pix){


        comprovantePixRepository.comprovante(p, produto, pix);
    }
}
