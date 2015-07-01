import java.util.EmptyStackException;

public class ListStack implements DStack {
	private int top;
	private ListStackNode topNode;
	
	public ListStack() {
		 topNode = null; //empty node
		 top = 0; //empty size
	  }


	public boolean isEmpty() { //check if stack is empty
		if (topNode == null){ //
			return true;
		}
		
		if (top == 0){
			return true;
		}
		
		return false;
	}


	public void push(double d) { //add data to the top of the stack
		if (topNode == null || top == 0){ //edge case, instantiate a new node with data
			topNode = new ListStackNode(d);
			top++;
		} else {
			ListStackNode tempNode = new ListStackNode(d); // new node with data to put in the head
			tempNode.next = topNode; // link new node to the head of the data stack
			topNode = tempNode; //update head to the new node
			top++; // keep track of size
		}
	}

	public double pop() { //retrieve and remove the top of the stack
		double returnValue = 0;
		if (top == 0){ // if the size is 0 throw EmptyStackException
			throw new EmptyStackException();
		} else { // otherwise get the data from the head
			returnValue = topNode.data;
			topNode = topNode.next; //update head to remove the topnode
			top--; //keep track of size
		}
		return returnValue;
	}

	public double peek() { // look at the top data
		if (top == 0){ // if empty throw EmptyStackException
			throw new EmptyStackException();
		}
		return topNode.data; 
	}

	public int size (){ 
		if (top == 0 || topNode == null){
			return 0;
		}
		return top;
	}
	
	

}
