package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek=10;
		switch(dayOfWeek) {
		case 1:
			System.out.println("I am on leave");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("I am in office");
			break;
		default:
			System.out.println("I dont know which day it is");
		}
	}

}
