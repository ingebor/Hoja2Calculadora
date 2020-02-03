import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Martin Amado (carne), Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public class Main{
	
	public static void main(String[] args) throws Exception{
		iCalculadora calc = new Calculadora();
		
		
		
		File datos = new File("C:\\Users\\Ingebor Rubio\\Desktop\\leer.txt");
		Scanner leer = new Scanner(datos);
		System.out.println(leer.next());
	}
}