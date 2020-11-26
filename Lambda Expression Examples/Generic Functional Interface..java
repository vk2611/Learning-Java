import java.util.*;

interface GenericInterface<T>{
	T func(T t);
}

class Solution{
	public static void main(String args[]) {
		
		GenericInterface<String> rev=(str)->{
			String s = "";
			for(int i=str.length()-1;i>=0;i--) {
				s+=str.charAt(i);
			}
			return s;
		};
		GenericInterface<Integer>fact=(n)->{
			int sum=1;
			while(n>0) {
				sum=sum*n;
				n--;
			}
			return sum;
		};
		System.out.println(rev.func("Vishal Karhade"));
		System.out.println(fact.func(4));
	}
}
