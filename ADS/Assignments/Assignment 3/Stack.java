package Questions;
//Array Implementation 
public class Stack {
	
	static final int MAX=10;
	int top;
	int a[] = new int[MAX];
	
	Stack() {
		top = -1;
	}
	//Underflow
	boolean isEmpty(){
		return (top < 0);
	}
	//insertion in stack
	boolean push(int x){
		if(top >= MAX) {
			System.out.println("Stack Overflow.");
		}
		a[++top] = x;
		return true;	
	}
	//deletion
	int pop(){
		if(top < 0) {
			System.out.println("Stack Underflow.");
			return 0;
		}
		return a[top--];
	}
	//peek
	int peek() {
		return (top < 0)? -1: a[top];
	}
	
	void display(){
		if(isEmpty()) {
			System.out.println("Empty Stack!");
		}else {
			System.out.println("Stack elements are:   ");
			show(top);
			System.out.println();
		}
	}
	void show(int index){
		if(index < 0){
			return; 
		}
		System.out.println(a[index]);
		show(index-1);  //recursive call
	}
	public static void main(String[] args) {
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(11);
		s1.push(12);
		s1.push(13);
		s1.display();
		
		System.out.println("Pop element is:  "+s1.pop());
//		s1.pop();
		
		System.out.println("Peak element is:  "+s1.peek());
//		s1.display();
	}

}