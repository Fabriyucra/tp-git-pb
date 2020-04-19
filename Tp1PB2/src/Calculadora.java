import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado = 0;
		
		Scanner teclado= new Scanner(System.in);	
		do {
			
		System.out.println("Ingrese su operación \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
		opcion = teclado.nextInt();
			switch(opcion){
			
			case 1: opcion = 1 ;
				System.out.println("Ingrese el primer numero");
				a = teclado.nextInt();
				System.out.println("Ingrese el segundo numero");
				b = teclado.nextInt();
				resultado = a - b;				
				resultado = a + b;
				System.out.println("El resultado es " + resultado.toString());
			break;
			
			case 2: opcion = 2;
				System.out.println("Ingrese el primer numero");
				a = teclado.nextInt();
				System.out.println("Ingrese el segundo numero");
				b = teclado.nextInt();
				resultado = a - b;
				System.out.println("El resultado es " + resultado.toString());
			break;
			
			case 3: opcion = 3;
				System.out.println("Ingrese el primer numero");
				a = teclado.nextInt();
				System.out.println("Ingrese el segundo numero");
				b = teclado.nextInt();
				resultado = a * b;
				System.out.println("El resultado es " + resultado.toString());
			break;
			
			case 4: opcion = 4;
				System.out.println("Ingrese el primer numero");
				a = teclado.nextInt();
				System.out.println("Ingrese el segundo numero");
				b = teclado.nextInt();
				resultado= a / b;
				System.out.println("El resultado es " + resultado.toString());
			break;
			
			default: System.out.println("Opcion no encontrada\n");
			break;}
			
		}	while(opcion < 1 || opcion > 4);
	}
}