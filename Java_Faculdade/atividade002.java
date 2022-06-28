import java.util.Scanner;

public class atividade002 {

    
    public static void main(String[] args){
        //declarando variavel
        int n1;
        double n2, soma;
        String caracter;
        //entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = input.nextDouble();
        System.out.println("Digite o sinal: ");
        caracter = input.next();
        
        //processamento
        soma = n1 + (double)n2;
        System.out.println(n1 + " + " + (double)n2 + " = " + soma + " sinal " + caracter);

        System.exit(0);
    }
}
