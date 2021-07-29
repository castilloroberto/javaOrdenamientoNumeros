import java.util.Scanner;

public class MyArray{

    public static int[] nums;
    public static int[] ascendentes;
    public static int[] descendentes;

    public void Ingresar (int cantidad){
        
        Scanner input = new Scanner(System.in);
        
        this.nums = new int[cantidad];
        this.ascendentes = new int[cantidad];
        this.descendentes = new int[cantidad];
        int i = 0;
        while(i < cantidad){
            
            Main.print("Ingrese elemento posicion #" + (i+1) + ": " );
            this.nums[i] = input.nextInt();
            this.ascendentes[i]  = this.nums[i];
            this.descendentes[i] = this.nums[i];

            i++;
        }
        this.SortAsc();
        this.SortDesc();
        
    }
    public static void Show(int[] nums_){


        for(int n : nums_){
            Main.println("Elemento: " + n);
        }

    }
    public static void Mostrar(){
        
        
        Main.println("\nIngresados:");
        Show(nums);
        
        
        Main.println("\nAscendentes:" );
        Show(ascendentes);
        
        
        Main.println("\nDescendentes:" );
        Show(descendentes);
        

    }
    
    private void SortAsc(){

        int mayor = 0;


        for (int i = 0; i < this.ascendentes.length; i++ ){
         
            for (int j = 0; j < this.ascendentes.length -1 ; j++ ){
            
                
                if( this.ascendentes[j] < this.ascendentes[j + 1] ){
                    mayor = this.ascendentes[j + 1];
                    this.ascendentes[j + 1] = this.ascendentes[j];
                    this.ascendentes[j] = mayor;
                }
                
            }
            
            
        }
       

    }

    private void SortDesc(){

        int len = this.descendentes.length;


        for (int i = 0; i < len ; i++ ){

            this.descendentes[i] = ascendentes[len-(i+1)]; 
                 
        }
        
        
    }



}

