import java.util.Scanner;

public class PiedraPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usrResp, cpuResp;
        String ganador;

        System.out.print("piedra, papel o tijeras: ");
        usrResp = sc.nextLine();
        System.out.println("Respuesta del USR: " + usrResp);

        cpuResp = respuestaCPU();

        System.out.println("Respuesta del CPU: " + cpuResp);

        ganador = evalua(usrResp, cpuResp);

        System.out.println("Ganador: " + ganador);

    }

    public static String evalua(String a, String b){
        String r = "aunSinGanador";

        //TODO: Implementar la selección del ganador


        return r;
    }

    public static String respuestaCPU(){
        String r = "aunSinVAlor";
        double x;

        x=Math.random();
        //System.out.println(x);

        if( x>0 && x<0.33 ){
            r = "piedra";
        }

        if( x>0.33 && x<0.66){
            r="papel";
        }

        if( x>0.66 && x<1.0 ){
            r="tijeras";
        }

        return r;
    }
}