package Que;
//Factorial Of a Number
public class Q3_Factorial {
	static int fact(int n){
		if(n<=1) {
			return 1;
		}else {
			return n*fact(n-1); //5*fact(4)....
		}	
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}
