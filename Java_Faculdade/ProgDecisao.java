import javax.swing.JOptionPane;

public class ProgDecisao {
    public static void main( String entrada[]) {
        int num;
        char op = 0;
        String msg = "", msgEnter = "Digite 1 para par/impar \n Digite 2 para positivo/negativo";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);
        
        switch(op){
            case '1':{
                
                if (num % 2 == 0){
                    msg = msg + num + " eh par. \n";
                } else{
                    msg = msg + num + " eh impar. \n";
                }
                break;
            }
            case '2':{

                if (num > 0){
                    msg = msg + num + " eh positivo. \n";
                } else{
                    msg = msg + num + " eh não positivo. \n";
                }
                break;
            }

            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculo não realizados.");
        }

        if (op == '1' || op == '2'){

            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
