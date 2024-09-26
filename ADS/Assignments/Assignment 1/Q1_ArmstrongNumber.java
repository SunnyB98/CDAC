package Que;

//Logic n*n*n+ n*n*n +n*n*n = num
//

public class Q1_ArmstrongNumber {
	
	static int armStrong(int num) {
		if(num<10) {
			return num*num*num;
		}else {
			int a,b,c,d;
			a=num%10; //3  //5 //1
			return (a*a*a) + armStrong(num/10);	
//			return (num%10)+(num%10)+(num%10)+ armStrong(num/10);  //ok
		}
	}
	
	public static void main(String[] args) {
		int num=153;
		int r = armStrong(num);
		
		if(num==r) {
			System.out.println("Armstrong!");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
