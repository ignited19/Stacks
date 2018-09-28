package stacks;

public class StacksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack(3);
		
		
		s.push(0, 1);
		s.push(0, 2);
		s.push(0, 5);
		
		s.push(0,8);
		s.push(1, 1);
		s.push(1, 1);
		s.push(1, 1);
		s.push(2, 2);
		s.push(2, 2);
		s.push(2, 2);
		s.printValues();
		System.out.println(s.peek(0));
		s.pop(0);
		s.printValues();
		s.push(0,8);
		s.printValues();
		System.out.println(s.peek(0));
	}

}
