import java.awt.*;


public class exerci3 {
    public static void main(String[] args) {
        Dimension tela =  Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        
        System.out.println("A Dimenção da sua tela é " + largura + " X " + altura);
    }


}
