import java.util.Scanner;

public class MyArray{

    private int[] nums;
    private int[] ascendentes;
    private int[] descendentes;

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
    
    public void Mostrar(){
        
        
        Main.println("\nIngresados:");
        for(int n : this.nums){
            Main.println("Elemento: " + n);
        }
        
        Main.println("\nAscendentes:" );
        for(int n : this.ascendentes){
            Main.println("Elemento: " + n);
        }
        
        Main.println("\nDescendentes:" );
        for(int n : this.descendentes){
            Main.println("Elemento: " + n);
        }

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

