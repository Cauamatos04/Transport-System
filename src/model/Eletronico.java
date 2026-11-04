package model;

import interfaces.Tributavel;

public class Eletronico extends Item implements Tributavel {

    public Eletronico(String nome, double peso, double valorBase) {
        super(nome, peso, valorBase);
    }

    @Override
    public double calcularImposto() {
        double imposto = valorBase * 0.15;
        double valorFinal = valorBase + imposto;

        System.out.println("Valor base: " + valorBase +
                "\nValor do Imposto: " + imposto +
                "\nValor total cobrado: " + valorFinal);

        return valorFinal;
    }

    @Override
    public void gerarGuiaRecolhimento() {
        System.out.println("PRODUTO FRÁGIL\nCUIDADO!");
    }
}
