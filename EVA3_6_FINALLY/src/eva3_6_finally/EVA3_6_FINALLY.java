package eva3_6_finally;

/**
 *
 * @author armando
 */
public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        int x=9, y=1;
        try{
            int res = x/y;
            System.out.println("Resultado: "+res);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
        }finally{//OBLIGA A LA EJECUCIÓN DE ESTA SECCIÓN DE CÓDIGO
                    // es opcional
            System.out.println("SIEMPRE ME VOY A EJECUTAR!!");
        }
        System.out.println("Fin del programa");
    }
}
