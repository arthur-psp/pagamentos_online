package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.ValidarPagamentoBoletoRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public class ValidarPagamentoBoletoUseCase {
    private ValidarPagamentoBoletoRepository validarPagamentoBoletoRepository;
    private boolean prosseguir;

    public ValidarPagamentoBoletoUseCase(ValidarPagamentoBoletoRepository validarPagamentoBoletoRepository){
        this.validarPagamentoBoletoRepository = validarPagamentoBoletoRepository;
    }

    public void validar(BoletoBancario boletoBancario, Produto produto, String resposta)throws Exception{
        if (resposta.equals("nao")){
            prosseguir = false;
            throw new Exception("O pagamento será cancelado.");
        }

        if (resposta.equals("sim")){
            if (produto.getValor() != boletoBancario.getValor()){
                prosseguir = false;
                throw new Exception("O valor do boleto precisa ser o mesmo que o do produto.");
            }
            System.out.println("\n");
            System.out.println("Você está comprando: " + produto.getNome());
            System.out.println("No valor de: " + produto.getValor());
            System.out.println("Prosseguindo com a compra...");

            validarPagamentoBoletoRepository.validar(boletoBancario, produto);

            prosseguir = true;
        } else {
            throw new Exception("Pagamento cancelado.");
        }
    }
}
