import java.util.Iterator;

public class ControlFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		String carDirection = "random"; 
		
		if (carDirection.equals("left")) {
			System.out.println("Turning left...");
		} else if (carDirection.equals("right")) {
			System.out.println("Turning right...");
		} else {
			System.out.println("Going straight forward...");
		}
		
		switch (carDirection) {
		case "left":
			System.out.println("Turning left...");
			break;
		case "right":
			System.out.println("Turning right...");
			break;
			
		default:
			System.out.println("Keeping straight");
			break;
		}
				
		int movieDuration = 1;
		
		while (movieDuration <= 5) {
			System.out.println(movieDuration + " seconds");
			
			Thread.sleep(1000);
			
			movieDuration++;
		}
		
		System.out.println("The movie has been finished");
		*/
		
		for (int i = 1; i <= 8; i++) {

			System.out.println("Currently watching the Harry Potter " + i);
			
			Thread.sleep(1000);
		}
	}

}
