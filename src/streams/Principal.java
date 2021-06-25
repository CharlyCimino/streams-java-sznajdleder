package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        String arch = "personas.dat";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(arch));
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new Persona(10, "Pablo", "23.112.223"));
        oos.writeObject(new Persona(20, "Pedro", "35.213.321"));
        oos.writeObject(new Persona(30, "Juan", "17.554.843"));
        oos.close();
        bos.close();
        // Ahora se lee
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(arch));
        ObjectInputStream ois = new ObjectInputStream(bis);
        try {
            Persona p = (Persona) ois.readObject();
            while (true) {
                System.out.println(p);
                p = (Persona) ois.readObject();
            }
        } catch (EOFException ex) {
            System.out.println("-- EOF --");
        }
        ois.close();
        bis.close();
    }
}
