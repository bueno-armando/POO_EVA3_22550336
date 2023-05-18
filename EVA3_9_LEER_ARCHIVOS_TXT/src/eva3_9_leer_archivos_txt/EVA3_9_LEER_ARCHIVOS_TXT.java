package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Armando Bueno
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
    final static String RUTA = "./prueba.txt";
    public static void main(String[] args) {
        try{
            readUsingFiles(RUTA);
        }catch (IOException e){
            e.printStackTrace();
        }
}

/*
    FILES: Se lee todo el contenido del archivo
    y se transfiere a memoria prinicpal (RAM).
    Útil con archivos pequeños.
    */
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("Now reading using Files object");
        Path path = Paths.get(ruta);
        /*List<String> listaLineas = Files.readAllLines(path);   
        System.out.println("*** RESULTADO ***");
        for(int i=0 ; i<listaLineas.size() ; i++){
            System.out.println(listaLineas.get(i));*/
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }

}

