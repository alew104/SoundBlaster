public class ListStackNode {
	double data;
	ListStackNode next;
	
	public ListStackNode(double data, ListStackNode next){
		this.data = data;
		this.next = next;
	}
	
	public ListStackNode(){
		this(0.0, null);
	}
	
	public ListStackNode(double data){
		this(data, null);
	}
	
}
