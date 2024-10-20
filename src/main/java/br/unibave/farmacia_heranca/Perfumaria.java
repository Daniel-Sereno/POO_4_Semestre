package br.unibave.farmacia_heranca;

public class Perfumaria extends Produto{



    public void vender(Cliente c, Perfumaria p, int qtd){
        double saldo = 0;
        if(p.getEstoque() >= qtd && c.getSaldoDevedor()<100){
            p.setEstoque(p.getEstoque()-qtd);
            saldo = c.getSaldoDevedor() + (qtd * p.getValor());
            c.setSaldoDevedor(saldo);
            System.out.println("venda realizada");
        }
    }
}
