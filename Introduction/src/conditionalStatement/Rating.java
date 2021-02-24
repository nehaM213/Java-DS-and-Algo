package conditionalStatement;

public class Rating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rating=4;
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Good");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
		case 5:
			System.out.println("bad");
		}
	}

}
