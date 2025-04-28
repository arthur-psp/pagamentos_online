package sistema_pagamentos.core.usecase;

import sistema_pagamentos.core.domain.contract.PagamentoBoleto;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.Produto;

public class PagamentoBoletoUseCase {
    private PagamentoBoleto pagamentoBoleto;

    public PagamentoBoletoUseCase(PagamentoBoleto pagamentoBoleto){
        this.pagamentoBoleto = pagamentoBoleto;
    }

    public void pagamentoBoleto(String tipo, Produto produto, BoletoBancario boletoBancario) throws Exception{
        if (tipo.equals("boleto")){
            if (produto.getValor() != boletoBancario.getValor()){
                throw new Exception("Erro ao gerar boleto");
            }
            pagamentoBoleto.realizarPagamentoBoleto(tipo, produto, boletoBancario);
        } else {
            throw new Exception("Tipo de pagamento indisponível");
        }

    }
}
