import java.util.*;

public class PStackOps {
	public void start() {
		Stack<String> stack = new Stack<String>();
		stack.push("firstMillion");
		printStack(stack);
		stack.push("secondMillion");
		printStack(stack);
		stack.push("thirdMillion");
		printStack(stack);
		
		System.out.println("popping " + stack.pop());
		printStack(stack);
		System.out.println("popping " + stack.pop());
		printStack(stack);
		System.out.println("popping " + stack.pop());
		printStack(stack);
	}
	
	private static void printStack(Stack<String> stack) {
		if(stack.isEmpty()) {
			System.out.println("nothing in stack");
		} else {
			System.out.println( stack +" TOP");
		}
		
	}
}
