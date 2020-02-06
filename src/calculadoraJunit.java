import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraJunit {
	
	Calculadora calcu = new Calculadora();
	Stack stack = new Stack();
	@Test
	void test() {
		int numero = 5;
		stack.push(numero);; 
		assertEquals(stack.peek(),numero);
	}

}
