public class Eletronico extends Item implements Tributavel{

    public Eletronico(String nome, double peso, double valorBase) {
        super(nome, peso, valorBase);
    }

    @Override
    public void calcularImposto() {
        //Pessoal Aqui deve ser ser implementado o metódo getValorBase e multiplicar apenas por 1.15
        //criar uma variável com essa operação e fazer um sout.

    }

    @Override
    public void gerarGuiaRecolhimento() {
        System.out.println("PRODUTO FRÁGIL\nCUIDADO!");
    }
}
