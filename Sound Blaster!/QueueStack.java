import java.util.EmptyStackException;

/**
 * 
 * @author Alex Lew
 * @date 7/1/2015
 * @email alew104@uw.edu
 * @studentID 0937384
 * @version CSE373 15sum
 * 
 *          Question 4. Suppose that, instead of a DStack interface, you were
 *          given a fully-functional FIFO Queue class. How might you implement
 *          this project (i.e., simulate a Stack) with one or more instances of
 *          a FIFO Queue?
 * 
 *          The FIFOQueue class provides the operations enqueue, dequeue,
 *          isEmpty and size and those are the ONLY operations that you can use.
 */
public class QueueStack implements DStack {
    // The queue object
    private FIFOQueue queue;
    private FIFOQueue tempQueue;

    // you can add more queue instances here and initialize in the constructor

    /**
     * Constructor. Initialize the instance field
     */
    public QueueStack() {
        queue = new FIFOQueue();
        tempQueue = new FIFOQueue();
        // initialize extra queue object if necessary
    }

    /**
     * Pushes the value onto the stack represented by this queue. In other
     * words, inserts the element at the front of this queue.
     * 
     * @param value
     *            the value that push into the stack
     */
    @Override
    public void push(double value) {
        // TODO write your push operation here
    	//queue into main queue
    	queue.enqueue(value); 
    }

    /**
     * Pops the value from the stack represented by this queue. In other words,
     * removes and returns the first element of this queue.
     * 
     * @return the value that at the end of the stack
     */
    @Override
    public double pop() {
        // TODO write your pop operation here
    	//dequeue queue 1 push into queue 2, dequeue last item in queue 1.
    	// make queue 2 into queue 1
    	double returnValue = 0.0; // variable to store return data
    	while (queue.size() > 1){ //move all data into a tempqueue except for the last value added
    		tempQueue.enqueue(queue.dequeue()); //move all data into tempqueue to keep order
    	}
    	returnValue = queue.dequeue();
    	queue = tempQueue; //update data queue with the removed data
    	tempQueue = new FIFOQueue(); //clear tempqueue so that it can be used for next pop operation
        return returnValue;
    }
    
    public double size(){
    	return queue.size();
    }

    // ////////////////////////////////////////////////////////////////
    // Ignore all the methods below, those are only for testing
    // ////////////////////////////////////////////////////////////////

    /**
     * Check if the queue is empty
     * 
     * @return true if the queue is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Peek the last element
     * 
     * @return the last element in the queue object
     */
    @Override
    public double peek() {
	double popVal = pop();
	push(popVal);
	return popVal;
    }
}
