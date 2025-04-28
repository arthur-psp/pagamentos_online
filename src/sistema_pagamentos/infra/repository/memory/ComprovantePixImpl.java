package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ComprovantePixRepository;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public class ComprovantePixImpl implements ComprovantePixRepository {
    @Override
    public void comprovante(PagamentoPixRepositoryImpl p, Produto produto, Pix pix) {
        System.out.println("\nComprovante");
        System.out.println("Valor: " + pix.getValor());
        System.out.println("Destinatário: " + pix.getDestinatario());
        System.out.println("Nome do produto: " + produto.getNome());
    }
}
