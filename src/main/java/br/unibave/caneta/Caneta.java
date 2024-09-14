package br.unibave.caneta;


import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class Caneta {
    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("nao pode rabiscar");
        }
        System.out.println("pode rabiscar");

    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){

    }
    void status(){
        System.out.println("uma caneta "+cor);
        System.out.println("esta tampada? "+tampada);
        rabiscar();
    }


}
