package eva3_8_custom_exceptions;

/**
 *
 * @author Armando Bueno
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        Persona person = new Persona();
        person.setName("Juan");
        person.setSecond_name("Jano");
        try{
            person.setAge(-222);
        }catch(InputDataCheckedEx e){
            System.out.println(e.getMessage());
        }
    }

}

class Persona{
    String name;
    String second_name;
    int age;

    public Persona() {
        name = "N.A";
        second_name = "N.A";
        age = -1;
    }

    public Persona(String name, String second_name, int age){
        this.name = name;
        this.second_name = second_name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InputDataCheckedEx{
        if(age < -1) 
            throw new InputDataCheckedEx();
        this.age = age;
    }
    
    
}

class  InputDataException extends RuntimeException{
    public InputDataException(){
        super("Incorrect input! Age must be a positive value");
    }
}

class InputDataCheckedEx extends Exception{
    public InputDataCheckedEx(){
        super("Incorrect input! Age must be a positive value");
    }
}