package operaciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class operaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		int opcion, num1, num2; 
		
		System.out.println("Introduzca un número entero: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca otro número entero: ");		
		num2 = sc.nextInt();
			
		System.out.println("Menú:");
		System.out.println("1.- Cálculo de la suma");
		System.out.println("2.- Cálculo de la resta");
		System.out.println("3.- cálculo de la multiplicación");
		System.out.println("0.- salir de la aplicación");
		System.out.println("\nIntroduzca la opción.");
		opcion = sc.nextInt();
		
		
		switch(opcion) {
		case 1: 
			System.out.println("La suma de los dos números es: " + (num1 + num2)); 
			break;
		case 2: 
			System.out.println("La resta de los dos números es: " + (num1 - num2));  
			break;                
		case 3: 
			System.out.println("La multiplicación de los dos números es: " + (num1 * num2));			
			break;
		case 0:
			return;
		default:
			System.out.println("Opción incorrecta");
		}
		System.out.println("Añadido en GitHub");
		
	}

}
