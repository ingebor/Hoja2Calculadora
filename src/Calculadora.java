/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public class Calculadora implements iCalculadora{
	iStack stack = new Stack();

	/**
	 * @return suma, resultado de la suma
	 * @param int operando1, int operando2
	 * Sumar dos numeros
	 */
	public int sumar(int operando1, int operando2){
		int suma = operando1 + operando2;
		return suma;
	}

	/**
	 * @return resta, resultado de la resta
	 * @param int operando1, int operando2
	 * Restar dos numeros
	 */
	public int restar(int operando1, int operando2){
		int resta = operando1-operando2;
		return resta;
	}

	/**
	 * @return division, resultado de la division
	 * @param int operando1, int operando2
	 * Dividir dos numeros
	 */
	public int dividir(int operando1, int operando2){
		int division=0;
		try {
			division = operando1/operando2;
		}
		catch(Exception e){
			System.out.println("No se puede realizar la division");
			division = 11111111; //numero al azar para poder ejecutar una instruccion en el main
		}
		return division;
	}

	/**
	 * @return multi, resultado de la multiplicacion
	 * @param int operando1, int operando2
	 * Multiplicar dos numeros
	 */
	public int multiplicar(int operando1, int operando2){
		int multi = operando1*operando2;
		return multi;
	}
}