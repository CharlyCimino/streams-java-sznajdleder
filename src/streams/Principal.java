package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("demo.txt");
        FileWriter fw = new FileWriter("copia.txt");
        int c = fr.read(); // Codifica 8 bits (1 byte)
        while (c != -1) {
            fw.write(c);
            c = fr.read();
        }
        fw.close();
        fr.close();
    }
}
