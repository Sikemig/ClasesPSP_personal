import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
        ProcessBuilder proceso = new ProcessBuilder("C:/Windows/System32/calc.exe");

        try {
            Process p = proceso.start();
            p.waitFor(); //Detiene el codigo hasta que el proceso anterior se cierred
            System.out.println("Proceso lanzado");
        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
