import java.io.IOException;

public class ProcesoLanzador {


    public void lanzarProceso(){
        ProcessBuilder proceso = new ProcessBuilder("C:/Windows/System32/calc.exe");
        try {
            proceso.start();
            System.out.println("Proceso lanzado");
        } catch (IOException  e){
            System.out.println("Error al lanzar el proceso");
        }
    }


}
