package eva3_4_multiples_excepciones;

/**
 *
 * @author armando
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        
        int x=1, y=-1;
        
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce el valor (entero) de x => ");
                x = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input no valido, intenta de nuevo");
            }
            
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el valor (entero) de y => ");
                y = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input no valido, intenta de nuevo");
            }
            catch(ArithmeticException e){
                System.out.println("Divisón entre 0 no es válida, intenta de nuevo");
            }
            
        }while(true);
        
        int res = x/y;
        System.out.println("Divisón "+x+'/'+y+" = "+res);
        System.out.println("*** PROGRAMA TERMINADO CON ÉXITO ***");
    }
    
}
