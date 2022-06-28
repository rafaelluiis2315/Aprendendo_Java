import javax.swing.JOptionPane;

public class prog07 {


    public static void somatoria() {
        int s = 0, vetor[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < vetor.length; i++){
            s = s + vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria eh " + s);
    }

    public static int produtoria() {
        int p = 1, vetor[] = {1, 2, 3, 4, 5};

        for (int i = 0; i <vetor.length; i++){
            p = p * vetor[i];
        }
        return p;
    }

    public static void main(String entrada[]) {
        
        int r;

        somatoria();
        r = produtoria();

        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
        System.exit(0);
    }
}

