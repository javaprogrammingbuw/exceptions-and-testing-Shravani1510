
public class ExceptionHandling {
	
	public static double squareRoot(double c)throws MyException {
		if(c<0) {
			throw new MyException("<0");
		}
		else {
			//		double c = -7.0;
			double d = Math.sqrt(c);
		//System.out.println(d);
			return d;
		}
		
	}

	
	public static void main(String[] args){
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception
		try {
			int a = 5;
			int b = 0;
			int div = a/b;
		}catch(ArithmeticException e) {
			System.err.println("Oooops ... a devision by zero appeared!");
			e.printStackTrace();
		}
		
		try {
			int[] arr = new int[5];
			arr[5] = 7;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("array index out of bounds !5");
			e.printStackTrace();
		}
		
		try {
			String one = "one";
			int i = Integer.parseInt(one);
		}catch(NumberFormatException e) {
			System.err.println("input string ! one ");
			e.printStackTrace();
		}
		
		try {
			squareRoot(-7);
		
		} catch(MyException e) {
			System.err.println("it is a Complex root");
			e.printStackTrace();
			}
		}
}
