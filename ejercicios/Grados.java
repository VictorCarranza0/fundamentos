import java.util.Scanner;

public class Grados {

    public static void main(String[] args) {
        int respuesta;

        respuesta = despliegaMenu();
        //System.out.println("La respuesta fue: " + respuesta);

        if(respuesta ==1 ){
            obtenerCF();
        }

        if(respuesta == 2){
            obtenerFC();
        }

        //TODO: Implementar e invocar los métodos faltantes.

    }

    public static void obtenerFC(){
        double F, C;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados F: ");
        F = sc.nextDouble();

        C = (5.0/9.0)*(F-32.0);

        System.out.println("Grados C: " + C);
    }

    public static void obtenerCF(){
        double C, F;
        Scanner sc = new Scanner(System.in);

        System.out.print("Grados C: ");
        C = sc.nextDouble();

        F = (9.0/5.0)*C + 32.0;

        System.out.println("Grados F: " + F);
    }

    public static int despliegaMenu(){
        int r = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- C-F");
        System.out.println("2.- F-C");
        System.out.println("3.- K-C");
        System.out.println("4.- K-F");
        System.out.println("5.- F-K");
        System.out.println("6.- C-K");
        System.out.println("Opción: ");
        r = sc.nextInt();

        return r;
    }

}