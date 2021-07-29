import java.util.Scanner;


class Main {

    
    public static void println(String p){

        print("\n" + p + "\n");

    }

    public static void print(String p){

        System.out.print(p);

    }

    public static void main(String[] args) {
        
        
        MyArray nums = new MyArray(); 

        nums.Ingresar(10);
        nums.Mostrar();
        
        
        

    }

}