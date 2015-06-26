import java.util.EmptyStackException;

public class ListStack implements DStack {
	public int top;
	public ListStackNode soundValue;
	public ListStack() {
	    // Your constructor code 
		 soundValue = null;
		 top = 0;
	  }

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (soundValue == null){
			return true;
		}
		
		if (top == 0){
			return true;
		}
		
		return false;
	}

	@Override
	public void push(double d) {
		// TODO Auto-generated method stub
		if (soundValue == null){
			soundValue = new ListStackNode(d);
		} else {
			addLast(soundValue, d);
		}
	}

	public void addLast(ListStackNode full, double d){
		boolean added = false;
		while (!added){
			full = full.next;
			if (full.next == null){
				full.next = new ListStackNode(d);
				top++;
				added = true;
			}
		}
	}
	@Override
	public double pop() {
		// TODO Auto-generated method stub
		if (top == 0){
			throw new EmptyStackException();
		}
		return removeLast(soundValue);
	}
	
	public double removeLast(ListStackNode full){
		boolean removed = false;
		double returnValue = 0.0;
		while (!removed){
			full = full.next;
			if (full.next.next == null){
				returnValue = full.next.data;
				full.next = null;
				top--;
				removed = true;
			}
		}
		return returnValue;
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		if (top == 0){
			throw new EmptyStackException();
		}
		return checkLast(soundValue);
	}
	
	public double checkLast(ListStackNode full){
		boolean reachedLast = false;
		double returnValue = 0.0;
		while (!reachedLast){
			full = full.next;
			if (full.next == null){
				returnValue = full.data;
				reachedLast = true;
			}
		}
		return returnValue;
	}

}
