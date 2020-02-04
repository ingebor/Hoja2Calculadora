/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

public interface iCalculadora{
	public int sumar(int operando1, int operando2);
	// pre: at least two numbers exist in stack used
	// post: returns the sum of the numbers

	public int restar(int operando1, int operando2);
	// pre: at least two numbers exist in stack used
	// post: returns the difference of the numbers 

	public int dividir(int operando1, int operando2);
	// pre: at least two numbers exist in stack used  
	// post: Divides both numbers 
	// Cant divide by zero, and doesnt return decimal places

	public int multiplicar(int operando1, int operando2);
	// pre: at least two numbers exist in stack used  
	// post: multiplies both numbers
}