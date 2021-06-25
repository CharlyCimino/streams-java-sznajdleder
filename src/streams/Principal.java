package streams;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        // abro el archivo
        FileInputStream fis = new FileInputStream("demo.txt");
        // instancio a Scanner pasandole el FileInputStream
        Scanner sc = new Scanner(fis);
        int i = sc.nextInt();
        String n = sc.next();
        while (!n.equals("FIN")) {
            System.out.println(i + ", " + n);
            i = sc.nextInt();
            n = sc.next();
        }
        // cierro el archivo
        fis.close();
    }

}
