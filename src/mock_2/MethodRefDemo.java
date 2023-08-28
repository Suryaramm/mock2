package mock_2;

import java.util.function.Function;

public class MethodRefDemo {
   public static int addition(int a,int b) {
	   return a+b;
   }
	public static void main(String[] args) {
//	1.method reference of a static method
	Function<Integer,Double> function=(input)->Math.sqrt(input);
	   Double result= function.apply(16);
	   System.out.println(result);
	   
		
	   Function<Integer,Double> functionMethod=Math::sqrt;
	   Double result1= functionMethod.apply(16);
	   System.out.println(result);
	   
	

	}

}
