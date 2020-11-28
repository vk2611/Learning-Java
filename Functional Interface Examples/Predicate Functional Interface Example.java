import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


class Solution{
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		//Single Parameter
		Predicate<Integer>p=(a)->(a<0);
		System.out.println(p.test(10));
	
		//Predicate on String
		Predicate<String>m=(a)->a.equals("Vishal");
		System.out.println(m.test("Vishal"));
		
		//BiPredicate
		BiPredicate<Integer,Integer>l=(a,b)->a<b;	
		System.out.println(l.test(10,20));
		
		//Predicate On List
		Predicate<Integer>even=(a)->(a%2==0);
	
		List<Integer>arr=new ArrayList<>();
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(s.nextInt());
		}
		for(Integer a:arr) {
			System.out.print(a+" is ");
			if(even.test(a)) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
		}
	}
}
