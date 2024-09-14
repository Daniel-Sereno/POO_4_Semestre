package br.unibave.caneta;

public class CanetaManipula {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCor("azul");
        c1.status();
        c1.tampar();
        c1.status();

    }
}
