package Que;

public class Q4_FibonacciSeries {
	static int fib(int n){
		if(n <= 1) {
			return n;
		}else {
		    return fib(n-1) + fib(n-2);  //n=(n-1)+(n-2)
		} 
	}
	public static void main(String[] args) {
		
		int num =5;
		for(int i=0; i<=num;i++) {
			System.out.print(fib(i)+" ");
			
		}
	}
}
		
		
			
