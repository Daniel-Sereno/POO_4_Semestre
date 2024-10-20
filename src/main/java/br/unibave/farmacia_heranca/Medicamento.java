package br.unibave.farmacia_heranca;
//SE NECESSARIO RETER A RECEITA MEDICA

public class Medicamento extends Produto{


    public void vender(Cliente c, Medicamento m, int qtd){
        double saldo = 0;
        if(m.getEstoque() >= qtd){
            m.setEstoque(m.getEstoque()-qtd);
            saldo = c.getSaldoDevedor() + (qtd * m.getValor());
            c.setSaldoDevedor(saldo);
            System.out.println("venda realizada");
        }
    }


}
