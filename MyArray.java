import java.util.Scanner;

public class MyArray{

    private int[] nums;
    private int[] ascendentes;
    private int[] descendentes;

    public int[] Ingresar (int cantidad){
        
        Scanner input = new Scanner(System.in);
        
        this.nums = new int[cantidad];
        this.ascendentes = new int[cantidad];
        this.ascendentes = new int[cantidad];
        int i = 0;
        while(i < cantidad){
            
            Main.print("Ingrese elemento posicion #" + (i+1) + ": " );
            this.nums[i] = input.nextInt();
            this.ascendentes[i]  = this.nums[i]
            this.descendentes[i] = this.nums[i]

            i++;
        }
        this.SortAsc();
        this.SortDesc();
        
    }
    
    public void Mostrar(){
        
        
        Main.println("Ingresados");
        for(int n : this.nums){
            Main.println("Elemento: " + n);
        }
        
        Main.println("Ascendentes" );
        for(int n : this.ascendentes){
            Main.println("Elemento: " + n);
        }
        
        Main.println("Descendentes" );
        for(int n : this.descendentes){
            Main.println("Elemento: " + n);
        }

    }
    
    private void SortAsc(){

        int mayor = 0;


        for (int i = 0; i < this.ascendentes.length; i++ ){
         
            for (int j = 1; j < this.ascendentes.length -1 ; j++ ){
            
                
                if( this.ascendentes[i] < this.ascendentes[j] ){
                    mayor = this.ascendentes[j];
                    this.ascendentes[j] = this.ascendentes[i];
                    this.ascendentes[i] = mayor;
                }
                
            }
            
            
        }
       

    }

    private void SortDesc(){

        int mayor = 0;


        for (int i = 0; i < this.descendentes.length; i++ ){
         
            for (int j = 1; j < this.descendentes.length -1 ; j++ ){
            
                // numeros[i] < numeros[j]
                if( this.descendentes[i] > this.descendentes[j] ){
                    mayor = this.descendentes[i];
                    this.descendentes[i] = this.descendentes[j];
                    this.descendentes[j] = mayor;
                }

            }


        }
        
        
    }



}

