package CollectionFrameWork;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(22);
		stack.push(32);
		stack.push(42);
		stack.push(52);
		
	System.out.println(stack);
	
	System.out.println(stack.pop());
	
	System.out.println(stack);
	System.out.println(stack.search(32));
	
	int i=stack.peek();
	System.out.println(i);
		
		
	}

}
