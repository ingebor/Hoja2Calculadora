/**
 * @author Martin Amado 19020, Ingebor Ayleen Rubio 19003
 * @date 05/02/2020
 * Hoja de trabajo 2
 */


public interface iStack<E> {
	
	/**
	 * Agregar algo al stack
	 * @param item
	 */
	public void push(E item);
	   
	/**
	 * @return El elemento mas reciente es removido y mostrado
	 */
	   public E pop();
	   
	   /**
	    * @return el siguiente valor a hacer pop
	    */
	   public E peek();
	   
	   /**
	    * @return si el stack esta vacio o no
	    */
	   public boolean empty();
	   
	   /**
	    * @return Tamaño del stack
	    */
	   public int size();
	   
}