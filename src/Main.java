import sistema_pagamentos.core.domain.contract.ComprovanteBoletoRepository;
import sistema_pagamentos.core.domain.entity.BoletoBancario;
import sistema_pagamentos.core.domain.entity.CartaoDeCredito;
import sistema_pagamentos.core.domain.entity.Pix;
import sistema_pagamentos.core.domain.entity.Produto;
import sistema_pagamentos.core.usecase.*;
import sistema_pagamentos.infra.repository.memory.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {
        Produto p1 = new Produto();
        p1.setNome("Iphone");
        p1.setValor(4000.00);

        Produto p2 = new Produto();
        p2.setNome("Apple Watch");
        p2.setValor(1600.00);

        Produto p3 = new Produto();
        p3.setNome("AirPods");
        p3.setValor(800.00);

        ProdutoRepositoryImpl produtoRepository = new ProdutoRepositoryImpl();
        ProdutoUseCase produtoUseCase = new ProdutoUseCase(produtoRepository);
        produtoUseCase.adicionarProduto(p1);
        produtoUseCase.adicionarProduto(p2);
        produtoUseCase.adicionarProduto(p3);
        produtoUseCase.listarProdutos();

        Pix pix = new Pix();
        pix.setChavePix("54999446481");
        pix.setDestinatario("katia");
        pix.setValor(4000.00);

        CartaoDeCredito c1 = new CartaoDeCredito();
        c1.setNome("Arthur");
        c1.setAgencia(0226);
        c1.setNumeroCartao("849302849");
        c1.setValor(1600.00);

        BoletoBancario b1 = new BoletoBancario();
        b1.setNome("Arthur");
        b1.setEndereco("av 20");
        b1.setValor(800.00);

        //Compra do p1
        ValidarPagamentoPixImpl validate = new ValidarPagamentoPixImpl();
        ValidarPagamentoPixUseCase validateInfoUseCase = new ValidarPagamentoPixUseCase(validate);
        validateInfoUseCase.validar(pix, p1, "sim");

        PagamentoPixRepositoryImpl pagamentoRepository = new PagamentoPixRepositoryImpl();
        PagamentoPixUseCase pagamentoUseCase = new PagamentoPixUseCase(pagamentoRepository);
        pagamentoUseCase.realizarPagamentoPix("pix", p1, pix);

        ComprovantePixImpl comprovantePix = new ComprovantePixImpl();
        ComprovantePixUseCase comprovantePixUseCase = new ComprovantePixUseCase(comprovantePix);
        comprovantePixUseCase.comprovante(pagamentoRepository, p1, pix);


        //compra do p2
        ValidarPagamentoCartaoImpl validarPagamentoCartao = new ValidarPagamentoCartaoImpl();
        ValidarPagamentoCartaoUseCase validarPagamentoCartaoUseCase = new ValidarPagamentoCartaoUseCase(validarPagamentoCartao);
        validarPagamentoCartaoUseCase.validar(c1, p2, "sim");

        PagamentoCartaoRepositoryImpl pagamentoCartaoRepository = new PagamentoCartaoRepositoryImpl();
        PagamentoCartaoUseCase pagamentoCartaoUseCase = new PagamentoCartaoUseCase(pagamentoCartaoRepository);
        pagamentoCartaoUseCase.pagamentoCartaoDeCredito("cartao", p2, c1);

        ComprovanteCartaoImpl comprovanteCartao = new ComprovanteCartaoImpl();
        ComprovanteCartaoUseCase comprovanteCartaoUseCase = new ComprovanteCartaoUseCase(comprovanteCartao);
        comprovanteCartaoUseCase.comprovante(pagamentoCartaoUseCase, p2, c1);

        //compra do p3
        ValidarPagamentoBoletoImpl validarPagamentoBoleto = new ValidarPagamentoBoletoImpl();
        ValidarPagamentoBoletoUseCase validarPagamentoBoletoUseCase = new ValidarPagamentoBoletoUseCase(validarPagamentoBoleto);
        validarPagamentoBoletoUseCase.validar(b1, p3, "sim");

        PagamentoBoletoRepositoryImpl pagamentoBoletoRepository = new PagamentoBoletoRepositoryImpl();
        PagamentoBoletoUseCase pagamentoBoletoUseCase = new PagamentoBoletoUseCase(pagamentoBoletoRepository);
        pagamentoBoletoUseCase.pagamentoBoleto("boleto", p3, b1);

        ComprovanteBoletoImpl comprovanteBoleto = new ComprovanteBoletoImpl();
        ComprovanteBoletoUseCase comprovanteBoletoUseCase = new ComprovanteBoletoUseCase(comprovanteBoleto);
        comprovanteBoletoUseCase.comprovante(pagamentoBoletoRepository, p3, b1);

    }
}