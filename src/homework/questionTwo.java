package homework;

public class questionTwo {
	public static void main(String[] args) {
		
		char gender = 'm';
		
		switch (gender) {
			case 'm':
				System.out.println("Male");
				break;
				
			case 'f':
				System.out.println("Female");
				break;
				
			case'F':
				System.out.println("Female");
				break;
				
			case 'M':
				System.out.println("Male");
				break;
				
				default: 
					System.out.println("not a gender");
					break;
		}
		
		if(gender == 'm') {
			System.out.println("Male");
			
		}else if (gender == 'f') {
			System.out.println("Female");
			
		}else if (gender == 'F') {
			System.out.println("Female");
			
		}else if (gender == 'M') {
			System.out.println("Male");
			
		}else {
			System.out.println("not a gender");
		}
	}

}
