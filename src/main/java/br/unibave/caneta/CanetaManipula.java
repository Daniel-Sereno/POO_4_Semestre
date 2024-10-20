package br.unibave.caneta;

import br.unibave.farmacia_heranca.Cliente;
import br.unibave.farmacia_heranca.Medicamento;
import br.unibave.farmacia_heranca.Produto;

public class CanetaManipula {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCor("azul");
        c1.status();
        c1.tampar();
        c1.status();
        Cliente c = new Cliente();
        c.setNome("miguel");
        System.out.println(c.getNome());
        Medicamento m = new Medicamento();



    }
}
