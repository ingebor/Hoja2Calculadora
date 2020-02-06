/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args) throws Exception{
		
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("Desea realizar una operacion con lo siguiente: ");

		iCalculadora calc = new Calculadora();
		iStack<Integer> stack = new Stack<Integer>(); 

		File archive = new File("datos.txt");//Busca el archivo llamado datos, y si existe, opera.
		if(archive.exists()){
			Scanner data = new Scanner(archive);
			String all = data.nextLine();
			System.out.println(all);
			String[] separated = all.split(" ");//Separa el String por espacios
			for(int i=0; i<separated.length;i++){
				try{
					int a = Integer.parseInt(separated[i]);
					stack.push(a);
					//Trata de convertir cada elemento a un entero, y si lo logra, lo mete a un stack
				}catch(NumberFormatException e){
					//Si encuentra un elemento que no se convierte a entero, llama a los ultimos dos numeros ingresados, al igual que al simbolo ingresado
					String b = separated[i];
					if(b.equals("+") || b.equals("-")|| b.equals("/")||b.equals("*")) {
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
					else {
						System.out.println("No ha ingresado un dato valido");
						int resp = -111111;
						stack.push(resp);
					}
						
				}
			}
		}

		else{
			System.out.println("No hay datos en el archivo");
		}
		if(stack.peek().equals(11111111)||stack.peek().equals(-111111)) {
			System.out.println("Vuelva a intentarlo");
		}
		else 
			System.out.println("Este es su resultado: "+stack.peek());
	
	}
}