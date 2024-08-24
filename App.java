package exerciciosz;
import java.util.Scanner;
import java.util.Arrays;
public class ForEach{
    public static void main(String[] args){
        Scanner entre = new Scanner(System.in);
        float[] numbers = null;

        while (true){
            int length = 2;
            
            try {
                System.out.print("Quantos números você quer ordenar? ");
                length = entre.nextInt();
                if (length >= 2) {
                    numbers = new float[length];
                    break;
                }
                else{
                    System.out.println("Número muito baixo.");
                    entre.nextLine();
                }
                
            } catch (Exception e) {
               System.out.println("Bota um numero que preste seu fudido!");
               entre.nextLine();      //Descarta o valor inválido, limpa o buffer
            } 
        }
        
        for( int i=0; i<numbers.length; i++){
            System.out.printf("Digite seu %d° número: ", i+1);
            numbers[i] = entre.nextFloat();
        }
        entre.close();
        Arrays.sort(numbers);
        System.out.printf("Seus números são %s", Arrays.toString(numbers) );
    }
}
