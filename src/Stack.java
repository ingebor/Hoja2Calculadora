

public class Stack<E> implements iStack<E>{
	protected Arraylist<E> lista;
	
	public StackArraylist() {
		lista = new Arraylist<E>();
		
	}
	
	public void push(E item){
		lista.add(item);
	}

	public E pop(){

		return lista.remove(size()-1);
	}

	public E peek(){

		return data.get(size()-1);
	}

	public boolean empty(){

		return size()==0;
	}

	public int size(){

		return lista.size();
	}
	   
}