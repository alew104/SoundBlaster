import java.util.EmptyStackException;

public class ArrayStack implements DStack {
	
	private static int top;
	private double soundValue[];
	
	public ArrayStack() {
		soundValue = new double[10];
		top = -1;
	  }

	public boolean isEmpty() { 
		if (top != -1){ //if top of the stack is -1, its empty
			return false;
		} else{
			return true;
		}
	}

	public void push(double d) { //add a value to the stack
		if ((top+1) == soundValue.length){ //if the top of the stack is at the end of the array
			soundValue = doubleCapacity(); // double the array size
		}
		top++; //have to add to the stack to add to the indices (-1 is not in the array)
		soundValue[top] = d; // add value to the stack
	}
	
	public double[] doubleCapacity() {
		double newArray[] = new double [2*soundValue.length]; //create a new array with double the size to store the values
		for (int i = 0; i < soundValue.length; i++){ //copy data from old array to new array
			newArray[i] = soundValue[i];
		}
		soundValue = newArray; //old array becomes new array
		return newArray;
	}

	public double pop() { //return a value and remove it from the stack
		if (top == -1){ //if the stack is empty throw EmptyStackException
			throw new EmptyStackException();
		}
		double popValue = 0.0; 
		popValue = soundValue[top]; //retrieve value from the top of the stack
		top--; // move the top of the stack down one. does not remove previous data from the end of the array
		return popValue; 
	}

	public double peek() {
		if (top == -1){ // if the stack is empty throw EmptyStackException
			throw new EmptyStackException();
		}
		return soundValue[top]; //return the top value of the stack without removing it
	}
	
	public int size() {
		if (top == -1){ //if the stack is empty return 0
			return 0;
		}
		return top+1; //have to add one to the top of the stack to represent accurate sizing due to array indexes
	}

}
