import javax.swing.*;

public class ProgRepeticao {
    public static void main(String entrada[]) {
        int tabuada;
        char op = 0;
        String msg = "", msgEnter = "Digite 1 repetição for \n Digite 2 para repetição while \n Digite 3 para repetição do/while";

        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);

        switch (op){
            case '1':{
                msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
                for (int i = 1; i <= 10; i = i + 1){
                    msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
                }
                break;
            }
            
            case '2':{
                msg = msg + "Tabuada do " + tabuada + " pelo While: \n\n";
                int i = 1;
                while (i<=10){
                    msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
                    i = i + 1;
                }
                break;
            }

            case '3':{
                msg = msg + "Tabuada do " + tabuada + " pelo do/while: \n\n";
                int i = 1;
                do{
                    msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
                    i = i + 1;
                }while(i<=10);
                break;
            }

            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados.");
        }

        if (op >= '1' && op <= '3'){
            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
