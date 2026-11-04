package main;

import interfaces.Perigoso;
import interfaces.Tributavel;
import model.Combustivel;
import model.Eletronico;
import model.Item;
import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();

        itens.add(new Eletronico("Smartphone", 0.3, 2000.0));
        itens.add(new Combustivel("Galão de Gasolina", 600.0, 150.0));
        itens.add(new Livro("Livro Java", 0.8, 100.0));

        for (Item item : itens) {
            System.out.println("Item: " + item);
            
            if (item instanceof Tributavel) {
                Tributavel tributavel = (Tributavel) item;
                System.out.println("→ Imposto: R$ " + tributavel.calcularImposto());
            }

            if (item instanceof Perigoso) {
                Perigoso perigoso = (Perigoso) item;
                perigoso.aplicarProtocoloSeguranca();
            }
        }
    }
}
