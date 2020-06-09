public class Principal {
    public static void main(String[] args) {

        

        //IF
        System.out.println("\n***** IF *****");
       
        boolean exp1;

        exp1 = true;
       
        if( exp1 ){
             System.out.println("    exp1 es true");
             System.out.println("    Estamos dentro del if");
        }
       
        System.out.println("Esto está después del if");
         


        //IF-ELSE
        System.out.println("\n***** IF-ELSE *****");
        
        boolean exp2;

        exp2 = false;
        
        if( exp2 ){
            System.out.println("    exp2 es true");
            System.out.println("    Estamos dentro del if");
        }else{
            System.out.println("    exp2 es false");
            System.out.println("    Estamos dentro del else");
        }
        
        System.out.println("Esto está después del if-else");


        
        //SWITCH
        System.out.println("\n***** SWITCH *****");
        
        int valor;

        valor = 3;

        switch(valor){
            case 1: System.out.println("    valor = 1");
                    System.out.println("    Estamos dentro del bloque 1");
            case 2: System.out.println("    valor = 2");
                    System.out.println("    Estamos dentro del bloque 2");
            case 3: System.out.println("    valor = 3");
                    System.out.println("    Estamos dentro del bloque 3");
            case 4: System.out.println("    valor = 4");
                    System.out.println("    Estamos dentro del bloque 4");
            case 5: System.out.println("    valor = 5");
                    System.out.println("    Estamos dentro del bloque 5");
            default:System.out.println("    valor no valido");
                    System.out.println("    Estamos dentro del bloque default");
        }

        System.out.println("Esto está después del switch");



        //SWITCH
        System.out.println("\n***** SWITCH *****");
        
        char c;

        c = 'd';

        switch(c){
            case 'a': System.out.println("    c = 'a'");
                      System.out.println("    Estamos dentro del bloque a");
                      break;
            case 'b': System.out.println("    c = 'b'");
                      System.out.println("    Estamos dentro del bloque b");
                      break;
            case 'c': System.out.println("    c = 'c'");
                      System.out.println("    Estamos dentro del bloque c");
                      break;
            case 'd': System.out.println("    c = 'd'");
                      System.out.println("    Estamos dentro del bloque d");
                      break;
            case 'e': System.out.println("    c = 'e'");
                      System.out.println("    Estamos dentro del bloque e ");
                      break;
            default:  System.out.println("    valor no valido");
                      System.out.println("    Estamos dentro del bloque default");
        }

        System.out.println("Esto está después del switch");



        //FOR
        System.out.println("\n***** FOR *****");
        
        int x = 0;
        
        for(int i=0; i<5; i++){
            x+=2;
            System.out.println("    iteración: " + i + ", x= " + x);
        }
        
        System.out.println("Esto está después del for");



        //WHILE
        System.out.println("\n***** WHILE *****");
       
        int iter=0;
        int y=0;
       
        while(y<=10){
            iter++;
            y+=2;
            System.out.println("    iteración: " + iter + ", y= " + y);
        }
       
        System.out.println("Esto está después del while");

       
       
        //DO-WHILE
        System.out.println("\n***** DO-while *****");
       
        int iteracion=0;
        int z=0;
       
        do{
            iteracion++;
            z+=2;
            System.out.println("    iteración: " + iteracion + ", z= " + y);
        }while(z<=10);
       
        System.out.println("Esto está después del do-while");


    }
}