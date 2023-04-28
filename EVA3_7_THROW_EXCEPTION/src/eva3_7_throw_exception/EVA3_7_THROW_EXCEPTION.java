package eva3_7_throw_exception;

/**
 *
 * @author armando
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        //checked: es forzoso atenderlas
        
        //unchecked: errores de lógica, no es forzoso resolverlas
        //Ej: int resu = 5/0
        Prueba obj = new Prueba();
        try{
            obj.capturaMayorCero(22);
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            //interceptar la excepción e imprimir el msj
        }
        //EXCEPTION tiene jerarquía sobre todo (captura todo)
        //este bloque da error porque Exception ya atrapó InputMismatchException
        /*catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }*/
        //como la excepción es unchecked no me obliga a poner try catch
        try{
            System.out.println(obj.division(100, 0)); 
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}

class Prueba{
    public void capturaMayorCero(int valor) throws Exception{
        //"Exception" es checked exception, estamos obligados a atenderla
        if(valor <= 0){ //voy a generar una excepcion
            //creando objeto tipo excepcion
            throw new Exception(valor + " es negativo, solo se aceptan valores positivos"); 
        }
        System.out.println("El valor es: "+valor);
    }
    public int division(int x, int y) throws ArithmeticException{
        //"ArithmeticException" es unchecked, no estamos obligados a atenderla
        if(y == 0)
            throw new ArithmeticException("y es 0, no se puede dividir entre 0");
        return x/y;
    }
}
