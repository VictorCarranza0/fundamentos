import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double d;
        double t;
        double v;

        System.out.print("Distancia = ");
        d = s.nextDouble();
        System.out.print("Tiempo = ");
        t = s.nextDouble();

        v = d/t;

        System.out.println("Velocidad = " + v);

        s.close();
    }
}