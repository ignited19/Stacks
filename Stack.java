package stacks;

public class Stack {

	private int numberofStacks = 3;
	private int stackCapacity=3;
	private int[] values;
	private int[] size;
	
	
	public Stack(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize*numberofStacks];
		size = new int[numberofStacks];
		
	}
	
	public void push(int stackNum, int value) {
		if(isFull(stackNum)) {
			return;
		}
		//This array keeps track of the three stacks as indexes and the amount
		//each stack has as the elements
		size[stackNum]++;
		values[getTopIndex(stackNum)]=value;
	}
	
	public  int peek(int stackNum) {
		if(isEmpty(stackNum)) {
			return 0;
		}
		return values[getTopIndex(stackNum)];
	}

	public void pop(int stackNum) {
		if(isEmpty(stackNum)) {
			return;
		}
		values[getTopIndex(stackNum)]=0;
		size[stackNum]--;
	}
	
	private boolean isEmpty(int stackNum) {
		if(size[stackNum]==0) {
			System.out.println("Empty");
			return true;
		}
		return false;
	}

	private int getTopIndex(int stackNum) {
		int offSet = stackNum*stackCapacity;
		int sizeCount= size[stackNum];
		//Have him be able to tell what time it is and adjust the greeting
		//System.out.println("Good Evening Sir, stackNum= " +stackNum);
		//System.out.println("SizeCount= "+ sizeCount);
		return offSet+sizeCount-1;
		
	}
	
	public void printValues() {
		for (int i = 0; i < values.length; i++) {
			System.out.println("Here is the value of index: " + i +" = " + values[i]);
		}
	}
	
	private boolean isFull(int stackNum) {
		if(size[stackNum]==stackCapacity) {
			System.out.println("Full, Sir");
			return true;
		}
		return false;
	}
}
