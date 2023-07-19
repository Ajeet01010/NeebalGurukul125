import java.util.Scanner;

public class fibodifference {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no upto: ");
		int num= sc.nextInt();
		
		int f=0, s;
		
		for(int i=0;i<=num;i++) {
			s=f+i;
			f=s;
			System.out.print(s+" ");
		}
	}

}
