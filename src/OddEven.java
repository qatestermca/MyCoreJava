import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your  no.");
		i=sc.nextInt();
		
		if(i%2==0)
			System.out.println("even no.");
		else
			System.out.println("odd no.");

	}

}
