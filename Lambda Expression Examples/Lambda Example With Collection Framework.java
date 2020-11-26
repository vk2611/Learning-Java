import java.util.*;

import Entity.Employee;

interface Print{
	void print(List<Integer> arr);
}
class Solution{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<Employee>arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int id=s.nextInt();
			s.nextLine();
			String name=s.next();
			String designation =s.next();
			String role=s.next();
			Employee e1=new Employee(id,name,designation,role);
			arr.add(e1);
		}
		System.out.println("Sorting of Employee Array is Name");
		arr.sort((obj1,obj2)->{
			return (obj1.getName().compareTo(obj2.getName()));
		});	
		arr.forEach(e1->{
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getRole()+" "+e1.getDesignation());
		});
	}
}
