package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Armando Bueno
 */
public class EVA3_12_SERIALIZABLE {

    public static void main(String[] args) {
       
        try {
            Persona per1 = new Persona("Julio", "Alvaro", 48);
            saveObj(per1);
            Persona res = null;
            try {
                res = readObj();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Nombre: "+res.getNombre());
            System.out.println("Apellido: "+res.getApdo());
            System.out.println("Edad: "+res.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void saveObj(Persona per) throws FileNotFoundException, IOException{
        FileOutputStream openFile = new FileOutputStream
        ("/home/mrnice/POO_EVA3_22550336/EVA3_12_SERIALIZABLE/personas.per");
        
        ObjectOutputStream ouStream = new ObjectOutputStream(openFile);
        ouStream.writeObject(per);
        ouStream.close();
        System.out.println("Succesfully saved Object");
    }
    
    public static Persona readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        Persona per = null;
        FileInputStream openFile = new FileInputStream
        ("/home/mrnice/POO_EVA3_22550336/EVA3_12_SERIALIZABLE/personas.per");
        ObjectInputStream oiStream = new ObjectInputStream(openFile);
        per = (Persona)oiStream.readObject();
        return per;
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apdo;
    private int edad;

    public Persona(String nombre, String apdo, int edad) {
        this.nombre = nombre;
        this.apdo = apdo;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "[NOT PROVIDED]";
        this.apdo = "[NOT PROVIDED]";
        this.edad = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApdo() {
        return apdo;
    }

    public void setApdo(String apdo) {
        this.apdo = apdo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  
}