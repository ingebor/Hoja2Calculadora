/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public interface iCalculadora{
	/**
	 * Sumar dos numeros
	 * @param operando1
	 * @param operando2
	 * @return suma
	 */
	public int sumar(int operando1, int operando2);

	/**
	 * Restar dos numeros
	 * @param operando1
	 * @param operando2
	 * @return resta
	 */
	public int restar(int operando1, int operando2);
	
	/**
	 * Dividir dos numeros
	 * @param operando1
	 * @param operando2
	 * @return division
	 */
	public int dividir(int operando1, int operando2);

	/**
	 * Multiplicar dos numeros
	 * @param operando1
	 * @param operando2
	 * @return multi
	 */
	public int multiplicar(int operando1, int operando2);
	// pre: at least two numbers exist in stack used  
	// post: multiplies both numbers
}