
public class Hello_Darkness_My_Old_Friend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Hello Darkness My Old Friend...");
		System.out.println("And then Jim said, \"Who's at the door?\"");
		
		int numInt = 20;
		final double pi = 3.14;
		String str = "Say my name";
		char singleChar = 'd';
		
		System.out.println(numInt);
		
		numInt = 10;
//		pi = 12;
		
		System.out.println(numInt);
		System.out.println(pi);
		*/
		Variable_scope data1 = new Variable_scope();
//		System.out.println(data1);
				
		Variable_scope.m = 10;
		
		System.out.println(data1.data);
		System.out.println(data1.m);
		
		data1.method();
	}

}
