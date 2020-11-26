import java.util.*;


@FunctionalInterface
interface Circle{
	double area(double pi,double r);
	default double pi() {
		return 3.14;
	}
}
class Solution{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		double radius=s.nextDouble();
		Circle c=(pi,r)->{
			return pi*r*r;
		};
		System.out.print(c.area(c.pi(),radius));
	}
}
