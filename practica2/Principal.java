import java.util.Scanner;  //PARA Leer.

public class Principal{

    char varGlobal;
    static final int CTE_GLOBAL = 2;

    public static void main(String[] args){

        System.out.println("Hola");

        int a;
        double b = 1.3;
        char  c = 'T';
        boolean d = true;

        //short f = 40000;
        /*
        comentarios
        de líneas múltiples
        */

        float g = 3.45f;
        
        int  h = 4;
        float i = 2.0f;
        double j;

        j = h/i;

        float k = (float)j;

        int l;
        
        Scanner sc = new Scanner(System.in);//leer del teclado

        System.out.print("dato: ");
        int dato = sc.nextInt();
        System.out.println("El dato es: " + dato);

        l = 5;

        l +=2;
        l++;
        System.out.println("l= " + l);

        System.out.println( !d );


        l = 2*(4+5);
        System.out.println( l );

        boolean m = true;
        boolean n = false;
        boolean o ;

        o = m || n;

        if( o ){
            System.out.println( "condición verdadera" );

        }else{
            System.out.println( "condición falsa" );

        }

        System.out.println( "salimos del if" );


        double p = Math.sqrt(9);

        System.out.println(p);

        String nombre;
        System.out.println("¿Cómo te llamas?");
        nombre = sc.nextLine();  //Se necesita una lectura extra para limpiar la entrada.
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("Longitud de tu nombre: " +  nombre.length()  );

        sc.close();

    }

    public static void otroMetodo(){
        int varLocal;
        final int CTE_LOCAL;

        CTE_LOCAL = 1;
    }

}


