import java.util.Scanner;


class Main {

    
    public static int[] descendente(int[] numeros){

        int mayor = 0;


        for (int i = 0; i < numeros.length; i++ ){
         
            for (int j = 1; j < numeros.length -1 ; j++ ){
            
                
                if( numeros[i] < numeros[j] ){
                    mayor = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = mayor;
                }
                
            }
            
            
        }
        // 9,8,7,6,5,4,3,2,1
        return numeros;

    }


    public static int[] ascendente(int[] numeros){

        int mayor = 0;


        for (int i = 0; i < numeros.length; i++ ){
         
            for (int j = 1; j < numeros.length -1 ; j++ ){
            
                // numeros[i] < numeros[j]
                if( numeros[i] > numeros[j] ){
                    mayor = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = mayor;
                }

            }


        }
        // 1,2,3,4,5,6,7,8,9
        return numeros;
        
    }
    
    
    

    public static void println(String p){

        print("\n" + p);

    }

    public static void print(String p){

        System.out.print(p);

    }

    public static void mostrar(int[] nums_){


        for(int n : nums_){
            println("Elemento: " + n);
        }

    } 

    public static void main(String[] args) {
        
        

        int nums[] = ingresar(10);
        int ascendentes[] = ascendente(nums);
        int descendentes[] = descendente(nums);
        println("\ningresados:");
        mostrar(nums);

        println("\nascendentes:");
        mostrar(ascendentes);
        
        println("\ndescendentes:");
        mostrar(descendentes);
        
        


    }

}