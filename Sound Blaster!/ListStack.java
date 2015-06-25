
public class ListStack implements DStack {
	public int top;
	public ListStackNode soundValue;
	public ListStack() {
	    // Your constructor code 
		 soundValue = new ListStackNode();
		 top = 0;
	  }

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(double d) {
		// TODO Auto-generated method stub
		ListStackNode placeholder = traverseToNull(soundValue);
		placeholder.next = new ListStackNode(d);
		
	}
	
	public ListStackNode traverseToNull(ListStackNode full){
		if (full.next == null){
			return full;
		} else {
			traverseToNull(full.next);
		}
		return null;
	}

	@Override
	public double pop() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return 0;
	}

}
