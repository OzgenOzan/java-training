
public class VariableScope2 {
	private int data;
	private static int m = 20;
	
	public VariableScope2() {
		this.data = 50;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public static int getM() {
		return m;
	}
	
	public static void setM(int m) {
		VariableScope2.m = m;
	}
	
	public void method() {
		int s = 30;
		System.out.println(s);
	}
}
