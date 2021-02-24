package loops;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPrime=true;
//		i*i<n--- i<squreroot of n
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(num<2) isPrime=false;
		System.out.println(isPrime);
	}

}
