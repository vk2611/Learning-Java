import java.util.*;

interface Print{
	void printMessage();
}

@FunctionalInterface
interface Math{
	void opr(int a,int b);
}

class Solution{
	static void performOperation(int a,int b,Math Operation) {
		Operation.opr(a,b);
	}
	public static void main(String args[]) {
		Solution s=new Solution();
		
		//lambda expression example
		Print t=()->System.out.println("Hello World");
		t.printMessage();
		
		//math operations using lambda example
		Math addition=(a,b)->System.out.println("Addition:-"+(a+b));
		Math substraction=(a,b)->System.out.println("Substraction:-"+(a-b));
		Math mulplication=(a,b)->System.out.println("Multiplication:-"+(a*b));	
		Math divide=(a,b)->System.out.println("Divide:-"+(a/b));
		s.performOperation(10,20,addition);
		s.performOperation(20, 10,substraction);
		s.performOperation(20,10,mulplication);
		s.performOperation(20,10,divide);
	}
}
