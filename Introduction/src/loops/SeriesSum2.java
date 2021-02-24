package loops;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		float sum=0;
		for(float i=1;i<=num;i++) {
			if(i%2==0) sum-=1/i;
			else sum+=1/i;
		}
		System.out.println("Sum of series="+sum);
	}

}
