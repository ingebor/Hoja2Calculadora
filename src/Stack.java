/**
 * @author Martin Amado (carne), Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */

import java.util.ArrayList;

public class Stack<E> implements iStack<E>{
	
	protected ArrayList<E> lista;
	

	/**
	 * Constructor
	 */
	public Stack() {
		lista = new ArrayList<E>();
		
	}
	
	/**
	 * 
	 */
	public void push(E item){
		lista.add(item);
	}

	/**
	 * 
	 */
	public E pop(){

		return lista.remove(size()-1);
	}

	/**
	 * 
	 */
	public E peek(){

		return lista.get(size()-1);
	}

	/**
	 * 
	 */
	public boolean empty(){

		return size()==0;
	}

	/**
	 * 
	 */
	public int size(){

		return lista.size();
	}
	   
}