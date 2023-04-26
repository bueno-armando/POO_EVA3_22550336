package eva3_3_try_catch;

public class EVA2_3_TRY_CATCH {

    public static void main(String[] args) {
        int x=5, y=0;
        try{//llaves obligatorias
            int res = x/y;
            System.out.println("res = "+res);
        }catch(ArithmeticException e){
            //e.printStackTrace(); lo que se imprime por default
            System.out.println("Excepción: "+e.getMessage());
        }
        System.out.println("Fin del programa");
        
    }
    
}
