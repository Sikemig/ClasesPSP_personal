import java.io.File;
import java.io.IOException;

public class LanzadorTabla {
    public static void main(String[] args) {
        String classpath = System.getProperty("java.class.path");
        // cp y classpath para que funcione la ruta
        ProcessBuilder proceso = new ProcessBuilder("java" ,"-cp", classpath, "tabla");

        proceso.redirectError(new File("errores.txt"));
        proceso.redirectOutput(new File("salida.txt"));
        proceso.redirectInput(new File("entrada.txt"));

        try{
            proceso.start().waitFor();
            System.out.println("El proceso ha terminado con exito");
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
