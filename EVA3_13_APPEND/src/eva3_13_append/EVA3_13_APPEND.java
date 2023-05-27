package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Armando Bueno
 */
public class EVA3_13_APPEND {

    public static void main(String[] args) {
        String ruta = 
                "/home/mrnice/POO_EVA3_22550336/EVA3_13_APPEND/";
        
        
        try {
            writeUsingBufferedWriter("Escribiendo mediante bufferedWriter",
                    ruta+"/outputBufferedWriter.txt");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_APPEND.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public static void writeUsingBufferedWriter(String datos, String ruta) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter buffWriter = new BufferedWriter(fileWriter);
        
        for(int i=0 ; i<10 ; i++){
            buffWriter.write((i+1)+ " " + datos);
            buffWriter.write("\n");
        }
        buffWriter.flush();
        buffWriter.close();
    }

}
