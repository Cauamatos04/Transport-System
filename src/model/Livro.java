package model;

import interfaces.Tributavel;

public class Livro extends Item implements Tributavel {

    public Livro(String nome, double peso, double valorBase) {
        super(nome, peso, valorBase);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Valor base: " + valorBase +
                "\nValor do Imposto: Isento" +
                "\nValor total cobrado: " + valorBase);

        return valorBase;
    }

    @Override
    public void gerarGuiaRecolhimento() {
        System.out.println("Produto Fragil\nAtenção");
    }

}
