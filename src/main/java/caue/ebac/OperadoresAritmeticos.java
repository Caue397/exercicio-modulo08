package caue.ebac;

public class OperadoresAritmeticos {

    public static double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main(String[] args) {
        double media = calculaMedia(8.2, 7, 9.3, 6);
        System.out.println("A média é: " + media);
    }
}
