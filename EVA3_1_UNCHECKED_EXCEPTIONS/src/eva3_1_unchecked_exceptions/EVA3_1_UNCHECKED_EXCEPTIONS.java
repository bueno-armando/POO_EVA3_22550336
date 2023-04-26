package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        //DIVISIÓN ENTRE CERO (ArithmeticException)
        //Lo anterior al error se ejecuta
        System.out.println("INICIANDO EL PROGRAMA");
        int x=5, y=0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int res = x/y; // <= ERROR AQUÍ
        
        //El comportamiento default es detener la ejecución
        System.out.println("CALCULAND LA DIVISIÓN");
        System.out.println("res = "+res);
        
        //**MALA ENTRADA (input missmatch exception)
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println("Tu número es: "+n);
        
        //**INDEXOUTOUFBOUNDS EXCEPTION
        int[] arr = new int[5]; //bounds: 0-4
        for(int i=0 ; i<5 ; i++) arr[i] = 100*(i+1);
        arr[5] = 600; //error de LOGICA: 5 no es una posicion valida
        
        //**NULL POINTER EXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x = "+objPrueba.x);
        //objPrueba aún no existe
    }
    
    class Prueba{
        public int x;
    }
    
}
