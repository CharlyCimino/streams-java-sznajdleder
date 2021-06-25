package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("streams-datos.txt"));
        DataOutputStream dos = new DataOutputStream(bos);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i > 0) {
            dos.writeInt(i);
            i = scanner.nextInt();
        }
        dos.close();
        bos.close();
        // AHORA SE LEE
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("streams-datos.txt"));
        DataInputStream dis = new DataInputStream(bis);
        try {
            int j = dis.readInt();
            while (true) {
                System.out.println(j);
                j = dis.readInt();
            }
        } catch (EOFException ex) {
            System.out.println("-- EOF --");
        }
        dis.close();
        bis.close();
    }
}
