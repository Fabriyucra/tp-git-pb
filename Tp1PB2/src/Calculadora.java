import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 String a;
		 String b;
		 String opcion;
		 Integer resultado = null;
		 do{
		 System.out.println("Ingrese su operación /n 1 para dividir /n 2 para multiplicar /n 3 para restar /n 4 para sumar");
		 opcion = teclado.next();
		 }while(Integer.parseInt(opcion) < 1 && Integer.parseInt(opcion) > 4);
		 System.out.println("Ingrese el primer numero");
		 a = teclado.next();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.next();
		 switch (Integer.parseInt(opcion))
		 { case 1: resultado = Integer.parseInt(a) / Integer.parseInt(b);
		           break;
		   case 2: resultado = Integer.parseInt(a) * Integer.parseInt(b);
		           break;        
		   case 3: resultado = Integer.parseInt(a) - Integer.parseInt(b);
		           break;
		   case 4: resultado = Integer.parseInt(a) + Integer.parseInt(b);
		           break; 
		 }

	   System.out.println("El resultado es " + resultado.toString());
		 }
}
