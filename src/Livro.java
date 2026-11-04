public class Livro extends Item implements Tributavel{

    public Livro(String nome, double peso, double valorBase) {
        super(nome, peso, valorBase);
    }

    @Override
    public void calcularImposto() {
        //Pessoal Aqui deve ser ser implementado o metódo getValorBase, apenas isso pois livro não tem imposto.
        //faça um sout arrumado para esse valor.
    }

    @Override
    public void gerarGuiaRecolhimento() {
        System.out.println("Produto Fragil\nAtenção");
    }

}
