package streams;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        PrintStream stdErr = null;
        try {
            // abro el archivo
            fos = new FileOutputStream("errores.txt");
            // instancio un printstream basado en el input stream
            stdErr = new PrintStream(fos);
            // seteo la estandard error
            System.setErr(stdErr);
            int[] arr = new int[5];
            // error cuando i sea mayor que 4
            for (int i = 0; i < 10; i++) {
                arr[i] = 0;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stdErr != null) {
                    stdErr.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
