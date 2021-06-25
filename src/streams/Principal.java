package streams;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("demo.txt");
        int c = fis.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fis.read();
        }
        fis.close();
    }
}
