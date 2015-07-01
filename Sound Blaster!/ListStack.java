import java.util.EmptyStackException;

public class ListStack implements DStack {
	private int top;
	private ListStackNode topNode;
	
	public ListStack() {
		 topNode = null;
		 top = 0;
	  }


	public boolean isEmpty() {
		if (topNode == null){
			return true;
		}
		
		if (top == 0){
			return true;
		}
		
		return false;
	}


	public void push(double d) {
		if (topNode == null){
			topNode = new ListStackNode(d);
			top++;
		} else {
			ListStackNode tempNode = new ListStackNode(d);
			tempNode.next = topNode;
			topNode = tempNode;
			top++;
		}
	}

	public double pop() {
		double returnValue = 0;
		if (top == 0){
			throw new EmptyStackException();
		} else {
			returnValue = topNode.data;
			topNode = topNode.next;
			top--;
		}
		return returnValue;
	}

	public double peek() {
		if (top == 0){
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
