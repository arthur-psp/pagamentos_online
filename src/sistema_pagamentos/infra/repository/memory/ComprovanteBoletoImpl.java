package sistema_pagamentos.infra.repository.memory;

import sistema_pagamentos.core.domain.contract.ComprovanteBoletoRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public class ComprovanteBoletoImpl implements ComprovanteBoletoRepository {
    @Override
    public void comprovante(PagamentoBoletoRepositoryImpl pagamentoBoletoRepository, Produto produto, BoletoBancario boletoBancario) {
        System.out.println("\nComprovante boleto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + boletoBancario.getValor());
        System.out.println("Endereço de entrega: " + boletoBancario.getEndereco());
        System.out.println("Cliente: " + boletoBancario.getNome());
    }
}
