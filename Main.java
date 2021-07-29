import java.util.Scanner;


class Main {

    
    public static int[] ascendente(int[] numeros_){

        int mayor = 0;


        for (int i = 0; i < numeros_.length; i++ ){
         
            for (int j = 0; j < numeros_.length -1; j++ ){
            
                if( numeros_[j] < numeros_[j + 1] ){
                    mayor = numeros_[j + 1];
                    numeros_[j + 1] = numeros_[j];
                    numeros_[j] = mayor;
                }

            }


        }
        // 9,8,7,6,5,4,3,2,1
        return numeros_;

    }


    public static int[] descendente(int[] numeros_){

        int mayor = 0;


        for (int i = 0; i < numeros_.length; i++ ){
         
            for (int j = 0; j < numeros_.length -1; j++ ){
            
                if( numeros_[j] > numeros_[j + 1] ){
                    mayor = numeros_[j];
                    numeros_[j] = numeros_[j + 1];
                    numeros_[j + 1] = mayor;
                }

            }


        }
        // 1,2,3,4,5,6,7,8,9
        return numeros_;
        
    }
    
    
    public static int[] ingresar (int cantidad){
        
        Scanner input = new Scanner(System.in);
        
        int[] numeros_ = new int[cantidad];
        int i = 0;
        while(i < cantidad){
            
            print("Ingrese el numero de la posicion #" + (i+1) + ": " );
            numeros_[i] = input.nextInt();
            
            i++;
        }
        
        return numeros_; 

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
        println("\ningresados:");
        mostrar(nums);
        
        int ascendentes[] = ascendente(nums);
        println("\nascendentes:");
        mostrar(ascendentes);
        
        int descendentes[] = descendente(nums);
        println("\ndescendentes:");
        mostrar(descendentes);
        
        


    }

}