import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public class Main{
	
	public static void main(String[] args) throws Exception{
		
		/*Stack stack = new Stack();
		
		iCalculadora calc = new Calculadora();
		Scanner leer2 = new Scanner(System.in);
		
		//File datos = new File("C:\\Users\\Ingebor Rubio\\Desktop\\leer.txt");
		File datos = new File("leer.txt");
		Scanner leer = new Scanner(datos);
		leer.useDelimiter("\\Z");
		String traducir = leer.next();
		String partes[] = traducir.split("\\s+");
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("Desea realizar una operacion con lo siguiente: "+ traducir+ "\n¿Que operacion desea realizar?\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
		//Usar try catch para el caso en el que no ingrese un numero, si no una letra
		int op1 = leer2.nextInt();
		switch (op1) {
		case 1: //Suma
			System.out.println("ha escogido sumar y esta es una prueba para ver que lo acepta");
			break;
		case 2://Resta
			System.out.println("ha escogido restar y esta es una prueba para ver que lo acepta");
			break;
		case 3: //Multiplicacion
			System.out.println("ha escogido multiplicar y esta es una prueba para ver que lo acepta");
			break;
		case 4: //Division
			System.out.println("ha escogido dividir y esta es una prueba para ver que lo acepta");
			break;
		default:
			System.out.println("Escoger una de las opciones por favor");
		}
		
		
		int i = 0;
		while(i<partes.length) {
			//System.out.println(partes[i]);
			stack.lista.add(partes[i]);
			i++;
		}
		System.out.println(stack.lista);*/

		iCalculadora calc = new Calculadora();
		iStack<Integer> stack = new Stack<Integer>(); //agregar generico

		File archive = new File("leer.txt");
		if(archive.exists()){
			Scanner data = new Scanner(archive);
			String all = data.nextLine();
			String[] separated = all.split(" ");
			for(int i=0; i<separated.length;i++){
				try{
					int a = Integer.parseInt(separated[i]);
					stack.push(a);
				}catch(NumberFormatException e){
					String b = separated[i];
					int d = stack.pop();
					int c = stack.pop();
					switch(b){
						case "+":
						stack.push(calc.sumar(c,d));
						break;
						case "-":
						stack.push(calc.restar(c,d));
						break;
						case "*":
						stack.push(calc.multiplicar(c,d));
						break;
						case "/":
						stack.push(calc.dividir(c,d));
						break;
					}
				}
			}

		}else{
			System.out.println("No hay datos en el archivo");
		}
		System.out.println(stack.peek());

		

		
	}
}