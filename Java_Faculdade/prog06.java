import javax.swing.*;

public class prog06 {
    public static void main(String entrada[]) {
        int n1, n2, p=1;
        char op = 0;
        String msg = "", msgEnter = "Digite 1 para produto \n Digite 2 para produtoria \n";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro:"));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);

        switch (op) {
            case '1': {
                
                if(n1>0 && n2>0){
                    p = n1 * n2;

                    msg = msg + "Produto " + n1 + " por " + n2 + " = " + p + "\n\n";
                }
                break;
                
            }

            case '2': {
                for (int i=1; i <= n2; i=i+1) {
                    p = p * n1;
                }
                msg = msg + "Produtoria de " + n1 + ", " + n2 + " vezes eh: " + p + "\n\n";
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
