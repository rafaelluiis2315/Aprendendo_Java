import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class sla {

    public static void main(String[] args) throws IOException {
        String stg = "6.5";
        System.out.println(stg);

        double d = Double.valueOf(stg).doubleValue();
        System.out.println(d);

        int estrelaInt = (int) d;

        System.out.println(estrelaInt);

         
        System.out.println(ImageIO.read(new File("estrela.png")));

        for (int i = 0; i < estrelaInt; i++) {
            System.out.println("⭐");
           
        }


    }


}
