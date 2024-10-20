package br.unibave.farmacia_heranca;

public class EquipamentoMedico extends Produto{
    public void vender(Cliente c, EquipamentoMedico e, int qtd){
        e.setEstoque(e.getEstoque()-qtd);
        c.setSaldoDevedor(c.getSaldoDevedor()+(e.getValor()*qtd));
        System.out.println("venda realizada");
    }
}
