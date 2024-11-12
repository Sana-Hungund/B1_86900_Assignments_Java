package question1;

public class FixedStack implements Stack{
	
	private Employee[] stackArray;
	private int top;
	public FixedStack() {
		stackArray = new Employee[STACK_SIZE];
		top = -1;
		
	}
	@Override
	public void push(Employee emp) {
		if (top == STACK_SIZE-1) {
			System.out.println("stack is full");
			
			
		} else {
			stackArray[++top] = emp;
            System.out.println("Employee added to Fixed Stack: " + emp);

		}
		
	}
	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return null;
		}
		else {
			return stackArray[top--];
		}
	}
	
	
}