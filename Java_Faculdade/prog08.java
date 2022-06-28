import javax.swing.JOptionPane;

public class prog08 {


    public static void somatoria(int vet[]) {
        int s = 0;
        for (int i = 0; i < vet.length; i++){
            s = s + vet[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria eh " + s);
    }
    
    public static int produtoria(int vet[]) {
        int p = 1;
        
        for (int i = 0; i <vet.length; i++){
            p = p * vet[i];
        }
        return p;
    }
    
    public static void main(String entrada[]) {
        int vetor[] = {1, 2, 3, 4, 5};
        int r;

        somatoria(vetor);
        r = produtoria(vetor);

        JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
        System.exit(0);
    }
}


