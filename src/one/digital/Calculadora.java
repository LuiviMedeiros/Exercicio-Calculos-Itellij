package one.digital;

public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("A soma de "+ numero1  + " mais " + numero2  + " é " + resultado);
    }

    public static void subtração(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("A subtração de "+ numero1  + " mais " + numero2  + " é " + resultado);
    }
    public static void divisão(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("A divisão de "+ numero1  + " mais " + numero2  + " é " + resultado);
    }

    public static void multiplicação(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de "+ numero1  + " mais " + numero2  + " é " + resultado);
    }


}