/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public class Calculadora implements iCalculadora{
	iStack stack = new Stack();

	public int sumar(int operando1, int operando2){
		int suma = operando1 + operando2;
		return suma;
	}

	public int restar(int operando1, int operando2){
		int resta = operando1-operando2;
		return resta;
	}

	public int dividir(int operando1, int operando2){
		int division=0;
		try {
			division = operando1/operando2;
		}
		catch(Exception e){
			System.out.println("No se puede realizar la division");
			division = 11111111; //numero al azar para poder ejecutar una instruccino con el en el principal
		}
		return division;
	}

	public int multiplicar(int operando1, int operando2){
		int multi = operando1*operando2;
		return multi;
	}
}