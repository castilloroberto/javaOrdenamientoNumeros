import java.util.Scanner; 
public class Asignatura {


    public float[] notas;
    public float promedio;

    public void Ingresar(int len){
        
        Scanner input = new Scanner(System.in);

        notas = new float[len];
        this.promedio = 0;

        for(int i = 0 ; i < len ; i++){
            
            Main.print("Ingrese el elemento " + i + " de " + len +": "  );
            notas[i] = input.nextFloat();
            this.promedio += notas[i];
        
        }
        this.promedio = this.promedio/ len;
    }

    public void Show(){

        String msg = (this.promedio >= 70) ? "Felicidades, Aprobo!! :)" : "Sorry, Reprobo :(" ;

        Main.println("Promedio: " + this.promedio + "\n"+ msg); 
    }

}