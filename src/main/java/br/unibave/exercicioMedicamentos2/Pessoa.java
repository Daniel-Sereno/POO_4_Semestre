package br.unibave.exercicioMedicamentos2;


public class Pessoa {
    private String nome;
    private String sintoma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    public void cadastraPessoa(String nome, String sintoma){
        this.nome = nome;
        this.sintoma = sintoma;
    }


    public void cadastraPessoa(Pessoa pessoa){
        this.nome = nome;
        this.sintoma = sintoma;
    }

}
