package homework;

public class questionOne {
	public static void main(String[] args) {
		
		String colorOption = "orange";
		
		switch (colorOption){
		case "red":
			System.out.println("red color");
			break;
			
		case "orange":
			System.out.println("orange color");
			break;
			
		case "black":
			System.out.println("black color");
			break;
			
		default:
			System.out.println("wrong color, not available");
			break;
			
			
		}
		
		if (colorOption == "blue") {
			System.out.println("blue color");
			
		}else if(colorOption == "orange") {
			System.out.println("orange color");
		
		}else if(colorOption == "black") {
			System.out.println("black color");
			
		}else {
			System.out.println("wrong color, not available");
		}
		
	
}
}
