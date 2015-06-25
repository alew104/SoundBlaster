import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	
	public static int top;
	public double soundValue[];
	
	public ArrayStack() {
		soundValue = new double[10];
		top = -1;
	  }

	public boolean isEmpty() {
		if (top != -1){
			return false;
		} else{
			return true;
		}
	}

	public void push(double d) {
		if (top == soundValue.length){
			soundValue = doubleCapacity();
		}
		top++;
		soundValue[top] = d;
	}
	
	public double[] doubleCapacity() {
		double newArray[] = new double [2*soundValue.length];
		for (int i = 0; i < soundValue.length; i++){
			newArray[i] = soundValue[i];
		}
		soundValue = newArray;
		return newArray;
	}

	public double pop() {
		if (top == -1){
			throw new EmptyStackException();
		}
		double popValue = 0.0;
		popValue = soundValue[top];
		top--;
		return popValue;
	}

	public double peek() {
		if (top == -1){
			throw new EmptyStackException();
		}
		return soundValue[top];
	}

}
