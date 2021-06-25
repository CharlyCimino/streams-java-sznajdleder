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

    public static void main(String[] args) throws Exception {
        // abro el archivo y redirecciono la standar error
        FileOutputStream fos = new FileOutputStream("errores.txt");
        PrintStream stdErr = new PrintStream(fos);
        System.setErr(stdErr);
        int[] arr = new int[5];
        // error cuando i sea mayor que 4
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        // cierro todo
        stdErr.close();
        fos.close();
    }

}
