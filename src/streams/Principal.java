package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("copia.txt"));
        int c = br.read(); // Codifica 8 bits (1 byte)
        while (c != -1) {
            bw.write(c);
            c = br.read();
        }
        bw.close();
        br.close();
    }
}
