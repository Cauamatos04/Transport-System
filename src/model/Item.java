package model;

public abstract class Item {
    protected String nome;
    protected double peso;
    protected double valorBase;

    public Item(String nome, double peso, double valorBase) {
        this.nome = nome;
        this.peso = peso;
        this.valorBase = valorBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", valorBase=" + valorBase +
                '}';
    }
}
