package eva3_14_append_objects;

import java.io.EOFException;
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
public class EVA3_14_APPEND_OBJECTS {

    public static void main(String[] args) {
        try {
            saveObj(new Persona("NOMBRE1", "APDO1", 10));
            saveObj(new Persona("NOMBRE2", "APDO2", 10));
            saveObj(new Persona("NOMBRE3", "APDO3", 10));
            saveObj(new Persona("NOMBRE4", "APDO4", 10));
            saveObj(new Persona("NOMBRE5", "APDO5", 10));
            //LEER OBJETOS:
            readObj();
        } catch (IOException ex) {
            Logger.getLogger(EVA3_14_APPEND_OBJECTS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_14_APPEND_OBJECTS.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void saveObj(Persona per) throws FileNotFoundException, IOException{
        FileOutputStream openFile = new FileOutputStream
        ("/home/mrnice/POO_EVA3_22550336/EVA3_14_APPEND_OBJECTS/personas.prs", true);
        
        ObjectOutputStream ouStream = new ObjectOutputStream(openFile);
        ouStream.writeObject(per);
        ouStream.close();
        System.out.println("Succesfully saved Object");
    }
    
    public static void readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
        Persona per = null;
        FileInputStream openFile = new FileInputStream
        ("/home/mrnice/POO_EVA3_22550336/EVA3_14_APPEND_OBJECTS/personas.prs");
        ObjectInputStream oiStream = new ObjectInputStream(openFile);
        //leer archivo hasta que no haya objetos
        try{
            Object obj = oiStream.readObject();
            while(obj != null){
                if(obj instanceof Persona){
                    per = (Persona)obj;
                    System.out.println("Nombre: "+per.getNombre());
                    System.out.println("Apellido: "+per.getApdo());
                    System.out.println("Edad: "+per.getEdad());
                }
                obj = oiStream.readObject();
            }
        }catch(EOFException ex){
            ex.printStackTrace();
        }

        
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

