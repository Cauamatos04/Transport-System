package model;

import interfaces.Perigoso;

public class Combustivel extends Item implements Perigoso {
    public Combustivel(String nome, double peso, double valorBase) {
        super(nome, peso, valorBase);
    }

    @Override
    public void aplicarProtocoloSeguranca() {
        System.out.println("Protocolo Ativado: \nUSAR EMBALAGEM REFORÇADA.");
    }

    @Override
    public boolean verificarNecessidadeEscolta() {
        if (peso >= 500) {
            return true;
        } else {
            return false;
        }
    }
}
