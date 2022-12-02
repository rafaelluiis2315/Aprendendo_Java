import java.util.Scanner;

public class circuferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculadora calculadora = new calculadora();
        System.out.print("\n"+"Qual o diametro da Circuferencia? : ");
        double diametro =  scanner.nextDouble();
        final double PI =  14.34;
        double resultado = calculadora.Multi(diametro, PI);

        System.out.println("A circuferencia e: " + resultado);



    }


}
