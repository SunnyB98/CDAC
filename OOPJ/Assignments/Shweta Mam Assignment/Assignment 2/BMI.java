
public class BMI {

	public static void main(String[] args) {
		
		float weight = 85f;
		float height = 1.71f;
		
		float BMI = weight/(height*height);
		System.out.println("BMI is: "+BMI);
		
		if(BMI < 18) {
			System.out.println("Person is Underwight");
		}else if (BMI>=18 && BMI < 24.9) {
			System.out.println("The weight of the person is normal.");
		}else {
			System.out.println("Person is Overweight");
		}
		
	}

}
