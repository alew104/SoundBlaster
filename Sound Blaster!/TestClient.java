import java.util.Stack;

public class TestClient {
	public static void main (String[] args){
         QueueStack s = new QueueStack();
         addValues(s);
         System.out.println(s.size());
         printAndRemoveValues(s);
         System.out.println(s.size());
         s.push(2.5);
         s.push(2.2);
         s.push(4.3);
         System.out.println(s.size());
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
         //s = new ArrayStack();
        
	}
	
	public static void addValues (QueueStack s){
		for (int i = 0; i < 25; i++){
			s.push(i);
			System.out.println("pushing");
		}
	}
	
	public static void printAndRemoveValues (QueueStack s){
		int sizeCount = 0;
		while (!s.isEmpty()){
			System.out.print(s.pop());
			sizeCount++;
		}
		System.out.println("size is " + sizeCount);
	}
}
