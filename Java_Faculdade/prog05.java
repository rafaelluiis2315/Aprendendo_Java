import javax.swing.*;

public class prog05 {
    public static void main(String entrada[]) {
        int n1, n2, soma=0;
        char op = 0;
        String msg = "", msgEnter = "Digite 1 para adição \n Digite 2 para somatoria \n";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro:"));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);

        switch (op) {
            case '1': {
                
                if(n1%2==0 && n2%2==0){
                    soma = n1 + n2;

                    msg = msg + "Soma de " + n1 + " por " + n2 + " = " + soma + "\n\n";
                }
                break;
                
            }

            case '2': {
                for (int i=1; i <= n2; i=i+1) {
                    soma = soma + n1;
                }
                msg = msg + "Somatorio de " + n1 + ", " + n2 + " vezes eh: " + soma + "\n\n";
                break;
            }

            default: JOptionPane.showMessageDialog(null, "Opção invalida, calculos não realizados.");
        }

        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }

        System.exit(0);
    }
}
