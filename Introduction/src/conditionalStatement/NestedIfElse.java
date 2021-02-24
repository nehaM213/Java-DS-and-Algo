package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// max among 3
		int a=12;
		int b=8;
		int c=100;
		int result;
		if(a>b) {
			if(a>c) {
				result=a;
			}
			else {
				result=c;
			}
		}
		else {
			if(b>c) {
				result=b;
			}
			else {
				result=c;
			}
		}
		System.out.println("max="+result);
	}

}
