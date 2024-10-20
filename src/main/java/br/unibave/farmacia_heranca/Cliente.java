package br.unibave.farmacia_heranca;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//
@Getter
@Setter
public class Cliente {
    private String nome;
    private double saldoDevedor;


    public void cadastra(String nome, double sd){
        setNome(nome);
        setSaldoDevedor(sd);

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", saldoDevedor=" + saldoDevedor +
                '}';
    }
}
//Uma farmácia, faz vendas no crediário para seus clientes. Para cada cliente são armazenados o nome e o saldo devedor.
//
//
//
//A farmácia vende 3 tipos de produtos. Medicamentos, equipamentos médicos e perfumaria.
//
//Para todos os produtos são armazenados o nome, estoque e o valor. Para os medicamentos é armazenado se é necessário reter a receita medica ou não.
//
//
//
//A venda consiste em baixar o estoque do produto (de acordo com a quantidade adquirida) e, consequentemente, somar o valor comprado da dívida do cliente.
//
//
//
//- Medicamentos, podem ser vendidos, desde que tenham em estoque.
//
//- Perfumarias, podem ser vendidas apenas se a dívida do cliente for inferior a 100,00. Também somente se tiver em estoque.
//
//- Produtos hospitalares podem ser vendidos mesmo que não tenha em estoque, pois as compras são feitas por encomenda.
//
//
//
//As classes modeladas devem permitir:
//
//- cadastrar todos os produtos da farmácia.
//
//- realizar vendas, selecionando o produto e o cliente
//
//- possibilitar a um cliente pagar a sua conta (parcialmente ou total)
//
//- Emitir relatório dos produtos e clientes cadastrados.
