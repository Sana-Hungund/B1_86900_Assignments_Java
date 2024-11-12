package question1;

import java.util.Arrays;

public class GrowableStack implements Stack{
	private Employee[] stackArray;
	int top;
	int capacity;
	public GrowableStack() {
		capacity = 10;
		stackArray =new Employee[capacity];
		top = -1;
		
	}
	@Override
	public void push(Employee emp) { 
		if (top == capacity - 1) {
			capacity = 2*capacity;
			Employee[] newArray = Arrays.copyOf(stackArray, capacity);
			stackArray = newArray;
		}
		stackArray[++top] = emp;
	    System.out.println("Employee added to Growable Stack: " + emp);
	}
	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return null;
		}else {
			return stackArray[top--];
		}
		
	}
	
	

}
