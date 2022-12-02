
import java.util.*;

public class calculadora{
      
    public static void main(String[]  args) {

        int i = 0;
        do{

            Scanner s = new Scanner(System.in);
            System.out.print("\n"+"Qual função você deseja realizar? (+, -, *, /) : ");
            String operador = s.nextLine();
            if (operador.equals("+") != true && operador.equals("-") != true && operador.equals("*") != true && operador.equals("/") != true){
                System.out.println("Operador '".concat(operador) + "' invalido");
                break;
            }
            s = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int n1 = s.nextInt();
            s = new Scanner(System.in);
            System.out.print("Digite outro numero: ");
            int n2 = s.nextInt();
    
            if (operador.equals("+") ){
                sum(n1, n2);
            }else if (operador.equals("-")){
                sub(n1, n2);
            }else if(operador.equals("*")){
                // Multi((double)(n1), (double)(n2));
            }else if(operador.equals("/")){
                div(n1, n2);
            }else{
                System.out.println("Ocorreu um ERRO ocasional!!");
            }

            System.out.print("você deseja continuar usando a calculadora? (y/n): ");
            s = new Scanner(System.in);
            String escolha = s.next().toLowerCase();

            if (escolha.equals("y")){
                System.out.println("====================================================");

            }else if(escolha.equals("n")){
                System.out.println("\n"+"Ate a proxima!! :)");
                i = 1;
            }

        }while( i == 0);
           
    }
    
    
    static void sum(int x, int y){
        int soma = x + y;

        System.out.println("\nA soma da: " + soma);
    }
    
    static void sub(int x, int y){
        int sub = x - y;
        System.out.println("\nA subtracao e: " + sub);
    }

    public double Multi(double x, double y){
        double multi = x * y;
        // System.out.println("\nmutiplicacao e: " + multi);
        return multi;
    }
    
    static void div(int x, int y){
        int div = x / y;
        System.out.println("\ndivisao e: " + div);
    }
    
}

