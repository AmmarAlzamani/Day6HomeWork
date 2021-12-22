package homework;

public class questionThree {
	public static void main(String[] args) {
		
		int number = 2;
		
		switch (number % 2) {
		
		case 0:
			System.out.println("number is even");
			break;
				
		case 1:
			System.out.println("number is odd");
			break;
			
			default:
				System.out.println("can not be determined");
		}
		
		if(number%2 == 0 ) {
			System.out.println("even number");
			
		}else if(number%2== 1) {
			System.out.println("odd number");
			
		}else {
			System.out.println("can not be determined");
		}
	}

}
