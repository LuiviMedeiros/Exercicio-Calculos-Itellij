package one.digital;

public class Main {
    public static void main(String[] args){

        //Calculadora
        System.out.println("Exercicios calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(9, 1.8);
        Calculadora.divisão(5, 2.5);
        Calculadora.multiplicação(7, 8);

        //Mensagem
        System.out.println("Exercicios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercicios Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

}

}