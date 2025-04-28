package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoPixRepository;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoPixUseCase {
    private ValidarPagamentoPixRepository validateInfo;
    private boolean prosseguir;

    public ValidarPagamentoPixUseCase(ValidarPagamentoPixRepository validateInfo){
        this.validateInfo = validateInfo;
    }

    public void validar(Pix pix, Produto produto, String resposta) throws Exception{
        if (resposta.equals("nao")){
            prosseguir = false;
            throw new Exception("O pagamento será cancelado.");
        }

        if (resposta.equals("sim")){
            if (produto.getValor() != pix.getValor()){
                prosseguir = false;
                throw new Exception("O valor do pix precisa ser o mesmo que o do produto.");
            }
            System.out.println("\n");
            System.out.println("Você está comprando: " + produto.getNome());
            System.out.println("No valor de: " + produto.getValor());
            System.out.println("Prosseguindo com a compra...");

            validateInfo.validar(pix, produto);

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
