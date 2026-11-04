public abstract class Item {
    private String nome;
    private double peso;
    private double valorBase;

    public Item(String nome, double peso, double valorBase) {
        this.nome = nome;
        this.peso = peso;
        this.valorBase = valorBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorBase() {
        return valorBase;
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
