package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoCartaoRepository;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoCartaoUseCase {
    private ValidarPagamentoCartaoRepository validarPagamentoCartaoRepository;
    private boolean prosseguir;

    public ValidarPagamentoCartaoUseCase(ValidarPagamentoCartaoRepository validarPagamentoCartaoRepository){
        this.validarPagamentoCartaoRepository = validarPagamentoCartaoRepository;
    }

    public void validar(CartaoDeCredito cartaoDeCredito, Produto produto, String resposta) throws Exception{
        if (resposta.equals("nao")){
            prosseguir = false;
            throw new Exception("O pagamento será cancelado.");
        }

        if (resposta.equals("sim")){
            if (produto.getValor() != cartaoDeCredito.getValor()){
                prosseguir = false;
                throw new Exception("O valor do pagamento precisa ser o mesmo que o do produto.");
            }
            System.out.println("\n");
            System.out.println("Você está comprando: " + produto.getNome());
            System.out.println("No valor de: " + produto.getValor());
            System.out.println("Prosseguindo com a compra...");

            validarPagamentoCartaoRepository.validar(cartaoDeCredito, produto);

            prosseguir = true;
        } else {
            throw new Exception("Pagamento cancelado.");
        }

    }

    public boolean isProsseguir() {
        return prosseguir;
    }

    public void setProsseguir(boolean prosseguir) {
        this.prosseguir = prosseguir;
    }
}
