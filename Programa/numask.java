package numask;
//Aquí estoy haciendo uso de la librería Scanner
import java.util.Scanner;

public class numask {
	public static String getMask(int[] numbers) {
		//Se está haciendo la máscara
        StringBuilder mask = new StringBuilder();
        for (int num : numbers) {
        	//Aquí indicamos que si es positivo se pondra 0, de lo contrario se pondrá 1
            if (num >= 0) {
                mask.append('0');
            } 
            else {
                mask.append('1');
            }
        }
        return mask.toString();
    }
	 public static void main(String[] args) {
		 //Estaremos usando este método para leer los datos del usuario
	        Scanner scanner = new Scanner(System.in);

	        int[] numbers = new int[10];
	        System.out.println("Introduce 10 números enteros:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Número " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        //Aquí estamos solicitando la máscara
	        String mask = getMask(numbers);

	        //Se imprime la máscara en pantalla
	        System.out.print("La máscara es: " + mask);

	        scanner.close();
	    }
}

